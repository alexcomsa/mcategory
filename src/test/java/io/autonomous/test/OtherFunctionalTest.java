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
public class OtherFunctionalTest {

    private static Logger log  = Logger.getLogger(OtherFunctionalTest.class.getName());


    @Rule
    public TestName name = new TestName();

    @Rule
    public TestCategory category = new TestCategory();

    @BeforeClass
    public static void init(){
        log.info("Entering class :"+OtherFunctionalTest.class.getCanonicalName());
    }

    @AfterClass
    public static void tearDown(){
        log.info("Exiting class : "+OtherFunctionalTest.class.getCanonicalName());
    }

    @Test
    @Category(Smoke.class)
    public void otherFunctionalTestCase(){

        log.info("Running otherFunctionalTestCase test from category: "+category.toString());
        Assert.assertEquals("otherFunctionalTestCase",name.getMethodName());

    }

    @Test
    @Category(Sanity.class)
    public void otherDifferentFunctionalTestCase(){

        log.info("Running otherDifferentFunctionalTestCase test from category: "+category.toString());
        Assert.assertEquals("otherDifferentFunctionalTestCase",name.getMethodName());

    }
}
