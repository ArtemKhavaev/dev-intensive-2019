package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extensions.TimeUnits
import ru.skillbranch.devintensive.extensions.add
import ru.skillbranch.devintensive.extensions.format
import ru.skillbranch.devintensive.extensions.toUserView
import ru.skillbranch.devintensive.models.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
//    @Test
//    fun test_instance(){
//        val user2 = User("2", "John", "Cena")
//    }
//
//    @Test
//    fun test_factory(){
////        val user = User.makeUser("John Cena")
////        val user2 = User.makeUser("John Wick")
////        val user3 = User.makeUser("John Silverhade")
//        val user = User.makeUser("John Wick")
//        val user2 = user.copy(id = "2", lastName = "Cena", lastVisit = Date())
//        println("$user \n$user2")
//    }
//
//    @Test
//    fun test_decomposition(){
//        val user = User.makeUser("John Wick")
//
//        fun getUserInfo() = user
//
//        val(id, firstName, lastName) = getUserInfo()
//
//        println("$id, $firstName, $lastName")
//        println("${user.component1()}, ${user.component2()}, ${user.component3()}")
//    }
//
//    @Test
//    fun test_copy(){
//        val user = User.makeUser("John Wick")
//        val user2 = user.copy(lastVisit = Date())
//        val user3 = user.copy(lastVisit = Date().add(-2, TimeUnits.SECOND))
//        val user4 = user.copy(lastName = "Cena", lastVisit = Date().add(2, TimeUnits.HOUR))
//
//        println("""
//            ${user.lastVisit?.format()}
//            ${user2.lastVisit?.format()}
//            ${user3.lastVisit?.format()}
//            ${user4.lastVisit?.format()}
//        """.trimIndent())
//
////        var user2 = user.copy()
////
////        if (user == user2){
////            println("equals data and hash\n${user.hashCode()} $user \n${user2.hashCode()} $user2 ")
////        } else {
////            println("no equals data and hash\n${user.hashCode()} $user \n${user2.hashCode()} $user2 ")
////        }
////
//////        user2 = user
////
////        if (user === user2){
////            println("equals address \n${System.identityHashCode(user)} \n${System.identityHashCode(user2)}")
////        } else {
////            println("no equals address \n${System.identityHashCode(user)} \n${System.identityHashCode(user2)}")
////        }
//
////        user2.lastName = "Doe"
////        println("$user \n$user2")
//
//
//
//    }
//
//    @Test
//    fun test_dateq_mapping(){
//        val user = User.makeUser("Хаваев Артем")
//        println(user)
//        val user2 = user.copy(lastVisit = Date().add(-48, TimeUnits.SECOND))
//        val userView = user2.toUserView()
//        userView.printMe()
//    }
//
//    @Test
//    fun test_abstract_factory(){
//        val user = User.makeUser("Хаваев Артем")
//        val txtMessage = BaseMessage.makeMessage(user, Chat("0"), payload = "any text message", type = "text")
//        val imgMessage = BaseMessage.makeMessage(user, Chat("0"), payload = "any image message", type = "image")
//
////        when(imgMessage){
////            is BaseMessage -> println("this is base message")
////            is TextMessage -> println("this is text message")
////            is ImageMessage -> println("this is image message")
////    }
//        println(txtMessage.formatMessage())
//        println(imgMessage.formatMessage())
//
//
//
//
//    }


}
