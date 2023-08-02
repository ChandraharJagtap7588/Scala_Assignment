package Assignment2
//Q8: write a function to convert the nested list to list using for loop
//input:    List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))
//Output: List(1,2,3,4, 3,4,5,11,34,6)
object QuestionNo8 extends App{
  def combineList(input: List[List[Int]]): List[Int] = {
    var result: List[Int] = List.empty // Initialize an empty list

    // Use for loop and yield to concatenate elements from the inner lists
    for {
      innerList <- input
      element <- innerList
    } {
      result = result :+ element
    }

    result
  }


  val list = List(List(1, 2, 3, 4), List(3, 4, 5), Nil, List(11, 34, 6))
  val res= combineList(list)
  println(res)

}
