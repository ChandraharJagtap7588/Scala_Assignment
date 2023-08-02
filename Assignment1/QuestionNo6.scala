package Assignment2

object QuestionNo6 extends App{

  def stringPalindrome(str:String):Boolean= {
    var result = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase
    result == result.reverse

  }

  val r = stringPalindrome("najan");
println(r)

  var r1=stringPalindrome("chandrahar")
  println(r1)

  //checking for palindrome or not
//  if(r==true)
//    {
//      println("String is palindrome")
//    }
//  else if(r==false)
//    {
//      println("String is not palindrome")
//    }




}
