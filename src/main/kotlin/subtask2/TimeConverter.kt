package subtask2

class TimeConverter {

    private val numberStringArray = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
        "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
    )

    fun toTextFormat(hourString: String, minuteString: String): String {
        val hour = hourString.toInt()
        val minute = minuteString.toInt()
        return when (minute) {
            0 -> "${numberStringArray[hour]} o' clock"
            1 -> "${numberStringArray[minute]} minute past ${numberStringArray[hour]}"
            15 -> "quarter past ${numberStringArray[hour]}"
            30 -> "half past ${numberStringArray[hour]}"
            59 -> "${numberStringArray[1]} minute to ${numberStringArray[hour]}"
            45 -> "quarter to ${numberStringArray[hour + 1]}"
            in 2..29 -> "${numberStringArray[minute]} minutes past ${numberStringArray[hour]}"
            in 31..58 -> "${numberStringArray[60 - minute]} minutes to ${numberStringArray[hour + 1]}"
            else -> ""
        }
    }
}
