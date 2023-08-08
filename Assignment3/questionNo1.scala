package Assignment3
//Create a case class Employee with fields: name, age, address, department, employeeId.
//Prepare a list of records of 6 employee with age as 28,27,24,32,65,21
//Output:  Print employee name and department when age of the employee is greater than 25 using for yield.

case class Employee(name : String, age :Int, address: String, department:String, employeeId:Int)

object questionNo1 extends App{

  val emp= List(
    Employee("chandrahar",24,"lasur","Hr",1),
    Employee("Bittu",28,"patna","Finance",2),
    Employee("babu",27,"banglore","Engineering",3),
    Employee("sumit",32,"Aurangabad","Sales",4),
    Employee("Abhi",65,"Gangapur","Admin",5),
    Employee("ajay",21,"pune","IT",6)
  )

  val empAge= for {
    employe <- emp

    if employe.age > 25

  } yield {
    println(s"name = ${employe.name},Department = ${employe.department}")
  }

}
