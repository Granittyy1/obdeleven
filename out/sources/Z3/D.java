package Z3;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: ProgressOutputStream.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D extends FilterOutputStream implements E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f7753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public G f7759h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(FilterOutputStream filterOutputStream, w requests, HashMap progressMap, long j) {
        super(filterOutputStream);
        kotlin.jvm.internal.i.e(requests, "requests");
        kotlin.jvm.internal.i.e(progressMap, "progressMap");
        this.f7753b = requests;
        this.f7754c = progressMap;
        this.f7755d = j;
        q qVar = q.f7852a;
        p165n4.t.e();
        this.f7756e = q.f7859h.get();
    }

    @Override // Z3.E
    public final void b(r rVar) {
        this.f7759h = rVar != null ? (G) this.f7754c.get(rVar) : null;
    }

    public final void c(long j) {
        G g10 = this.f7759h;
        if (g10 != null) {
            long j10 = g10.f7765d + j;
            g10.f7765d = j10;
            if (j10 >= g10.f7766e + g10.f7764c || j10 >= g10.f7767f) {
                g10.a();
            }
        }
        long j11 = this.f7757f + j;
        this.f7757f = j11;
        if (j11 >= this.f7758g + this.f7756e || j11 >= this.f7755d) {
            h();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        Iterator it = this.f7754c.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).a();
        }
        h();
    }

    public final void h() {
        Boolean boolValueOf;
        if (this.f7757f > this.f7758g) {
            w wVar = this.f7753b;
            for (w.a aVar : wVar.f7901e) {
                if (aVar instanceof w.b) {
                    Handler handler = wVar.f7898b;
                    if (handler == null) {
                        boolValueOf = null;
                    } else {
                        final w.b bVar = (w.b) aVar;
                        boolValueOf = Boolean.valueOf(handler.post(new Runnable() { // from class: Z3.C
                            @Override // java.lang.Runnable
                            public final void run() {
                                w.b callback = bVar;
                                kotlin.jvm.internal.i.e(callback, "$callback");
                                D this$0 = this;
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                callback.b();
                            }
                        }));
                    }
                    if (boolValueOf == null) {
                        ((w.b) aVar).b();
                    }
                }
            }
            this.f7758g = this.f7757f;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer) throws IOException {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        c(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] buffer, int i10, int i11) throws IOException {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        c(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        c(1L);
    }
}
