package Assignment4
//Q3: Write a function to find the sum of element from a list using higher order function
object questionNo3 extends App {

  def sumListElements(list: List[Int]): Int = {
    //list.sum
    list.foldLeft(0)(_+_)
  }

  val numbers = List(1, 2, 3, 4, 5)
  val sum = sumListElements(numbers)
  println(s" sum  = $sum")

}
