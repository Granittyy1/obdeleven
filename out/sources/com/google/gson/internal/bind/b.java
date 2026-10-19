package com.google.gson.internal.bind;

import Z3.n;
import com.google.gson.Strictness;
import com.google.gson.e;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: JsonTreeWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends M7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f28954s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f28955t = new j(MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f28956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f28957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f28958r;

    /* JADX INFO: compiled from: JsonTreeWriter.java */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f28954s);
        this.f28956p = new ArrayList();
        this.f28958r = h.f28825b;
    }

    @Override // M7.b
    public final void R(double d10) throws IOException {
        if (this.f4612i == Strictness.f28812b || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            r0(new j(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }

    @Override // M7.b
    public final void S(long j) throws IOException {
        r0(new j(Long.valueOf(j)));
    }

    @Override // M7.b
    public final void U(Boolean bool) throws IOException {
        if (bool == null) {
            r0(h.f28825b);
        } else {
            r0(new j(bool));
        }
    }

    @Override // M7.b
    public final void c() throws IOException {
        e eVar = new e();
        r0(eVar);
        this.f28956p.add(eVar);
    }

    @Override // M7.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f28956p;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f28955t);
    }

    @Override // M7.b
    public final void f0(Number number) throws IOException {
        if (number == null) {
            r0(h.f28825b);
            return;
        }
        if (this.f4612i != Strictness.f28812b) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        r0(new j(number));
    }

    @Override // M7.b
    public final void h() throws IOException {
        i iVar = new i();
        r0(iVar);
        this.f28956p.add(iVar);
    }

    @Override // M7.b
    public final void j() throws IOException {
        ArrayList arrayList = this.f28956p;
        if (arrayList.isEmpty() || this.f28957q != null) {
            throw new IllegalStateException();
        }
        if (!(o0() instanceof e)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // M7.b
    public final void j0(String str) throws IOException {
        if (str == null) {
            r0(h.f28825b);
        } else {
            r0(new j(str));
        }
    }

    @Override // M7.b
    public final void k() throws IOException {
        ArrayList arrayList = this.f28956p;
        if (arrayList.isEmpty() || this.f28957q != null) {
            throw new IllegalStateException();
        }
        if (!(o0() instanceof i)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // M7.b
    public final void m0(boolean z10) throws IOException {
        r0(new j(Boolean.valueOf(z10)));
    }

    public final g o0() {
        return (g) n.f(1, this.f28956p);
    }

    @Override // M7.b
    public final void p(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f28956p.isEmpty() || this.f28957q != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(o0() instanceof i)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f28957q = str;
    }

    public final void r0(g gVar) {
        if (this.f28957q != null) {
            gVar.getClass();
            if (!(gVar instanceof h) || this.f4614l) {
                i iVar = (i) o0();
                iVar.f28826b.put(this.f28957q, gVar);
            }
            this.f28957q = null;
            return;
        }
        if (this.f28956p.isEmpty()) {
            this.f28958r = gVar;
            return;
        }
        g gVarO0 = o0();
        if (!(gVarO0 instanceof e)) {
            throw new IllegalStateException();
        }
        e eVar = (e) gVarO0;
        if (gVar == null) {
            eVar.getClass();
            gVar = h.f28825b;
        }
        eVar.f28824b.add(gVar);
    }

    @Override // M7.b
    public final M7.b x() throws IOException {
        r0(h.f28825b);
        return this;
    }

    @Override // M7.b, java.io.Flushable
    public final void flush() throws IOException {
    }
}
