package Assignment3
//04: Create a list of tuples with fields of the book: LanguageName, Author, Price.

//Val languageList =List(( “Scala Language”, “Martin Odersky”, 500), (“Java Language”, “James Gosling”, 450), (“JavaScript”, “Brendan Eich”, 350))
//Do pattern matching and print the price of the book if the language name has the string “Language” else print “We don;t sell this book”.
object questionNo4 extends App{

  val languageList= List(
      ("Scala Language", "Martin Odersky", 500),
      ("Java Language", "James Gosling", 450),
        ("JavaScript", "Brendan Eich", 350)
  )

  def printPriceBook(book:(String,String,Int)):Unit={

    book match {
      case (languageName,author,price) if languageName.contains("Language") => println(s"price = ${languageName} :${price}")
      case _ => println("We don;t sell this book")
    }
  }

  for(book <- languageList){

    printPriceBook(book)
  }

}
