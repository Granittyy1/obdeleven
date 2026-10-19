package p058e7;

import T6.b;
import android.app.Application;
import kotlin.jvm.internal.n;
import p033c7.T;
import p268va.a;

/* JADX INFO: compiled from: ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f34771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Application> f34772b;

    public A(n nVar, a<Application> aVar) {
        this.f34771a = nVar;
        this.f34772b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = this.f34772b.get();
        this.f34771a.getClass();
        return new T(application, "fiam_eligible_campaigns_cache_file");
    }
}
