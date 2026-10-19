package com.obdeleven.service.core.gen1;

import com.obdeleven.service.exception.CommandException;
import com.voltasit.obdeleven.domain.models.Nrc;

/* JADX INFO: compiled from: ConnectUdsCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {
    public b() {
        super("1003", 1000L);
    }

    @Override // com.obdeleven.service.core.gen1.i
    public final void i(byte[] bArr) {
        if (bArr.length >= 1) {
            if ((bArr[0] & 255) == 127 && bArr.length >= 3) {
                int i10 = bArr[2] & 255;
                Nrc.f30496b.getClass();
                Nrc nrcA = Nrc.a.a(i10);
                O.e.D("ConnectUdsCommand", String.format("NRC(%02X: %s)", Integer.valueOf(nrcA.a()), nrcA.b()));
                if (i10 == 120) {
                    return;
                }
            }
            String strA = com.obdeleven.service.util.b.a(bArr);
            if (strA.startsWith("7F10")) {
                g(new CommandException(20));
            } else {
                h(strA);
            }
        }
    }
}
