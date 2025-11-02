package io.github.haoyongqiang1999.haotest.annotation;

import io.github.haoyongqiang1999.haotest.config.TestTableModuleConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(TestTableModuleConfiguration.class)
@MapperScan("io.github.haoyongqiang1999.haotest.dao")
public @interface EnableHaoTest {

}
