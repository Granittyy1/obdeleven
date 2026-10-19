package coil.compose;

import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.layout.InterfaceC1161g;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: SubcomposeAsyncImage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z2.f f22821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f22822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AsyncImagePainter f22823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f22825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161g f22826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f22827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I f22828i;
    public final /* synthetic */ boolean j;

    public q(Z2.f fVar, ComposableLambdaImpl composableLambdaImpl, AsyncImagePainter asyncImagePainter, String str, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, float f10, I i10, boolean z10) {
        this.f22821b = fVar;
        this.f22822c = composableLambdaImpl;
        this.f22823d = asyncImagePainter;
        this.f22824e = str;
        this.f22825f = dVar;
        this.f22826g = interfaceC1161g;
        this.f22827h = f10;
        this.f22828i = i10;
        this.j = z10;
    }

    @Override // Ia.q
    public final p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC0950j interfaceC0950j2 = interfaceC0950j;
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= interfaceC1084f2.K(interfaceC0950j2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && interfaceC1084f2.s()) {
            interfaceC1084f2.w();
        } else {
            ConstraintsSizeResolver constraintsSizeResolver = (ConstraintsSizeResolver) this.f22821b;
            long jC = interfaceC0950j2.c();
            StateFlowImpl stateFlowImpl = constraintsSizeResolver.f22736b;
            p013b0.a aVar = new p013b0.a(jC);
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, aVar);
            this.f22822c.invoke(new n(interfaceC0950j2, this.f22823d, this.f22824e, this.f22825f, this.f22826g, this.f22827h, this.f22828i, this.j), interfaceC1084f2, 0);
        }
        return p293xa.r.f47939a;
    }
}
