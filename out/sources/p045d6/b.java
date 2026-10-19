package p045d6;

import android.app.PendingIntent;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f34569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34570c;

    public b(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f34569b = pendingIntent;
        this.f34570c = z10;
    }

    @Override // p045d6.a
    public final PendingIntent a() {
        return this.f34569b;
    }

    @Override // p045d6.a
    public final boolean b() {
        return this.f34570c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f34569b.equals(aVar.a()) && this.f34570c == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f34569b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f34570c ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f34569b.toString() + ", isNoOp=" + this.f34570c + "}";
    }
}
