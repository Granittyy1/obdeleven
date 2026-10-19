package X2;

/* JADX INFO: compiled from: RealMemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f7177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f7178b;

    public d(g gVar, h hVar) {
        this.f7177a = gVar;
        this.f7178b = hVar;
    }

    @Override // X2.b
    public final void a(int i10) {
        this.f7177a.a(i10);
        this.f7178b.a(i10);
    }

    @Override // X2.b
    public final b.C0101b b(b.a aVar) {
        b.C0101b c0101bB = this.f7177a.b(aVar);
        return c0101bB == null ? this.f7178b.b(aVar) : c0101bB;
    }

    @Override // X2.b
    public final void c(b.a aVar, b.C0101b c0101b) {
        this.f7177a.c(new b.a(aVar.f7172b, coil.util.b.b(aVar.f7173c)), c0101b.f7174a, coil.util.b.b(c0101b.f7175b));
    }
}
