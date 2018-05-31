package com.raja.oopslab.employee;



public class Professor extends Employee{
	public Professor(){
        super();
        computeProfessorPay();
    }
	
	public void computeProfessorPay(){
        System.out.println("Enter Basic pay of Professor [enter -1  for Default [BP = 70000]]:");
        this.basic_pay = input.nextDouble();
        if(this.basic_pay == -1){
        	this.basic_pay = 70000;
        	System.out.println("Default Pay Taken");
        }
        this.per_day_pay = this.basic_pay/no_of_days_in_current_month;
        this.per_day_pay = Math.round(this.per_day_pay);
        System.out.println("Basic Pay of Professor:"+this.basic_pay + " for "+this.no_of_days_in_current_month+" days");
        System.out.println("This month this Professor gets "+this.per_day_pay+" INR as basic pay per day");
        System.out.println("Enter no.of days worked by Professor including CL, WH, FH and excluding LWP:");
        this.no_of_days_worked = input.nextInt();
        
        if(no_of_days_worked<=no_of_days_in_current_month){
        	this.current_basic_pay = this.per_day_pay * no_of_days_worked;
            System.out.println("Professor");
            System.out.println("---------");
            generatePaySlip();
        }
        else{
        	System.out.println("Sorry Please Enter Valid Days");
        }
        
	}
}
