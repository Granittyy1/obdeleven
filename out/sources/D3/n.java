package D3;

/* JADX INFO: compiled from: LockedResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class n<Z> implements o<Z>, Y3.a.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Y3.a.c f2769f = Y3.a.a(20, new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y3.d.a f2770b = new Y3.d.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o<Z> f2771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2773e;

    /* JADX INFO: compiled from: LockedResource.java */
    public class a implements Y3.a.b<n<?>> {
        @Override // Y3.a.b
        public final n<?> a() {
            return new n<>();
        }
    }

    @Override // D3.o
    public final synchronized void a() {
        this.f2770b.a();
        this.f2773e = true;
        if (!this.f2772d) {
            this.f2771c.a();
            this.f2771c = null;
            f2769f.b(this);
        }
    }

    public final synchronized void b() {
        this.f2770b.a();
        if (!this.f2772d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f2772d = false;
        if (this.f2773e) {
            a();
        }
    }

    @Override // D3.o
    public final Class<Z> c() {
        return this.f2771c.c();
    }

    @Override // Y3.a.d
    public final Y3.d.a d() {
        return this.f2770b;
    }

    @Override // D3.o
    public final Z get() {
        return this.f2771c.get();
    }

    @Override // D3.o
    public final int getSize() {
        return this.f2771c.getSize();
    }
}
