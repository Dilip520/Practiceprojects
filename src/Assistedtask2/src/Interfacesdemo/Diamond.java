package Interfacesdemo;
public class Diamond implements MyInterface2, MyInterface1{
	   public void display() {
	      MyInterface2.super.display();
	      MyInterface1.super.display();
	   }
	   public static void main(String args[]) {
		   Diamond obj = new Diamond();
	      obj.display();
	   }
	}
