package Z6;

import android.app.Application;

/* JADX INFO: compiled from: ApplicationModule_ProvidesApplicationFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7924a;

    public b(a aVar) {
        this.f7924a = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = (Application) this.f7924a.f7923a;
        p006a5.a.b(application);
        return application;
    }
}
