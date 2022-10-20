package com.example.androidtests;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest{

    // rule specifies that we are
    // running test on MainActivity
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    // test to check if the preferred language
    // of user is displayed under the chosen language or not
    @Test
    public void selectLanguageAndCheck(){
        onView(withId(R.id.german)) // ViewMatchers - withId(R.id.german) is to
                // specify that we are looking for Button
                // with id = R.id.german
                .perform(click()); // ViewActions - Performs click action on view.
        onView(withId(R.id.preferred_language)) // ViewMatchers - withId(R.id.preferred_language)
                // is to specify that we are looking for a TextView
                // with id = R.id.preferred_language
                .check(matches(withText("German"))); // ViewAssertions - validates if preferred_language
        // matches with the text "German" since we
        // pressed german language button.

    }
}


