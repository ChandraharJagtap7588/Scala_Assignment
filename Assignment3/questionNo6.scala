package Assignment3
//Q6 . Illustrate companion object behavior using a function sum().
class Addition{
  def add(a:Int,b:Int):Int=a+b
}
object Addition{
  def sum(a:Int,b:Int):Int=a+b
}

object questionNo6 extends App{

  val addtions=new Addition()

val res=  addtions.add(10,20)
  val res1=Addition.sum(10,20)

  println(s" add = ${res}")
  println(s" sum using Compan*ion Object = ${res1}")

}
