package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22068a;

    public v0(String mite) {
        kotlin.jvm.internal.i.e(mite, "mite");
        this.f22068a = mite;
    }

    public final String a() {
        return this.f22068a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && kotlin.jvm.internal.i.a(this.f22068a, ((v0) obj).f22068a);
    }

    public int hashCode() {
        return this.f22068a.hashCode();
    }

    public String toString() {
        return B7.b.g(new StringBuilder("DustMiteReceivedEvent(mite="), this.f22068a, ')');
    }
}
