package org.techtown.myapplication.Kotlin

class TV {
    var power: Boolean = false
    var channels = mutableListOf<String>()
    var defaultChannel: Int = 0

    constructor(power: Boolean, defaultChannel: Int) {
        this.power = power
        this.channels = mutableListOf<String>("KBS", "SBS", "MBC")
        this.defaultChannel = defaultChannel
    }

    fun tvOn() {
        this.power = true
    }

    fun changeChannel() {
        if (this.power) {
            if (this.defaultChannel > channels.size){
                this.defaultChannel = 0
                println(channels[this.defaultChannel])
            } else {
                println(channels[this.defaultChannel])
            }
        } else {
            println("TV needs to be turned on first")
        }
    }

    fun addChannel(newChannel: String){
        this.channels.add(newChannel)
    }
}