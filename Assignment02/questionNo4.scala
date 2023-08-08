package Assignment02

//iv) Write a program which uses Enumeration and its usages of your own choice based on your understanding.


//// Scala program Printing default ID of
//// any element in the enumeration
//
//// Creating Enumeration
//object Main extends Enumeration
//{
//	type Main = Value
//
//	// Assigning Values
//	val first = Value("Thriller") // ID = 0
//	val second = Value("Horror") // ID = 1
//	val third = Value("Comedy") // ID = 2
//	val fourth = Value("Romance") // ID = 3
//
//	// Main Method
//	def main(args: Array[String])
//	{
//		println(s"ID of third = ${Main.third.id}")
//	}
//}
object demo extends  Enumeration{

  type demo =  Value

  val one ,two, Three, Foure, five, six, seven, eight=Value


}

object questionNo4 extends App {

  println(s"print the value   ${demo.values}")

  println(s"Default id ${demo.one.id}")
  println(s"default Id ${demo.five.id}")
  println(s"defult Id ${demo.six.id}")



}
