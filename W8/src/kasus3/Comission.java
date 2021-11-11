package kasus3;

public class Comission extends Hourly{
	private double totalSale;
	private double comissionRate;
	// 0.2 comissionRate = 20% comission on sales
	public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comission) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		comissionRate = comission;
	}
	
	public void addSales(double sale) {
		totalSale = sale;
	}
	
	public double pay() {
		double payment = super.pay() + (super.pay() * comissionRate);
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sale: " + totalSale;
		return result;
	}
}
