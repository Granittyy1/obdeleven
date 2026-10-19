package androidx.compose.foundation.lazy.layout;

import java.util.List;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0988x extends androidx.compose.ui.layout.H {
    List<androidx.compose.ui.layout.Y> I0(int i10, long j);

    @Override // p013b0.c
    default long p(long j) {
        if (j != 9205357640488583168L) {
            return kotlinx.coroutines.C.c(v(Float.intBitsToFloat((int) (j >> 32))), v(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    @Override // p013b0.c
    default float u(int i10) {
        return i10 / getDensity();
    }

    @Override // p013b0.c
    default float v(float f10) {
        return f10 / getDensity();
    }
}
