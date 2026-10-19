package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0881i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f9183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9184b;

    public final int a(int i10) {
        if (i10 >= 0 && i10 < this.f9184b) {
            return this.f9183a[i10];
        }
        D9.o.r("Index must be between 0 and size");
        throw null;
    }

    public final int b() {
        int i10 = this.f9184b;
        if (i10 != 0) {
            return this.f9183a[i10 - 1];
        }
        D9.o.s("IntList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0881i) {
            AbstractC0881i abstractC0881i = (AbstractC0881i) obj;
            int i10 = abstractC0881i.f9184b;
            int i11 = this.f9184b;
            if (i10 == i11) {
                int[] iArr = this.f9183a;
                int[] iArr2 = abstractC0881i.f9183a;
                Na.i iVarJ = Na.l.J(0, i11);
                int i12 = iVarJ.f4687b;
                int i13 = iVarJ.f4688c;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f9183a;
        int i10 = this.f9184b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f9183a;
        int i10 = this.f9184b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.i.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i12);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.i.d(string2, "toString(...)");
        return string2;
    }
}
