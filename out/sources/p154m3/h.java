package p154m3;

import android.graphics.PointF;
import java.util.List;
import p116j3.a;
import p116j3.d;
import p116j3.n;

/* JADX INFO: compiled from: AnimatableSplitDimensionPathValue.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k<PointF, PointF> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f44581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f44582c;

    public h(b bVar, b bVar2) {
        this.f44581b = bVar;
        this.f44582c = bVar2;
    }

    @Override // p154m3.k
    public final a<PointF, PointF> a() {
        return new n((d) this.f44581b.a(), (d) this.f44582c.a());
    }

    @Override // p154m3.k
    public final List<p225s3.a<PointF>> e() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p154m3.k
    public final boolean k() {
        return this.f44581b.k() && this.f44582c.k();
    }
}
