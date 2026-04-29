fun main() {
    val person = Person("Anmol", 17, arrayOf("Coding", "Traveling", "Cooking"))
    person.display()
}

class Person(name: String, age: Int, hobby: Array<String>) {
    var name: String = name
    var age: Int = age
    var hobby: Array<String> = hobby

    fun display() {
        println("Name: $name")
        println("Age: $age")
        println("Hobbies: ${hobby.joinToString(", ")}")
    }
}
