package io.autonomous.test;

import io.autonomus.categories.Sanity;
import io.autonomus.categories.Smoke;
import io.autonomus.categories.TestCategory;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

import java.util.logging.Logger;

/**
 * Created by alex on 9/24/16.
 */
public class FunctionalTest {


    private static Logger log  = Logger.getLogger(FunctionalTest.class.getName());

    @Rule
    public TestName name = new TestName();

    @Rule
    public TestCategory category = new TestCategory();

    @BeforeClass
    public static void init(){
        log.info("Entering class :"+FunctionalTest.class.getCanonicalName());
    }

    @AfterClass
    public static void tearDown(){
        log.info("Exiting class : "+FunctionalTest.class.getCanonicalName());
    }

    @Test
    @Category(Sanity.class)
    public void someTestCase(){
        log.info("Running someTestCase test from category: "+category.toString());
        Assert.assertEquals("someTestCase",name.getMethodName());

    }


    @Test
    @Category(Smoke.class)
    public void someOtherTestCase(){


        log.info("Running someOtherTestCase test from category: "+category.toString());
        Assert.assertEquals("someOtherTestCase",name.getMethodName());
    }



}
