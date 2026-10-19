package coil.request;

import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: RequestDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f23011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2694i0 f23012c;

    public a(Lifecycle lifecycle, InterfaceC2694i0 interfaceC2694i0) {
        this.f23011b = lifecycle;
        this.f23012c = interfaceC2694i0;
    }

    @Override // coil.request.m
    public final void b() {
        this.f23011b.c(this);
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void s(InterfaceC1376t interfaceC1376t) {
        this.f23012c.i(null);
    }

    @Override // coil.request.m
    public final void start() {
        this.f23011b.a(this);
    }
}
