package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    // Return true if the customer is from the given city
    return this.city == city
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // Return true if all customers are from the given city
    return customers.all { it -> it.isFrom(city) }
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    // Return true if there is at least one customer from the given city
    return customers.any { it -> it.isFrom(city) }
}

fun Shop.countCustomersFrom(city: City): Int {
    // Return the number of customers from the given city
    return customers.count { it -> it.isFrom(city) }
}

fun fromCity(city: City): (Customer) -> Boolean = { it.city == city }

fun Shop.countCustomersFrom2(city: City): Int {
    // Return the number of customers from the given city
    return customers.count(fromCity(city))
}

fun Shop.findFirstCustomerFrom(city: City): Customer? {
    // Return the first customer who lives in the given city, or null if there is none
    return customers.firstOrNull { it -> it.isFrom(city) }
}
