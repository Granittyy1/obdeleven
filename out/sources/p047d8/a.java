package p047d8;

import com.obdeleven.service.core.d;
import com.obdeleven.service.util.b;
import java.util.Arrays;

/* JADX INFO: compiled from: ReadColorCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d<String> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 23 && (bArr[1] & 255) == 0) {
            h(b.a(Arrays.copyOfRange(bArr, 2, 5)));
        }
    }
}
