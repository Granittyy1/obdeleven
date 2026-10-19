package p146l8;

import com.obdeleven.service.util.b;
import java.util.Arrays;

/* JADX INFO: compiled from: KWP2000LongAdaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends i {
    @Override // p146l8.i
    public final int j() {
        return 10;
    }

    @Override // p146l8.i
    public final byte[] k(String str) {
        byte[] bArrE = b.e(str);
        int i10 = bArrE[2] & 255;
        if (bArrE.length >= i10 + 3) {
            int i11 = i10 + 2;
            if ((bArrE[i11] & 255) != 255) {
                return Arrays.copyOfRange(bArrE, i11, bArrE.length);
            }
        }
        return new byte[0];
    }

    @Override // p146l8.i
    public final String l(String str) {
        return str.substring(6, ((Integer.parseInt(str.substring(4, 6), 16) - 1) * 2) + 6);
    }

    @Override // p146l8.i
    public final String m(String str) {
        return str;
    }
}
