package p116j3;

import Z3.n;
import android.graphics.PointF;
import java.util.List;
import p225s3.a;

/* JADX INFO: compiled from: PointKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends g<PointF> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PointF f41111h;

    public k(List<a<PointF>> list) {
        super(list);
        this.f41111h = new PointF();
    }

    @Override // p116j3.a
    public final Object f(a aVar, float f10) {
        return g(aVar, f10, f10, f10);
    }

    @Override // p116j3.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final PointF g(a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = aVar.f46886b;
        if (pointF2 == null || (pointF = aVar.f46887c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        PointF pointF5 = this.f41111h;
        float f13 = pointF3.x;
        float fB = n.b(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF5.set(fB, n.b(pointF4.y, f14, f12, f14));
        return pointF5;
    }
}
