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
public class Phone extends Electronics{
	
	public boolean smartPhone;
	public boolean touchScreen;
	public boolean hotSpot;
	public boolean wiFi;
	
	public Phone(){
		this.smartPhone=false;
		this.touchScreen=false;
		this.hotSpot=false;
		this.wiFi=false;
		Electronics.cost=0;
		Electronics.weight=0;
		Electronics.powerUsage=0;
		Electronics.manufacturers=null;
	}
	public Phone(boolean smartPhone, boolean touchScreen, boolean hotSpot, boolean wiFi){
		this.smartPhone=smartPhone;
		this.touchScreen=touchScreen;
		this.hotSpot=hotSpot;
		this.wiFi=wiFi;
		setCost(500);
		setManufacturer("Apple");
		setWeight(1);
		setPower(16);
	}
	public String toString(){
		return "Phone[ Smart Phone= "+smartPhone+"\nTouch Screen= "+touchScreen+"\nHot Spot= "+hotSpot+"\nWifi= "+wiFi+ "\nManufacturers= "+ manufacturers+"\nCost= "+cost+
				"\nWeight= "+weight+"lbs"+"\nPower Usage= "+powerUsage+"]";
	
	
	
	
	
}
}
