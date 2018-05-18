
import java.util.Scanner;

class Employee {
    String emp_name;
    int emp_id;
    String emp_address;
    String emp_mail_id;
    int emp_mobile_no;
    Employee(){
        Scanner inputs = new Scanner(System.in);
        System.out.println("Name: ");
        this.emp_name = inputs.next();
        System.out.println("ID: ");
        this.emp_id = inputs.nextInt();
        System.out.println("Address: ");
        this.emp_address = inputs.next();
        System.out.println("MailID: ");
        this.emp_mail_id = inputs.next();
        System.out.println("Mobile No: ");
        this.emp_mobile_no = inputs.nextInt();
        inputs.close();
    }
    public void generatePaySlip(int basic_pay){
        double da = (basic_pay/100)*97;
        double hra = (basic_pay/100)*12;
        double pf = (basic_pay/100)*0.1;
        double gross_pay = basic_pay+da+hra+pf;
        double net_pay = gross_pay - pf;
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Name: "+this.emp_name);
        System.out.println("ID: "+this.emp_id);
        System.out.println("Address: "+this.emp_address);
        System.out.println("MailID: "+this.emp_mail_id);
        System.out.println("Mobile No: "+this.emp_mobile_no);
        System.out.println("Gross Pay: "+gross_pay);
        System.out.println("Net Pay: "+net_pay);
    }

}
class Programmer extends Employee{
    int basic_pay;
    Programmer(){
        super();
        System.out.println("Enter Basic Pay of Programmer");
        Scanner input = new Scanner(System.in);
        this.basic_pay = input.nextInt();
        generatePaySlip(this.basic_pay);
        input.close();
    }

}
class AssistantProfessor extends Employee{
    int basic_pay;
    AssistantProfessor(){
    System.out.println("Enter Basic Pay of AssistantProfessor");
    Scanner input = new Scanner(System.in);
    this.basic_pay = input.nextInt();
    generatePaySlip(this.basic_pay);
    input.close();
    }
}
public class Main {

    public static void main(String[] args) {
	Programmer p = new Programmer();
    }
}