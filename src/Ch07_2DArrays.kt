fun main() {

    val matrix2 = Array(3) {
        IntArray(3)
    }

    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    println(matrix.contentDeepToString())
    println(matrix[1][2])
    println("Column Size = ${matrix.size} \nRow Size = ${matrix[1].size}")

    

}