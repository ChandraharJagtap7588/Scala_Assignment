package Assignment02
//i)Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
//units by creating a class named 'Triangle' with  parameter length,bredth,height  in its constructor.
  class Triangle(length: Double, bredth: Double, height: Double) {
    // Function to calculate the area of the triangle using Heron's formula
    def area: Double = {
      val s = (length + bredth + height) / 2.0
      math.sqrt(s * (s - length) * (s - bredth) * (s - height))
    }

    // Function to calculate the perimeter of the triangle

    def perimeter: Double = length + bredth + height
  }

object QuestionNo1 {
    def main(args: Array[String]): Unit = {
      val triangle = new Triangle(3, 4, 5)

      // Calculate and print the area of the triangle
      val area = triangle.area
      println("Area of the triangle: " + area)

      // Calculate and print the perimeter of the triangle

      val perimeter = triangle.perimeter
      println("Perimeter of the triangle: " + perimeter)
    }



}
