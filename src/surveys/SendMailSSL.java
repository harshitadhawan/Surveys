/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surveys;

public class SendMailSSL{    
 public void send(String Recipent,String Pwd ) {    
     //from,password,to,subject,message  
     Mailer.send("indudhawan.mw@gmail.com","todeewzzlngnczje",Recipent,"Survey Credentials","User ID :" + Recipent + "\n Password:" + Pwd );  
     //change from, password and to  
 }    
}    