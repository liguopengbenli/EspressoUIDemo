package com.lig.intermediate.espressouidemo

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith


/*
* The test is launched  in alphabetical order
* */
@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @Test
    fun test_navSecondaryActivity(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
    }

    @Test
    fun test_backPress_toAminActivity(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))

        //onView(withId(R.id.button_back)).perform(click()) // method 1
        pressBack() // method 2
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }


}