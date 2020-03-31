package rewards

class InventoryController {

    def index() {
        render "Hello from Dark Side"
    }

    def  edit()
    {
        def productName="Cappuchino"
        def sku ="CC058"

        //create mappings
        [product:productName, sku:sku]
    }
    def remove()
    {
        render "Welcome to the dark side"
    }

    def list()
    {
        //pull some lists from the db
        def allProducts = Product.list()
        [allProducts: allProducts]
    }
}
