package p047d8;

import com.obdeleven.service.core.d;
import java.util.Arrays;

/* JADX INFO: compiled from: ReadCpuIdCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d<String> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 18 && (bArr[1] & 255) == 0) {
            h(com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 2, 14)));
        }
    }
}
