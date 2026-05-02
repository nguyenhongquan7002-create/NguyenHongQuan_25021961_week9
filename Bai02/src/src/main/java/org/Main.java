package org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Entry point minh hoạ luồng hoạt động và logging của BankSystem. */
public final class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  // Constructor private để ngăn khởi tạo lớp tiện ích (utility class)
  private Main() { }

  public static void main(String[] args) {
    LOG.info("khoi dong he thong BankSystem");
    BankAccount acc = new BankAccount("089001", "Nguyen Hong Quan", 10000);
    acc.deposit(5000);          // nạp hợp lệ
    acc.withdraw(2000);         // rút hợp lệ
    acc.withdraw(99999);        // cố tình rút quá số dư để thấy log WARN
    LOG.info("ket thuc, sodu cuoi={}", acc.getBalance());
  }
}
