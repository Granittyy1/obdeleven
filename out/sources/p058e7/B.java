package p058e7;

import T6.b;
import android.app.Application;
import kotlin.jvm.internal.n;
import p033c7.T;
import p268va.a;

/* JADX INFO: compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f34773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Application> f34774b;

    public B(n nVar, a<Application> aVar) {
        this.f34773a = nVar;
        this.f34774b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = this.f34774b.get();
        this.f34773a.getClass();
        return new T(application, "fiam_impressions_store_file");
    }
}
