package androidx.activity;

import A1.C0575j;
import android.window.BackEvent;

/* JADX INFO: renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackEventCompat.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0845b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8202d;

    public C0845b(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        float fC = C0844a.c(backEvent);
        float fD = C0844a.d(backEvent);
        float fA = C0844a.a(backEvent);
        int iB = C0844a.b(backEvent);
        this.f8199a = fC;
        this.f8200b = fD;
        this.f8201c = fA;
        this.f8202d = iB;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f8199a);
        sb2.append(", touchY=");
        sb2.append(this.f8200b);
        sb2.append(", progress=");
        sb2.append(this.f8201c);
        sb2.append(", swipeEdge=");
        return C0575j.b(sb2, this.f8202d, '}');
    }
}
