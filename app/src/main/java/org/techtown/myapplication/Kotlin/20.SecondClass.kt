package org.techtown.myapplication.Kotlin

class BankAccount{
    var name: String
    var date: Int
    var valance: Int
    constructor(name: String, date: Int, valance:Int){
        this.name = name
        this.date = date
        this.valance = valance
    }

    fun deposit(depositAmount:Int): Int{
        valance += depositAmount
        return valance
    }
    fun withdraw(withdrawAmount: Int): Int{
        valance -= withdrawAmount
        return valance
    }
}