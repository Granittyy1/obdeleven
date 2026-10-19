package D3;

/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public final class r implements B3.d.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H3.q.a f2784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.f f2785c;

    public r(com.bumptech.glide.load.engine.f fVar, H3.q.a aVar) {
        this.f2785c = fVar;
        this.f2784b = aVar;
    }

    @Override // B3.d.a
    public final void c(Exception exc) {
        com.bumptech.glide.load.engine.f fVar = this.f2785c;
        H3.q.a<?> aVar = this.f2784b;
        H3.q.a<?> aVar2 = fVar.f24653g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        d dVar = fVar.f24654h;
        B3.d<?> dVar2 = aVar.f3669c;
        fVar.f24649c.c(dVar, exc, dVar2, dVar2.getDataSource());
    }

    @Override // B3.d.a
    public final void d(Object obj) {
        com.bumptech.glide.load.engine.f fVar = this.f2785c;
        H3.q.a<?> aVar = this.f2784b;
        H3.q.a<?> aVar2 = fVar.f24653g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        h hVar = fVar.f24648b.f2738p;
        if (obj != null && hVar.c(aVar.f3669c.getDataSource())) {
            fVar.f24652f = obj;
            fVar.f24649c.k();
            return;
        }
        A3.b bVar = aVar.f3667a;
        B3.d<?> dVar = aVar.f3669c;
        fVar.f24649c.b(bVar, obj, dVar, dVar.getDataSource(), fVar.f24654h);
    }
}
