## My life snippet

```output
Name: Anmol
Age: 17
Hobbies: Programming, Learing new tech, Writing, Reading
```

```Kotlin
fun main() {
    val person = Person(
        name = "Anmol",
        age = 17,
        hobbies = listOf("Programming", "Learing new tech", "Writing", "Reading")
    )
    person.display()
}

class Person(
    val name: String,
    val age: Int,
    val hobbies: List<String>
) {
    fun display() {
        println("Name: $name")
        println("Age: $age")
        println("Hobbies: ${hobbies.joinToString(", ")}")
    }
}
```
