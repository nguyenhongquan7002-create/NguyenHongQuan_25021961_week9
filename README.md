# Tuần 9 - Tích hợp và Triển khai

**Sinh viên:** Nguyễn Hồng Quân
**MSSV:** 25021961
**Môn:** UET.CS2043 - Lập trình nâng cao

## Nội dung

10 bài tập về Maven, SLF4J/Logback, Checkstyle, GitHub Actions, JaCoCo:

| Bài | Chủ đề |
|---|---|
| Bai01 | Quản lý Dependency với Maven (Logback, Hibernate, JUnit Jupiter) |
| Bai02 | Code Quality với Checkstyle + Logging quan sát |
| Bai03 | CI/CD Automation với GitHub Actions |
| Bai04 | Matrix Strategy - kiểm thử đa OS |
| Bai05 | Test Coverage với JaCoCo (>= 80%) |
| Bai06 | CI/CD Pipeline Optimization & Caching |
| Bai07 | Automated Code Review qua Pull Request |
| Bai08 | Đóng gói sản phẩm thực thi (executable JAR) |
| Bai09 | Triển khai Logging chuyên nghiệp |
| Bai10 | Broken Pipeline - tìm và sửa lỗi |

## Cấu trúc mỗi bài

```
BaiNN/
├── run.sh              # cd src && mvn clean && mvn ...
├── GIAITHICH.txt       # Giải thích đúng yêu cầu đề bài
└── src/                # Maven project root (chứa pom.xml)
    ├── pom.xml
    └── src/
        ├── main/java/  # Source code
        └── test/java/  # Unit tests
```

## Tài liệu vấn đáp

- [`TONGKET.txt`](TONGKET.txt) — Tổng kết kiến thức (text)
- [`TONGKET_TUAN9.pdf`](TONGKET_TUAN9.pdf) — Tổng kết kèm hình minh họa (19 trang)

## Cách chạy

```bash
cd BaiNN
bash run.sh
```

Hoặc mở thư mục `BaiNN/src/` bằng IntelliJ → tab Maven → chạy lifecycle.
