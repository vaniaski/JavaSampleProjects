package javatutor.objects.examples;

public class VariableArgsDemo {

	static void main(String args[]){
		VarArgs.variableArgs(false,true,true,false);
		/*creates ambiguity if not commented one of the
		 *  variableArgs()int i, int...var) and  variableArgs(int... var)*/
		
		VarArgs.variableArgs(2,4,3,5,6);
		
		
	}
}
