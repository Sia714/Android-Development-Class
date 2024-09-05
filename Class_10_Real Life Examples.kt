// DISCOUNT SYSTEM FOR STORE
fun Discount(amt:Int, mem:Boolean){
    if(amt>=1000){
        if(mem){
            println("20% Discount")
            println("Amount to be paid: ${0.8*amt}")
        }
        else{
            println("10% Discount")
            println("Amount to be paid: ${0.9*amt}")
        }
    }
    else{
        println("No Discount")
    }
}


// BANKING SYSTEM
fun withdraw(bal: Int): Int {
    var currentBalance = bal
    var amt: Int
    var cont: String
    
    do {
        println("Your current balance is: $currentBalance")
        println("Enter amount to withdraw")
        amt = readLine()?.toIntOrNull() ?: 0

        if (amt <= currentBalance) {
            currentBalance -= amt
            println("Withdrawal successful! New balance: $currentBalance")
        } else {
            println("Insufficient balance!")
        }

        println("Do you want to continue withdrawing? (yes/no)")
        cont = readLine()?.lowercase() ?: "no"

    } while (cont == "yes")
    
    return currentBalance
}


fun main(){
    var amt= 1050
    var mem= true
    Discount(amt,mem)
    
    
    var balance = 1000
    balance = withdraw(balance)
    println("Thank you! Your final balance is: $balance")
        
}
