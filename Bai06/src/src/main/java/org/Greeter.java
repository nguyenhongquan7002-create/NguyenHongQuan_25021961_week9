package org;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Greeter: dùng commons-lang3 và slf4j để pom.xml có nhiều dependency
// -> minh hoạ rõ lợi ích của caching ~/.m2/repository trong CI
public class Greeter {
    private static final Logger LOG = LoggerFactory.getLogger(Greeter.class);

    // Trả về câu chào, nếu name rỗng/null thì dùng "guest"
    public String hello(String name) {
        // defaultIfBlank của commons-lang3: trả về default nếu chuỗi blank
        String safe = StringUtils.defaultIfBlank(name, "guest");
        LOG.info("hello {}", safe);
        // capitalize: viết hoa chữ cái đầu
        return "Hello, " + StringUtils.capitalize(safe);
    }
}
