package Assignment2

//Q5: How do we define the default value of a parameter in the function with example
object QuestionNo5 extends App {

  def greet(name: String = "Guest", greeting: String = "Hello"): String = {
   s"$greeting, $name!"
  }
    val s= greet("bittu")
  println(s)
}
