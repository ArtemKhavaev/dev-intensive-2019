package ru.skillbranch.devintensive.extensions

import java.lang.IllegalArgumentException
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

const val SECOND = 1000L
const val MINUTE = SECOND * 60
const val HOUR = MINUTE * 60
const val DAY = HOUR * 24

fun Date.format(pattern:String = "HH:mm:ss dd.MM.yy"):String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}
fun Date.shortFormat(): String? {
    val pattern = if(this.isSameDay(Date())) "HH:mm" else "dd.MM.yy"
    val dateFormat = SimpleDateFormat (pattern, Locale("ru"))
    return dateFormat.format(this)

}

fun Date.isSameDay(date: Date): Boolean {
    val day1 = this.time/ DAY
    val day2 = date.time/ DAY
    return day1 == day2

}

fun Date.add(value:Int, units: TimeUnits = TimeUnits.SECOND) : Date{
    var time = this.time

    time += when (units){
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
    }

    this.time = time

    return this
}

fun Date.humanizeDiff(date: Date? = Date()) : String{

    var res:Long? = (date?.getTime()?.minus(this.time))?.div(1000)
    var out = ""
    val x:Long
    if(res == null || res <= 1L) return "только что"
    else if(res <= 45L) return "несколько секунд назад"
    else if(res <= 75L) return "минуту назад"

    else if(res <= 2700){
        res = (res / 60)

        if (res < 10){
            x = res
        } else if (res < 20){
            return "$res минут назад"
        } else {
            x = res % 10
        }
        when (x){
            1L -> out = "$res минуту назад"
            2L,3L,4L -> out = "$res минуты назад"
            5L,6L,7L,8L,9L,0L -> out = "$res минут назад"
        }
    }
    else if(res <= 3600L) return "час назад"
    else if(res <= 79200){
        res = (res / 3600)

        if (res < 10){
            x = res
        } else if (res < 20){
            return "$res часов назад"
        } else {
            x = res % 10
        }
        when (x){
            1L -> out = "$res час назад"
            2L,3L,4L -> out = "$res часа назад"
            5L,6L,7L,8L,9L,0L -> out = "$res часов назад"
        }
    }
    else if(res <= 93600L) return "день назад"
    else if(res <= 31104000){
        res = (res / 86400)
        if (res < 10){
            x = res
        } else if (res < 20){
            return "$res дней назад"
        } else if (res < 100) {
            x = res % 10
        } else if (res < 1000) {
            x = (res % 100) % 10
        } else return "очень давно"
        when (x){
            1L -> out = "$res день назад"
            2L,3L,4L -> out = "$res дня назад"
            5L,6L,7L,8L,9L,0L -> out = "$res дней назад"
        }
    }else return "более года назад"


    return out
}

enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY
}