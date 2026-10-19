package p164n3;

import Z3.o;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p142l3.a;

/* JADX INFO: compiled from: ShapeData.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f44851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44852c;

    public h(PointF pointF, boolean z10, List<a> list) {
        this.f44851b = pointF;
        this.f44852c = z10;
        this.f44850a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f44851b == null) {
            this.f44851b = new PointF();
        }
        this.f44851b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f44850a.size());
        sb2.append("closed=");
        return o.d(sb2, this.f44852c, '}');
    }

    public h() {
        this.f44850a = new ArrayList();
    }
}
