package G8;

import java.util.List;

/* JADX INFO: compiled from: VehicleScanProgress.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I {

    /* JADX INFO: compiled from: VehicleScanProgress.kt */
    public static final class a extends I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<p109i8.e> f3434a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends p109i8.e> cus) {
            kotlin.jvm.internal.i.e(cus, "cus");
            this.f3434a = cus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f3434a, ((a) obj).f3434a);
        }

        public final int hashCode() {
            return this.f3434a.hashCode();
        }

        public final String toString() {
            return "ReceivedControlUnits(cus=" + this.f3434a + ")";
        }
    }

    /* JADX INFO: compiled from: VehicleScanProgress.kt */
    public static final class b extends I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<p109i8.e> f3435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p109i8.e f3436b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends p109i8.e> cus, p109i8.e cu) {
            kotlin.jvm.internal.i.e(cus, "cus");
            kotlin.jvm.internal.i.e(cu, "cu");
            this.f3435a = cus;
            this.f3436b = cu;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.i.a(this.f3435a, bVar.f3435a) && kotlin.jvm.internal.i.a(this.f3436b, bVar.f3436b);
        }

        public final int hashCode() {
            return this.f3436b.hashCode() + (this.f3435a.hashCode() * 31);
        }

        public final String toString() {
            return "ScannedSingleControlUnit(cus=" + this.f3435a + ", cu=" + this.f3436b + ")";
        }
    }

    /* JADX INFO: compiled from: VehicleScanProgress.kt */
    public static final class c extends I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<p109i8.e> f3437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p109i8.e f3438b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends p109i8.e> cus, p109i8.e cu) {
            kotlin.jvm.internal.i.e(cus, "cus");
            kotlin.jvm.internal.i.e(cu, "cu");
            this.f3437a = cus;
            this.f3438b = cu;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.i.a(this.f3437a, cVar.f3437a) && kotlin.jvm.internal.i.a(this.f3438b, cVar.f3438b);
        }

        public final int hashCode() {
            return this.f3438b.hashCode() + (this.f3437a.hashCode() * 31);
        }

        public final String toString() {
            return "ScanningSingleControlUnit(cus=" + this.f3437a + ", cu=" + this.f3438b + ")";
        }
    }
}
