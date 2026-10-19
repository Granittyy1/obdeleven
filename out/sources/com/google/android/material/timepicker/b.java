package com.google.android.material.timepicker;

import B0.s;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.C1286a;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ClockFaceView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends C1286a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27676a;

    public b(ClockFaceView clockFaceView) {
        this.f27676a = clockFaceView;
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
        super.onInitializeAccessibilityNodeInfo(view, sVar);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            sVar.f1411a.setTraversalAfter(this.f27676a.f27657y.get(iIntValue - 1));
        }
        sVar.l(s.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
        sVar.j(true);
        sVar.b(s.a.f1416g);
    }

    @Override // androidx.core.view.C1286a
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.performAccessibilityAction(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f27676a;
        view.getHitRect(clockFaceView.f27654v);
        float fCenterX = clockFaceView.f27654v.centerX();
        float fCenterY = clockFaceView.f27654v.centerY();
        clockFaceView.f27653u.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f27653u.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
