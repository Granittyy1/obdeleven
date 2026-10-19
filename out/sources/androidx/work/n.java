package androidx.work;

/* JADX INFO: compiled from: Operation.java */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.c f20463a = new a.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.b f20464b = new a.b();

    /* JADX INFO: compiled from: Operation.java */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Operation.java */
        public static final class C0204a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f20465a;

            public C0204a(Throwable th) {
                this.f20465a = th;
            }

            public final String toString() {
                return "FAILURE (" + this.f20465a.getMessage() + ")";
            }
        }

        /* JADX INFO: compiled from: Operation.java */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* JADX INFO: compiled from: Operation.java */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
