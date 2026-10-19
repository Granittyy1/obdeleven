package p058e7;

import T6.b;
import android.app.Application;
import com.google.android.gms.internal.measurement.C1787c0;

/* JADX INFO: compiled from: ApplicationModule_ProvidesApplicationFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements b<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D3.l f34809a;

    public l(D3.l lVar) {
        this.f34809a = lVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = (Application) this.f34809a.f2765c;
        C1787c0.f(application);
        return application;
    }
}
