package androidx.recyclerview.widget;

/* JADX INFO: compiled from: StableIdStorage.java */
/* JADX INFO: loaded from: classes.dex */
public interface O {

    /* JADX INFO: compiled from: StableIdStorage.java */
    public static class a implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0197a f19560a = new C0197a();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.O$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: StableIdStorage.java */
        public class C0197a implements b {
            @Override // androidx.recyclerview.widget.O.b
            public final long a(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.O
        public final b a() {
            return this.f19560a;
        }
    }

    /* JADX INFO: compiled from: StableIdStorage.java */
    public interface b {
        long a(long j);
    }

    b a();
}
