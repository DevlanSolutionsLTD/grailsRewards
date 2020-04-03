package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params)
    {
        def firstName =params.firstName
        def totalPoints
        //totalPoints = params.points.toInteger()

        def welcomeMessage = ""

        switch (totalPoints)
        {
            case 5:
                welcomeMessage = "Welcome back $firstName, this drink is on us"
            break

            case 4:
                welcomeMessage = "Welcome back $firstName, Your next drink is free"
            break

            case 2..3:
                welcomeMessage = "Welcome back $firstName, you now have $totalPoints points"
            break

            default:
            welcomeMessage = "Welcome back $firstName, Thanks for creating account with us"
                break
        }

    }
    def getTotalPoints(customerInstance)
    {
        def totalAwards = 0
        customerInstance.awards.each{
            totalAwards = totalAwards + it.points
        }
        customerInstance.totalPoints = totalAwards
        return customerInstance

    }

    def processCheckin(lookupInstance)
    {
        //lookup by phone number
        def customerInstance = Customer.findByPhone(lookupInstance.phone)

        //set up new customer
        if (customerInstance == null)
        {
            customerInstance = lookupInstance
            customerInstance.firstName = "Customer"
        }

        //calculate awards
        def totalAwards = 0
        customerInstance.awards.each
        {
            totalAwards = totalAwards + it.points
        }
        customerInstance.totalPoints = totalAwards

        //create welcome message
        def welcomeMessage = ""
        switch (totalAwards)
        {
            case 5:
                welcomeMessage = "Welcome back  $customerInstance.firstName , this drink is on us"
                break

            case 4:
                welcomeMessage = "Welcome back $customerInstance.firstName , Your next drink is free"
                break

            case 1..3:
                welcomeMessage = "Welcome back $customerInstance.firstName , you now have $totalAwards points"
                break

            default:
                welcomeMessage = "Welcome back $customerInstance.firstName , Thanks for creating account with us"
                break
        }

        //add new award
        if(totalAwards < 5)
        {
            customerInstance.addToAwards(new Award(awardDate:  new Date(), type: "Purchase", points: 1))

        }
        else
        {
            customerInstance.addToAwards(new Award(awardDate:  new Date(), type: "Reward", points: -5))

        }

        //save customer
        customerInstance.save()

        return [customerInstance, welcomeMessage]
    }
}
