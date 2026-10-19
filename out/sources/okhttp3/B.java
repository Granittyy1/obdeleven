package okhttp3;

import p318zb.C2839f;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f45275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f45276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2839f f45277e;

    public B(r rVar, long j, C2839f c2839f) {
        this.f45275c = rVar;
        this.f45276d = j;
        this.f45277e = c2839f;
    }

    @Override // okhttp3.A
    public final long b() {
        return this.f45276d;
    }

    @Override // okhttp3.A
    public final r c() {
        return this.f45275c;
    }

    @Override // okhttp3.A
    public final InterfaceC2841h h() {
        return this.f45277e;
    }
}
