package androidx.compose.material3.internal;

import androidx.lifecycle.InterfaceC1376t;

/* JADX INFO: renamed from: androidx.compose.material3.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1056b implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ia.a f12516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1376t f12517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1055a f12518c;

    public C1056b(Ia.a aVar, InterfaceC1376t interfaceC1376t, C1055a c1055a) {
        this.f12516a = aVar;
        this.f12517b = interfaceC1376t;
        this.f12518c = c1055a;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f12516a.invoke();
        this.f12517b.getLifecycle().c(this.f12518c);
    }
}
