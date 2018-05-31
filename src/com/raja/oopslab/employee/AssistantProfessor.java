package com.raja.oopslab.employee;

public class AssistantProfessor extends Employee{
	public AssistantProfessor(){
        super();
        computeAssistantProfessorPay();
    }
	
	public void computeAssistantProfessorPay(){
        System.out.println("Enter Basic pay of AssistantProfessor [enter -1  for Default [BP = 25000]]:");
        this.basic_pay = input.nextDouble();
        if(this.basic_pay == -1){
        	this.basic_pay = 25000;
        	System.out.println("Default Pay Taken");
        }
        this.per_day_pay = this.basic_pay/no_of_days_in_current_month;
        this.per_day_pay = Math.round(this.per_day_pay);
        System.out.println("Basic Pay of AssistantProfessor:"+this.basic_pay + " for "+this.no_of_days_in_current_month+" days");
        System.out.println("This month this AssistantProfessor gets "+this.per_day_pay+" INR as basic pay per day");
        System.out.println("Enter no.of days worked by AssistantProfessor including CL, WH, FH and excluding LWP:");
        this.no_of_days_worked = input.nextInt();
        if(no_of_days_worked<=no_of_days_in_current_month){
        	this.current_basic_pay = this.per_day_pay * no_of_days_worked;
        	generatePaySlip();
        	System.out.println("AssistantProfessor");
        	System.out.println("------------------");
        }
        else{
        	System.out.println("Sorry Please Enter Valid Days");
        }
	}
}
