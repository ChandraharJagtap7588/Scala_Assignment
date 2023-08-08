package Assignment3
//Q2: Explain multiple inheritance use case in scala having a class called Calculator by overriding two different functions : Sum, Multiply .

trait add{
  def sum(a:Int, b:Int):Int
}

trait mul{
  def Multiply(a:Int, b:Int):Int
}

class Calculator extends add with mul{
  override def sum(a: Int, b: Int): Int = a+b

  override def Multiply(a: Int, b: Int): Int = a*b
}

object questionNo2 extends App {

  val cal=new Calculator()

  //use override Function
 val totalsum= cal.sum(2,5)
  val totalmul=cal.Multiply(2,5)

  println(s"Sum= ${totalsum}")
  println(s"Multiply = ${totalmul}")


}
