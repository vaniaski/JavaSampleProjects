package javatutor.objects.examples;

public class BoxClassDemo {
	
   public static void main(String[] args){
	   Box box1= new Box();
	   
	   box1.length=20;
	   box1.width=30;
	   box1.height=20;
	   box1.calcVolume();
	   
	   /*to avoid changes in the behavior of the instance variables
	    use a parameterized method.*/
	   
	   Box box2=new Box();
	   box2.setDim(20, 20, 30);
	   box2.calcVolume();
	   
	   //initialized instance variables in the constructor
	   BoxConstructor boxConst=new BoxConstructor();
	   double calcVolume = boxConst.calcVolume();
	   System.out.println("Box volume is :"+calcVolume);
	   
	   //Parameterized constructor
	   BoxConstructor boxConst2=new BoxConstructor(10,40,50);
	   double calcVolume2 = boxConst2.calcVolume();
	   System.out.println("Box volume is :"+calcVolume2);
	   
   }
}
