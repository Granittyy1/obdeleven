package p058e7;

import T6.b;
import android.app.Application;
import kotlin.jvm.internal.n;
import p033c7.T;
import p268va.a;

/* JADX INFO: compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f34775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Application> f34776b;

    public C(n nVar, a<Application> aVar) {
        this.f34775a = nVar;
        this.f34776b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = this.f34776b.get();
        this.f34775a.getClass();
        return new T(application, "rate_limit_store_file");
    }
}
