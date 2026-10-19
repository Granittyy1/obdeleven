package p047d8;

import com.obdeleven.service.core.d;

/* JADX INFO: compiled from: ReadVoltageCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends d<Float> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 21 && (bArr[1] & 255) == 0) {
            h(Float.valueOf(((bArr[3] & 255) / 100.0f) + (bArr[2] & 255)));
        }
    }
}
