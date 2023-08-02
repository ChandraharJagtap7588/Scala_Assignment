package Assignment2
//Q2: Write a function to calculate the fibonacci series of a given number n

object QuestionNo2 extends App {


  def fibonacci(n: Int): List[Int] = {


    def fibHelper(a: Int, b: Int, count: Int, acc: List[Int]): List[Int] = {
      if (count == 0) acc.reverse
      else fibHelper(b, a + b, count -1 , a :: acc)
    }


    if (n <= 0) {
      List(0)
    }
    else if (n == 1) {
      List(0, 1)
    }
    else{
      fibHelper(0, 1, n , List())
  }
  }

  // Test the function
  val n = 10
  val fibonacciSeries = fibonacci(n)
  println(s"Fibonacci series up to $n: $fibonacciSeries")

}
