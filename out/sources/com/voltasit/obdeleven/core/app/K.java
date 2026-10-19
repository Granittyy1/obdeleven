package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: DigitByteFieldCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K extends AbstractC2107w {
    public final String[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f30050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f30051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f30052n;

    public K(I8.b bVar, boolean z10) {
        super(bVar, true);
        String[] strArrSplit = bVar.f3916b.split("/");
        this.j = bVar.f3918d.split("/");
        if (z10) {
            this.f30049k = Integer.parseInt(strArrSplit[2]);
            this.f30050l = Integer.parseInt(strArrSplit[3]);
            this.f30051m = Integer.parseInt(strArrSplit[4]);
            this.f30052n = Integer.parseInt(strArrSplit[5]);
            return;
        }
        this.f30049k = Integer.parseInt(strArrSplit[1]);
        this.f30050l = Integer.parseInt(strArrSplit[2]);
        this.f30051m = Integer.parseInt(strArrSplit[3]);
        this.f30052n = Integer.parseInt(strArrSplit[4]);
    }

    public static byte[] j(byte[] bArr) {
        int length = bArr.length * 8;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = (byte) ((bArr[i10 / 8] >> (i10 % 8)) & 1);
        }
        return bArr2;
    }

    public static byte[] k(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        return bArr;
    }

    public static void l(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < bArr.length / 2) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[length];
            bArr[length] = b10;
            i10++;
            length--;
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        String strA = a();
        int i10 = this.f30049k;
        byte[] bArrK = k(kotlin.jvm.internal.n.g(strA.substring(i10, this.f30050l + i10)));
        l(bArrK);
        byte[] bArrJ = j(bArrK);
        int i11 = this.f30051m;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrJ, i11, this.f30052n + i11);
        int i12 = 0;
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            i12 |= bArrCopyOfRange[i13] << i13;
        }
        return Integer.toString(i12);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        return this.f30181e || this.j[i10].equals(c());
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return controlUnit.n0().continueWith(new I(this, 0, controlUnit));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        String strA = a();
        if (this.f30181e && strA == null) {
            return;
        }
        int i11 = this.f30049k;
        int i12 = this.f30050l;
        int i13 = i11 + i12;
        String strG = kotlin.jvm.internal.n.g(strA.substring(i11, i13));
        long j = Long.parseLong(this.j[i10]);
        byte[] bArrK = k(strG);
        l(bArrK);
        byte[] bArrJ = j(bArrK);
        for (int i14 = 0; i14 < this.f30052n; i14++) {
            bArrJ[this.f30051m + i14] = (byte) ((j >> i14) & 1);
        }
        int iCeil = (int) Math.ceil(bArrJ.length / 8.0f);
        byte[] bArr = new byte[iCeil];
        for (int i15 = 0; i15 < bArrJ.length; i15++) {
            int i16 = i15 / 8;
            byte b10 = (byte) (1 << (i15 % 8));
            if (bArrJ[i15] == 1) {
                bArr[i16] = (byte) (b10 | bArr[i16]);
            } else {
                bArr[i16] = (byte) ((~b10) & bArr[i16]);
            }
        }
        l(bArr);
        StringBuilder sb2 = new StringBuilder();
        for (int i17 = 0; i17 < iCeil; i17++) {
            sb2.append(String.format(Locale.US, "%02X", Byte.valueOf(bArr[i17])));
        }
        String string = Integer.toString(Integer.parseInt(sb2.toString(), 16));
        if (string.length() > i12) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strA.substring(0, i11));
        StringBuilder sb4 = new StringBuilder(string);
        for (int length = i12 - sb4.length(); length > 0; length--) {
            sb4.insert(0, "0");
        }
        sb3.append(sb4.toString());
        sb3.append(strA.substring(i13));
        f(sb3.toString());
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return controlUnit.K0(a()).continueWith(new J(0));
    }
}
