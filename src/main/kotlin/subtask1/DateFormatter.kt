package subtask1

import java.util.*
import java.time.*
import java.time.format.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            date.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("RU")))
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
