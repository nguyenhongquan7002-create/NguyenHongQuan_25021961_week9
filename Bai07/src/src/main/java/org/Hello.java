package org;

/**
 * Lớp Hello - sample tối thiểu để minh hoạ PR auto-review.
 * Mục đích: tạo một file Java đơn giản, sau đó cố tình tạo PR có lỗi
 * Checkstyle để kiểm chứng bot dbelyaev/action-checkstyle hoạt động.
 */
public final class Hello {

  // Constructor private - đây là utility class, không cho new
  private Hello() { }

  // Trả về câu chào theo tên đầu vào
  public static String greet(String name) {
    return "Hello, " + name + "!";
  }
}
