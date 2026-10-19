package p046d7;

import android.app.Application;
import com.google.android.gms.internal.measurement.C1787c0;
import p268va.a;

/* JADX INFO: compiled from: DaggerAppComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements a<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f34584a;

    public d(o oVar) {
        this.f34584a = oVar;
    }

    @Override // p268va.a
    public final Application get() {
        Application application = this.f34584a.f34602c.get();
        C1787c0.e(application);
        return application;
    }
}
