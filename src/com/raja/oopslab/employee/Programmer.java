package com.raja.oopslab.employee;

public class Programmer extends Employee{
	
	public Programmer(){
        super();
        computeProgrammerPay();
        
    }
	
	public void computeProgrammerPay(){
        System.out.println("Enter Basic pay of Programmer [enter -1  for Default [BP = 30000]]:");
        this.basic_pay = input.nextDouble();
        if(this.basic_pay == -1){
        	this.basic_pay = 30000;
        	System.out.println("Default Pay Taken");
        }
        this.per_day_pay = this.basic_pay/no_of_days_in_current_month;
        this.per_day_pay = Math.round(this.per_day_pay);
        System.out.println("Basic Pay of Programmer:"+this.basic_pay + " for "+this.no_of_days_in_current_month+" days");
        System.out.println("This month this Programmer gets "+this.per_day_pay+" INR as basic pay per day");
        System.out.println("Enter no.of days worked by Programmer including CL, WH, FH and excluding LWP:");
        this.no_of_days_worked = input.nextInt();
        
        if(no_of_days_worked<=no_of_days_in_current_month){
        	this.current_basic_pay = this.per_day_pay * no_of_days_worked;
            System.out.println("Programmer");
            System.out.println("----------");
            generatePaySlip();
        }
        else{
        	System.out.println("Sorry Please Enter Valid Days");
        }
        
	}

}