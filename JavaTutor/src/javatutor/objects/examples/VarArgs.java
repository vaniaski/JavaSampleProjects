package javatutor.objects.examples;

public class VarArgs {
	
//	static void variableArgs(int... var){
//		System.out.println("Variable length"+ var.length);
//	}
	static void variableArgs(int i,int... var){
		System.out.println("var"+i+" Variable length"+ var.length);
	}

	static void variableArgs(boolean...var){
		System.out.println("Boolean variables length"+var.length);
	}

}
