package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ByteFieldCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2102q extends AbstractC2107w {
    public final String[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f30141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f30142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f30143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f30144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f30145o;

    public AbstractC2102q(I8.b bVar, boolean z10) {
        super(bVar, false);
        this.f30145o = z10;
        String strA = bVar.f3915a.a();
        String[] strArrSplit = bVar.f3916b.split("/");
        this.j = strArrSplit;
        this.f30141k = bVar.f3918d.split("/");
        strA.getClass();
        switch (strA) {
            case "LONG_CODING":
                this.f30142l = Integer.parseInt(strArrSplit[0]);
                this.f30143m = Integer.parseInt(strArrSplit[1]);
                this.f30144n = Integer.parseInt(strArrSplit[2]);
                break;
            case "DATA_BY_ID":
            case "SUB_LONG_CODING":
                this.f30142l = Integer.parseInt(strArrSplit[1]);
                this.f30143m = Integer.parseInt(strArrSplit[2]);
                this.f30144n = Integer.parseInt(strArrSplit[3]);
                break;
            case "ADAPTATION":
            case "LONG_ADAPTATION":
            case "CODING":
                this.f30142l = 0;
                this.f30143m = Integer.parseInt(strArrSplit[1]);
                this.f30144n = Integer.parseInt(strArrSplit[2]);
                break;
            case "SUB_CODING":
                this.f30142l = 0;
                this.f30143m = Integer.parseInt(strArrSplit[2]);
                this.f30144n = Integer.parseInt(strArrSplit[3]);
                break;
            case "EEPROM":
                this.f30142l = Integer.parseInt(strArrSplit[2]);
                this.f30143m = Integer.parseInt(strArrSplit[3]);
                this.f30144n = Integer.parseInt(strArrSplit[4]);
                break;
            default:
                this.f30142l = 0;
                this.f30143m = 0;
                this.f30144n = 0;
                break;
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        String hexData = a();
        kotlin.jvm.internal.i.e(hexData, "hexData");
        byte[] bArrJ = A0.f.j(hexData);
        if (this.f30145o) {
            A0.f.k(bArrJ);
        }
        byte[] bArrA = A0.f.a(bArrJ);
        int i10 = (this.f30142l * 8) + this.f30143m;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i10, this.f30144n + i10);
        kotlin.jvm.internal.i.d(bArrCopyOfRange, "copyOfRange(...)");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        int length = bArrCopyOfRange.length;
        for (int i11 = 0; i11 < length; i11++) {
            bigIntegerValueOf = bigIntegerValueOf.or(BigInteger.valueOf(bArrCopyOfRange[i11]).shiftLeft(i11));
        }
        String string = bigIntegerValueOf.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        return this.f30181e || this.f30141k[i10].equals(c());
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public Task<Integer> g(ControlUnit controlUnit) {
        return g(controlUnit);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public void h(int i10) {
        String hexData = a();
        if (this.f30181e && hexData == null) {
            return;
        }
        String value = this.f30141k[i10];
        kotlin.jvm.internal.i.e(hexData, "hexData");
        kotlin.jvm.internal.i.e(value, "value");
        BigInteger bigInteger = new BigInteger(value);
        byte[] bArrJ = A0.f.j(hexData);
        boolean z10 = this.f30145o;
        if (z10) {
            A0.f.k(bArrJ);
        }
        byte[] bArrA = A0.f.a(bArrJ);
        for (int i11 = 0; i11 < this.f30144n; i11++) {
            bArrA[(this.f30142l * 8) + this.f30143m + i11] = bigInteger.shiftRight(i11).and(BigInteger.ONE).byteValue();
        }
        int length = bArrA.length / 8;
        byte[] bArr = new byte[length];
        int length2 = bArrA.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = i12 / 8;
            byte b10 = (byte) (1 << (i12 % 8));
            if (bArrA[i12] == 1) {
                bArr[i13] = (byte) (bArr[i13] | b10);
            } else {
                bArr[i13] = (byte) (bArr[i13] & ((byte) (~b10)));
            }
        }
        if (z10) {
            A0.f.k(bArr);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(Locale.US, "%02X", Arrays.copyOf(new Object[]{Byte.valueOf(bArr[i14])}, 1)));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        f(string);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public Task<Integer> i(ControlUnit controlUnit) {
        return i(controlUnit);
    }
}
