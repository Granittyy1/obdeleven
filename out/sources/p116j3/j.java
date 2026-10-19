package p116j3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import p225s3.a;

/* JADX INFO: compiled from: PathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g<PointF> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PointF f41108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f41109i;
    public final PathMeasure j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f41110k;

    public j(ArrayList arrayList) {
        super(arrayList);
        this.f41108h = new PointF();
        this.f41109i = new float[2];
        this.j = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p116j3.a
    public final Object f(a aVar, float f10) {
        i iVar = (i) aVar;
        Path path = iVar.f41106q;
        if (path == null) {
            return (PointF) aVar.f46886b;
        }
        i iVar2 = this.f41110k;
        PathMeasure pathMeasure = this.j;
        if (iVar2 != iVar) {
            pathMeasure.setPath(path, false);
            this.f41110k = iVar;
        }
        float length = pathMeasure.getLength() * f10;
        float[] fArr = this.f41109i;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF = this.f41108h;
        pointF.set(fArr[0], fArr[1]);
        return pointF;
    }
}
