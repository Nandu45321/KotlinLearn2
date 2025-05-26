
sealed class ScreenUIState {

    object Loading: ScreenUIState()
    data class Success(var data: SomeData): ScreenUIState()
    data class Error(var errorMessage: String): ScreenUIState()
}

class Test: ScreenUIState() {

}

data class SomeData(
    val name: String
)

fun main() {

    updateUI(ScreenUIState.Loading)
    //Simulating some real loading
    Thread.sleep(1000)
    updateUI(ScreenUIState.Success(SomeData("Test")))

}

fun updateUI(screenUIState: ScreenUIState) {
    when (screenUIState) {
        is ScreenUIState.Loading -> println("Loading")
        is ScreenUIState.Success -> println(screenUIState.data)
        is ScreenUIState.Error -> println(screenUIState.errorMessage)
        else -> println("I donne")
    }
}