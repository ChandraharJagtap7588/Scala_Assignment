package Assignment3
//How to handle None values in scala for optional fields ?

case class Person(name: String, age: Option[Int], address: Option[String])



  object questionNo3 extends App {

    val person1  = new Person("chand", Some(23), Some("Aurangabad"))
    val person2 = new  Person("jagtap", None, Some("lasur"))
    val person3 = new  Person("abhi", Some(32), None)


    def personInfo(person: Person) = {
      println(s"Person Name=${person.name}")
      person.age match {
        case Some(age) => println(s"age = ${age}")
        case None => println(s"age not available")
      }
      person.address match {
        case Some(address) => println(s"address = ${address}")
        case None => println("Address Not available")
      }
    }

    println(personInfo(person2))
    println(personInfo(person3))



}