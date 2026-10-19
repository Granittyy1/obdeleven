package androidx.compose.ui.text.style;

import p013b0.n;
import p013b0.o;

/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f15678c = new k(3, 0L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15680b;

    public k(long j, long j10) {
        this.f15679a = j;
        this.f15680b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n.a(this.f15679a, kVar.f15679a) && n.a(this.f15680b, kVar.f15680b);
    }

    public final int hashCode() {
        o[] oVarArr = n.f20492b;
        return Long.hashCode(this.f15680b) + (Long.hashCode(this.f15679a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) n.d(this.f15679a)) + ", restLine=" + ((Object) n.d(this.f15680b)) + ')';
    }

    public /* synthetic */ k(int i10, long j) {
        this(G0.a.g(0), (i10 & 2) != 0 ? G0.a.g(0) : j);
    }
}
