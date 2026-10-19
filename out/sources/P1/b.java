package P1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import p078g1.s;
import p114j1.A;

/* JADX INFO: compiled from: SlowMotionData.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4889a;

    /* JADX INFO: compiled from: SlowMotionData.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4892c;

        public a(int i10, long j, long j10) {
            p241t7.b.e(j < j10);
            this.f4890a = j;
            this.f4891b = j10;
            this.f4892c = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4890a == aVar.f4890a && this.f4891b == aVar.f4891b && this.f4892c == aVar.f4892c;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f4890a), Long.valueOf(this.f4891b), Integer.valueOf(this.f4892c));
        }

        public final String toString() {
            int i10 = A.f40996a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.f4890a + ", endTimeMs=" + this.f4891b + ", speedDivisor=" + this.f4892c;
        }
    }

    public b(ArrayList arrayList) {
        this.f4889a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j = ((a) arrayList.get(0)).f4891b;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((a) arrayList.get(i10)).f4890a < j) {
                    z10 = true;
                    break;
                }
                j = ((a) arrayList.get(i10)).f4891b;
            }
        }
        p241t7.b.e(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f4889a.equals(((b) obj).f4889a);
    }

    public final int hashCode() {
        return this.f4889a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f4889a;
    }
}
