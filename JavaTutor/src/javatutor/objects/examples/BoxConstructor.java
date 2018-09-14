package javatutor.objects.examples;

public class BoxConstructor {
	
	double length;
	double height;
	double width;
	
	public BoxConstructor() {
		length=10;
		height=20;
		width=30;
	}
	//Parameterized constructor
	public BoxConstructor(double length,double height,double width) {
		this.length=length;
		this.height=height;
		this.width=width;
	}
	
	double calcVolume(){
		double volume= this.length*this.height*this.width;
		System.out.println("Volume of Box is :"+ volume);
		return volume;
	}
	
}
