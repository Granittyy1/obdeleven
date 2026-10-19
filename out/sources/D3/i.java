package D3;

import com.google.android.gms.internal.measurement.M1;
import java.security.MessageDigest;

/* JADX INFO: compiled from: EngineKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements A3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<?> f2752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f2753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A3.b f2754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X3.b f2755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A3.d f2756i;
    public int j;

    public i(Object obj, A3.b bVar, int i10, int i11, X3.b bVar2, Class cls, Class cls2, A3.d dVar) {
        M1.d(obj, "Argument must not be null");
        this.f2749b = obj;
        M1.d(bVar, "Signature must not be null");
        this.f2754g = bVar;
        this.f2750c = i10;
        this.f2751d = i11;
        M1.d(bVar2, "Argument must not be null");
        this.f2755h = bVar2;
        M1.d(cls, "Resource class must not be null");
        this.f2752e = cls;
        M1.d(cls2, "Transcode class must not be null");
        this.f2753f = cls2;
        M1.d(dVar, "Argument must not be null");
        this.f2756i = dVar;
    }

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2749b.equals(iVar.f2749b) && this.f2754g.equals(iVar.f2754g) && this.f2751d == iVar.f2751d && this.f2750c == iVar.f2750c && this.f2755h.equals(iVar.f2755h) && this.f2752e.equals(iVar.f2752e) && this.f2753f.equals(iVar.f2753f) && this.f2756i.equals(iVar.f2756i);
    }

    @Override // A3.b
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.f2749b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.f2754g.hashCode() + (iHashCode * 31)) * 31) + this.f2750c) * 31) + this.f2751d;
            this.j = iHashCode2;
            int iHashCode3 = this.f2755h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.f2752e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f2753f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.f2756i.f580b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f2749b + ", width=" + this.f2750c + ", height=" + this.f2751d + ", resourceClass=" + this.f2752e + ", transcodeClass=" + this.f2753f + ", signature=" + this.f2754g + ", hashCode=" + this.j + ", transformations=" + this.f2755h + ", options=" + this.f2756i + '}';
    }
}
