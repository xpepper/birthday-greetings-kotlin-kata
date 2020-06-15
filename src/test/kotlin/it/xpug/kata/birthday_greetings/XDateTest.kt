package it.xpug.kata.birthday_greetings

import org.junit.Assert
import org.junit.Test

class XDateTest {
    @Test
    @Throws(Exception::class)
    fun getters() {
        val date = XDate("1789/01/24")
        Assert.assertEquals(1, date.month.toLong())
        Assert.assertEquals(24, date.day.toLong())
    }

    @get:Throws(Exception::class)
    @get:Test
    val isSameDate: Unit
        get() {
            val date = XDate("1789/01/24")
            val sameDay = XDate("2001/01/24")
            val notSameDay = XDate("1789/01/25")
            val notSameMonth = XDate("1789/02/25")
            Assert.assertTrue("same", date.isSameDay(sameDay))
            Assert.assertFalse("not same day", date.isSameDay(notSameDay))
            Assert.assertFalse("not same month", date.isSameDay(notSameMonth))
        }

    @Test
    @Throws(Exception::class)
    fun equality() {
        val base = XDate("2000/01/02")
        val same = XDate("2000/01/02")
        val different = XDate("2000/01/04")
        Assert.assertFalse(base.equals(null))
        Assert.assertFalse(base.equals(""))
        Assert.assertTrue(base.equals(base))
        Assert.assertTrue(base.equals(same))
        Assert.assertFalse(base.equals(different))
    }
}