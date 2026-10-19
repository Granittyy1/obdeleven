package p058e7;

import P6.d;
import T6.b;
import java.util.concurrent.atomic.AtomicBoolean;
import p033c7.C1496i;
import p033c7.C1497j;
import p033c7.i0;
import p046d7.i;

/* JADX INFO: renamed from: e7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ApiClientModule_ProvidesDataCollectionHelperFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2191e implements b<C1497j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2189c f34799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2194h f34800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f34801c;

    public C2191e(C2189c c2189c, C2194h c2194h, i iVar) {
        this.f34799a = c2189c;
        this.f34800b = c2194h;
        this.f34801c = iVar;
    }

    @Override // p268va.a
    public final Object get() {
        i0 i0Var = (i0) this.f34800b.get();
        d dVar = (d) this.f34801c.get();
        C2189c c2189c = this.f34799a;
        C1497j c1497j = new C1497j();
        c1497j.f22460a = i0Var;
        c1497j.f22461b = new AtomicBoolean(c2189c.f34792a.g());
        dVar.a(new C1496i());
        return c1497j;
    }
}
