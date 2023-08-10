package Assignment4

object questionNo4 extends App{

  //currying

  def add(a:Int)(b:Int):Int=a+b

  val res=add(10)(_)  // Partially applying the first argument
  val finalres=res(10)
  println(finalres)


  //pure Function

  def square(c:Int):Int=c*c

  val squ=square(10)
  println(squ)


  //Not Pure Function
  var total=0
  def addtotal(d:Int):Int={
    total +=d
    total
  }

  val r=addtotal(10)
  println(r)
  val r1=addtotal(2)
  println(r1)

}
