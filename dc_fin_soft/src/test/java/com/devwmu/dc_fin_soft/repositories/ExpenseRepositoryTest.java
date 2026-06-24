package com.devwmu.dc_fin_soft.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.autoconfigure.*;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import com.devwmu.dc_fin_soft.repositories.ExpenseRepository;


@DataJpaTest
class ExpenseRepositoryTest {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Test
    void contextLoads() {
        return;
    }
}
