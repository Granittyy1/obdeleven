package p116j3;

import D9.o;
import p214r3.f;
import p225s3.a;

/* JADX INFO: compiled from: ColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g<Integer> {
    @Override // p116j3.a
    public final Object f(a aVar, float f10) {
        return Integer.valueOf(i(aVar, f10));
    }

    public final int i(a<Integer> aVar, float f10) {
        if (aVar.f46886b == null || aVar.f46887c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        return o.i(f.b(f10, 0.0f, 1.0f), aVar.f46886b.intValue(), aVar.f46887c.intValue());
    }
}
