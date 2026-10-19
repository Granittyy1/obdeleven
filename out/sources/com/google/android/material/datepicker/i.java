package com.google.android.material.datepicker;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f27063c;

    public i(MaterialCalendar materialCalendar, int i10) {
        this.f27063c = materialCalendar;
        this.f27062b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27063c.f27019k.m0(this.f27062b);
    }
}
