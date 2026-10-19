package androidx.compose.ui.platform;

import android.os.Parcel;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1225i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f15051a;

    public final void a(byte b10) {
        this.f15051a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f15051a.writeFloat(f10);
    }

    public final void c(long j) {
        long jB = p013b0.n.b(j);
        byte b10 = 0;
        if (!p013b0.o.a(jB, 0L)) {
            if (p013b0.o.a(jB, 4294967296L)) {
                b10 = 1;
            } else if (p013b0.o.a(jB, 8589934592L)) {
                b10 = 2;
            }
        }
        a(b10);
        if (p013b0.o.a(p013b0.n.b(j), 0L)) {
            return;
        }
        b(p013b0.n.c(j));
    }
}
