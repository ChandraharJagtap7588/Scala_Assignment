package Assignment2

//Q7: print the element of the list using for and for yield of below list
//   List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))

object QuestionNo7 extends App {
  val myList=List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))
//Using for
  for (innerList <- myList) {
    for (element <- innerList) {
      print(element+" ")
    }
  }


  // Using yield
  val flattenedList = for {
    innerList <- myList
    element <- innerList
  } yield print(element+" ")




}
