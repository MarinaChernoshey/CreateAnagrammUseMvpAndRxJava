package com.example.fanmu.task1anagrams.Mvp;

import android.support.test.rule.ActivityTestRule;

import com.example.fanmu.task1anagrams.R;
import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    ///java -jar spoon-runner-1.7.1-jar-with-dependencies.jar --apk app/build/outputs/apk/debug/app-debug.apk --test-apk app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk --sdk C:/Users/fanMU/AppData/Local/Android/Sdk

    @Test
    public void onCreate() {
        onView(withId(R.id.editText)).perform(typeText("and!123roid test123 123anagram"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("dio!123rdna tset123 123margana")));
    }
}