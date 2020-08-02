package org.techtown.myapplication.Kotlin

fun main(array: Array<String>){
    val tv = Tv(listOf<String>("K", "M","S"))
    println(tv.onOrOff)
    tv.switch()
    println(tv.onOrOff)

    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())

}

class Tv(val channels: List<String>){
    var onOrOff: Boolean =  false
    var currentChannelNumber:Int = 0
        // set() let user what value will be added to the variable
        // value, field
        // field works as a temp var
        set(value){
            field = value
            if (field > 2){
                field = 0
            }
            if (field < 0){
                field = 2
            }
        }
        // get() let user know when the variable being used
        get(){
            println("호출 되었습니다.")
            return field
        }
    fun switch(){
        onOrOff = !(onOrOff)
    }

    fun channelUp(){
        currentChannelNumber = currentChannelNumber + 1
//        channels.forEachIndexed{ index, value ->
//            if(currentChannelNumber == index){
//                currentChannelNumber = currentChannelNumber +1
//                return
//            }
//        }
    }

    fun checkCurrentChannel(){
        println(channels[currentChannelNumber])
    }
}