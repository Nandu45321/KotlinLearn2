fun main() {

    val age = 15
    val isAdult = if (age >= 18) true else false
    val isAdultExpanded = if (age >= 18) {
                                true
                        } else {
                                false
    }

    val date: Int = 3
    val day: String = when (date) {
                    1 -> "Sun"
                    2 -> "Mon"
                    3 -> "Tue"
                    4 -> {
                        println("sun")
                        "wed"
                    }
                    else -> "None"
                }

}