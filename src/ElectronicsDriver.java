/*
 * Jonathan Wiley
 * CSC 201 
 * 
 *  PsuedoCode
 *  Design and implement a set of classes that define various courses 
 *  in your curriculum. Include information about each course such as 
 *  the title, number, description, and department that teaches the
 *   course. Consider the categories of classes that constitutes your 
 *   curriculum when designing your inheritance structure. 
 *   Create a main driver class to instantiate and exercise 
 *   several of the classes. 
 */
public class ElectronicsDriver {

	public static void main (String[]args){
		Electronics ps4 = new Playstation(false, true, false);
		System.out.print(ps4.toString());
		
		Electronics iPhone6= new Phone(true,true,true,true);
		System.out.print(iPhone6.toString());

		Electronics dell = new Computer(true, true, false, true);
		System.out.print(dell.toString());
	}
}
