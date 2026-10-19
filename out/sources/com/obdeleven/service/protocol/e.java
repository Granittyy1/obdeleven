package com.obdeleven.service.protocol;

import com.obdeleven.service.core.gen1.i;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.models.Nrc;
import java.util.Arrays;

/* JADX INFO: compiled from: ObdIIProtocol.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends Protocol {

    /* JADX INFO: compiled from: ObdIIProtocol.java */
    public class a extends i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f29546h;

        public a(String str) {
            super(str);
        }

        @Override // com.obdeleven.service.core.gen1.i
        public final void i(byte[] bArr) {
            if (bArr.length == 0) {
                h(this.f29546h);
                return;
            }
            if (bArr.length > 4) {
                if ((bArr[3] & 255) == 127) {
                    int i10 = bArr[5] & 255;
                    Nrc.f30496b.getClass();
                    Nrc nrcA = Nrc.a.a(i10);
                    O.e.D(e.this.f29527b, String.format("NRC(%02X: %s)", Integer.valueOf(nrcA.a()), nrcA.b()));
                    if (i10 != 120) {
                        this.f29546h = com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 3, bArr.length - 1));
                        return;
                    }
                    return;
                }
                if (this.f29546h == null) {
                    this.f29546h = com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 3, bArr.length - 1));
                    return;
                }
                this.f29546h += com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 4, bArr.length - 1));
            }
        }
    }

    public e() {
        super("OBDII");
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final long b(Protocol.State state) {
        return state == Protocol.State.f29532c ? 1000L : 0L;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<String> c(String str) {
        String strC = B7.b.c("686AF1", str);
        int i10 = 0;
        int i11 = 0;
        while (i10 < strC.length()) {
            int i12 = i10 + 2;
            i11 += Integer.parseInt(strC.substring(i10, i12), 16) & 255;
            i10 = i12;
        }
        return new a(strC.concat(String.format("%02X", Integer.valueOf(i11 & 255)))).a();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<Void> e() {
        return Task.delay(5000L);
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final void f(Protocol.State state) {
        O.e.j(this.f29527b, "onTimeout(" + state.name() + ")");
        g("0100");
    }
}
