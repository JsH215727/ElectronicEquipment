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
public class Playstation extends Electronics{
	boolean ps4, ps3, ps2;
	
	
	
	public Playstation(){
		this.ps3=false;
		this.ps2=false;
		this.ps4=false;
		Electronics.cost=0;
		Electronics.weight=0;
		Electronics.powerUsage=0;
		Electronics.manufacturers=null;
	}

	public Playstation(boolean ps3,boolean ps4, boolean ps2){
		this.ps2=ps2;
		this.ps3=ps3;
		this.ps4=ps4;
		setCost(500);
		setManufacturer("Sony");
		setWeight(4);
		setPower(16);
	}
	public String toString(){
		return "Computer[ \nPS4= "+ps4+"\nPS2= "+ps2+"PS3= "+ps3+"\nManufacturers= "+ manufacturers+"\nCost= "+cost+
				"\nWeight= "+weight+"lbs"+"\nPower Usage= "+powerUsage+"]";

	}
}

