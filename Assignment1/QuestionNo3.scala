package Assignment2
//
object QuestionNo3 extends App {

  import scala.annotation.tailrec


  // Recursive way
  def findElementRecursive(list: List[Int], target: Int): Option[Int] = list match {
    case Nil => None
    case head :: tail =>
      if (head == target) Some(head)
      else findElementRecursive(tail, target)
  }

  // Test cases
  val myList = List(1, 2, 3, 4, 5)
  println(findElementRecursive(myList, 3)) // Output: Some(3)
  println(findElementRecursive(myList, 6)) // Output: None



//TailRecursive way
  def findElement(list: List[Int], key: Int): Option[Int] = {
    @tailrec
    def findHelper(list: List[Int]): Option[Int] = {
      list match {
        case Nil => None
        case head :: tail =>
          if (head == key) Some(head)
          else findHelper(tail)
      }
    }

    findHelper(list)
  }

  // Test the tail recursive function
  val list = List(1, 2, 3, 4, 5)
  val find = 3

 val res= findElement(list,find)
  println(res)



}
