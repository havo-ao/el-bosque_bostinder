package co.edu.unbosque.models;

import java.time.LocalDate;

public class Men extends People {
	protected double monthlySalary;

	public Men(String userName, String password, String email, String status, String gender, String name,
			LocalDate birthDate, int height, double monthlySalary) {
		super(userName, password, email, status, gender, name, birthDate, height);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}
