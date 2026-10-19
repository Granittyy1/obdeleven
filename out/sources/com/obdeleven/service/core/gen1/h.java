package com.obdeleven.service.core.gen1;

/* JADX INFO: compiled from: ReadVoltageCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends com.obdeleven.service.core.d<Float> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 22) {
            h(Float.valueOf(((bArr[2] & 255) / 100.0f) + (bArr[1] & 255)));
        }
    }
}
