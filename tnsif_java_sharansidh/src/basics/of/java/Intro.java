package basics.of.java;

/*
 * Java - 1995 
 * Oak
 * Created by Sun Microsystems in Island in Indonesia
 * Now owned by Oracle
 * Web Application - Whatsapp (hosted in Server)
 * 
 * Interview Questions:
 * 1. What are the Java terminologies?
 * 		Bytecode, JDK,(JRE) Java Runtime Environment, JVM
 * 		Bytecode is .class file
 * 		C/C++ converted into machine code
 * 		
 * 
 * Features of Java
 * 1. Object Oriented
 * 2. Architecture Neutral  - in C size may differ for system 32 64
 * 3. Platform Indipendence
 * 4. Secure
 * 5. Robust
 * 6. Distributed
 * 
 * String is the common memory for getting inputs in Java.
 * Static - Method excecuted automatically
 * 
 * Class & Object
 * 	Class is a blue print or mould from which objects are made.
 * 	Object is an instance of the class
 * 
 * Objects consists of 
 * 	1. State - its represents the attributes of an objects
 * 	2. Behaviour - methods of the class
 *	3. identity - Reference of the object
 * 
 * */

public class Intro {
	
	public static void main (String[] args){
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int c=a+b;
		System.out.println("Addition of a= "+a+" b ="+b+" is"+c);
	}

}
