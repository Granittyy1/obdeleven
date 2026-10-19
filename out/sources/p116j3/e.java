package p116j3;

import D9.o;
import java.util.List;
import p005a4.q;
import p164n3.c;
import p214r3.f;
import p225s3.a;

/* JADX INFO: compiled from: GradientColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g<c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f41102h;

    public e(List<a<c>> list) {
        super(list);
        c cVar = list.get(0).f46886b;
        int length = cVar != null ? cVar.f44830b.length : 0;
        this.f41102h = new c(new float[length], new int[length]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p116j3.a
    public final Object f(a aVar, float f10) {
        c cVar = (c) aVar.f46886b;
        c cVar2 = (c) aVar.f46887c;
        c cVar3 = this.f41102h;
        cVar3.getClass();
        int[] iArr = cVar.f44830b;
        int length = iArr.length;
        int[] iArr2 = cVar2.f44830b;
        if (length != iArr2.length) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(iArr.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(q.c(sb2, iArr2.length, ")"));
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            cVar3.f44829a[i10] = f.d(cVar.f44829a[i10], cVar2.f44829a[i10], f10);
            cVar3.f44830b[i10] = o.i(f10, iArr[i10], iArr2[i10]);
        }
        return cVar3;
    }
}
