package p116j3;

import p214r3.f;
import p225s3.a;

/* JADX INFO: compiled from: FloatKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g<Float> {
    public d() {
        throw null;
    }

    @Override // p116j3.a
    public final Object f(a aVar, float f10) {
        return Float.valueOf(j(aVar, f10));
    }

    public final float i() {
        return j(this.f41084c.b(), c());
    }

    public final float j(a<Float> aVar, float f10) {
        if (aVar.f46886b == null || aVar.f46887c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Float f11 = aVar.f46886b;
        if (aVar.f46893i == -3987645.8f) {
            aVar.f46893i = f11.floatValue();
        }
        float f12 = aVar.f46893i;
        if (aVar.j == -3987645.8f) {
            aVar.j = aVar.f46887c.floatValue();
        }
        return f.d(f12, aVar.j, f10);
    }
}
