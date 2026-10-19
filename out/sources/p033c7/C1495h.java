package p033c7;

import T6.b;
import android.app.Application;
import p058e7.G;
import p268va.a;

/* JADX INFO: renamed from: c7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CampaignCacheClient_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1495h implements b<C1494g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f22453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<Application> f22454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f22455c;

    public C1495h(a aVar, a aVar2, G g10) {
        this.f22453a = aVar;
        this.f22454b = aVar2;
        this.f22455c = g10;
    }

    @Override // p268va.a
    public final Object get() {
        return new C1494g(this.f22453a.get(), this.f22454b.get(), (p071f7.a) this.f22455c.get());
    }
}
