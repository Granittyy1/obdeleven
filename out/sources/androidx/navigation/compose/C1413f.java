package androidx.navigation.compose;

import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import p141l2.C2749t;

/* JADX INFO: renamed from: androidx.navigation.compose.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ComposeNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1413f extends p141l2.D<C1412e.a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1412e f19160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ComposableLambdaImpl f19161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> f19162i;
    public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> f19163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> f19164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.y> f19165m;

    public C1413f(C1412e c1412e, String str, ComposableLambdaImpl composableLambdaImpl) {
        super(c1412e, str);
        this.f19160g = c1412e;
        this.f19161h = composableLambdaImpl;
    }

    @Override // p141l2.D
    public final p141l2.C a() {
        C1412e.a aVar = (C1412e.a) super.a();
        aVar.f19156h = this.f19162i;
        aVar.f19157i = this.j;
        aVar.j = this.f19163k;
        aVar.f19158k = this.f19164l;
        aVar.f19159l = this.f19165m;
        return aVar;
    }

    @Override // p141l2.D
    public final p141l2.C b() {
        return new C1412e.a(this.f19160g, this.f19161h);
    }
}
