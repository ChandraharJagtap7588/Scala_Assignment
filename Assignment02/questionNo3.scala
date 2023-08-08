package Assignment02

//iii)A Student is an object in a university management System. Analyze the concept and
//identify the data members   that   a   Student   class   should   have.   Also   analyze   the
//behavior   of  student  in   a   university management System and identify the methods
//that should be included in Student class.

class Student(studentId:Int, studentName:String, age :Int, gender: String, var address:String, var contactNumber:String, var email:String, course:String, batch:String ){

  private var mark:Array[Double]=Array()

  def getInfo():Unit={

    println(s"StudentId=${studentId}")
    println(s"StudentName=${studentName}")
    println(s"age=${age}")
    println(s"gender=${gender}")
    println(s"address=${address}")
    println(s"contactNumber=${contactNumber}")
    println(s"email=${email}")
    println(s"course=${course}")
    println(s"batch=${batch}")

  }

  def updateContactInfo(newaddress:String,newcontactNumber:String,newEmail:String):Unit={
     address = newaddress
    contactNumber = newcontactNumber
    email = newEmail

    println("update Sucessfully")


  }

  def addMarks(newMarks:Array[Double]):Unit={
    mark = newMarks
    println("Marks Added Sucessfully")
  }

  def getAverageMark():Double={
    if(mark.isEmpty){
      println("no mark available")
      0.0
    }else{
      val sum = mark.sum
      sum / mark.length
    }
  }

  def getGrade():String= {
    val averagemark=getAverageMark()

    if(averagemark >= 90) "A"
    else if(averagemark >= 80) "B"
    else if (averagemark >= 70) "c"
    else if (averagemark >= 60) "D"
    "F"

  }

  def isPassing():Boolean={
    val averagemark=getAverageMark()
    averagemark >= 60
  }




}

object questionNo3 extends App{
val stud=new Student(324,"chandu",23,"male","Lasur","954536","chandu@gmail.com","computer","2022")

  stud.getInfo()

  stud.updateContactInfo("Aurangabad","758827","chandrshar@globallogic.com")

  val marks= Array(89.0,92.0,77.9,90,97.0)
  stud.addMarks(marks)

 val avergemarks = stud.getAverageMark()
println(avergemarks)

  println(stud.getGrade())

  println(stud.isPassing())

}
