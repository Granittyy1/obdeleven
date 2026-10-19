package com.obdeleven.service.core.gen1;

import com.obdeleven.service.exception.CommandException;
import java.util.Arrays;

/* JADX INFO: compiled from: IoCtlCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.obdeleven.service.core.d<String> {
    public c(String str) {
        super(B7.b.c("22", str), true);
    }

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) == 34) {
            int i10 = bArr[1] & 255;
            if (i10 == 0) {
                h(com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 2, bArr.length)));
            } else {
                g(new CommandException(i10));
            }
        }
    }
}
