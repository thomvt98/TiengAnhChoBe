package com.vuthithom.tienganhchobe;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.ImageView;

import com.vuthithom.tienganhchobe.main.Acitivity_BaiHoc;
import com.vuthithom.tienganhchobe.main.ActivityQua;
import com.vuthithom.tienganhchobe.main.Activity_BangChu;
import com.vuthithom.tienganhchobe.main.Activity_Color;
import com.vuthithom.tienganhchobe.main.Activity_DongVat;
import com.vuthithom.tienganhchobe.main.Activity_Hoa;
import com.vuthithom.tienganhchobe.main.Activity_QuocGia;
import com.vuthithom.tienganhchobe.main.Activity_SoDem;
import com.vuthithom.tienganhchobe.main.Activity_TruongHoc;

/**
 * Created by vuthithom on 4/4/2018.
 */

public class TestBaiHoc extends ActivityInstrumentationTestCase2<Acitivity_BaiHoc> {
    Acitivity_BaiHoc acitivity_baiHoc;
    ImageView imbangchu, imgso, imgdongvat, imgmau, imgqua, imghoa, imgtruonghoc, imgquocgia;

    public TestBaiHoc() {
        super(Acitivity_BaiHoc.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        acitivity_baiHoc = getActivity();
        setActivityInitialTouchMode(false);
        imbangchu = acitivity_baiHoc.findViewById(R.id.iv_bangchu);
        imgso = acitivity_baiHoc.findViewById(R.id.iv_number);
        imgdongvat = acitivity_baiHoc.findViewById(R.id.iv_dongvat);
        imgmau = acitivity_baiHoc.findViewById(R.id.iv_mauxac);
        imgqua = acitivity_baiHoc.findViewById(R.id.iv_qua);
        imghoa = acitivity_baiHoc.findViewById(R.id.iv_hoa);
        imgtruonghoc = acitivity_baiHoc.findViewById(R.id.iv_truonghoc);
        imgquocgia = acitivity_baiHoc.findViewById(R.id.iv_quocgiav);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testbangchu() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_BangChu.class.getName(), null, false);
        TouchUtils.clickView(this, imbangchu);
        Activity_BangChu listenAct = (Activity_BangChu) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testso() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_SoDem.class.getName(), null, false);
        TouchUtils.clickView(this, imgso);
        Activity_SoDem listenAct = (Activity_SoDem) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testdongvat() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_DongVat.class.getName(), null, false);
        TouchUtils.clickView(this, imgdongvat);
        Activity_DongVat listenAct = (Activity_DongVat) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testmauxac() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_Color.class.getName(), null, false);
        TouchUtils.clickView(this, imgmau);
        Activity_Color listenAct = (Activity_Color) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testquocgia() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_QuocGia.class.getName(), null, false);
        TouchUtils.clickView(this, imgquocgia);
        Activity_QuocGia listenAct = (Activity_QuocGia) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testtruonghoc() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_TruongHoc.class.getName(), null, false);
        TouchUtils.clickView(this, imgtruonghoc);
        Activity_TruongHoc listenAct = (Activity_TruongHoc) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testqua() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(ActivityQua.class.getName(), null, false);
        TouchUtils.clickView(this, imgqua);
        ActivityQua listenAct = (ActivityQua) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }

    public void testhoa() {
        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(Activity_Hoa.class.getName(), null, false);
        TouchUtils.clickView(this, imghoa);
        Activity_Hoa listenAct = (Activity_Hoa) monitor.waitForActivityWithTimeout(2000);
        assertNotNull(listenAct);
    }
}
