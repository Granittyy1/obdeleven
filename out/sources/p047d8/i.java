package p047d8;

import com.obdeleven.service.core.d;
import com.parse.a;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: StartBootloaderCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends d<Void> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 6 && (bArr[1] & 255) == 0) {
            Task.delay(100L).continueWith(new a(6, this));
        }
    }
}
