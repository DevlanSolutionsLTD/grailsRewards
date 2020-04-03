package rewards

class WhiteboardController {
    def calculationsService

    def index()
    {

    }

    def variable()
    {
        def myTotal = 1
        render("Total:" + myTotal)
        render("<br>" +myTotal.class)
        myTotal = myTotal+1
        render("<br> New Total "+ myTotal +"<br>")

        def firstName = "Martin"
        render("<br>Name:" + firstName)
        render("<br>" + firstName.class)
        firstName = firstName+1
        render("<br> New Name "+ firstName +"<br>")


        def today = new Date()
        render("<br>Today is : " + today)
        today = today+1
        render("<br> New Date "+ today +"<br>")

    }
    def string()
    {
        def first = "Martin"
        def last = "Mbithi"
        def points = 5
        //groovy strings
        render "Hey there $first. You have $points points"
        //calculating strings
        render "Today is ${new Date()}"
    }
    def conditions()
    {
        def firstName ="Martin"
        def totalPoints = 4
        def welcomeMessage =""

        if(totalPoints >= 5)
        {
            welcomeMessage = "Welcome back $firstName, this drink is on us"
        }
            else  if (totalPoints == 4)
        {
            welcomeMessage = "Welcome back $firstName, Your next drink is free"

        }

        else
        {
            welcomeMessage = "Welcome back $firstName, you now have $totalPoints points"
        }
        render welcomeMessage
    }


    def switchCondition()
    {
        def firstName ="Martin"
        def totalPoints = 4
        def welcomeMessage =""

        switch (totalPoints )
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
            welcomeMessage = "Welcome back $firstName, Thanks for registering"
            break
        }

    }
    //params

    def Params()
    {
        def welcomeMessage = calculationsService.welcome(params)
        render welcomeMessage
    }
}
