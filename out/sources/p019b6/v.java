package p019b6;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f20607b;

    public /* synthetic */ v(String str, Set set) {
        this.f20606a = str;
        this.f20607b = set;
    }

    @Override // b6.a.d
    public final String a() {
        return this.f20606a;
    }

    @Override // b6.a.d
    public final Set<Integer> b() {
        return this.f20607b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.d) {
            a.d dVar = (a.d) obj;
            String str = this.f20606a;
            if (str != null ? str.equals(dVar.a()) : dVar.a() == null) {
                if (this.f20607b.equals(dVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20606a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f20607b.hashCode();
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f20606a + ", verdictOptOut=" + this.f20607b.toString() + "}";
    }
}
