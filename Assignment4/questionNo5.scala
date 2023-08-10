package Assignment4
//Q5: How do we define the default value of a parameter in the function with example
object questionNo5 extends App{

  def printmessage(str:String,  str1:String="hello")={
    println(s"$str1 : $str")
  }

  val m=printmessage("chandrahar")
  println(m)

}
