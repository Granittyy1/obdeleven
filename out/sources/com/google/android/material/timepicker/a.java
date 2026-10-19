package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: ClockFaceView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27675b;

    public a(ClockFaceView clockFaceView) {
        this.f27675b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f27675b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f27653u.f27663f) - clockFaceView.f27646C;
        if (height != clockFaceView.f27678s) {
            clockFaceView.f27678s = height;
            clockFaceView.q();
            int i10 = clockFaceView.f27678s;
            ClockHandView clockHandView = clockFaceView.f27653u;
            clockHandView.f27670n = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
