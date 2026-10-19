package Z7;

import O.h;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BroadcastCommand2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.obdeleven.service.core.e<Set<? extends Short>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f7957i;
    public static final byte[] j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f7958h;

    static {
        byte[] bArrB = E8.a.b("22F1B5");
        f7957i = E8.a.b("62F1B5");
        j = Q3.d.G(Q3.d.G(new byte[]{3}, bArrB), E8.a.b("55555555"));
    }

    public b() {
        super(j);
        this.f7958h = new LinkedHashSet();
    }

    @Override // com.obdeleven.service.core.d
    public final void d(byte[] bArr) {
        e(bArr);
    }

    @Override // com.obdeleven.service.core.d
    public final void f() {
        O.e.s("BroadcastCommand2", "Broadcast Timeout");
        h(this.f7958h);
    }

    @Override // com.obdeleven.service.core.e
    public final void i(byte[] data) {
        i.e(data, "data");
        if (data.length == 8 && (data[0] & 240) == 16 && Arrays.equals(Q3.d.t(data, 2, 5), f7957i)) {
            com.obdeleven.service.core.d<T>.a aVar = this.f29246e;
            synchronized (aVar) {
                aVar.f29249d = System.currentTimeMillis();
            }
            short sH = (short) E8.a.h(Q3.d.t(data, 5, 7));
            h.c(16);
            String string = Integer.toString(sH, 16);
            i.d(string, "toString(...)");
            O.e.s("BroadcastCommand2", "Gateway responded: ".concat(string));
            this.f7958h.add(Short.valueOf(sH));
        }
    }
}
