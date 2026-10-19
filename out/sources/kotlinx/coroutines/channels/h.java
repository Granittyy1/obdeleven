package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Ha.a
public final class h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f43291b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43292a;

    /* JADX INFO: compiled from: Channel.kt */
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f43293a;

        public a(Throwable th) {
            this.f43293a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.i.a(this.f43293a, ((a) obj).f43293a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f43293a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.h.b
        public final String toString() {
            return "Closed(" + this.f43293a + ')';
        }
    }

    /* JADX INFO: compiled from: Channel.kt */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable a(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f43293a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.i.a(this.f43292a, ((h) obj).f43292a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f43292a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f43292a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
