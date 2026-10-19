package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import java.io.IOException;
import p078g1.t;
import p114j1.A;
import p114j1.k;

/* JADX INFO: compiled from: DefaultMediaCodecAdapterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18568a;

    public b(Context context) {
        this.f18568a = context;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c.b
    public final c a(c.a aVar) throws IOException {
        Context context;
        int i10 = A.f40996a;
        if (i10 < 23 || (i10 < 31 && ((context = this.f18568a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new g.a().a(aVar);
        }
        int iH = t.h(aVar.f18571c.f35302n);
        k.e("Creating an asynchronous MediaCodec adapter for track type " + A.x(iH));
        return new a.C0188a(new p212r1.b(iH), new p212r1.c(iH)).a(aVar);
    }
}
