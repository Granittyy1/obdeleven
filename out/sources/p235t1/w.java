package p235t1;

import com.google.common.collect.ImmutableList;
import p078g1.y;
import p114j1.A;
import p114j1.k;

/* JADX INFO: compiled from: TrackGroupArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f47101d = new w(new y[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<y> f47103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47104c;

    static {
        A.B(0);
    }

    public w(y... yVarArr) {
        this.f47103b = ImmutableList.I(yVarArr);
        this.f47102a = yVarArr.length;
        int i10 = 0;
        while (true) {
            ImmutableList<y> immutableList = this.f47103b;
            if (i10 >= immutableList.size()) {
                return;
            }
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < immutableList.size(); i12++) {
                if (immutableList.get(i10).equals(immutableList.get(i12))) {
                    k.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final y a(int i10) {
        return this.f47103b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f47102a == wVar.f47102a && this.f47103b.equals(wVar.f47103b);
    }

    public final int hashCode() {
        if (this.f47104c == 0) {
            this.f47104c = this.f47103b.hashCode();
        }
        return this.f47104c;
    }

    public final String toString() {
        return this.f47103b.toString();
    }
}
