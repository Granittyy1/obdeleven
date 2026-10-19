package p197pb;

import java.util.regex.Pattern;
import okhttp3.A;
import okhttp3.r;
import p318zb.C;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f45954e;

    public g(String str, long j, C c10) {
        this.f45952c = str;
        this.f45953d = j;
        this.f45954e = c10;
    }

    @Override // okhttp3.A
    public final long b() {
        return this.f45953d;
    }

    @Override // okhttp3.A
    public final r c() {
        String str = this.f45952c;
        if (str == null) {
            return null;
        }
        Pattern pattern = r.f45588d;
        return r.a.b(str);
    }

    @Override // okhttp3.A
    public final InterfaceC2841h h() {
        return this.f45954e;
    }
}
