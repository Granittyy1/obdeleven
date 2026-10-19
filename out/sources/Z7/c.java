package Z7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BroadcastCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.obdeleven.service.core.e<List<Short>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f7959i = {3, 34, 42, 47, 85, 85, 85, 85};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f7960h;

    @Override // com.obdeleven.service.core.d
    public final void d(byte[] bArr) {
        e(bArr);
    }

    @Override // com.obdeleven.service.core.d
    public final void f() {
        O.e.s("BroadcastCommand", "Broadcast Timeout");
        h(this.f7960h);
    }

    @Override // com.obdeleven.service.core.e
    public final void i(byte[] bArr) {
        if (bArr.length == 8 && bArr[1] == 98 && bArr[2] == 42 && bArr[3] == 47) {
            com.obdeleven.service.core.d<T>.a aVar = this.f29246e;
            synchronized (aVar) {
                aVar.f29249d = System.currentTimeMillis();
            }
            Short shValueOf = Short.valueOf((short) (bArr[4] & 255));
            O.e.s("BroadcastCommand", "Gateway responded: ".concat(String.format("%02X ", Integer.valueOf(shValueOf.intValue()))));
            this.f7960h.add(shValueOf);
        }
    }
}
