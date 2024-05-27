import java.util.Scanner;

class calculation{
	int a;
	int b;
	int c;
	
	Scanner sc=new Scanner(System.in);
	
	
	void add(){
		System.out.print("a: ");
		int a=sc.nextInt();
		System.out.print("b: ");
		int b=sc.nextInt();
		c=a+b;
		System.out.print("sum of "+a+" & "+b+" is "+c );
	}
	
	void sub(){
		System.out.print("a: ");
		int a=sc.nextInt();
		System.out.print("b: ");
		int b=sc.nextInt();
		c=a-b;
		System.out.print(+a+" - "+b+" = "+c );
	}
	
	void mult(){
		System.out.print("a: ");
		int a=sc.nextInt();
		System.out.print("b: ");
		int b=sc.nextInt();
		c=a*b;
		System.out.print(+a+" * "+b+" = "+c );
	}
	
	void div(){
		System.out.print("a: ");
		int a=sc.nextInt();
		System.out.print("b: ");
		int b=sc.nextInt();
		c=a/b;
		System.out.print(+a+" / "+b+" = "+c );
	}
}

class main{
	public static void main(String[] args){
		int choice;
		Scanner scm=new Scanner(System.in);
		calculation n=new calculation();
		while(true){
			System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplication\n4.Division\nEnter your choice: ");
			choice=scm.nextInt();
		
			switch(choice){
				case 1:
					n.add();
					break;
				case 2:
					n.sub();
					break;
				case 3:
					n.mult();
					break;
				case 4:
					n.div();
					break;
				default:
					System.out.print("wrong");
			}
		}
	}	
}
