package p050db;

import kotlin.jvm.internal.i;
import kotlinx.serialization.json.internal.B;
import p011ab.e;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f34691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34692d;

    public t(String body, boolean z10) {
        i.e(body, "body");
        this.f34690b = z10;
        this.f34691c = null;
        this.f34692d = body.toString();
    }

    @Override // p050db.B
    public final String e() {
        return this.f34692d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f34690b == tVar.f34690b && i.a(this.f34692d, tVar.f34692d);
    }

    public final int hashCode() {
        return this.f34692d.hashCode() + (Boolean.hashCode(this.f34690b) * 31);
    }

    @Override // p050db.B
    public final String toString() {
        boolean z10 = this.f34690b;
        String str = this.f34692d;
        if (!z10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        B.a(sb2, str);
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }
}
