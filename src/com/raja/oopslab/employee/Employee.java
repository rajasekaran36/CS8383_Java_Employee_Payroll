package com.raja.oopslab.employee;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Employee {
    String emp_name;
    String emp_id;
    String emp_address;
    String emp_mail_id;
    String emp_mobile_no;
    double basic_pay;
    double per_day_pay;
	double current_basic_pay;
	int no_of_days_in_current_month;
	int no_of_days_worked;
	Calendar cal;
	Scanner input;
    Employee(){
        input = new Scanner(System.in);
        cal = new GregorianCalendar();
        no_of_days_in_current_month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Enter Details");
        System.out.println("Name: ");
        this.emp_name = input.next();
        System.out.println("ID: ");
        this.emp_id = input.next();
        System.out.println("Address: ");
        this.emp_address = input.next();
        System.out.println("MailID: ");
        this.emp_mail_id = input.next();
        System.out.println("Mobile No: \n\n");
        this.emp_mobile_no = input.next();
    }
    public void generatePaySlip(){
        double da = Math.round((this.current_basic_pay/100)*97);
        double hra = Math.round(((this.current_basic_pay/100)*12));
        double pf = Math.round((this.current_basic_pay/100)*0.1);
        double gross_pay = this.current_basic_pay+da+hra+pf;
        double net_pay = gross_pay - pf;
        System.out.println("Name: "+this.emp_name);
        System.out.println("ID: "+this.emp_id);
        System.out.println("Address: "+this.emp_address);
        System.out.println("MailID: "+this.emp_mail_id);
        System.out.println("Mobile No: "+this.emp_mobile_no);
        System.out.println("Earnings");
        System.out.println("--------");
        System.out.println("BASIC Pay: "+current_basic_pay);
        System.out.println("DA : "+da);
        System.out.println("HRA : "+hra);
        System.out.println("Deductions");
        System.out.println("----------");
        System.out.println("PF : "+pf);
        System.out.println("GROSS Pay: "+gross_pay);
        System.out.println("NET Pay: "+net_pay);
    }

}