package Assignment4

import service.MessageService
//2. create a service and give example how do we defined the package and how can we use some class/method in other package

//package core
//
//class Message (sender : String, content : String){
//
//  def display()={
//     println(s"from $sender to \n content $content")
//  }
//
//}


//package service
//
//import core.Message
//
//class MessageService {
//
//  def sendMessage(sender : String, content :String): Unit = {
//    val message = new Message(sender,content);
//    message.display();
//  }
//
//}

object questionNo2 extends App {

  val service = new MessageService;

  service.sendMessage("chandu ","hello")
  service.sendMessage("chandrahr","how are you ?")

}
