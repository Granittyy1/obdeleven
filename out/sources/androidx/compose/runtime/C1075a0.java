package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1075a0<N> implements InterfaceC1078c<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1078c<N> f12936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12938c;

    public C1075a0(InterfaceC1078c<N> interfaceC1078c, int i10) {
        this.f12936a = interfaceC1078c;
        this.f12937b = i10;
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public final void a(int i10, N n10) {
        this.f12936a.a(i10 + (this.f12938c == 0 ? this.f12937b : 0), n10);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public final void b(N n10) {
        this.f12938c++;
        this.f12936a.b(n10);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public final void d(int i10, int i11, int i12) {
        int i13 = this.f12938c == 0 ? this.f12937b : 0;
        this.f12936a.d(i10 + i13, i11 + i13, i12);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public final void e(int i10, int i11) {
        this.f12936a.e(i10 + (this.f12938c == 0 ? this.f12937b : 0), i11);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public final void f() {
        if (!(this.f12938c > 0)) {
            C1090i.c("OffsetApplier up called with no corresponding down");
        }
        this.f12938c--;
        this.f12936a.f();
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public final void g(int i10, N n10) {
        this.f12936a.g(i10 + (this.f12938c == 0 ? this.f12937b : 0), n10);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public final N h() {
        return this.f12936a.h();
    }
}
