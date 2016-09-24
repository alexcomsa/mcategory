package io.autonomous.suite;

import io.autonomous.test.FunctionalTest;
import io.autonomous.test.OtherFunctionalTest;
import io.autonomus.categories.Sanity;
import io.autonomus.categories.Smoke;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by alex on 9/24/16.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Categories.ExcludeCategory(Sanity.class)
@Suite.SuiteClasses({FunctionalTest.class, OtherFunctionalTest.class})
    public class SmokeTestSuite {

}
