package io.github.haoyongqiang1999.haotest.config;

import io.github.haoyongqiang1999.haotest.service.TestTableService;
import io.github.haoyongqiang1999.haotest.service.impl.TestTableServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestTableModuleConfiguration {
    @Bean
    public TestTableService testTableService () {
        return new TestTableServiceImpl();
    }
}
