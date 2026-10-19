package androidx.compose.ui.text;

/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15604b;

    public p(long j, long j10) {
        this.f15603a = j;
        this.f15604b = j10;
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        if ((j & 1095216660480L) == 0) {
            Y.a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j10 & 1095216660480L) == 0) {
            Y.a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p013b0.n.a(this.f15603a, pVar.f15603a) && p013b0.n.a(this.f15604b, pVar.f15604b) && q.a(4, 4);
    }

    public final int hashCode() {
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        return Integer.hashCode(4) + C4.b.c(this.f15604b, Long.hashCode(this.f15603a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Placeholder(width=");
        sb2.append((Object) p013b0.n.d(this.f15603a));
        sb2.append(", height=");
        sb2.append((Object) p013b0.n.d(this.f15604b));
        sb2.append(", placeholderVerticalAlign=");
        if (q.a(4, 1)) {
            str = "AboveBaseline";
        } else if (q.a(4, 2)) {
            str = "Top";
        } else if (q.a(4, 3)) {
            str = "Bottom";
        } else if (q.a(4, 4)) {
            str = "Center";
        } else if (q.a(4, 5)) {
            str = "TextTop";
        } else if (q.a(4, 6)) {
            str = "TextBottom";
        } else {
            str = q.a(4, 7) ? "TextCenter" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
