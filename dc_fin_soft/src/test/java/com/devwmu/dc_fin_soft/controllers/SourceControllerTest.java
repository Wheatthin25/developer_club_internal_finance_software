package com.devwmu.dc_fin_soft.controllers;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.devwmu.dc_fin_soft.controllers.*;
import com.devwmu.dc_fin_soft.entities.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@WebMvcTest(Source.class)
public class SourceControllerTest {
    // web level testing - tests that path goes to correct function
    @Nested
    class getAllSourcesTest{
        // individual tests
    }

    @Nested
    class filterSourcesTest{
        // individual tests
    }

    @Nested
    class createSourceTest{
        // individual tests
    }

    @Nested
    class editSourceTest{
        // individual tests
    }

    @Nested
    class deleteSourceTest{
        // individual tests
    }

}


// Needs integrated testing and standard testing (add integration testing later)
@SpringBootTest
class SourceControllerTestInt {
    // web level testing - tests that path goes to correct function
    @Nested
    class getAllSourcesTest{
        // individual tests
    }

    @Nested
    class filterSourcesTest{
        // individual tests
    }

    @Nested
    class createSourceTest{
        // individual tests
    }

    @Nested
    class editSourceTest{
        // individual tests
    }

    @Nested
    class deleteSourceTest{
        // individual tests
    }

}