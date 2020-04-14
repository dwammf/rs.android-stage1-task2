package subtask4

class Pangram {

    private val alphabet = "qwertyuiopasdfghjklzxcvbnm"
    private val vowels = "eyuioa"
    private val consonants = "qwrtpsdfghjklzxcvbnm"

    fun getResult(inputString: String): String {
        val words = inputString.split(" ").filterNot{ it == "" || it == "\n" }
        return  answerForInputString(words, if (isPangram(inputString)) vowels else consonants)
    }

    private fun answerForInputString(words: List<String>, sortBy: String): String {
        var sortedList = words.sortedBy {e -> e.count { sortBy.contains(it, true)} }
        sortBy.forEach { consonant -> sortedList =
            sortedList.map { element -> element.replace(consonant, consonant.toUpperCase()) }
        }
        return sortedList.joinToString(" ")
        { s -> "${s.count {sortBy.contains(it, true)}}$s" }
    }


    private fun isPangram(str: String): Boolean {
        return (alphabet.filter { str.contains(it, true) } == alphabet);
    }
}
