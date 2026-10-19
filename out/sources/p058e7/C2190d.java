package p058e7;

import T6.b;
import android.app.Application;
import p033c7.C1490c;
import p033c7.C1509w;
import p033c7.U;
import p046d7.d;
import p046d7.l;
import p268va.a;

/* JADX INFO: renamed from: e7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ApiClientModule_ProvidesApiClientFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2190d implements b<C1490c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2189c f34795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<C1509w> f34796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f34797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f34798d;

    public C2190d(C2189c c2189c, a aVar, d dVar, l lVar) {
        this.f34795a = c2189c;
        this.f34796b = aVar;
        this.f34797c = dVar;
        this.f34798d = lVar;
    }

    @Override // p268va.a
    public final Object get() {
        Application application = (Application) this.f34797c.get();
        U u10 = (U) this.f34798d.get();
        C2189c c2189c = this.f34795a;
        return new C1490c(this.f34796b, c2189c.f34792a, application, c2189c.f34794c, u10);
    }
}
