package org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// OrderService: bỏ hết System.out.println, thay bằng SLF4J + parameterized logging
public class OrderService {

    // Logger lấy theo class - giúp Logback in tên class trong mỗi dòng log
    private static final Logger LOG = LoggerFactory.getLogger(OrderService.class);

    // Tính tổng tiền = qty * price
    // Dùng INFO cho mốc bình thường, ERROR khi nem exception
    public double total(int qty, double price) {
        // Parameterized logging "{}" - chỉ format chuỗi khi level được bật
        LOG.info("tinh tong qty={} price={}", qty, price);

        if (qty <= 0 || price < 0) {
            // ERROR: input sai dẫn đến exception, ghi đầy đủ tham số để truy vết
            LOG.error("input khong hop le qty={} price={}", qty, price);
            throw new IllegalArgumentException("input khong hop le");
        }

        double total = qty * price;
        LOG.info("ket qua tong={}", total);     // mốc kết thúc thành công
        return total;
    }
}
