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
public class Computer extends Electronics {
	public boolean laptop, desktop, work, school; 
	
	public Computer(){
		this.laptop=false;
		this.desktop=false;
		this.work=false;
		this.school=false;
		Electronics.cost=0;
		Electronics.weight=0;
		Electronics.powerUsage=0;
		Electronics.manufacturers=null;
	}

	public Computer(boolean laptop,boolean desktop,boolean work,boolean school){
		this.laptop=laptop;
		this.desktop=desktop;
		this.work=work;
		this.school=school;
		setCost(5000);
		setManufacturer("IBM");
		setWeight(20);
		setPower(32);
	}
	
	public String toString(){
		return "Computer[ Laptop="+laptop+"\nDesktop= "+desktop+"\nWork= "+work+"School= "+school+"\nManufacturers= "+ manufacturers+"\nCost= "+cost+
				"\nWeight= "+weight+"lbs"+"\nPower Usage= "+powerUsage+"]";
	
	
	
	
	
}
}