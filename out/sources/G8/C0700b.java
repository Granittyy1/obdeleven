package G8;

/* JADX INFO: renamed from: G8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppTranslation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C0700b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3445d;

    public C0700b(String applicationId, String languageCode, String type, String str) {
        kotlin.jvm.internal.i.e(applicationId, "applicationId");
        kotlin.jvm.internal.i.e(languageCode, "languageCode");
        kotlin.jvm.internal.i.e(type, "type");
        this.f3442a = applicationId;
        this.f3443b = languageCode;
        this.f3444c = type;
        this.f3445d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0700b)) {
            return false;
        }
        C0700b c0700b = (C0700b) obj;
        return kotlin.jvm.internal.i.a(this.f3442a, c0700b.f3442a) && kotlin.jvm.internal.i.a(this.f3443b, c0700b.f3443b) && kotlin.jvm.internal.i.a(this.f3444c, c0700b.f3444c) && kotlin.jvm.internal.i.a(this.f3445d, c0700b.f3445d);
    }

    public final int hashCode() {
        return this.f3445d.hashCode() + B1.a.b(this.f3444c, B1.a.b(this.f3443b, this.f3442a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppTranslation(applicationId=");
        sb2.append(this.f3442a);
        sb2.append(", languageCode=");
        sb2.append(this.f3443b);
        sb2.append(", type=");
        sb2.append(this.f3444c);
        sb2.append(", translation=");
        return Q8.d.a(sb2, this.f3445d, ")");
    }
}
