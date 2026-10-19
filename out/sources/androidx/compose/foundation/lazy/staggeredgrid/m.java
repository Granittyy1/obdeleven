package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.foundation.lazy.layout.z;
import androidx.compose.ui.layout.Y;
import com.braze.support.BrazeLogger;
import java.util.List;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements C<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f10843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0988x f10844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f10845d;

    public m(boolean z10, f fVar, InterfaceC0988x interfaceC0988x, u uVar) {
        this.f10842a = z10;
        this.f10843b = fVar;
        this.f10844c = interfaceC0988x;
        this.f10845d = uVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.C
    public final z a(int i10, int i11, int i12, long j) {
        f fVar = this.f10843b;
        return b(i10, i11, i12, fVar.c(i10), fVar.f(i10), this.f10844c.I0(i10, j), j);
    }

    public abstract p b(int i10, int i11, int i12, Object obj, Object obj2, List<? extends Y> list, long j);

    public final p c(int i10, long j) {
        int i11;
        long jH;
        f fVar = this.f10843b;
        Object objC = fVar.c(i10);
        Object objF = fVar.f(i10);
        u uVar = this.f10845d;
        int[] iArr = (int[]) uVar.f10901c;
        int length = iArr.length;
        int i12 = (int) (j >> 32);
        int i13 = length - 1;
        if (i12 <= i13) {
            i13 = i12;
        }
        int i14 = ((int) (j & 4294967295L)) - i12;
        int i15 = length - i13;
        if (i14 > i15) {
            i14 = i15;
        }
        if (i14 == 1) {
            i11 = iArr[i13];
        } else {
            int[] iArr2 = (int[]) uVar.f10900b;
            int i16 = (i13 + i14) - 1;
            i11 = (iArr2[i16] + iArr[i16]) - iArr2[i13];
        }
        if (this.f10842a) {
            if (i11 < 0) {
                p013b0.i.a("width must be >= 0");
            }
            jH = p013b0.b.h(i11, i11, 0, BrazeLogger.SUPPRESS);
        } else {
            if (i11 < 0) {
                p013b0.i.a("height must be >= 0");
            }
            jH = p013b0.b.h(0, BrazeLogger.SUPPRESS, i11, i11);
        }
        long j10 = jH;
        return b(i10, i13, i14, objC, objF, this.f10844c.I0(i10, j10), j10);
    }
}
