package Assignment4
//Q8: write a function to convert the nested list to list using map or flatMap
//input:    List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))
//Output: List(1,2,3,4, 3,4,5,11,34,6)
object questionNo8 extends App{

  val list=List(List(1,2,3,4),List(3,4,5), Nil, List(11,34,6))

  //using Flatmap
  def flattenList(nestedList: List[List[Int]]): List[Int] = {
    nestedList.flatMap(innerList => innerList)
  }

  val flatList = flattenList(list)
  println(flatList)


  //using Map

  def mapList(nestedList: List[List[Int]]): List[Int] = {
    nestedList.map(innerList => innerList).flatten
  }

  val maplists = mapList(list)
  println(maplists)

}
