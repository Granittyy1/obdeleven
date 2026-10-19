package androidx.compose.ui.graphics.colorspace;

import android.os.Bundle;
import androidx.fragment.app.E;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements j, j1.j.a, E, okhttp3.m.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13615c;

    public /* synthetic */ s(int i10, Object obj) {
        this.f13614b = i10;
        this.f13615c = obj;
    }

    @Override // okhttp3.m.b
    public okhttp3.m c(okhttp3.internal.connection.e eVar) {
        okhttp3.m.a this_asFactory = (okhttp3.m.a) this.f13615c;
        kotlin.jvm.internal.i.e(this_asFactory, "$this_asFactory");
        return this_asFactory;
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        t tVar = (t) this.f13615c;
        double d11 = tVar.f13620e;
        double d12 = tVar.f13619d;
        return d10 >= d11 * d12 ? (Math.pow(d10, 1.0d / tVar.f13616a) - tVar.f13618c) / tVar.f13617b : d10 / d12;
    }

    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String p10) {
        Ia.p tmp0 = (Ia.p) this.f13615c;
        kotlin.jvm.internal.i.e(tmp0, "$tmp0");
        kotlin.jvm.internal.i.e(p10, "p0");
        tmp0.invoke(p10, bundle);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        switch (this.f13614b) {
            case 1:
                ((g1.v.c) obj).d0((p078g1.s) this.f13615c);
                break;
            default:
                ((p162n1.b) obj).c((ExoPlaybackException) this.f13615c);
                break;
        }
    }

    public /* synthetic */ s(n1.b.a aVar, ExoPlaybackException exoPlaybackException) {
        this.f13614b = 3;
        this.f13615c = exoPlaybackException;
    }
}
