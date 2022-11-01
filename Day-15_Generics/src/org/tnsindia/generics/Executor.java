package org.tnsindia.generics;

public class Executor {

	public static void main(String[] args) {
		Sender <String> obj=new Sender<>();
		obj.setMessage("Generic class Demo");
		obj.sendMessage();
		System.out.println();
		Email em=new Email();
		em.setFrom("rutujaasonawane@gmail.com");
		em.setTo("rutujaasonawane@gmail.com");
		em.setSubject("Java Full Stack");
		em.setBody("About Training And Placement");
		System.out.println(em.getBody());
		
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		
		obj1.sendMessage();
		
		}

}