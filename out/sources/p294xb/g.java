package p294xb;

import Z3.o;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: WebSocketExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f47984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f47986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47988f;

    public g() {
        this(false, null, false, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f47983a == gVar.f47983a && i.a(this.f47984b, gVar.f47984b) && this.f47985c == gVar.f47985c && i.a(this.f47986d, gVar.f47986d) && this.f47987e == gVar.f47987e && this.f47988f == gVar.f47988f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z10 = this.f47983a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        Integer num = this.f47984b;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.f47985c;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        Integer num2 = this.f47986d;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f47987e;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (iHashCode2 + r12) * 31;
        boolean z13 = this.f47988f;
        return i12 + (z13 ? 1 : z13);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f47983a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f47984b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f47985c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f47986d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f47987e);
        sb2.append(", unknownValues=");
        return o.d(sb2, this.f47988f, ')');
    }

    public g(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f47983a = z10;
        this.f47984b = num;
        this.f47985c = z11;
        this.f47986d = num2;
        this.f47987e = z12;
        this.f47988f = z13;
    }
}
