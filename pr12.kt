import kotlinx.coroutines.*
suspend fun main() = coroutineScope {    println("Введит количество фунций")
    try{
        val n: Int = readLine()!!.toInt()

        if(n <= 0 ) println("Необходимо ввести целое положительное число")
        else{
            launch {                for (i in 0..n) {
                println(i)
                delay(500L)

            }

            }
            println("Корунтина")
        }
    }
    catch (e: NumberFormatException){
        println("Необходимо ввести число")
    }
}