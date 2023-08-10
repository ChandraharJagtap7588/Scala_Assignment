package Assignment4
//Q6: check if the given string is palindrome or not without using inbuilt methods like reverse
object questionNo6 extends App{

  def isPalindrome(str:String):Boolean={

   val cstr= str.replaceAll("[^a-zA-Z0-9]","").toLowerCase()
    val len=cstr.length
    val mid=len/2

    for(i <- 0 until mid){

      if(cstr(i) != cstr(len - i - 1 )){
        return false
      }
    }

    true
  }

  val res=isPalindrome("nitin")
  println(res)

  val res1=isPalindrome("jagtap")
  println(res1)

}
