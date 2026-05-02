package com.lab;

// ShippingCalculator: giữ nguyên logic gốc của đề bài (broken pipeline)
// File này KHÔNG có lỗi - lỗi nằm ở pom.xml và workflow CI (đã sửa)
public class ShippingCalculator {

    // Tính phí ship dựa trên cân nặng và loại dịch vụ
    public double calculate(double weight, String type) {
        if (weight <= 0) {
            // Ngoại lệ khi cân nặng âm hoặc bằng 0
            throw new IllegalArgumentException("Weight must be positive");
        }
        // EXPRESS: 5000 đ/kg + phụ phí cố định 20000 đ
        if (type.equals("EXPRESS")) return weight * 5000 + 20000;
        // STANDARD: 3000 đ/kg, không phụ phí
        if (type.equals("STANDARD")) return weight * 3000;
        // Loại dịch vụ không xác định -> ném exception
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
