package com.obdeleven.service.protocol;

import com.obdeleven.service.core.gen1.i;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.models.Nrc;
import java.util.Arrays;

/* JADX INFO: compiled from: Kwp2002Protocol.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Protocol {

    /* JADX INFO: compiled from: Kwp2002Protocol.java */
    public class a extends i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f29543h;

        public a(String str) {
            super(str);
        }

        @Override // com.obdeleven.service.core.gen1.i
        public final void i(byte[] bArr) {
            if (bArr.length > 2) {
                int i10 = (bArr[0] << 8) | (bArr[1] & 255);
                int i11 = 32768 & i10;
                if ((i10 & 32767) + 2 == bArr.length) {
                    if ((bArr[2] & 255) == 127) {
                        int i12 = bArr[4] & 255;
                        Nrc.f30496b.getClass();
                        Nrc nrcA = Nrc.a.a(i12);
                        O.e.D(c.this.f29527b, String.format("NRC(%02X: %s)", Integer.valueOf(nrcA.a()), nrcA.b()));
                        if (i12 != 120) {
                            h(com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 2, bArr.length)));
                            return;
                        }
                        return;
                    }
                    if (this.f29543h == null) {
                        this.f29543h = com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 2, bArr.length));
                    } else {
                        this.f29543h += com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 3, bArr.length));
                    }
                    if (i11 == 0) {
                        h(this.f29543h);
                    }
                }
            }
        }
    }

    public c() {
        super("KWP2002");
        O.e.j(this.f29527b, "");
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final long b(Protocol.State state) {
        return 0L;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<String> c(String str) {
        int length = str.length() / 2;
        return new a(String.format("%02X%02X%s", Integer.valueOf((length >> 8) & 255), Integer.valueOf(length & 255), str)).a();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<Void> e() {
        return Task.forResult(null);
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final void f(Protocol.State state) {
        O.e.j(this.f29527b, "onTimeout(" + state.name() + ")");
    }
}
