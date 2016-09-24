package io.autonomus.categories;

import org.junit.experimental.categories.Category;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.Arrays;

/**
 * Created by alex on 9/24/16.
 */
public class TestCategory  extends TestWatcher{

    private String[] categories;


    protected void starting(Description d) {
       Category existing = d.getAnnotation(Category.class);
        Class<?>[] values = existing.value();

        if(values!=null){
            categories = new String[values.length];
            for(int index=0;index<values.length;index++){

                categories[index]=values[index].getCanonicalName();

            }
        }

    }

    @Override
    public String toString(){
        return Arrays.toString(categories);
    }

}
