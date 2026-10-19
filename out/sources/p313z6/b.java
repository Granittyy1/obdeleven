package p313z6;

import p005a4.o;

/* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48857f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f48853b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f48854c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f48855d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f48856e = str4;
        this.f48857f = j;
    }

    @Override // p313z6.k
    public final String a() {
        return this.f48854c;
    }

    @Override // p313z6.k
    public final String b() {
        return this.f48855d;
    }

    @Override // p313z6.k
    public final String c() {
        return this.f48853b;
    }

    @Override // p313z6.k
    public final long d() {
        return this.f48857f;
    }

    @Override // p313z6.k
    public final String e() {
        return this.f48856e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f48853b.equals(kVar.c()) && this.f48854c.equals(kVar.a()) && this.f48855d.equals(kVar.b()) && this.f48856e.equals(kVar.e()) && this.f48857f == kVar.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f48853b.hashCode() ^ 1000003) * 1000003) ^ this.f48854c.hashCode()) * 1000003) ^ this.f48855d.hashCode()) * 1000003) ^ this.f48856e.hashCode()) * 1000003;
        long j = this.f48857f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f48853b);
        sb2.append(", parameterKey=");
        sb2.append(this.f48854c);
        sb2.append(", parameterValue=");
        sb2.append(this.f48855d);
        sb2.append(", variantId=");
        sb2.append(this.f48856e);
        sb2.append(", templateVersion=");
        return o.d(this.f48857f, "}", sb2);
    }
}
