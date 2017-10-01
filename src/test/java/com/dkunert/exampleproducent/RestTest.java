package com.dkunert.exampleproducent;


import com.dkunert.exampleproducent.controller.PersonController;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

public class RestTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new PersonController());
    }
}