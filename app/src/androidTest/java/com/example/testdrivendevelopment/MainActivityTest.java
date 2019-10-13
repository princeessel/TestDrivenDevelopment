package com.example.testdrivendevelopment;

import android.widget.EditText;
import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    private MainActivity mainActivity;
    private TextView textView;
    private EditText editText;
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();
        textView = mainActivity.findViewById(R.id.textView1);
        editText = mainActivity.findViewById(R.id.editText1);
    }

    @Test
    public void testExample(){
        assertEquals("Prince Otis", textView.getText().toString());
//        assertEquals("esselotis@gmail.com", editText.getText().toString());

//        assertTrue("eprinceotis@yahoo.com", mainActivity.isValidEmail(editText.getText().toString()));

    }

    @Test
    public void testMail(){
        assertTrue("eprinceotis@yahoo.com", mainActivity.isValidMail(editText.getText().toString()));

    }

    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}