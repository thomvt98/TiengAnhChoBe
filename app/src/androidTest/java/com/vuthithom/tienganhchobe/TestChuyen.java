package com.vuthithom.tienganhchobe;

import android.app.Instrumentation;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

/**
 * Created by vuthithom on 4/5/2018.
 */

public class TestChuyen extends ActivityInstrumentationTestCase2<ChuyenManHinh> {
    ChuyenManHinh chuyenManHinh;

    // đây
    public TestChuyen() {
        super(ChuyenManHinh.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(false);
        chuyenManHinh = getActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testOpenNextActivity() {
        // register next activity that need to be monitored.
        Instrumentation.ActivityMonitor activityMonitor = getInstrumentation().addMonitor(MainActivity.class.getName(), null, false);

        // open current activity.


        //Watch for the timeout
        //example values 5000 if in ms, or 5 if it's in seconds.
        MainActivity mainActivity = (MainActivity) getInstrumentation().waitForMonitorWithTimeout(activityMonitor, 4000);
        // next activity is opened and captured.


        assertNotNull(mainActivity);


    }

}
