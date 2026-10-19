package androidx.navigation.compose;

import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.runtime.InterfaceC1084f;
import p141l2.C2749t;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2749t f19137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0900c f19138c;

    public N(C2749t c2749t, InterfaceC0900c interfaceC0900c) {
        this.f19137b = c2749t;
        this.f19138c = interfaceC0900c;
    }

    @Override // Ia.p
    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        if ((num.intValue() & 3) == 2 && interfaceC1084f2.s()) {
            interfaceC1084f2.w();
        } else {
            C2749t c2749t = this.f19137b;
            p141l2.C c10 = c2749t.f44299c;
            kotlin.jvm.internal.i.c(c10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((C1412e.a) c10).f19155g.invoke(this.f19138c, c2749t, interfaceC1084f2, 0);
        }
        return p293xa.r.f47939a;
    }
}
