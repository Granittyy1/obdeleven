package p175o1;

/* JADX INFO: compiled from: AudioOffloadSupport.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f45075d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45078c;

    /* JADX INFO: compiled from: AudioOffloadSupport.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45081c;

        public final c a() {
            if (this.f45079a || !(this.f45080b || this.f45081c)) {
                return new c(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public c(a aVar) {
        this.f45076a = aVar.f45079a;
        this.f45077b = aVar.f45080b;
        this.f45078c = aVar.f45081c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f45076a == cVar.f45076a && this.f45077b == cVar.f45077b && this.f45078c == cVar.f45078c;
    }

    public final int hashCode() {
        return ((this.f45076a ? 1 : 0) << 2) + ((this.f45077b ? 1 : 0) << 1) + (this.f45078c ? 1 : 0);
    }
}
