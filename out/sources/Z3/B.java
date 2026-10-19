package Z3;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: ProgressNoopOutputStream.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B extends OutputStream implements E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f7746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7747c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f7748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f7749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7750f;

    public B(Handler handler) {
        this.f7746b = handler;
    }

    @Override // Z3.E
    public final void b(r rVar) {
        this.f7748d = rVar;
        this.f7749e = rVar != null ? (G) this.f7747c.get(rVar) : null;
    }

    public final void c(long j) {
        r rVar = this.f7748d;
        if (rVar == null) {
            return;
        }
        if (this.f7749e == null) {
            G g10 = new G(this.f7746b, rVar);
            this.f7749e = g10;
            this.f7747c.put(rVar, g10);
        }
        G g11 = this.f7749e;
        if (g11 != null) {
            g11.f7767f += j;
        }
        this.f7750f += (int) j;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        c(buffer.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        c(i11);
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        c(1L);
    }
}
