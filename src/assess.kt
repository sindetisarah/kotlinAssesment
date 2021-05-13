fun main(){
outputString("sarah")

}
fun outputString(str:String):Int{
var length=str.length
    return length
}
data class Car(var make:String,var model:String,var color:String){
 fun checkColor(car: List<Car>)  {
     var blue= mutableListOf<Car>()
     var red= mutableListOf<Car>()
     var other= mutableListOf<Car>()
     var car= mutableListOf<Car>(
         Car("benz","car","red"),
     Car("benz","me","blue"),
     Car("benz","toyota","puple")
     )
     when(car.color){
         "blue"->blue.add(car)
         "red"->red.add(car)
         "other"->other.add(car)
     }

 }}


class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int){
    fun deposit(amount:Double){
        balance=balance+amount.toInt()
    }
    fun withdraw(amount:Double){
        balance=balance-amount.toInt()
    }
    fun details(){
        println("${accountNumber},${balance},${accountName}")
    }

}
class SavingsAccount(var accountNumber:String,var accountName:String,var balance:Int,var withdrawals:Int){
    var count=0;
     fun withdraw(savingsAccount.withdraw){
         if (count<4){
             count ++;

         }
        println("allow to withdaraw ${count}")

     }
}