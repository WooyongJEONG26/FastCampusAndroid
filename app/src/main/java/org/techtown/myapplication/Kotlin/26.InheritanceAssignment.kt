package org.techtown.myapplication.Kotlin

fun main(array: Array<String>){
    val monster = SuperMonster(100,15)
    val knight = SuperKnight(100,15)
    monster.attack(knight)
    monster.bite(knight)
}

// characteristic of class inheritance
// child class is type of parent class
// while parent class cannot be type of child class

open class Character(var hp: Int, val power:Int){
    fun attack(character: Character, power:Int = this.power){
        character.defense(power)
    }
    open fun defense(damage:Int){
        hp-=damage
        if(hp > 0) println("${javaClass.simpleName} Remaining HP $hp")
        else println("${javaClass.simpleName} You are dead")
    }
}
// inheritance class's parameter should not have any var or val
class SuperKnight(hp:Int, power:Int): Character(hp,power){
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}

class SuperMonster(hp: Int,power:Int): Character(hp,power){
    fun bite(character: Character){
        super.attack(character, power +2)
    }

}