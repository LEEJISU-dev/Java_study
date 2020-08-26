package Ex171106;
/* 오버라이딩(toString) */

class BankAccount {
	int accountNumber;	// 계좌번호
	String name;	// 이름
	int balance;	// 잔액

	public void deposit(int amount) {// 입금
		balance += amount;
	}

	public void withdraw(int amount) {// 출금
		balance -= amount;
	}

	public String toString() {
		return "현재 잔액은 " + balance + "만원 입니다";
	}
}

public class Ex171106_4 {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.deposit(100);
		System.out.println(ba);
		
		ba.withdraw(10);
		System.out.println(ba);
	}

}
