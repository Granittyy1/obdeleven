package p272w1;

import Z3.n;
import androidx.compose.foundation.lazy.layout.A;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: SlidingPercentile.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A f47725g = new A(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f47726h = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47732f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f47728b = new a[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f47727a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47729c = -1;

    /* JADX INFO: compiled from: SlidingPercentile.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f47735c;
    }

    public final void a(float f10, int i10) {
        a aVar;
        int i11 = this.f47729c;
        ArrayList<a> arrayList = this.f47727a;
        if (i11 != 1) {
            Collections.sort(arrayList, f47725g);
            this.f47729c = 1;
        }
        int i12 = this.f47732f;
        a[] aVarArr = this.f47728b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f47732f = i13;
            aVar = aVarArr[i13];
        } else {
            aVar = new a();
        }
        int i14 = this.f47730d;
        this.f47730d = i14 + 1;
        aVar.f47733a = i14;
        aVar.f47734b = i10;
        aVar.f47735c = f10;
        arrayList.add(aVar);
        this.f47731e += i10;
        while (true) {
            int i15 = this.f47731e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            a aVar2 = arrayList.get(0);
            int i17 = aVar2.f47734b;
            if (i17 <= i16) {
                this.f47731e -= i17;
                arrayList.remove(0);
                int i18 = this.f47732f;
                if (i18 < 5) {
                    this.f47732f = i18 + 1;
                    aVarArr[i18] = aVar2;
                }
            } else {
                aVar2.f47734b = i17 - i16;
                this.f47731e -= i16;
            }
        }
    }

    public final float b() {
        int i10 = this.f47729c;
        ArrayList<a> arrayList = this.f47727a;
        if (i10 != 0) {
            Collections.sort(arrayList, f47726h);
            this.f47729c = 0;
        }
        float f10 = 0.5f * this.f47731e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar = arrayList.get(i12);
            i11 += aVar.f47734b;
            if (i11 >= f10) {
                return aVar.f47735c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((a) n.f(1, arrayList)).f47735c;
    }
}
