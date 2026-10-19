package p116j3;

import android.graphics.PointF;
import p225s3.a;

/* JADX INFO: compiled from: IntegerKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g<Integer> {
    @Override // p116j3.a
    public final Object f(a aVar, float f10) {
        return Integer.valueOf(i(aVar, f10));
    }

    public final int i(a<Integer> aVar, float f10) {
        if (aVar.f46886b == null || aVar.f46887c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Integer num = aVar.f46886b;
        if (aVar.f46894k == 784923401) {
            aVar.f46894k = num.intValue();
        }
        int i10 = aVar.f46894k;
        if (aVar.f46895l == 784923401) {
            aVar.f46895l = aVar.f46887c.intValue();
        }
        int i11 = aVar.f46895l;
        PointF pointF = p214r3.f.f46331a;
        return (int) ((f10 * (i11 - i10)) + i10);
    }
}
