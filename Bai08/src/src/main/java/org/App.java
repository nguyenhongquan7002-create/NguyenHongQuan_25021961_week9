package org;

// App: lớp chính của standalone JAR
// Tên FQCN "org.App" phải khớp với <mainClass> trong pom.xml -> ghi vào MANIFEST.MF
public class App {

    // Khi chạy: java -jar target/StandaloneApp-1.0-SNAPSHOT.jar arg1 arg2
    // JVM mở zip, đọc Main-Class trong manifest, gọi hàm main này
    public static void main(String[] args) {
        System.out.println("Standalone JAR chay thanh cong!");
        // In luôn các tham số dòng lệnh để chứng minh truyền tham số được
        System.out.println("Tham so: " + java.util.Arrays.toString(args));
    }
}
