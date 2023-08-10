package Assignment4
//Q1: Give example , how do we handle exceptions in different ways?
import scala.util.{Failure, Success, Try}

object questionNo1 extends App{

  try {
    val result = 10 / 0
  } catch {
    case e: ArithmeticException => println("Caught an ArithmeticException: " + e.getMessage)
  }


  // Options
  def divide(x: Int, y: Int): Option[Int] =
    try {
      Option[Int](x / y)
    } catch {
      case _ => None
    }


    val result: Option[Int] = divide(42, 0)
    println(result.getOrElse(0))


  //TRY

  val result1: Try[Int] = Try(10 / 2)
  result1 match {
   case Success(value) => println(s"Result: $value")
    case Failure(exception) => println(s"Error: ${exception.getMessage}")
  }


}
