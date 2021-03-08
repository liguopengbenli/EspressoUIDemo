package com.lig.intermediate.espressouidemo

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
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
    fun test_isActivityInView(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_title_nextButton(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))

        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))
        onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE))) // another way
    }

    @Test
    fun test_isTitleTextDisplayed(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainactivity)))
    }




}