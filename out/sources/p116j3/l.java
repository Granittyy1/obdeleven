package p116j3;

import java.util.List;
import p214r3.f;
import p225s3.a;
import p225s3.b;

/* JADX INFO: compiled from: ScaleKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g<b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f41112h;

    public l(List<a<b>> list) {
        super(list);
        this.f41112h = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p116j3.a
    public final Object f(a aVar, float f10) {
        T t8;
        T t10 = aVar.f46886b;
        if (t10 == 0 || (t8 = aVar.f46887c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        b bVar = (b) t10;
        b bVar2 = (b) t8;
        float fD = f.d(bVar.f46900a, bVar2.f46900a, f10);
        float fD2 = f.d(bVar.f46901b, bVar2.f46901b, f10);
        b bVar3 = this.f41112h;
        bVar3.f46900a = fD;
        bVar3.f46901b = fD2;
        return bVar3;
    }
}
