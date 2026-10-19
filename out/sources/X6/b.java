package X6;

import W6.n;
import Z6.q;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: BannerBindingWrapper_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<n> f7331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<LayoutInflater> f7332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f7333c;

    public b(p268va.a aVar, p268va.a aVar2, q qVar) {
        this.f7331a = aVar;
        this.f7332b = aVar2;
        this.f7333c = qVar;
    }

    @Override // p268va.a
    public final Object get() {
        return new a(this.f7331a.get(), this.f7332b.get(), (p083g7.h) this.f7333c.get());
    }
}
