package javatutor.objects.examples;

public class Box {
	
	 double length;
	 double height;
	 double width;
	
	void calcVolume(){
		System.out.println("Volume of the box is :" +length*width*height);
	}
	
	// this identifier differs instance variables from parametes
	void setDim(double length,double height,double width){
		this.length=length;
		this.height=height;
		this.width=width;
	}

}
