import java.utill.scanner;

class IfElseDemo{
	public static void main(string[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age=in.nextInt();
		if(age>=18){
			System.out.println("you are eligible to vote!");
		}
		if(age>=60){
			System.out.println("you are an senoir cetizition!");
		}
		else{
			System.out.println("you are not an in eligible");
		}
	}
}