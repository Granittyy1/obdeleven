package com.obdeleven.service.protocol;

import com.obdeleven.service.core.gen1.i;
import com.parse.boltsinternal.Task;
import java.util.Arrays;

/* JADX INFO: compiled from: Kwp1281Protocol.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Protocol {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29541f;

    /* JADX INFO: compiled from: Kwp1281Protocol.java */
    public class a extends i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f29542h;

        @Override // com.obdeleven.service.core.gen1.i
        public final void i(byte[] bArr) {
            if (bArr.length == 0) {
                h(this.f29542h);
            } else if (bArr.length > 2) {
                this.f29542h = com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, 2, bArr.length - 1));
            }
        }
    }

    public b() {
        super("KWP1281");
        this.f29541f = 0;
        O.e.j(this.f29527b, "");
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final long b(Protocol.State state) {
        return state == Protocol.State.f29532c ? 500L : 0L;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<String> c(String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            str2 = "";
        } else {
            if (str.length() % 2 != 0) {
                throw new RuntimeException("Command data length must be even");
            }
            int length = (str.length() / 2) + 2;
            this.f29541f += 2;
            str2 = String.format("%02X%02X%s03", Integer.valueOf(length & 255), Integer.valueOf(this.f29541f & 255), str);
        }
        return new a(str2).a();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<Void> e() {
        return c("06").makeVoid();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final void f(Protocol.State state) {
        O.e.j(this.f29527b, "onTimeout(" + state.name() + ")");
        g("09");
    }
}
