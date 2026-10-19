package D4;

import android.content.Context;

/* JADX INFO: compiled from: MetadataBackendRegistry_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements E4.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.c f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f2802b;

    public j(E4.c cVar, h hVar) {
        this.f2801a = cVar;
        this.f2802b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268va.a
    public final Object get() {
        return new i((Context) this.f2801a.f3085a, (g) this.f2802b.get());
    }
}
