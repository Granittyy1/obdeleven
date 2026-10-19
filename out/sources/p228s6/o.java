package p228s6;

import p033c7.d0;
import p096h7.a;
import p096h7.b;

/* JADX INFO: compiled from: OptionalProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o<T> implements b<T>, a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B6.a f46973c = new B6.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f46974d = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.InterfaceC0377a<T> f46975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b<T> f46976b;

    public o(B6.a aVar, b bVar) {
        this.f46975a = aVar;
        this.f46976b = bVar;
    }

    @Override // p096h7.a
    public final void a(a.InterfaceC0377a<T> interfaceC0377a) {
        b<T> bVar;
        b<T> bVar2;
        b<T> bVar3 = this.f46976b;
        n nVar = f46974d;
        if (bVar3 != nVar) {
            interfaceC0377a.d(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f46976b;
            if (bVar != nVar) {
                bVar2 = bVar;
            } else {
                this.f46975a = new d0(this.f46975a, interfaceC0377a);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0377a.d(bVar);
        }
    }

    @Override // p096h7.b
    public final T get() {
        return this.f46976b.get();
    }
}
