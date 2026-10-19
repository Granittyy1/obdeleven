package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1078c<N> {
    void a(int i10, N n10);

    void b(N n10);

    default void c() {
        N nH = h();
        InterfaceC1082e interfaceC1082e = nH instanceof InterfaceC1082e ? (InterfaceC1082e) nH : null;
        if (interfaceC1082e != null) {
            interfaceC1082e.p();
        }
    }

    void d(int i10, int i11, int i12);

    void e(int i10, int i11);

    void f();

    void g(int i10, N n10);

    N h();
}
