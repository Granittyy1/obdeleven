package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0887o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f9197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9198b;

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0887o) {
            AbstractC0887o abstractC0887o = (AbstractC0887o) obj;
            int i10 = abstractC0887o.f9198b;
            int i11 = this.f9198b;
            if (i10 == i11) {
                long[] jArr = this.f9197a;
                long[] jArr2 = abstractC0887o.f9197a;
                Na.i iVarJ = Na.l.J(0, i11);
                int i12 = iVarJ.f4687b;
                int i13 = iVarJ.f4688c;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
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
        long[] jArr = this.f9197a;
        int i10 = this.f9198b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f9197a;
        int i10 = this.f9198b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.i.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.i.d(string2, "toString(...)");
        return string2;
    }
}
