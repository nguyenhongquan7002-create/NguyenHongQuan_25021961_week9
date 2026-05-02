package org;

import java.nio.file.Path;
import java.nio.file.Paths;

// PathHelper: minh hoạ cách viết code chạy được trên nhiều OS (Windows, Linux, macOS)
// Tránh hardcode dấu '/' hay '\\' - dùng Path / File.separator
public class PathHelper {

    // Tạo đường dẫn từ thư mục + tên file
    // Paths.get tự động chọn dấu phân cách phù hợp với OS hiện tại
    public Path buildLogPath(String dir, String file) {
        return Paths.get(dir, file).toAbsolutePath();
    }

    // Trả về dấu phân cách của hệ thống ('/' trên Linux/Mac, '\\' trên Windows)
    public String separator() {
        return java.io.File.separator;
    }
}
