package D3;

import com.google.android.gms.internal.measurement.M1;

/* JADX INFO: compiled from: EngineResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class j<Z> implements o<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<Z> f2759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.c f2760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f2761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2763h;

    public j(o oVar, boolean z10, boolean z11, i iVar, com.bumptech.glide.load.engine.c cVar) {
        M1.d(oVar, "Argument must not be null");
        this.f2759d = oVar;
        this.f2757b = z10;
        this.f2758c = z11;
        this.f2761f = iVar;
        M1.d(cVar, "Argument must not be null");
        this.f2760e = cVar;
    }

    @Override // D3.o
    public final synchronized void a() {
        if (this.f2762g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f2763h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f2763h = true;
        if (this.f2758c) {
            this.f2759d.a();
        }
    }

    public final synchronized void b() {
        if (this.f2763h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f2762g++;
    }

    @Override // D3.o
    public final Class<Z> c() {
        return this.f2759d.c();
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f2762g;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f2762g = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f2760e.d(this.f2761f, this);
        }
    }

    @Override // D3.o
    public final Z get() {
        return this.f2759d.get();
    }

    @Override // D3.o
    public final int getSize() {
        return this.f2759d.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f2757b + ", listener=" + this.f2760e + ", key=" + this.f2761f + ", acquired=" + this.f2762g + ", isRecycled=" + this.f2763h + ", resource=" + this.f2759d + '}';
    }
}
