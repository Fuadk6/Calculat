package com.example.nikonorov.gleb.simplecalculator;


import static android.support.test.espresso.Espresso.onView;

import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class calCTest {

    //Launch the app
    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<>(MainActivity.class);
    //With the @Rule we are instructing to launch the MainiActivity
    //Now we will write test with @Test
    //The test is to verify if we can do addition
    @Test
    public void verifyAddTwoNumbers () throws Exception{
        //Now we need to statically import onView method from Espresso class to avoid writing Espresso
        //every time i write the method
        //
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.adButton)).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.equalsButton)).perform(click());
        //Result is four or not
        onView(withId(R.id.outputLabel)).check(matches(withText("4")));
        Thread.sleep(5000);

        //Espresso -> work with a view
        //ViewMatchers -> Identify the element
        //ViewActions -> Perform some actions on the element
        //ViewAssertions -> Validation

    }
}
