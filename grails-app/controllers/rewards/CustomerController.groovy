package rewards

class CustomerController {
    static scaffold = Customer

    def calculationsService

    def lookup()
    {
        def customerInstance = Customer.list()
        [customerInstanceList: customerInstance]

    }

    /*
    def lookup()
    {
        def customerInstance = Customer.findByFirstNameIlikeAndTotalPointsGreaterThanEquals("B%", 3)
        [customerInstanceList: customerInstance]
    }

     */

    def checkin()
    {

    }

/*
Created default by  grails scaffoldings

    def create()
    {
        [customerInstance: new Customer()]
    }



    def save(Customer customerInstance)
    {
        customerInstance.save()
        redirect(action: "show",  id: customerInstance.id)
    }
    */

    def show(Long id)
    {
        def customerInstance = Customer.get(id)
        [customerInstance: customerInstance]
        customerInstance = calculationsService.getTotalPoints(customerInstance)



    }

/*
    def edit(Long id)
    {
        def customerInstance = Customer.get(id)
        [customerInstance: customerInstance]

    }

    def update(Long id)
    {
        def customerInstance = Customer.get(id)
        customerInstance.properties = params
        customerInstance.save()
        redirect(action: "show",  id: customerInstance.id)


    }

 */

    def customerLookup(Customer lookupInstance)
    {


        def (customerInstance, welcomeMessage) = calculationsService.processCheckin(lookupInstance)
        render(view: "checkin", model: [CustomerInstance: customerInstance, welcomeMessage: welcomeMessage])
        /*
            * Querry customer by phone
            * If no result create new one
            * Create welcome message
            * Add award
            * save customer
            * send a welcome message
            * If Customer exists
            * calculate total points
            * add award record
            * save customer
            * send a welcome message
            */

    }

    def profile()
    {
        def customerInstance = Customer.findByPhone(params.id)
        [customerInstance: customerInstance]
    }
    def updateProfile(Customer customerInstance)
    {
        customerInstance.save()
        render(view: "profile", model: [customerInstance: customerInstance])
    }

}
