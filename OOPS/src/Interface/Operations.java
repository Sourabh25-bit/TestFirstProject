package Interface;

import java.util.Scanner;

public class Operations implements Maths {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt(); 
	
//	int a; int b;
	int add;
	int sub;
	
	public static void main(String[] args) {

		System.out.println("Value A and B: ");
					
		Operations op=new Operations();
		op.add();
		op.sub();
		
	}

	@Override
	public void add() {
		add=a+b;
		System.out.println("Addition: "+add);
		
	}

	@Override
	public void sub() {
		sub=a-b;
		System.out.println("Subtraction: "+sub);
	}

}
