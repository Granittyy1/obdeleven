package p134k8;

import com.obdeleven.service.util.b;
import java.util.Arrays;

/* JADX INFO: compiled from: GatewayListCoding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f42685a;

    public V0(byte[] bArr) {
        this.f42685a = bArr;
    }

    public final void a(int i10, boolean z10) {
        int i11 = i10 / 8;
        int i12 = i10 % 8;
        int i13 = this.f42685a[i11];
        byte[] bArr = new byte[8];
        byte b10 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            bArr[i14] = (byte) (i13 & 1);
            i13 >>= 1;
        }
        bArr[i12] = z10 ? (byte) 1 : (byte) 0;
        for (int i15 = 8; i15 > 0; i15--) {
            b10 = (byte) (((byte) (b10 << 1)) | (bArr[i15 - 1] & 1));
        }
        this.f42685a[i11] = b10;
    }

    public final boolean equals(Object obj) {
        return obj instanceof V0 ? Arrays.equals(this.f42685a, ((V0) obj).f42685a) : super.equals(obj);
    }

    public final String toString() {
        return b.a(this.f42685a);
    }
}
