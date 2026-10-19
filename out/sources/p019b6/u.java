package p019b6;

import p005a4.o;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends a.AbstractC0209a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20605a;

    public /* synthetic */ u(long j) {
        this.f20605a = j;
    }

    @Override // p019b6.a.AbstractC0209a
    public final int a() {
        return 0;
    }

    @Override // p019b6.a.AbstractC0209a
    public final long b() {
        return this.f20605a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.AbstractC0209a) {
            a.AbstractC0209a abstractC0209a = (a.AbstractC0209a) obj;
            if (this.f20605a == abstractC0209a.b() && abstractC0209a.a() == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f20605a;
        return (((int) (j ^ (j >>> 32))) ^ 1000003) * (-721379959);
    }

    public final String toString() {
        return o.d(this.f20605a, ", webViewRequestMode=0, sessionId=null}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
