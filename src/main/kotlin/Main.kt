package org.example

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty {
    MEDIUM, HARD, EASY
}
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar() {

    }
}
class Quiz: ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"
    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
    fun printQuiz() {
        println(question1.questionText)
        println(question1.answer)
        println(question1.difficulty)
        println()
        println(question2.questionText)
        println(question2.answer)
        println(question2.difficulty)
        println()
        println(question3.questionText)
        println(question3.answer)
        println(question3.difficulty)
        println()
    }
    fun printQuiz1() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}
//val Quiz.StudentProgress.progressText: String
    //get() = "${answered} of ${total} answered"

//fun Quiz.StudentProgress.printProgressBar() {
//   repeat(Quiz.answered) { print("▓") }
//    repeat(Quiz.total - Quiz.answered) { print("▒") }
//    println()
//    println(Quiz.progressText)
//}
fun main() {
    Quiz().printProgressBar()
    val quiz = Quiz()
    quiz.printQuiz1()
    Quiz().apply {
        printQuiz()
    }
    println("perehod k List")
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem[3])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    for(planet in solarSystem) {
        println(planet)
    }
    println("perehod k MutableList")
    val solarSystem1 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem1.add("Pluto")
    solarSystem1.add(3, "Theia")
    solarSystem1[3] = "Future Moon"
    println(solarSystem1[3])
    println(solarSystem1[9])
    println(solarSystem1.contains("Pluto"))
    println("Future Moon" in solarSystem1)
    println("perehod k Set")
    val solarSystem2 = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem2.size)
    solarSystem2.add("Pluto")
    println(solarSystem2.size)
    println(solarSystem2.contains("Pluto"))
    println("perehod k Map")
    val solarSystem3 = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem3.size)
    solarSystem3["Pluto"] = 5
    println(solarSystem3.size)
    println(solarSystem3["Pluto"]) //get value of key "Pluto"

}