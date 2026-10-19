package p127k1;

import B6.c;
import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import java.util.ArrayList;
import java.util.Arrays;
import p078g1.s;
import p114j1.A;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: MdtaMetadataEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f41386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41388d;

    public a(String str, byte[] bArr, int i10, int i11) {
        byte b10;
        boolean z10 = true;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                b.e(i11 == 23 && bArr.length == 4);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 != 75 || bArr.length != 1 || ((b10 = bArr[0]) != 0 && b10 != 1)) {
                    z10 = false;
                }
                b.e(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                b.e(i11 == 78 && bArr.length == 8);
                break;
            case "auxiliary.tracks.map":
                b.e(i11 == 0);
                break;
        }
        this.f41385a = str;
        this.f41386b = bArr;
        this.f41387c = i10;
        this.f41388d = i11;
    }

    public final ArrayList d() {
        b.i("Metadata is not an auxiliary tracks map", this.f41385a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f41386b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f41385a.equals(aVar.f41385a) && Arrays.equals(this.f41386b, aVar.f41386b) && this.f41387c == aVar.f41387c && this.f41388d == aVar.f41388d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f41386b) + B1.a.b(this.f41385a, 527, 31)) * 31) + this.f41387c) * 31) + this.f41388d;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[LOOP:0: B:39:0x00f0->B:41:0x00f3, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb2;
        String str = this.f41385a;
        byte[] bArr = this.f41386b;
        int i10 = this.f41388d;
        if (i10 != 0) {
            if (i10 == 1) {
                string = A.l(bArr);
            } else if (i10 == 23) {
                boolean z10 = bArr.length >= 4;
                int length = bArr.length;
                if (!z10) {
                    throw new IllegalArgumentException(A8.A.h("array too small: %s < %s", Integer.valueOf(length), 4));
                }
                byte b10 = bArr[0];
                string = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (b10 << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
            } else if (i10 == 67) {
                boolean z11 = bArr.length >= 4;
                int length2 = bArr.length;
                if (!z11) {
                    throw new IllegalArgumentException(A8.A.h("array too small: %s < %s", Integer.valueOf(length2), 4));
                }
                byte b11 = bArr[0];
                string = String.valueOf(((bArr[1] & 255) << 16) | (b11 << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255));
            } else if (i10 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr[0]));
            } else if (i10 != 78) {
                int i11 = A.f40996a;
                sb2 = new StringBuilder(bArr.length * 2);
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                    sb2.append(Character.forDigit(bArr[i12] & 15, 16));
                }
                string = sb2.toString();
            } else {
                string = String.valueOf(new r(bArr).z());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbE = C4.b.e("track types = ");
            new C2126g(String.valueOf(',')).a(sbE, arrayListD.iterator());
            string = sbE.toString();
        } else {
            int i13 = A.f40996a;
            sb2 = new StringBuilder(bArr.length * 2);
            while (i12 < bArr.length) {
                sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                sb2.append(Character.forDigit(bArr[i12] & 15, 16));
            }
            string = sb2.toString();
        }
        return c.d("mdta: key=", str, ", value=", string);
    }
}
