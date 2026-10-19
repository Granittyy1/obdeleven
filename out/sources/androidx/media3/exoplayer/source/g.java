package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.r0;
import java.io.IOException;
import p235t1.r;
import p235t1.w;
import p259v1.t;

/* JADX INFO: compiled from: MediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public interface g extends m {

    /* JADX INFO: compiled from: MediaPeriod.java */
    public interface a extends m.a<g> {
        void b(g gVar);
    }

    void d() throws IOException;

    long e(long j, r0 r0Var);

    long f(long j);

    long k();

    long l(t[] tVarArr, boolean[] zArr, r[] rVarArr, boolean[] zArr2, long j);

    void m(a aVar, long j);

    w n();

    void r(long j, boolean z10);
}
