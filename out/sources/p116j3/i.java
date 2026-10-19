package p116j3;

import android.graphics.Path;
import android.graphics.PointF;
import p079g3.b;
import p214r3.g;
import p225s3.a;

/* JADX INFO: compiled from: PathKeyframe.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a<PointF> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f41106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a<PointF> f41107r;

    public i(b bVar, a<PointF> aVar) {
        super(bVar, aVar.f46886b, aVar.f46887c, aVar.f46888d, aVar.f46889e, aVar.f46890f, aVar.f46891g, aVar.f46892h);
        this.f41107r = aVar;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        T t8;
        T t10 = this.f46887c;
        T t11 = this.f46886b;
        boolean z10 = (t10 == 0 || t11 == 0 || !((PointF) t11).equals(((PointF) t10).x, ((PointF) t10).y)) ? false : true;
        if (t11 == 0 || (t8 = this.f46887c) == 0 || z10) {
            return;
        }
        PointF pointF = (PointF) t11;
        PointF pointF2 = (PointF) t8;
        a<PointF> aVar = this.f41107r;
        PointF pointF3 = aVar.f46898o;
        PointF pointF4 = aVar.f46899p;
        g.a aVar2 = g.f46332a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f10 = pointF3.x + pointF.x;
            float f11 = pointF.y + pointF3.y;
            float f12 = pointF2.x;
            float f13 = f12 + pointF4.x;
            float f14 = pointF2.y;
            path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        }
        this.f41106q = path;
    }
}
