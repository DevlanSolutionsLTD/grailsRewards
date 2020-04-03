package rewards

class Customer {
    Long   phone
    String firstName
    String lastName
    String email
    Integer totalPoints

    static hasMany = [awards:Award, orders:OrderOnline]

    static constraints = {
        phone(nullable: false)
        firstName(nullable: true)
        lastName(nullable: true)
        email(nullable: true, email: true)
        totalPoints(nullable: true, max: 10)

    }
}
