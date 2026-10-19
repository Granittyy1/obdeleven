package p047d8;

import com.obdeleven.service.core.d;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.controlUnit.basicsettings.b;

/* JADX INFO: compiled from: StartFirmwareCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends d<Boolean> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        int i10 = bArr[0] & 255;
        if (i10 == 5 && (bArr[1] & 255) == 0) {
            Task.delay(100L).continueWith(new b(2, this));
        } else if (i10 == 5 && (bArr[1] & 255) == 1) {
            Task.delay(100L).continueWith(new com.parse.b(4, this));
        }
    }
}
