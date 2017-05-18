package rocketData;

import java.io.Serializable;

public class LoanRequest implements Serializable {

	private int iTerm; //Drop-down box
	private double dRate; //Label
	private double dAmount; //TextField
	private int iCreditScore; //TextField
	private int iDownPayment; //TextField
	private double dPayment; //Label
	private double Income; //TextField
	private double Expenses; //TextField
	
	//	TODO - RocketBLL.LoanRequest
	//			missing attributes...
	//			Income
	//			Expenses
	//			Add these attributes to the class... add getters and setters.
	
	public LoanRequest() {
		super();
	}
	public int getiTerm() {
		return iTerm;
	}
	public void setiTerm(int iTerm) {
		this.iTerm = iTerm;
	}
	public double getdRate() {
		return dRate;
	}
	public void setdRate(double dRate) {
		this.dRate = dRate;
	}
	public double getdAmount() {
		return dAmount;
	}
	public void setdAmount(double dAmount) {
		this.dAmount = dAmount;
	}
	public int getiCreditScore() {
		return iCreditScore;
	}
	public void setiCreditScore(int iCreditScore) {
		this.iCreditScore = iCreditScore;
	}
	public int getiDownPayment() {
		return iDownPayment;
	}
	public void setiDownPayment(int iDownPayment) {
		this.iDownPayment = iDownPayment;
	}
	public double getdPayment() {
		return dPayment;
	}
	public void setdPayment(double dPayment) {
		this.dPayment = dPayment;
	}
	public double getIncome() {
		return Income;
	}
	public void setIncome(double income) {
		Income = income;
	}
	public double getExpenses() {
		return Expenses;
	}
	public void setExpenses(double expenses) {
		Expenses = expenses;
	}
}
