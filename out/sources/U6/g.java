package U6;

import S6.j;
import W6.p;
import android.app.Application;

/* JADX INFO: compiled from: FirebaseInAppMessagingDisplay_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268va.a<j> f6548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y6.a f6549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p268va.a<W6.f> f6550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W6.b f6551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y6.b f6552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final W6.g f6553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p268va.a<W6.d> f6554g;

    public g(p268va.a aVar, Y6.a aVar2, p268va.a aVar3, W6.b bVar, Y6.b bVar2, W6.g gVar, p268va.a aVar4) {
        this.f6548a = aVar;
        this.f6549b = aVar2;
        this.f6550c = aVar3;
        this.f6551d = bVar;
        this.f6552e = bVar2;
        this.f6553f = gVar;
        this.f6554g = aVar4;
    }

    @Override // p268va.a
    public final Object get() {
        return new b(this.f6548a.get(), this.f6549b.get(), this.f6550c.get(), new p(), new p(), (W6.j) this.f6551d.get(), (Application) this.f6552e.get(), (W6.a) this.f6553f.get(), this.f6554g.get());
    }
}
