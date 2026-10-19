package G8;

import java.util.List;

/* JADX INFO: compiled from: Odx.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f3537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3540e;

    public s(String objectId, String fileName, String platform, String fileUrl, List values) {
        kotlin.jvm.internal.i.e(objectId, "objectId");
        kotlin.jvm.internal.i.e(values, "values");
        kotlin.jvm.internal.i.e(fileName, "fileName");
        kotlin.jvm.internal.i.e(platform, "platform");
        kotlin.jvm.internal.i.e(fileUrl, "fileUrl");
        this.f3536a = objectId;
        this.f3537b = values;
        this.f3538c = fileName;
        this.f3539d = platform;
        this.f3540e = fileUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.i.a(this.f3536a, sVar.f3536a) && kotlin.jvm.internal.i.a(this.f3537b, sVar.f3537b) && kotlin.jvm.internal.i.a(this.f3538c, sVar.f3538c) && kotlin.jvm.internal.i.a(this.f3539d, sVar.f3539d) && kotlin.jvm.internal.i.a(this.f3540e, sVar.f3540e);
    }

    public final int hashCode() {
        return this.f3540e.hashCode() + B1.a.b(this.f3539d, B1.a.b(this.f3538c, p005a4.p.d(this.f3536a.hashCode() * 31, 31, this.f3537b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Odx(objectId=");
        sb2.append(this.f3536a);
        sb2.append(", values=");
        sb2.append(this.f3537b);
        sb2.append(", fileName=");
        sb2.append(this.f3538c);
        sb2.append(", platform=");
        sb2.append(this.f3539d);
        sb2.append(", fileUrl=");
        return Q8.d.a(sb2, this.f3540e, ")");
    }
}
