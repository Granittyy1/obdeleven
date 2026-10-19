package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f15455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15459e;

    public u(d dVar, l lVar, int i10, int i11, Object obj) {
        this.f15455a = dVar;
        this.f15456b = lVar;
        this.f15457c = i10;
        this.f15458d = i11;
        this.f15459e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.i.a(this.f15455a, uVar.f15455a) && kotlin.jvm.internal.i.a(this.f15456b, uVar.f15456b) && j.a(this.f15457c, uVar.f15457c) && k.a(this.f15458d, uVar.f15458d) && kotlin.jvm.internal.i.a(this.f15459e, uVar.f15459e);
    }

    public final int hashCode() {
        d dVar = this.f15455a;
        int iB = p005a4.q.b(this.f15458d, p005a4.q.b(this.f15457c, (((dVar == null ? 0 : dVar.hashCode()) * 31) + this.f15456b.f15447b) * 31, 31), 31);
        Object obj = this.f15459e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f15455a);
        sb2.append(", fontWeight=");
        sb2.append(this.f15456b);
        sb2.append(", fontStyle=");
        sb2.append((Object) j.b(this.f15457c));
        sb2.append(", fontSynthesis=");
        sb2.append((Object) k.b(this.f15458d));
        sb2.append(", resourceLoaderCacheKey=");
        return B6.c.e(sb2, this.f15459e, ')');
    }
}
