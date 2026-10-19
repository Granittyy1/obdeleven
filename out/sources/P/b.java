package P;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PointerIdArray.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f4882b;

    public final void a(long j) {
        if (b(j)) {
            return;
        }
        int i10 = this.f4881a;
        long[] jArrCopyOf = this.f4882b;
        if (i10 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i10 + 1, jArrCopyOf.length * 2));
            i.d(jArrCopyOf, "copyOf(...)");
            this.f4882b = jArrCopyOf;
        }
        jArrCopyOf[i10] = j;
        if (i10 >= this.f4881a) {
            this.f4881a = i10 + 1;
        }
    }

    public final boolean b(long j) {
        int i10 = this.f4881a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f4882b[i11] == j) {
                return true;
            }
        }
        return false;
    }

    public final void c(long j) {
        int i10 = this.f4881a;
        int i11 = 0;
        while (i11 < i10) {
            if (j == this.f4882b[i11]) {
                int i12 = this.f4881a - 1;
                while (i11 < i12) {
                    long[] jArr = this.f4882b;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f4881a--;
                return;
            }
            i11++;
        }
    }
}
