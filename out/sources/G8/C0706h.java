package G8;

import com.voltasit.obdeleven.domain.models.ProductType;

/* JADX INFO: renamed from: G8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CreditProduct.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0706h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductType f3499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3503f;

    public C0706h(String title, ProductType productType, int i10, String productId, String url, String str) {
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(productId, "productId");
        kotlin.jvm.internal.i.e(url, "url");
        this.f3498a = title;
        this.f3499b = productType;
        this.f3500c = i10;
        this.f3501d = productId;
        this.f3502e = url;
        this.f3503f = str;
    }

    public static C0706h a(C0706h c0706h, String str) {
        String title = c0706h.f3498a;
        ProductType productType = c0706h.f3499b;
        int i10 = c0706h.f3500c;
        String productId = c0706h.f3501d;
        String url = c0706h.f3502e;
        c0706h.getClass();
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(productId, "productId");
        kotlin.jvm.internal.i.e(url, "url");
        return new C0706h(title, productType, i10, productId, url, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0706h)) {
            return false;
        }
        C0706h c0706h = (C0706h) obj;
        return kotlin.jvm.internal.i.a(this.f3498a, c0706h.f3498a) && this.f3499b == c0706h.f3499b && this.f3500c == c0706h.f3500c && kotlin.jvm.internal.i.a(this.f3501d, c0706h.f3501d) && kotlin.jvm.internal.i.a(this.f3502e, c0706h.f3502e) && kotlin.jvm.internal.i.a(this.f3503f, c0706h.f3503f);
    }

    public final int hashCode() {
        return this.f3503f.hashCode() + B1.a.b(this.f3502e, B1.a.b(this.f3501d, p005a4.q.b(this.f3500c, (this.f3499b.hashCode() + (this.f3498a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CreditProduct(title=" + this.f3498a + ", type=" + this.f3499b + ", credits=" + this.f3500c + ", productId=" + this.f3501d + ", url=" + this.f3502e + ", price=" + this.f3503f + ")";
    }
}
