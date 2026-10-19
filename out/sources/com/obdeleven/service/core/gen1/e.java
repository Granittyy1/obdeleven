package com.obdeleven.service.core.gen1;

import java.util.Arrays;

/* JADX INFO: compiled from: ReadPasswordCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.obdeleven.service.core.d<String> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 20) {
            h(com.obdeleven.service.util.b.b(com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 1, bArr.length))));
        }
    }
}
