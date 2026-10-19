package okio.internal;

import java.io.EOFException;
import kotlin.jvm.internal.i;
import p318zb.C2839f;
import p318zb.D;
import p318zb.x;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f45712a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(kotlin.text.a.f43120b);
        i.d(bytes, "getBytes(...)");
        f45712a = bytes;
    }

    public static final String a(C2839f c2839f, long j) throws EOFException {
        i.e(c2839f, "<this>");
        if (j > 0) {
            long j10 = j - 1;
            if (c2839f.p(j10) == 13) {
                String strO0 = c2839f.o0(j10, kotlin.text.a.f43120b);
                c2839f.skip(2L);
                return strO0;
            }
        }
        String strO1 = c2839f.o0(j, kotlin.text.a.f43120b);
        c2839f.skip(1L);
        return strO1;
    }

    public static final int b(C2839f c2839f, x options, boolean z10) {
        int i10;
        int i11;
        D d10;
        byte[] bArr;
        int i12;
        i.e(c2839f, "<this>");
        i.e(options, "options");
        D d11 = c2839f.f49073b;
        int i13 = -2;
        if (d11 == null) {
            return z10 ? -2 : -1;
        }
        int i14 = d11.f49042b;
        int i15 = d11.f49043c;
        byte[] bArr2 = d11.f49041a;
        D d12 = d11;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int[] iArr = options.f49119c;
            int i19 = iArr[i17];
            int i20 = i17 + 2;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (d12 == null) {
                break;
            }
            if (i19 >= 0) {
                int i22 = i14 + 1;
                int i23 = bArr2[i14] & 255;
                int i24 = i20 + i19;
                while (i20 != i24) {
                    if (i23 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i22 == i15) {
                            d12 = d12.f49046f;
                            i.b(d12);
                            i11 = d12.f49042b;
                            i15 = d12.f49043c;
                            bArr2 = d12.f49041a;
                            if (d12 == d11) {
                                d12 = null;
                            }
                        } else {
                            i11 = i22;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i25 = (i19 * (-1)) + i20;
            while (true) {
                int i26 = i14 + 1;
                int i27 = i20 + 1;
                if ((bArr2[i14] & 255) != iArr[i20]) {
                    return i16;
                }
                boolean z11 = i27 == i25;
                if (i26 == i15) {
                    i.b(d12);
                    D d13 = d12.f49046f;
                    i.b(d13);
                    i12 = d13.f49042b;
                    int i28 = d13.f49043c;
                    bArr = d13.f49041a;
                    if (d13 != d11) {
                        d10 = d13;
                        i15 = i28;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        i15 = i28;
                        d10 = null;
                    }
                } else {
                    d10 = d12;
                    bArr = bArr2;
                    i12 = i26;
                }
                if (z11) {
                    i10 = iArr[i27];
                    i11 = i12;
                    bArr2 = bArr;
                    d12 = d10;
                    break;
                }
                i14 = i12;
                bArr2 = bArr;
                d12 = d10;
                i20 = i27;
            }
            if (i10 >= 0) {
                return i10;
            }
            i17 = -i10;
            i14 = i11;
            i13 = -2;
        }
        return z10 ? i13 : i16;
    }
}
