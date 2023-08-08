package Assignment3
//Q5: Print fibonacci series for a given number N of type Long using pattern matching .
object questionNo5 extends App {
  def fibonacci(n: Long): List[Int] = {

    def fibHelper(a: Int, b: Int, count: Long, acc: List[Int]): List[Int] = {
      if (count == 0) acc.reverse
      else fibHelper(b, a + b, count - 1, a :: acc)
    }


    n match {
      case 0 => List(0)
      case 1 => List(1)
      case _ => fibHelper(0, 1, n, List())

    }


  }

  val n = 10
    val fibonacciSeries = fibonacci(n)
    println(s"Fibonacci series up to $n: $fibonacciSeries")




}




