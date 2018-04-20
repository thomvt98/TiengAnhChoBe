package com.vuthithom.tienganhchobe;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.main.Acitivity_BaiHoc;
import com.vuthithom.tienganhchobe.main.ActVideo;
import com.vuthithom.tienganhchobe.main.Activity_Start;

/**
 * Created by vuthithom on 4/4/2018.
 */

public class TestActivityStast extends ActivityInstrumentationTestCase2<Activity_Start> {
    Activity_Start activity_start;
    ImageView imbaihoc, imggiaitri;

    public TestActivityStast() {
        super(Activity_Start.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity_start = getActivity();
        setActivityInitialTouchMode(false);
        imbaihoc = activity_start.findViewById(R.id.baihoc);
        imggiaitri = activity_start.findViewById(R.id.giaitri);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testlist() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Acitivity_BaiHoc.class.getName(), null, false);
        TouchUtils.clickView(this, imbaihoc);
        Acitivity_BaiHoc listenAct = (Acitivity_BaiHoc) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testlistgioitri() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(ActVideo.class.getName(), null, false);
        TouchUtils.clickView(this, imggiaitri);
        ActVideo listenActt = (ActVideo) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenActt);
    }
}
