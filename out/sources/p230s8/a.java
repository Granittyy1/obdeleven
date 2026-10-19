package p230s8;

import O.e;
import com.obdeleven.service.core.gen1.i;
import com.obdeleven.service.util.b;
import com.voltasit.obdeleven.domain.models.Nrc;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: UdsProtocolRequestCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String requestHex) {
        super(requestHex);
        kotlin.jvm.internal.i.e(requestHex, "requestHex");
        this.f46993h = requestHex;
    }

    @Override // com.obdeleven.service.core.gen1.i
    public final void i(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        if (data.length == 0) {
            return;
        }
        if (data[0] != 127 || data.length < 3) {
            byte b10 = (byte) (E8.a.b(this.f46993h)[0] + 64);
            if (data.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (data[0] == b10) {
                h(b.a(data));
                return;
            } else {
                e.D("UdsProtocolRequestCommand", "Received data is not intended for this request");
                return;
            }
        }
        byte b11 = data[2];
        Nrc.f30496b.getClass();
        Nrc nrcA = Nrc.a.a(b11);
        e.D("UdsProtocolRequestCommand", String.format("NRC(%02X: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(nrcA.a()), nrcA.b()}, 2)));
        if (nrcA != Nrc.f30499e) {
            h(b.a(data));
        }
    }
}
