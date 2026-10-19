package p307z0;

/* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f48695a = new c(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f48696b = new c(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f48697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f48698d;

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48699a = new a();
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f48700a;

        public b(a aVar) {
            this.f48700a = aVar;
        }

        public abstract boolean a();

        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
                throw new IllegalArgumentException();
            }
            if (this.f48700a == null) {
                return a();
            }
            char c10 = 0;
            c10 = 2;
            for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                c cVar = e.f48695a;
                if (directionality == 0) {
                    c10 = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            c10 = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            c10 = 2;
                            continue;
                    }
                }
            }
            if (c10 == 0) {
                return true;
            }
            if (c10 != 1) {
                return a();
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    public static class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48701b;

        public c(a aVar, boolean z10) {
            super(aVar);
            this.f48701b = z10;
        }

        @Override // z0.e.b
        public final boolean a() {
            return this.f48701b;
        }
    }

    static {
        a aVar = a.f48699a;
        f48697c = new c(aVar, false);
        f48698d = new c(aVar, true);
    }
}
