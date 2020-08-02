package org.techtown.myapplication.Kotlin

fun main(array: Array<String>) {
    val account: Account = Account("Woo", "1111", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())
}

class Account {
    val name: String
    val birth: String
    var balance: Int
    constructor(name: String, birth: String, balance: Int){
        this.name = name
        this.birth = birth
        if (balance >=0){
            this.balance = balance
        } else {
            this.balance = 0
        }
    }
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount:Int){
        balance += amount
    }

}

class Account2 (val name: String, val birth: String, var balance: Int = 1000){
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount:Int){
        balance += amount
    }
}


// parameter with no var or val
// cannot be used within function while it can be used to create initial value for a field
class Account3(initialBalance: Int){
    val balance: Int  =  if (initialBalance >= 0) initialBalance else 0
    fun checkBalance(): Int{
        return balance
    }
}