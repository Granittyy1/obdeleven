package p259v1;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p078g1.y;
import p114j1.k;
import p272w1.c;

/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f47516f;

    /* JADX INFO: renamed from: v1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class C0543a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f47518b;

        public C0543a(long j, long j10) {
            this.f47517a = j;
            this.f47518b = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0543a)) {
                return false;
            }
            C0543a c0543a = (C0543a) obj;
            return this.f47517a == c0543a.f47517a && this.f47518b == c0543a.f47518b;
        }

        public final int hashCode() {
            return (((int) this.f47517a) * 31) + ((int) this.f47518b);
        }
    }

    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class b {
    }

    public a(y yVar, int[] iArr, c cVar, long j, long j10, ImmutableList immutableList) {
        super(yVar, iArr);
        if (j10 < j) {
            k.f("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f47516f = cVar;
        ImmutableList.G(immutableList);
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j10 : jArr) {
            j += j10;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ImmutableList.a aVar = (ImmutableList.a) arrayList.get(i10);
            if (aVar != null) {
                aVar.c(new C0543a(j, jArr[i10]));
            }
        }
    }

    @Override // p259v1.c, p259v1.t
    public final void d() {
    }

    @Override // p259v1.c, p259v1.t
    public final void f() {
    }

    @Override // p259v1.c, p259v1.t
    public final void i(float f10) {
    }
}
