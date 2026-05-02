package org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Tài khoản ngân hàng - đã refactor theo Google Java Style. */
public final class BankAccount {

  // Logger lấy theo class - cho phép Checkstyle và Logback nhận diện đúng nguồn log
  private static final Logger LOG = LoggerFactory.getLogger(BankAccount.class);

  // Các field final = bất biến sau khi khởi tạo, đúng convention Google Style
  private final String accountNumber;
  private final String holder;
  private double balance;

  // Constructor: nếu số dư khởi tạo âm thì coi như 0 (không cho phép âm)
  public BankAccount(String accountNumber, String holder, double initialBalance) {
    this.accountNumber = accountNumber;
    this.holder = holder;
    this.balance = Math.max(0, initialBalance);
    LOG.info("tao tk acc={} chu={} sodu={}", accountNumber, holder, this.balance);
  }

  // Rút tiền - trả về true nếu thành công, false nếu input không hợp lệ
  public boolean withdraw(double amount) {
    if (amount <= 0 || amount > balance) {
      // WARN vì hệ thống tự xử lý được (từ chối), không cần ném exception
      LOG.warn("rut khong hop le acc={} amount={} balance={}", accountNumber, amount, balance);
      return false;
    }
    balance -= amount;
    LOG.info("rut thanh cong acc={} amount={} sodu={}", accountNumber, amount, balance);
    return true;
  }

  // Nạp tiền - chỉ cho phép số dương
  public void deposit(double amount) {
    if (amount <= 0) {
      LOG.warn("nap khong hop le acc={} amount={}", accountNumber, amount);
      return;
    }
    balance += amount;
    LOG.info("nap thanh cong acc={} amount={} sodu={}", accountNumber, amount, balance);
  }

  // Getter - không log để tránh nhiễu console
  public double getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getHolder() {
    return holder;
  }
}
