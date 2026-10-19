package rb;

import okio.ByteString;

/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f46543a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f46544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f46545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f46546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f46547e;

    static {
        ByteString byteString = ByteString.f45705d;
        f46544b = ByteString.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f46545c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f46546d = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            kotlin.jvm.internal.i.d(binaryString, "toBinaryString(it)");
            String strReplace = p172nb.b.i("%8s", binaryString).replace(' ', '0');
            kotlin.jvm.internal.i.d(strReplace, "replace(...)");
            strArr[i10] = strReplace;
        }
        f46547e = strArr;
        String[] strArr2 = f46546d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = Q8.d.a(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f46546d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = Q8.d.a(sb2, strArr3[i13], "|PADDED");
        }
        int length = f46546d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f46546d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f46547e[i16];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static String a(boolean z10, int i10, int i11, int i12, int i13) {
        String strG;
        String str;
        String[] strArr = f46545c;
        String strI = i12 < strArr.length ? strArr[i12] : p172nb.b.i("0x%02x", Integer.valueOf(i12));
        if (i13 == 0) {
            strG = "";
        } else {
            String[] strArr2 = f46547e;
            if (i12 == 2 || i12 == 3) {
                strG = strArr2[i13];
            } else if (i12 == 4 || i12 == 6) {
                strG = i13 == 1 ? "ACK" : strArr2[i13];
            } else if (i12 == 7 || i12 == 8) {
                strG = strArr2[i13];
            } else {
                String[] strArr3 = f46546d;
                if (i13 < strArr3.length) {
                    str = strArr3[i13];
                    kotlin.jvm.internal.i.b(str);
                } else {
                    str = strArr2[i13];
                }
                if (i12 != 5 || (i13 & 4) == 0) {
                    strG = (i12 != 0 || (i13 & 32) == 0) ? str : kotlin.text.m.G(str, "PRIORITY", "COMPRESSED");
                } else {
                    strG = kotlin.text.m.G(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return p172nb.b.i("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strI, strG);
    }
}
