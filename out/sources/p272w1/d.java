package p272w1;

import java.util.Arrays;
import p114j1.A;

/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47700d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47697a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47698b = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47701e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f47702f = new a[100];

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f47699c;
        this.f47699c = i10;
        if (z10) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, A.e(this.f47699c, this.f47698b) - this.f47700d);
        int i10 = this.f47701e;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f47702f, iMax, i10, (Object) null);
        this.f47701e = iMax;
    }
}
