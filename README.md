# hao-test-tools

让开发的自测更简单一些！

## 项目介绍

`hao-test-tools` 是一个 Java 工具库，旨在为开发者提供便捷的自测支持，提高自动化测试和模块化开发的效率。

目标：

- 简化单元测试和集成测试的配置
- 提供常用的工具类和辅助方法
- 易于集成到现有的 Spring Boot / Maven 项目中

---


## demo

<dependency>
    <groupId>io.github.haoyongqiang</groupId>
    <artifactId>hao-test-tools</artifactId>
    <version>1.0.0</version>
</dependency>

```java
import io.github.haoyongqiang1999.haotest.annotation.EnableHaoTest;
import io.github.haoyongqiang1999.haotest.service.TestTableService;

@SpringBootTest
@EnableHaoTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Autowired
    private TestTableService testTableService;
    @Test
    public void testGetById(){
        List<Object> queryParamList= testTableService.testTableInsert(
                "tbl_book(id,type):id-int-0,type-varchar-20,name-varchar-50,description-varchar-255",
                "id,type"
        ).getQueryParamList();
        Book book = bookService.getById((Integer) queryParamList.get(0));
        System.out.println(book);
    }
}

```

