package D3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: ResourceCacheKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements A3.b {
    public static final X3.g<Class<?>, byte[]> j = new X3.g<>(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.h f2774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A3.b f2775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A3.b f2776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f2779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A3.d f2780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A3.g<?> f2781i;

    public p(E3.h hVar, A3.b bVar, A3.b bVar2, int i10, int i11, A3.g gVar, Class cls, A3.d dVar) {
        this.f2774b = hVar;
        this.f2775c = bVar;
        this.f2776d = bVar2;
        this.f2777e = i10;
        this.f2778f = i11;
        this.f2781i = gVar;
        this.f2779g = cls;
        this.f2780h = dVar;
    }

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        Object objF;
        E3.h hVar = this.f2774b;
        synchronized (hVar) {
            E3.h.b bVar = hVar.f3056b;
            E3.j jVarH = (E3.j) ((ArrayDeque) bVar.f3048c).poll();
            if (jVarH == null) {
                jVarH = bVar.H();
            }
            E3.h.a aVar = (E3.h.a) jVarH;
            aVar.f3062b = 8;
            aVar.f3063c = byte[].class;
            objF = hVar.f(aVar, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.f2777e).putInt(this.f2778f).array();
        this.f2776d.a(messageDigest);
        this.f2775c.a(messageDigest);
        messageDigest.update(bArr);
        A3.g<?> gVar = this.f2781i;
        if (gVar != null) {
            gVar.a(messageDigest);
        }
        this.f2780h.a(messageDigest);
        X3.g<Class<?>, byte[]> gVar2 = j;
        Class<?> cls = this.f2779g;
        byte[] bArrA = gVar2.a(cls);
        if (bArrA == null) {
            bArrA = cls.getName().getBytes(A3.b.f574a);
            gVar2.d(cls, bArrA);
        }
        messageDigest.update(bArrA);
        hVar.h(bArr);
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f2778f == pVar.f2778f && this.f2777e == pVar.f2777e && X3.j.a(this.f2781i, pVar.f2781i) && this.f2779g.equals(pVar.f2779g) && this.f2775c.equals(pVar.f2775c) && this.f2776d.equals(pVar.f2776d) && this.f2780h.equals(pVar.f2780h);
    }

    @Override // A3.b
    public final int hashCode() {
        int iHashCode = ((((this.f2776d.hashCode() + (this.f2775c.hashCode() * 31)) * 31) + this.f2777e) * 31) + this.f2778f;
        A3.g<?> gVar = this.f2781i;
        if (gVar != null) {
            iHashCode = (iHashCode * 31) + gVar.hashCode();
        }
        return this.f2780h.f580b.hashCode() + ((this.f2779g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f2775c + ", signature=" + this.f2776d + ", width=" + this.f2777e + ", height=" + this.f2778f + ", decodedResourceClass=" + this.f2779g + ", transformation='" + this.f2781i + "', options=" + this.f2780h + '}';
    }
}
