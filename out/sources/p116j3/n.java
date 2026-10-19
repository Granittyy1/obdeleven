package p116j3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import p225s3.a;

/* JADX INFO: compiled from: SplitDimensionPathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PointF f41115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f41116i;
    public final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f41117k;

    public n(d dVar, d dVar2) {
        super(Collections.emptyList());
        this.f41115h = new PointF();
        this.f41116i = new PointF();
        this.j = dVar;
        this.f41117k = dVar2;
        h(this.f41085d);
    }

    @Override // p116j3.a
    public final PointF e() {
        return i(0.0f);
    }

    @Override // p116j3.a
    public final /* bridge */ /* synthetic */ PointF f(a<PointF> aVar, float f10) {
        return i(f10);
    }

    @Override // p116j3.a
    public final void h(float f10) {
        d dVar = this.j;
        dVar.h(f10);
        d dVar2 = this.f41117k;
        dVar2.h(f10);
        this.f41115h.set(dVar.e().floatValue(), dVar2.e().floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f41082a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a.InterfaceC0468a) arrayList.get(i10)).a();
            i10++;
        }
    }

    public final PointF i(float f10) {
        PointF pointF = this.f41115h;
        PointF pointF2 = this.f41116i;
        pointF2.set(pointF.x, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }
}
