package p193p7;

import Z6.r;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import p046d7.k;
import p046d7.l;
import p229s7.b;
import p229s7.c;
import p229s7.e;
import p268va.a;

/* JADX INFO: compiled from: FirebasePerformance_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f45881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f45882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f45883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f45884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f45885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f45886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p229s7.d f45887g;

    public d(r rVar, l lVar, k kVar, e eVar, c cVar, b bVar, p229s7.d dVar) {
        this.f45881a = rVar;
        this.f45882b = lVar;
        this.f45883c = kVar;
        this.f45884d = eVar;
        this.f45885e = cVar;
        this.f45886f = bVar;
        this.f45887g = dVar;
    }

    @Override // p268va.a
    public final Object get() {
        return new b((p144l6.e) this.f45881a.get(), (p096h7.b) this.f45882b.get(), (p108i7.c) this.f45883c.get(), (p096h7.b) this.f45884d.get(), (RemoteConfigManager) this.f45885e.get(), (p218r7.a) this.f45886f.get(), (SessionManager) this.f45887g.get());
    }
}
