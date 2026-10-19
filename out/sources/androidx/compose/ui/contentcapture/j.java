package androidx.compose.ui.contentcapture;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentCaptureEventType f13333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T.e f13334d;

    public j(int i10, long j, ContentCaptureEventType contentCaptureEventType, T.e eVar) {
        this.f13331a = i10;
        this.f13332b = j;
        this.f13333c = contentCaptureEventType;
        this.f13334d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13331a == jVar.f13331a && this.f13332b == jVar.f13332b && this.f13333c == jVar.f13333c && kotlin.jvm.internal.i.a(this.f13334d, jVar.f13334d);
    }

    public final int hashCode() {
        int iHashCode = (this.f13333c.hashCode() + C4.b.c(this.f13332b, Integer.hashCode(this.f13331a) * 31, 31)) * 31;
        T.e eVar = this.f13334d;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f13331a + ", timestamp=" + this.f13332b + ", type=" + this.f13333c + ", structureCompat=" + this.f13334d + ')';
    }
}
