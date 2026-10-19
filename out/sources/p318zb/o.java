package p318zb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ForwardingTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends I {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public I f49104e;

    public o(I delegate) {
        i.e(delegate, "delegate");
        this.f49104e = delegate;
    }

    @Override // p318zb.I
    public final I a() {
        return this.f49104e.a();
    }

    @Override // p318zb.I
    public final I b() {
        return this.f49104e.b();
    }

    @Override // p318zb.I
    public final long c() {
        return this.f49104e.c();
    }

    @Override // p318zb.I
    public final I d(long j) {
        return this.f49104e.d(j);
    }

    @Override // p318zb.I
    public final boolean e() {
        return this.f49104e.e();
    }

    @Override // p318zb.I
    public final void f() throws IOException {
        this.f49104e.f();
    }

    @Override // p318zb.I
    public final I g(long j, TimeUnit unit) {
        i.e(unit, "unit");
        return this.f49104e.g(j, unit);
    }

    @Override // p318zb.I
    public final long h() {
        return this.f49104e.h();
    }
}
