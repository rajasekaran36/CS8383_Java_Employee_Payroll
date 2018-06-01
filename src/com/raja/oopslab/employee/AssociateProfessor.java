package com.raja.oopslab.employee;

public class AssociateProfessor extends Employee {
	public AssociateProfessor() {
		super();
		computeAssociateProfessorPay();
	}

	public void computeAssociateProfessorPay() {
		System.out.println("Enter Basic pay of AssociateProfessor [enter -1  for Default [BP = 40000]]:");
		this.basic_pay = input.nextInt();
		if (this.basic_pay == -1) {
			this.basic_pay = 40000;
			System.out.println("Default Pay Taken");
		}

		computeCurrentBasicPay("AssociateProfessor");
		generatePaySlip();
		displayPaySlip();
	}
}
