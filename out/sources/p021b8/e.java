package p021b8;

import com.obdeleven.service.core.d;
import com.obdeleven.service.exception.CommandException;

/* JADX INFO: compiled from: WriteFlashMemoryCommandEncrypted.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends d<Boolean> {
    public static String i(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X", Integer.valueOf(b10 & 255)));
        }
        return sb2.toString();
    }

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) != 3) {
            return;
        }
        if ((bArr[1] & 255) == 0) {
            h(Boolean.TRUE);
        } else {
            g(new CommandException(bArr[1]));
        }
    }
}
