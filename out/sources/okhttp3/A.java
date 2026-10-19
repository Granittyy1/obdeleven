package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f45270b;

    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class a extends Reader {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2841h f45271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Charset f45272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InputStreamReader f45274e;

        public a(InterfaceC2841h source, Charset charset) {
            kotlin.jvm.internal.i.e(source, "source");
            kotlin.jvm.internal.i.e(charset, "charset");
            this.f45271b = source;
            this.f45272c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            p293xa.r rVar;
            this.f45273d = true;
            InputStreamReader inputStreamReader = this.f45274e;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                rVar = p293xa.r.f47939a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                this.f45271b.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i10, int i11) throws IOException {
            kotlin.jvm.internal.i.e(cbuf, "cbuf");
            if (this.f45273d) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f45274e;
            if (inputStreamReader == null) {
                InterfaceC2841h interfaceC2841h = this.f45271b;
                inputStreamReader = new InputStreamReader(interfaceC2841h.X0(), p172nb.b.s(interfaceC2841h, this.f45272c));
                this.f45274e = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    public abstract long b();

    public abstract r c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p172nb.b.c(h());
    }

    public abstract InterfaceC2841h h();

    public final String i() throws IOException {
        Charset charsetA;
        InterfaceC2841h interfaceC2841hH = h();
        try {
            r rVarC = c();
            if (rVarC == null || (charsetA = rVarC.a(kotlin.text.a.f43120b)) == null) {
                charsetA = kotlin.text.a.f43120b;
            }
            String strD0 = interfaceC2841hH.d0(p172nb.b.s(interfaceC2841hH, charsetA));
            p241t7.b.n(interfaceC2841hH, null);
            return strD0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p241t7.b.n(interfaceC2841hH, th);
                throw th2;
            }
        }
    }
}
