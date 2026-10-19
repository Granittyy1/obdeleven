package androidx.navigation.compose;

import androidx.compose.runtime.InterfaceC1084f;
import p141l2.C2749t;

/* JADX INFO: renamed from: androidx.navigation.compose.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1420m implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1423p.a f19183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2749t f19184c;

    public C1420m(C1423p.a aVar, C2749t c2749t) {
        this.f19183b = aVar;
        this.f19184c = c2749t;
    }

    @Override // Ia.p
    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        if ((num.intValue() & 3) == 2 && interfaceC1084f2.s()) {
            interfaceC1084f2.w();
        } else {
            this.f19183b.f19191h.invoke(this.f19184c, interfaceC1084f2, 0);
        }
        return p293xa.r.f47939a;
    }
}
