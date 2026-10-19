package C8;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Output.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: C8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Output.kt */
    public static final class C0024a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f2462a;

        public C0024a(Throwable throwable) {
            i.e(throwable, "throwable");
            this.f2462a = throwable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0024a) && i.a(this.f2462a, ((C0024a) obj).f2462a);
        }

        public final int hashCode() {
            return this.f2462a.hashCode();
        }

        public final String toString() {
            return "Failure(throwable=" + this.f2462a + ")";
        }
    }

    /* JADX INFO: compiled from: Output.kt */
    public static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f2463a;

        public b(T result) {
            i.e(result, "result");
            this.f2463a = result;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && i.a(this.f2463a, ((b) obj).f2463a);
        }

        public final int hashCode() {
            return this.f2463a.hashCode();
        }

        public final String toString() {
            return "Success(result=" + this.f2463a + ")";
        }
    }
}
