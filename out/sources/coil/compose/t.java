package coil.compose;

import androidx.compose.runtime.InterfaceC1084f;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SubcomposeAsyncImage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Ia.q<v, InterfaceC1084f, Integer, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ia.r<v, AsyncImagePainter.a.c, InterfaceC1084f, Integer, p293xa.r> f22831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.r<v, AsyncImagePainter.a.d, InterfaceC1084f, Integer, p293xa.r> f22832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ia.r<v, AsyncImagePainter.a.b, InterfaceC1084f, Integer, p293xa.r> f22833d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Ia.r<? super v, ? super AsyncImagePainter.a.c, ? super InterfaceC1084f, ? super Integer, p293xa.r> rVar, Ia.r<? super v, ? super AsyncImagePainter.a.d, ? super InterfaceC1084f, ? super Integer, p293xa.r> rVar2, Ia.r<? super v, ? super AsyncImagePainter.a.b, ? super InterfaceC1084f, ? super Integer, p293xa.r> rVar3) {
        this.f22831b = rVar;
        this.f22832c = rVar2;
        this.f22833d = rVar3;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ia.q
    public final p293xa.r invoke(v vVar, InterfaceC1084f interfaceC1084f, Integer num) {
        v vVar2 = vVar;
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= interfaceC1084f2.K(vVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && interfaceC1084f2.s()) {
            interfaceC1084f2.w();
        } else {
            AsyncImagePainter.a aVar = (AsyncImagePainter.a) vVar2.h().f22724s.getValue();
            boolean z10 = false;
            boolean z11 = true;
            if (aVar instanceof AsyncImagePainter.a.c) {
                interfaceC1084f2.e(1739512213);
                Ia.r<v, AsyncImagePainter.a.c, InterfaceC1084f, Integer, p293xa.r> rVar = this.f22831b;
                if (rVar != null) {
                    rVar.invoke(vVar2, (AsyncImagePainter.a.c) aVar, interfaceC1084f2, Integer.valueOf((iIntValue & 14) | 64));
                    p293xa.r rVar2 = p293xa.r.f47939a;
                } else {
                    z10 = true;
                }
                interfaceC1084f2.I();
            } else if (aVar instanceof AsyncImagePainter.a.d) {
                interfaceC1084f2.e(1739605461);
                Ia.r<v, AsyncImagePainter.a.d, InterfaceC1084f, Integer, p293xa.r> rVar3 = this.f22832c;
                if (rVar3 != null) {
                    rVar3.invoke(vVar2, (AsyncImagePainter.a.d) aVar, interfaceC1084f2, Integer.valueOf((iIntValue & 14) | 64));
                    p293xa.r rVar4 = p293xa.r.f47939a;
                } else {
                    z10 = true;
                }
                interfaceC1084f2.I();
            } else {
                if (aVar instanceof AsyncImagePainter.a.b) {
                    interfaceC1084f2.e(1739696601);
                    Ia.r<v, AsyncImagePainter.a.b, InterfaceC1084f, Integer, p293xa.r> rVar5 = this.f22833d;
                    if (rVar5 != null) {
                        rVar5.invoke(vVar2, (AsyncImagePainter.a.b) aVar, interfaceC1084f2, Integer.valueOf((iIntValue & 14) | 64));
                        p293xa.r rVar6 = p293xa.r.f47939a;
                    } else {
                        z10 = true;
                    }
                    interfaceC1084f2.I();
                } else {
                    if (!(aVar instanceof AsyncImagePainter.a.C0239a)) {
                        interfaceC1084f2.e(-82435959);
                        interfaceC1084f2.I();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC1084f2.e(1739782316);
                    interfaceC1084f2.I();
                }
                if (z11) {
                    u.c(vVar2, null, null, null, null, null, 0.0f, null, false, interfaceC1084f2, iIntValue & 14);
                }
            }
            z11 = z10;
            if (z11) {
                u.c(vVar2, null, null, null, null, null, 0.0f, null, false, interfaceC1084f2, iIntValue & 14);
            }
        }
        return p293xa.r.f47939a;
    }
}
