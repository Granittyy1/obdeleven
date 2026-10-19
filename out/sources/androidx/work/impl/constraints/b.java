package androidx.work.impl.constraints;

import A1.C0575j;

/* JADX INFO: compiled from: WorkConstraintsTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: WorkConstraintsTracker.kt */
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20390a = new a();
    }

    /* JADX INFO: renamed from: androidx.work.impl.constraints.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WorkConstraintsTracker.kt */
    public static final class C0202b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20391a;

        public C0202b(int i10) {
            this.f20391a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0202b) && this.f20391a == ((C0202b) obj).f20391a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f20391a);
        }

        public final String toString() {
            return C0575j.b(new StringBuilder("ConstraintsNotMet(reason="), this.f20391a, ')');
        }
    }
}
