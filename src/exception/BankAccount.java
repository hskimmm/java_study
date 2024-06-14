package exception;

import exception.custom.InsufficientBalanceException;

public class BankAccount {
    private int balance;

    public void withdraw(int amount) throws InsufficientBalanceException {
        //잔액이 부족할 때
        if(balance < amount) {
            throw new InsufficientBalanceException("잔액이 부족합니다.");
        }
        //잔액이 부족하지 않을 때
        balance -= amount;
    }
}
