package com.vuthithom.tienganhchobe;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.main.Activity_Start;

/**
 * Created by vuthithom on 4/4/2018.
 */

public class TestManHinhChuyen extends ActivityInstrumentationTestCase2<MainActivity> {
    ImageView btnOpen;
    MainActivity chuyenManHinh;

    public TestManHinhChuyen() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        chuyenManHinh = getActivity();
        setActivityInitialTouchMode(false);
        btnOpen = chuyenManHinh.findViewById(R.id.imstart);

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testlist() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_Start.class.getName(), null, false);
        TouchUtils.clickView(this, btnOpen);
        Activity_Start listenAct = (Activity_Start) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

}
