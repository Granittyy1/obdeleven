package p058e7;

import D3.l;
import T6.b;
import java.util.concurrent.Executor;
import p033c7.C1501n;
import p268va.a;

/* JADX INFO: compiled from: ApplicationModule_DeveloperListenerManagerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements b<C1501n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f34807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Executor> f34808b;

    public k(l lVar, a<Executor> aVar) {
        this.f34807a = lVar;
        this.f34808b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        Executor executor = this.f34808b.get();
        this.f34807a.getClass();
        return new C1501n(executor);
    }
}
