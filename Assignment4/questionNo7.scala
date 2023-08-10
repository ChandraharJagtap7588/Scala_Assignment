package Assignment4

//Q7: print the element of the list using map and flatMap yield of below list
//   List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))
object questionNo7 extends App{

  val list = List(List(1, 2, 3, 4), List(3, 4, 5), Nil, List(11, 34, 6))

  // Using map
  val resultUsingMap = list.map {
    case Nil => "Empty List"
    case innerList => innerList.mkString(", ")
  }

  resultUsingMap.foreach(println)

  // Using flatMap and yield
  val resultUsingFlatMap = for {
    innerList <- list
  } yield {
    innerList match {
      case Nil => "Empty List"
      case _ => innerList.mkString(", ")
    }
  }

  resultUsingFlatMap.foreach(println)


}
