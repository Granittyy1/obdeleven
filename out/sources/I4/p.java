package I4;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Uploader_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements E4.b<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.c f3880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<D4.d> f3881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p268va.a<J4.d> f3882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H4.g f3883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p268va.a<Executor> f3884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p268va.a<K4.a> f3885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p268va.a<J4.c> f3886g;

    public p(E4.c cVar, p268va.a aVar, p268va.a aVar2, H4.g gVar, p268va.a aVar3, p268va.a aVar4, p268va.a aVar5) {
        this.f3880a = cVar;
        this.f3881b = aVar;
        this.f3882c = aVar2;
        this.f3883d = gVar;
        this.f3884e = aVar3;
        this.f3885f = aVar4;
        this.f3886g = aVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268va.a
    public final Object get() {
        return new o((Context) this.f3880a.f3085a, this.f3881b.get(), this.f3882c.get(), (u) this.f3883d.get(), this.f3884e.get(), this.f3885f.get(), new L4.b(), new kotlin.jvm.internal.n(), this.f3886g.get());
    }
}
