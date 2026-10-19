package androidx.paging;

/* JADX INFO: compiled from: LoadState.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19370a;

    /* JADX INFO: compiled from: LoadState.kt */
    public static final class a extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f19371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable error) {
            super(false);
            kotlin.jvm.internal.i.e(error, "error");
            this.f19371b = error;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f19370a == aVar.f19370a && kotlin.jvm.internal.i.a(this.f19371b, aVar.f19371b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f19371b.hashCode() + Boolean.hashCode(this.f19370a);
        }

        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f19370a + ", error=" + this.f19371b + ')';
        }
    }

    /* JADX INFO: compiled from: LoadState.kt */
    public static final class b extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f19372b = new b();

        public b() {
            super(false);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                if (this.f19370a == ((b) obj).f19370a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19370a);
        }

        public final String toString() {
            return Z3.o.d(new StringBuilder("Loading(endOfPaginationReached="), this.f19370a, ')');
        }
    }

    /* JADX INFO: compiled from: LoadState.kt */
    public static final class c extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f19373b = new c(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f19374c = new c(false);

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                if (this.f19370a == ((c) obj).f19370a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19370a);
        }

        public final String toString() {
            return Z3.o.d(new StringBuilder("NotLoading(endOfPaginationReached="), this.f19370a, ')');
        }
    }

    public m(boolean z10) {
        this.f19370a = z10;
    }
}
