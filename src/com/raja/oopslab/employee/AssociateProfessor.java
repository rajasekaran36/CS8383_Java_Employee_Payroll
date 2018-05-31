package com.raja.oopslab.employee;

public class AssociateProfessor extends Employee{
	public AssociateProfessor(){
        super();
        computeAssociateProfessorPay();
    }
	
	public void computeAssociateProfessorPay(){
        System.out.println("Enter Basic pay of AssociateProfessor [enter -1  for Default [BP = 40000]]:");
        this.basic_pay = input.nextDouble();
        if(this.basic_pay == -1){
        	this.basic_pay = 40000;
        	System.out.println("Default Pay Taken");
        }
        this.per_day_pay = this.basic_pay/no_of_days_in_current_month;
        this.per_day_pay = Math.round(this.per_day_pay);
        System.out.println("Basic Pay of AssociateProfessor:"+this.basic_pay + " for "+this.no_of_days_in_current_month+" days");
        System.out.println("This month this AssociateProfessor gets "+this.per_day_pay+" INR as basic pay per day");
        System.out.println("Enter no.of days worked by AssociateProfessor including CL, WH, FH and excluding LWP:");
        this.no_of_days_worked = input.nextInt();
        
        if(no_of_days_worked<=no_of_days_in_current_month){
        	this.current_basic_pay = this.per_day_pay * no_of_days_worked;
        	System.out.println("AssociateProfessor");
        	System.out.println("------------------");
        	generatePaySlip();
        }
        
        else{
        	System.out.println("Sorry Please Enter Valid Days");
        }
	}
}
