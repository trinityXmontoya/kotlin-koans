package iii_conventions

import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)  : Comparable<MyDate> {
    override fun compareTo(other: MyDate)
            = compareValuesBy(this, other, { it.year }, { it.month }, { it.dayOfMonth })
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)
operator fun DateRange.contains(d: MyDate): Boolean = start <= d && d <= endInclusive