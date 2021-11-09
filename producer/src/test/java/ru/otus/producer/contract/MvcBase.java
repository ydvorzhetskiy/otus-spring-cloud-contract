package ru.otus.producer.contract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.otus.producer.rest.ExampleController;

@SpringBootTest
public class MvcBase {

    @Autowired
    ExampleController exampleController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(exampleController);
    }

}
