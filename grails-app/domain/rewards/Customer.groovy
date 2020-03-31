package rewards

class Customer {
    String firstName
    String lastName
    Long    phone
    String email
    Integer totalPoint

    static hasMany = [awards:Award, orders:OrderOnline]

    static constraints = {
    }
}
