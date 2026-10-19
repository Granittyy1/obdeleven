package J4;

import android.content.Context;

/* JADX INFO: compiled from: SchemaManager_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class y implements E4.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.c f4013a;

    public y(E4.c cVar) {
        this.f4013a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268va.a
    public final Object get() {
        return new x((Context) this.f4013a.f3085a, "com.google.android.datatransport.events", Integer.valueOf(x.f4009e).intValue());
    }
}
