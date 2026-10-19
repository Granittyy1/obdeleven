package Y6;

import android.app.Application;

/* JADX INFO: compiled from: DaggerAppComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p268va.a<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7616a;

    public b(e eVar) {
        this.f7616a = eVar;
    }

    @Override // p268va.a
    public final Application get() {
        Application application = this.f7616a.f7625a.get();
        if (application != null) {
            return application;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
