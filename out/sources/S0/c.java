package S0;

import O.h;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Table.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f5345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5347d;

    public c() {
        if (h.f4725a == null) {
            h.f4725a = new h();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f5347d) {
            return this.f5345b.getShort(this.f5346c + i10);
        }
        return 0;
    }
}
