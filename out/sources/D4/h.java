package D4;

import android.content.Context;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: CreationContextFactory_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements E4.b<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.c f2795a;

    public h(E4.c cVar) {
        this.f2795a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268va.a
    public final Object get() {
        return new g((Context) this.f2795a.f3085a, new L4.b(), new n());
    }
}
