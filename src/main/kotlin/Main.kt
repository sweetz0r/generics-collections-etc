package org.example

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)



enum class Difficulty {
    MEDIUM, HARD, EASY
}

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}


fun main() {
    println("${Quiz.answered} of ${Quiz.total} answered.")
}