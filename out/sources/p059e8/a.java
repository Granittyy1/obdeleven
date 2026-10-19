package p059e8;

import com.obdeleven.service.core.d;

/* JADX INFO: compiled from: ReadDeviceGenerationCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d<Byte> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 8 && (bArr[1] & 255) == 0) {
            h(Byte.valueOf(bArr[2]));
        }
    }
}
