package p134k8;

import java.util.ArrayList;
import p109i8.c;
import p121j8.e;

/* JADX INFO: renamed from: k8.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LongCoding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2642q1 implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f42830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42831c;

    public C2642q1(String str) {
        this.f42831c = str.toUpperCase();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2642q1 clone() {
        return new C2642q1(this.f42831c, this.f42830b);
    }

    public final int b(int i10) {
        int i11 = i10 * 2;
        return Integer.parseInt(this.f42831c.substring(i11, i11 + 2), 16);
    }

    public final byte[] c(int i10) {
        int iB = b(i10);
        byte[] bArr = new byte[8];
        for (int i11 = 0; i11 < 8; i11++) {
            bArr[i11] = (byte) (iB & 1);
            iB >>= 1;
        }
        return bArr;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f42831c.length() / 2; i10++) {
            int i11 = i10 * 2;
            arrayList.add(this.f42831c.substring(i11, i11 + 2));
        }
        return arrayList;
    }

    public final void e(int i10, int i11, int i12) {
        byte[] bArrC = c(i10);
        bArrC[i11] = (byte) (i12 & 1);
        int i13 = 0;
        for (int i14 = 8; i14 > 0; i14--) {
            i13 = (i13 << 1) | (bArrC[i14 - 1] & 1);
        }
        f(i10, i13);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C2642q1 ? this.f42831c.equals(((C2642q1) obj).f42831c) : super.equals(obj);
    }

    public final void f(int i10, int i11) {
        String hexString = Integer.toHexString(i11);
        while (hexString.length() < 2) {
            hexString = "0".concat(hexString);
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = i10 * 2;
        sb2.append(this.f42831c.substring(0, i12));
        sb2.append(hexString);
        sb2.append(this.f42831c.substring(i12 + 2));
        this.f42831c = sb2.toString().toUpperCase();
    }

    @Override // p109i8.c
    public final String getValue() {
        return this.f42831c;
    }

    public final String toString() {
        return this.f42831c;
    }

    public C2642q1(String str, e eVar) {
        this(str);
        this.f42830b = eVar;
    }
}
