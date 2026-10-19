package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.P;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: LazyListIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<f> implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P<f> f10347a = new P<>();

    public LazyListIntervalContent(Ia.l<? super p, p293xa.r> lVar) {
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.p
    public final void e(final Object obj, final Object obj2, final Ia.q<? super b, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar) {
        this.f10347a.a(1, new f(obj != null ? new Ia.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Object invoke(Integer num) {
                num.intValue();
                return obj;
            }
        } : null, new Ia.l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Object invoke(Integer num) {
                num.intValue();
                return obj2;
            }
        }, new ComposableLambdaImpl(true, -1010194746, new Ia.r<b, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent$item$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // Ia.r
            public final p293xa.r invoke(b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
                b bVar2 = bVar;
                num.intValue();
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                int iIntValue = num2.intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= interfaceC1084f2.K(bVar2) ? 4 : 2;
                }
                if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 131) != 130)) {
                    qVar.invoke(bVar2, interfaceC1084f2, Integer.valueOf(iIntValue & 14));
                } else {
                    interfaceC1084f2.w();
                }
                return p293xa.r.f47939a;
            }
        })));
    }

    @Override // androidx.compose.foundation.lazy.p
    public final void g(int i10, Ia.l lVar, Ia.l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f10347a.a(i10, new f(lVar, lVar2, composableLambdaImpl));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final P i() {
        return this.f10347a;
    }
}
