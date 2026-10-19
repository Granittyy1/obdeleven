package p318zb;

import J4.n;
import kotlin.collections.AbstractC2670b;
import kotlin.jvm.internal.i;
import okio.ByteString;
import okio.internal.b;

/* JADX INFO: renamed from: zb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2834a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2839f.a f49060a = new C2839f.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f49061b = -1234567890;

    public static final boolean a(int i10, int i11, int i12, byte[] a10, byte[] b10) {
        i.e(a10, "a");
        i.e(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j || j - j10 < j11) {
            StringBuilder sbF = n.f("size=", " offset=", j);
            sbF.append(j10);
            sbF.append(" byteCount=");
            sbF.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbF.toString());
        }
    }

    public static final int c(int i10, ByteString byteString) {
        i.e(byteString, "<this>");
        return i10 == f49061b ? byteString.e() : i10;
    }

    public static final String d(byte b10) {
        char[] cArr = b.f45713a;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }

    public static final String e(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = b.f45713a;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        AbstractC2670b.a.a(i11, 8, 8);
        return new String(cArr2, i11, 8 - i11);
    }
}
