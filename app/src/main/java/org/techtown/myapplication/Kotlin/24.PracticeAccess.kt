package org.techtown.myapplication.Kotlin

fun main(array:Array<String>){
}

class Knight(private var hp:Int,private var power:Int){

    fun attack(monster:Monster){
        monster.defense(power)
    }
    fun defense(damage: Int){
        hp -= damage
        if (hp > 0) {
            heal()
            println("your Hp is $hp" )
        }
        else println("I am dead")
    }
    private fun heal(){
        hp += 3
    }
}
// when declaring new var
// need put private all the times turn it to public later
class Monster(private var hp:Int,private var power:Int){

    fun attack(knight: Knight){
        knight.defense(power)
    }
    fun defense(damage:Int){
        hp -= damage
        if (hp > 0) println("I am not dead")
        else println("I am dead")
    }
}