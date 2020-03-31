package rewards

class OrderItem {
    Integer qty
    Float total

    static belongsTo = [order:OrderOnline, product:Product]

    static constraints = {
    }
}
