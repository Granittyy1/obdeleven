package O1;

import java.util.Arrays;

/* JADX INFO: compiled from: BinaryFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f4731b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f4731b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4755a.equals(bVar.f4755a) && Arrays.equals(this.f4731b, bVar.f4731b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4731b) + B1.a.b(this.f4755a, 527, 31);
    }
}
