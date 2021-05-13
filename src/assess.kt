fun main(){
outputString("sarah")

}
fun outputString(str:String):Int{
var length=str.length
    return length
}
//data class Car(var make:String,var model:String,var color:String){
// fun checkColor(car: List<Car>)  {
//     var purple= mutableListOf<Car>()
//     var red= mutableListOf<Car>()
//     var orange= mutableListOf<Car>()
//     var car= mutableListOf<Car>(
//         Car("benz","car","red"),
//     Car("benz","me","blue"),
//     Car("benz","toyota","puple")
//     )
//     when(car.color){
//         "purple"=>purple.add(car)
//         "red"->red.add(car)
//         "orange"->orange.add(car)
//     }
//
// }}


class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int){
    fun deposit(amount:Int){
        balance=balance+amount
    }
    fun withdraw(amount:Int){
        balance=balance-amount
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