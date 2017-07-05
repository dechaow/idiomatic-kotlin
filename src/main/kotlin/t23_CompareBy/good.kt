package t23_CompareBy.good

class Person(val name: String,
             val age: Int)

fun sortPersons(persons: List<Person>) =
    persons.sortedWith(compareBy(Person::name, Person::age))
