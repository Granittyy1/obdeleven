package p141l2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: NavArgument.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L<Object> f44288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44291d;

    /* JADX INFO: compiled from: NavArgument.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public L<Object> f44292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f44294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f44295d;
    }

    public r(L l10, boolean z10, Object obj, boolean z11) {
        if (!l10.isNullableAllowed() && z10) {
            throw new IllegalArgumentException((l10.getName() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + l10.getName() + " has null value but is not nullable.").toString());
        }
        this.f44288a = l10;
        this.f44289b = z10;
        this.f44291d = obj;
        this.f44290c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f44289b != rVar.f44289b || this.f44290c != rVar.f44290c || !i.a(this.f44288a, rVar.f44288a)) {
            return false;
        }
        Object obj2 = rVar.f44291d;
        Object obj3 = this.f44291d;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f44288a.hashCode() * 31) + (this.f44289b ? 1 : 0)) * 31) + (this.f44290c ? 1 : 0)) * 31;
        Object obj = this.f44291d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.a(r.class).a());
        sb2.append(" Type: " + this.f44288a);
        sb2.append(" Nullable: " + this.f44289b);
        if (this.f44290c) {
            sb2.append(" DefaultValue: " + this.f44291d);
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }
}
