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
@WebMvcTest(Expense.class)
public class ExpenseControllerTest {
    // web level testing - tests that path goes to correct function
    @Nested
    class filterExpensesTest{
        // individual tests
    }

    @Nested
    class editItemTest{
        // individual tests
    }

    @Nested
    class budgetItemTest{
        // individual tests
    }

    @Nested
    class FoodFlagItemTest{
        // individual tests
    }

    @Nested
    class requestedFlagItemTest{
        // individual tests
    }

    @Nested
    class SBuyingFlagItemTest{
        // individual tests
    }

    @Nested
    class fBuyingFlagItemTest{
        // individual tests
    }

    @Nested
    class pickedUpFlagItemTest{
        // individual tests
    }

    @Nested
    class reimbursedFlagItemTest{
        // individual tests
    }

    @Nested
    class deleteItemTest{
        // individual tests
    }

    @Nested
    class createOperationalAllocationFormTest{
        // individual tests
    }

    @Nested
    class allocationNotSpentAlertTest{
        // individual tests
    }

    @Nested
    class foodBudgetTooHighAlertTest{
        // individual tests
    }

    @Nested
    class allocationTooBigAlertTest{
        // individual tests
    }

    @Nested
    class deadlinePastAlertTest{
        // individual tests
    }

    @Nested
    class calculateRecommendedTotalPriceTest{
        // individual tests
    }

    @Nested
    class calculateRecommendedSourceTest{
        // individual tests
    }

    @Nested
    class addReceiptTest{
        // individual tests
    }

}


// Needs integrated testing and standard testing (add integration testing later)
@SpringBootTest
class ExpenseControllerTestInt {
    // web level testing - tests that path goes to correct function
    @Nested
    class filterExpensesTest{
        // individual tests
    }

    @Nested
    class editItemTest{
        // individual tests
    }

    @Nested
    class budgetItemTest{
        // individual tests
    }

    @Nested
    class FoodFlagItemTest{
        // individual tests
    }

    @Nested
    class requestedFlagItemTest{
        // individual tests
    }

    @Nested
    class SBuyingFlagItemTest{
        // individual tests
    }

    @Nested
    class fBuyingFlagItemTest{
        // individual tests
    }

    @Nested
    class pickedUpFlagItemTest{
        // individual tests
    }

    @Nested
    class reimbursedFlagItemTest{
        // individual tests
    }

    @Nested
    class deleteItemTest{
        // individual tests
    }

    @Nested
    class createOperationalAllocationFormTest{
        // individual tests
    }

    @Nested
    class allocationNotSpentAlertTest{
        // individual tests
    }

    @Nested
    class foodBudgetTooHighAlertTest{
        // individual tests
    }

    @Nested
    class allocationTooBigAlertTest{
        // individual tests
    }

    @Nested
    class deadlinePastAlertTest{
        // individual tests
    }

    @Nested
    class calculateRecommendedTotalPriceTest{
        // individual tests
    }

    @Nested
    class calculateRecommendedSourceTest{
        // individual tests
    }

    @Nested
    class addReceiptTest{
        // individual tests
    }

}