package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: compiled from: ScreenTraceUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p241t7.a f28506a = p241t7.a.d();

    public static void a(Trace trace, p253u7.b bVar) {
        int i10 = bVar.f47439a;
        if (i10 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_TOTAL.toString(), i10);
        }
        int i11 = bVar.f47440b;
        if (i11 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_SLOW.toString(), i11);
        }
        int i12 = bVar.f47441c;
        if (i12 > 0) {
            trace.putMetric(Constants$CounterNames.FRAMES_FROZEN.toString(), i12);
        }
        String str = trace.f28464e;
        f28506a.a();
    }
}
