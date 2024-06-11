package fun;

public class BankAccount {

    private String accountNumber; //계좌번호
    private String ownerName; //계좌소유자
    private double balance; // 계좌잔액

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    //입금
    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입급되었습니다.");
        } else {
            System.out.println("유효하지 않는 금액입니다.");
        }

    }

    //출금
    public void withdraw(int amount) {
        if(amount < balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    
    //잔액조회
    public void printBalance() {
        System.out.println("계좌의 남은 금액은 " + Math.round(balance) +"원 입니다.");
    }
}
