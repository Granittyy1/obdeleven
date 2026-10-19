package kotlinx.datetime.format;

import java.util.List;
import kotlinx.datetime.internal.format.DecimalFractionFieldFormatDirective;

/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends DecimalFractionFieldFormatDirective<C> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<Integer> f43823g = kotlin.collections.l.s(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<Integer> f43824h = kotlin.collections.l.s(2, 1, 0, 2, 1, 0, 2, 1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43826f;

    public n() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(int i10, int i11) {
        List<Integer> zerosToAdd = f43823g;
        kotlin.jvm.internal.i.e(zerosToAdd, "zerosToAdd");
        super(TimeFields.f43780d, i10, i11, zerosToAdd);
        this.f43825e = i10;
        this.f43826f = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f43825e == nVar.f43825e && this.f43826f == nVar.f43826f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f43825e * 31) + this.f43826f;
    }
}
