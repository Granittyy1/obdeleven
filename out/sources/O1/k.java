package O1;

import java.util.Arrays;

/* JADX INFO: compiled from: MlltFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f4763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f4764f;

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4760b = i10;
        this.f4761c = i11;
        this.f4762d = i12;
        this.f4763e = iArr;
        this.f4764f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f4760b == kVar.f4760b && this.f4761c == kVar.f4761c && this.f4762d == kVar.f4762d && Arrays.equals(this.f4763e, kVar.f4763e) && Arrays.equals(this.f4764f, kVar.f4764f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4764f) + ((Arrays.hashCode(this.f4763e) + ((((((527 + this.f4760b) * 31) + this.f4761c) * 31) + this.f4762d) * 31)) * 31);
    }
}
