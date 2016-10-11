package com.ironyard.Services;

import com.ironyard.Data.Budget;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by nathanielellsworth on 10/7/16.
 */
public class DatabaseLineServiceTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAllBudgets() throws Exception {

    }

    @Test
    public void getBudgetTotals() throws Exception {

    }

    @Test
    public void search() throws Exception {

    }

    @Test
    public void save() throws Exception {
        DatabaseLineService dbService = new DatabaseLineService();

        //declare
        Budget b = null;
        // assign
        b = new Budget();

        // set values
        b.setActualAmount(123);
        b.setBudgetAmount(456);
        b.setCategory("Hello");
        b.setDescription("Goodbye");

        dbService.save(b);

        Budget fetched = dbService.getBudgetById(b.getId());
        assertNotNull(fetched);
        assertEquals(b.getCategory(), fetched.getCategory());

    }

    @Test
    public void getBudgetById() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}