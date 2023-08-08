package Assignment02

//ii)Write a program by creating an 'Employee' class having the following methods and print
//the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as
//parameter
//2   -   'AddSal()'   which   adds   $10   to   salary   of   the   employee   if   it   is   less   than   $500.
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per
//day is more than 6 hours

class Employee(var salary:Double, var hoursofworkperday:Double){

  def getInfo():Unit={
    println(s"salary =${salary} ")
    println(s"print the Number of hour of work per dayv = ${hoursofworkperday}")
  }

  def addSal()={
    if(salary < 500){
      salary += 10
    }
  }

  def addWork()={
    if(hoursofworkperday > 6){
      salary += 5
    }
  }

  def printFinalSalary={
    println(s"print the final Salary ${salary}")
  }

}

object questioNo2 extends App {

  val emp=new Employee(450,7)

  emp.getInfo()
  emp.addSal()
  emp.addWork()
  emp.printFinalSalary


}
