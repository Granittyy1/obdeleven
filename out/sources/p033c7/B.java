package p033c7;

import T6.b;
import p268va.a;

/* JADX INFO: compiled from: ImpressionStorageClient_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B implements b<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f22341a;

    public B(a<T> aVar) {
        this.f22341a = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        return new A(this.f22341a.get());
    }
}
