package p021b8;

import com.obdeleven.service.core.d;
import com.obdeleven.service.exception.CommandException;

/* JADX INFO: compiled from: EraseFlashMemoryCommandEncrypted.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d<Void> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) != 2) {
            return;
        }
        if ((bArr[1] & 255) == 0) {
            h(null);
        } else {
            g(new CommandException(bArr[1]));
        }
    }
}
