package p061ea;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;
import p074fa.a;

/* JADX INFO: compiled from: ByteReadPacket.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f34862i = new d(a.f35065k, 0, a.j);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a head, long j, p086ga.d<a> pool) {
        super(head, j, pool);
        i.e(head, "head");
        i.e(pool, "pool");
        if (this.f34871h) {
            return;
        }
        this.f34871h = true;
    }

    @Override // p061ea.f
    public final a i() {
        return null;
    }

    @Override // p061ea.f
    public final void j(ByteBuffer destination) {
        i.e(destination, "destination");
    }

    public final String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }
}
