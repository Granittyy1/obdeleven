package Z6;

import android.app.Application;

/* JADX INFO: compiled from: GlideModule_ProvidesGlideRequestManagerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S4.o f7925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y6.b f7926b;

    public c(S4.o oVar, Y6.b bVar) {
        this.f7925a = oVar;
        this.f7926b = bVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = (Application) this.f7926b.get();
        this.f7925a.getClass();
        com.bumptech.glide.e eVarE = com.bumptech.glide.b.c(application).e(application);
        p006a5.a.b(eVarE);
        return eVarE;
    }
}
