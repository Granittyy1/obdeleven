package p047d8;

import com.obdeleven.service.core.d;

/* JADX INFO: compiled from: WriteVoltageCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends d<Void> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 22 && (bArr[1] & 255) == 0) {
            h(null);
        }
    }
}
