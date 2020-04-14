package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var j = 0
        for (i in a.indices)
            if (a[i] == b[j] || a[i].toUpperCase() == b[j]){
                j++
                if (j == b.length)
                    return "YES"
            }
        return "NO"
    }
}
