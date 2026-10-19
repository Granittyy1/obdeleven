package coil.disk;

import androidx.navigation.compose.x;
import java.io.EOFException;
import java.io.IOException;
import p318zb.C2839f;
import p318zb.F;
import p318zb.m;

/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f22952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22953d;

    public c(F f10, x xVar) {
        super(f10);
        this.f22952c = xVar;
    }

    @Override // p318zb.m, p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f22953d = true;
            this.f22952c.invoke(e10);
        }
    }

    @Override // p318zb.m, p318zb.F, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f22953d = true;
            this.f22952c.invoke(e10);
        }
    }

    @Override // p318zb.m, p318zb.F
    public final void t0(C2839f c2839f, long j) throws EOFException {
        if (this.f22953d) {
            c2839f.skip(j);
            return;
        }
        try {
            super.t0(c2839f, j);
        } catch (IOException e10) {
            this.f22953d = true;
            this.f22952c.invoke(e10);
        }
    }
}
