package p146l8;

import com.obdeleven.service.util.b;
import java.util.Locale;

/* JADX INFO: compiled from: KWP2000SimpleAdaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends i {
    @Override // p146l8.i
    public final int j() {
        return 3;
    }

    @Override // p146l8.i
    public final byte[] k(String str) {
        return b.e(str.substring(8));
    }

    @Override // p146l8.i
    public final String l(String str) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(Integer.parseInt(str.substring(4, 8), 16)));
    }

    @Override // p146l8.i
    public final String m(String str) {
        return String.format("%04X", Integer.valueOf(Integer.parseInt(str)));
    }
}
