package p245u;

import android.os.Parcel;
import p013b0.n;
import p013b0.o;

/* JADX INFO: compiled from: ClipboardUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f47386a;

    public final void a(byte b10) {
        this.f47386a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f47386a.writeFloat(f10);
    }

    public final void c(long j) {
        long jB = n.b(j);
        byte b10 = 0;
        if (!o.a(jB, 0L)) {
            if (o.a(jB, 4294967296L)) {
                b10 = 1;
            } else if (o.a(jB, 8589934592L)) {
                b10 = 2;
            }
        }
        a(b10);
        if (o.a(n.b(j), 0L)) {
            return;
        }
        b(n.c(j));
    }
}
