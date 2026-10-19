package Va;

import J4.i;
import kotlin.text.n;

/* JADX INFO: compiled from: math.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6875c;

    public a(int i10, int i11) {
        this.f6874b = i10;
        this.f6875c = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(i.b(i11, "Digits must be non-negative, but was ").toString());
        }
    }

    public final int a(int i10) {
        int i11 = this.f6874b;
        int i12 = this.f6875c;
        if (i10 == i12) {
            return i11;
        }
        int[] iArr = b.f6876a;
        return i10 > i12 ? i11 * iArr[i10 - i12] : i11 / iArr[i12 - i10];
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a other = aVar;
        kotlin.jvm.internal.i.e(other, "other");
        int iMax = Math.max(this.f6875c, other.f6875c);
        return kotlin.jvm.internal.i.g(a(iMax), other.a(iMax));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a other = (a) obj;
            kotlin.jvm.internal.i.e(other, "other");
            int iMax = Math.max(this.f6875c, other.f6875c);
            if (kotlin.jvm.internal.i.g(a(iMax), other.a(iMax)) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = b.f6876a[this.f6875c];
        int i11 = this.f6874b;
        sb2.append(i11 / i10);
        sb2.append('.');
        sb2.append(n.Z(String.valueOf((i11 % i10) + i10), "1"));
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
