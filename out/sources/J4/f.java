package J4;

import android.content.Context;

/* JADX INFO: compiled from: EventStoreModule_PackageNameFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements E4.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.c f3979a;

    public f(E4.c cVar) {
        this.f3979a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268va.a
    public final Object get() {
        String packageName = ((Context) this.f3979a.f3085a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
