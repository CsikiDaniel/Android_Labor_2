import java.text.SimpleDateFormat
import java.time.Month
import java.time.MonthDay
import java.time.Year
import java.util.*

data class MyDate(var year: Year, var month: Month, var day: MonthDay)
{
    init{
        val dayFormat = SimpleDateFormat("yyyy,MM,dd")
        var currentDate = dayFormat.format(Date())
    }

}