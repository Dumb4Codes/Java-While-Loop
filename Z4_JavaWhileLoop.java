import java.util.Scanner;

public class Z4_JavaWhileLoop {

	public static void main(String[] args) {
		// While loop = executes a block of code as long as it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		
		
       String name = "";
       
       while(name.isBlank()) {
    	   System.out.println("What is your name?");
    	   
    	   name = scanner.nextLine();
    	  
       }
       System.out.println("Sup "+name);
	}

}
