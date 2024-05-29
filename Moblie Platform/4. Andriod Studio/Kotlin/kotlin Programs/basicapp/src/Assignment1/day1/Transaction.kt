package Assignment1.day1

import java.util.Date

class Transaction(val amount:Double,val date: Date,val category:String){
    override fun toString(): String {
        return "Transaction(amount=$amount,date=$date,category='$category')"
    }

}
fun main()
{
    val transaction= Transaction(40.0,Date(),"price")
    println(transaction)
}