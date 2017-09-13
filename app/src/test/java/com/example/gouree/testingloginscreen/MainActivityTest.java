package com.example.gouree.testingloginscreen;

import android.widget.EditText;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by omsai on 13/09/2017.
 */

//unit testing
public class MainActivityTest {
    @Test
    public void onCreate() throws Exception {

    }

    @Test

    public void checker() throws Exception {
        //input string to be tested for palindrome
        String input = "madam";
        //store output in output variable
        boolean output;

        //expected result
        boolean expected = true;

        //create an object of main activity and call the method to test result
        MainActivity m = new MainActivity();
        output= m.checker(input);

        //check for expected result vs actual output
        assertEquals(expected,output);


    }

}