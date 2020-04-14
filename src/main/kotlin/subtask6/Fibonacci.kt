package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var prev = 0
        var now = 1
        while (prev * now < n) {
            val sum = prev + now
            prev = now
            now = sum
        }
        return arrayOf(prev, now, if (prev * now == n) 1 else 0).toIntArray()
    }
}
