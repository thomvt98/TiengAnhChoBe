package com.vuthithom.tienganhchobe;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;

import com.vuthithom.tienganhchobe.main.Activity_DongVat;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.action.ViewActions.click;


/**
 * Created by vuthithom on 4/5/2018.
 */

public class TestDongVat extends ActivityInstrumentationTestCase2<Activity_DongVat> {
    Activity_DongVat activity_dongVat;

    public TestDongVat() {
        super(Activity_DongVat.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(false);
        activity_dongVat = getActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGirdView() {

        Espresso.onView(ViewMatchers.withId(R.id.gv_dongvat)).perform(ViewActions.click());
    }
}
