package week3.d1.a3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Minimum deposit required is Rs.2000");
	}
	public void superdeposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		AxisBank ab = new AxisBank();
		
		bi.Saving();
		bi.deposit();
		bi.Fixed();
		ab.deposit();
		ab.superdeposit();
		
	}
}
