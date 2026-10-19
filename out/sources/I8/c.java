package I8;

import androidx.compose.animation.D;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: OcaWriteSession.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3926h;

    public c(String ocaId, String str, int i10, int i11, boolean z10, String os, int i12, String str2) {
        i.e(ocaId, "ocaId");
        i.e(os, "os");
        this.f3919a = ocaId;
        this.f3920b = str;
        this.f3921c = i10;
        this.f3922d = i11;
        this.f3923e = z10;
        this.f3924f = os;
        this.f3925g = i12;
        this.f3926h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f3919a, cVar.f3919a) && this.f3920b.equals(cVar.f3920b) && this.f3921c == cVar.f3921c && this.f3922d == cVar.f3922d && this.f3923e == cVar.f3923e && i.a(this.f3924f, cVar.f3924f) && this.f3925g == cVar.f3925g && this.f3926h.equals(cVar.f3926h);
    }

    public final int hashCode() {
        return this.f3926h.hashCode() + q.b(this.f3925g, (((this.f3924f.hashCode() + D.b(q.b(this.f3922d, q.b(this.f3921c, B1.a.b(this.f3920b, this.f3919a.hashCode() * 31, 31), 31), 31), 31, this.f3923e)) * 31) + 897927835) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OcaWriteSession(ocaId=");
        sb2.append(this.f3919a);
        sb2.append(", vehicleId=");
        sb2.append(this.f3920b);
        sb2.append(", currentValueIndex=");
        sb2.append(this.f3921c);
        sb2.append(", newValueIndex=");
        sb2.append(this.f3922d);
        sb2.append(", hasOriginal=");
        sb2.append(this.f3923e);
        sb2.append(", os=");
        sb2.append(this.f3924f);
        sb2.append(", appVersion=0.107.1(10800), mileage=");
        sb2.append(this.f3925g);
        sb2.append(", languageCode=");
        return Q8.d.a(sb2, this.f3926h, ")");
    }
}
