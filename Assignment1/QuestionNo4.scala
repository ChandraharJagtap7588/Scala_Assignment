package Assignment2

object QuestionNo4 extends App {

  //call by value

//  def callByValue(x: Int): Unit = {
//
//    println("Value of x: " + x)
//  }
//
//  val num = {
//    10
//  }
//
//
//  callByValue(num)
//
//
//  //call by name
//  def callByName(x: => Int): Unit = {
//    println("Value of x: " + x)
//  }
//
//  val num1 = {
//    println("Evaluating x")
//    10
//  }
//
//  callByName(num1)

  def showTime_CallByValue(time: Long): Unit = {
    println(s"System time using Call-by-value: $time")
    println(s"System time using Call-by-value: $time")
  }

  def showTime_CallByName(time: => Long): Unit = {
    println(s"System time using Call-by-name: $time")
    println(s"System time using Call-by-name: $time")
  }

  showTime_CallByValue(System.nanoTime())
  showTime_CallByName(System.nanoTime())

}
