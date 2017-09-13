package com.example.gouree.testingloginscreen;

import android.support.test.filters.SmallTest;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by omsai on 13/09/2017.
 */

//Example of instrumented testing

    public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>
    {

        public MainActivityTest()
        {
            super(MainActivity.class);
        }

        @Override
        protected void setUp() throws Exception {
            super.setUp();
        }

        //check for name edit text
        @SmallTest
        public void testedittext()
        {
            EditText name =(EditText)getActivity().findViewById(R.id.name);
            assertNotNull(name);
        }


        //check for button
        public void testbutton()
        {
            Button b1 =(Button) getActivity().findViewById(R.id.button);
            assertNotNull(b1);
        }


        @Override
        protected void tearDown() throws Exception {
            super.tearDown();
        }
    }



