package com.raja.oopslab.employee;



public class Professor extends Employee{
	public Professor(){
        super();
        computeProfessorPay();
    }
	
	public void computeProfessorPay(){
        System.out.println("Enter Basic pay of Professor [enter -1  for Default [BP = 70000]]:");
        this.basic_pay = input.nextInt();
        if(this.basic_pay == -1){
        	this.basic_pay = 70000;
        	System.out.println("Default Pay Taken");
        }
        computeCurrentBasicPay("Professor");
        generatePaySlip();
        displayPaySlip();
	}
}
