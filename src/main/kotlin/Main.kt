// Practising collections in kotlin- A group or related data e.g customer records
// types of collections are - listOf,setOf,mapOf
//listOf - contains duplicate items
//toSet() converts
//setOf -similar to listOf but doesn't contain duplicates
//mapOf- Is like a dictionary, it pairs keys with their values
// Functions to be used in manipulation of collections in kotlin are- sorted(),put()
fun main() {
    val identificationNums = listOf(90940,8956489,895895,675647,758748,40,40)
    //printing the items in a list
    println("The Ids are: ${identificationNums}")
    //converting list to set
    println("Converted list: ${identificationNums.toSet()}")
    val age = setOf(1,3)
    //Prints set of ages
    println("The set of ages are:${age}")
    val records = mapOf<String,Int>(
        "Alpha" to 1,
        "Felix" to 2,
        "Purity" to 3,
        "Amos" to 4
    )
    //print the map
    println("The group members are : ${records}")
    //Sorting the list
    println("The sorted list is :${identificationNums.sorted()}")
    //checking if an items exists using contains()
    println("contains 1:${age.contains(1)}")

}