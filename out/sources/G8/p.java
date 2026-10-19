package G8;

/* JADX INFO: compiled from: HiddenTextId.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3529a;

    public p(String textId) {
        kotlin.jvm.internal.i.e(textId, "textId");
        this.f3529a = textId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.i.a(this.f3529a, ((p) obj).f3529a);
    }

    public final int hashCode() {
        return this.f3529a.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("HiddenTextId(textId="), this.f3529a, ")");
    }
}
