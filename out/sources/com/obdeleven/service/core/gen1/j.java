package com.obdeleven.service.core.gen1;

import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: StartBootloaderCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.obdeleven.service.core.d<Void> {
    public j() {
        super("09", true);
    }

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 9) {
            Task.delay(100L).continueWith(new p009a8.d(1, this));
        }
    }
}
