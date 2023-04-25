fun main() {
    val words="bossy"
    println((words[0]))
    println((words[4]))
    println(words.length)
    println()
    val nums= mutableListOf<Int>(1,1000)
    println(nums.binarySearch(8))


}
open class CurrentaAccount(){

}

/*
1. Write and invoke one function that takes in a random string and returns the
following values: first character, last character, length of the string and
whether it begins with a vowel or not.
*/
fun random(name:String):String{
    var word=("random")
//    for(i in word){
//        if(i in word is  )
//            return ("a is a vowel")
//    }
    return random("bossy")

}
// 2.Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
 fun  Password(list:Array<Any>){
     var pass= mutableListOf<Any>()



}
// 3.Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiply(num:List<Int>){
    var nums= mutableListOf(num)
    for(num in nums)
    return(multiply(num))

}
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
////this format: “Account number x with balance y is operated by z”
data class CurrentAccount( name , var number:Int,var balance:Double):CurrentAccount(var name:String,){
    var currentaccount1=CurrentAccount("Jully",224019,6560.90)
    return
}