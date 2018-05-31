import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.raja.oopslab.employee.AssistantProfessor;
import com.raja.oopslab.employee.AssociateProfessor;
import com.raja.oopslab.employee.Programmer;
import com.raja.oopslab.employee.Professor;

public class Main {

	public static void main(String[] args) throws IOException {
		Programmer aProgrammer;
		AssistantProfessor aAssistantProfessor;
		AssociateProfessor aAssociateProfessor;
		Professor aProfessor;
		String choice;
		int n_choice = 0;
		Scanner userInput = new Scanner("System.in");
		
		while(n_choice != 5){
			System.out.println("\n\nEmployee Payroll System");
			System.out.println("***********************\n");
			System.out.println("1. Programmer\n2. Assistant Professor\n"
							 + "3. Associate Professor\n4. Professor\n"
							 + "5. Exit\n\nEnter Your Choice");
			choice = new BufferedReader(new InputStreamReader(System.in)).readLine();
			n_choice = Integer.parseInt(choice);
			switch (n_choice) {
			case 1:
				System.out.println("Programmer Selected");
				aProgrammer = new Programmer();
				break;
			case 2:
				System.out.println("AssistantProfessor Selected");
				aAssistantProfessor = new AssistantProfessor();
				break;
			case 3:
				System.out.println("AssociateProfessor Selected");
				aAssociateProfessor = new AssociateProfessor();
				break;
			case 4:
				System.out.println("Professor Selected");
				aProfessor = new Professor();
			case 5:
				System.out.println("Thank You !!!");
				userInput.close();
				break;
			default:
				System.out.println("Enter valid choice !!!");
				break;
			}
		}
	}

}
