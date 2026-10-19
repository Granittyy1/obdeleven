package Ua;

import Ya.k;
import com.braze.Constants;
import kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.DateTimeUnitSerializer;
import kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer;

/* JADX INFO: compiled from: DateTimeUnit.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = DateTimeUnitSerializer.class)
public abstract class a {
    public static final C0089a Companion = new C0089a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6568a;

    /* JADX INFO: renamed from: Ua.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DateTimeUnit.kt */
    public static final class C0089a {
        public final Ya.b<a> serializer() {
            return DateTimeUnitSerializer.f43946a;
        }
    }

    /* JADX INFO: compiled from: DateTimeUnit.kt */
    @k(with = DateBasedDateTimeUnitSerializer.class)
    public static abstract class b extends a {
        public static final C0090a Companion = new C0090a();

        /* JADX INFO: renamed from: Ua.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DateTimeUnit.kt */
        public static final class C0090a {
            public final Ya.b<b> serializer() {
                return DateBasedDateTimeUnitSerializer.f43943a;
            }
        }
    }

    /* JADX INFO: compiled from: DateTimeUnit.kt */
    @k(with = DayBasedDateTimeUnitSerializer.class)
    public static final class c extends b {
        public static final C0091a Companion = new C0091a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6569b;

        /* JADX INFO: renamed from: Ua.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DateTimeUnit.kt */
        public static final class C0091a {
            public final Ya.b<c> serializer() {
                return DayBasedDateTimeUnitSerializer.f43949a;
            }
        }

        public c(int i10) {
            this.f6569b = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException(J4.i.c(i10, "Unit duration must be positive, but was ", " days.").toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    if (this.f6569b == ((c) obj).f6569b) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f6569b ^ 65536;
        }

        public final String toString() {
            int i10 = this.f6569b;
            return i10 % 7 == 0 ? a.a(i10 / 7, "WEEK") : a.a(i10, "DAY");
        }
    }

    /* JADX INFO: compiled from: DateTimeUnit.kt */
    @k(with = MonthBasedDateTimeUnitSerializer.class)
    public static final class d extends b {
        public static final C0092a Companion = new C0092a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6570b;

        /* JADX INFO: renamed from: Ua.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DateTimeUnit.kt */
        public static final class C0092a {
            public final Ya.b<d> serializer() {
                return MonthBasedDateTimeUnitSerializer.f43953a;
            }
        }

        public d(int i10) {
            this.f6570b = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException(J4.i.c(i10, "Unit duration must be positive, but was ", " months.").toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    if (this.f6570b == ((d) obj).f6570b) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f6570b ^ 131072;
        }

        public final String toString() {
            int i10 = this.f6570b;
            if (i10 % 1200 == 0) {
                return a.a(i10 / 1200, "CENTURY");
            }
            if (i10 % 12 == 0) {
                return a.a(i10 / 12, "YEAR");
            }
            return i10 % 3 == 0 ? a.a(i10 / 3, "QUARTER") : a.a(i10, "MONTH");
        }
    }

    /* JADX INFO: compiled from: DateTimeUnit.kt */
    @k(with = TimeBasedDateTimeUnitSerializer.class)
    public static final class e extends a {
        public static final C0093a Companion = new C0093a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f6572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6573d;

        /* JADX INFO: renamed from: Ua.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DateTimeUnit.kt */
        public static final class C0093a {
            public final Ya.b<e> serializer() {
                return TimeBasedDateTimeUnitSerializer.f43957a;
            }
        }

        public e(long j) {
            this.f6571b = j;
            if (j <= 0) {
                throw new IllegalArgumentException(("Unit duration must be positive, but was " + j + " ns.").toString());
            }
            if (j % 3600000000000L == 0) {
                this.f6572c = "HOUR";
                this.f6573d = j / 3600000000000L;
                return;
            }
            if (j % 60000000000L == 0) {
                this.f6572c = "MINUTE";
                this.f6573d = j / 60000000000L;
                return;
            }
            long j10 = 1000000000;
            if (j % j10 == 0) {
                this.f6572c = "SECOND";
                this.f6573d = j / j10;
                return;
            }
            long j11 = 1000000;
            if (j % j11 == 0) {
                this.f6572c = "MILLISECOND";
                this.f6573d = j / j11;
                return;
            }
            long j12 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            if (j % j12 == 0) {
                this.f6572c = "MICROSECOND";
                this.f6573d = j / j12;
            } else {
                this.f6572c = "NANOSECOND";
                this.f6573d = j;
            }
        }

        public final e b(int i10) {
            return new e(Math.multiplyExact(this.f6571b, i10));
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    if (this.f6571b == ((e) obj).f6571b) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f6571b;
            return ((int) (j >> 32)) ^ ((int) j);
        }

        public final String toString() {
            String unit = this.f6572c;
            kotlin.jvm.internal.i.e(unit, "unit");
            long j = this.f6573d;
            if (j == 1) {
                return unit;
            }
            return j + '-' + unit;
        }
    }

    static {
        new e(1L).b(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS).b(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS).b(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS).b(60).b(60);
        new c(Math.multiplyExact(new c(1).f6569b, 7));
        int i10 = new d(1).f6570b;
        new d(Math.multiplyExact(i10, 3));
        d dVar = new d(Math.multiplyExact(i10, 12));
        f6568a = dVar;
        new d(Math.multiplyExact(dVar.f6570b, 100));
    }

    public static String a(int i10, String str) {
        if (i10 == 1) {
            return str;
        }
        return i10 + '-' + str;
    }
}
