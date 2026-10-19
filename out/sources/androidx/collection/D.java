package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0887o {
    public D(int i10) {
        this.f9197a = i10 == 0 ? C0890s.f9209a : new long[i10];
    }

    public final void a(long j) {
        int i10 = this.f9198b + 1;
        long[] jArr = this.f9197a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            kotlin.jvm.internal.i.d(jArrCopyOf, "copyOf(...)");
            this.f9197a = jArrCopyOf;
        }
        long[] jArr2 = this.f9197a;
        int i11 = this.f9198b;
        jArr2[i11] = j;
        this.f9198b = i11 + 1;
    }
}
