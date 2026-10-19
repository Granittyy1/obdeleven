package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.graphics.o0;
import java.util.List;
import p005a4.q;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f13974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f13976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13978i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13979k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f13980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f13981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f13982n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f13983o;

    public l() {
        throw null;
    }

    public l(String str, List list, int i10, C c10, float f10, C c11, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f13971b = str;
        this.f13972c = list;
        this.f13973d = i10;
        this.f13974e = c10;
        this.f13975f = f10;
        this.f13976g = c11;
        this.f13977h = f11;
        this.f13978i = f12;
        this.j = i11;
        this.f13979k = i12;
        this.f13980l = f13;
        this.f13981m = f14;
        this.f13982n = f15;
        this.f13983o = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            return kotlin.jvm.internal.i.a(this.f13971b, lVar.f13971b) && kotlin.jvm.internal.i.a(this.f13974e, lVar.f13974e) && this.f13975f == lVar.f13975f && kotlin.jvm.internal.i.a(this.f13976g, lVar.f13976g) && this.f13977h == lVar.f13977h && this.f13978i == lVar.f13978i && n0.a(this.j, lVar.j) && o0.a(this.f13979k, lVar.f13979k) && this.f13980l == lVar.f13980l && this.f13981m == lVar.f13981m && this.f13982n == lVar.f13982n && this.f13983o == lVar.f13983o && this.f13973d == lVar.f13973d && kotlin.jvm.internal.i.a(this.f13972c, lVar.f13972c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13972c.hashCode() + (this.f13971b.hashCode() * 31)) * 31;
        C c10 = this.f13974e;
        int iD = O.a.d(this.f13975f, (iHashCode + (c10 != null ? c10.hashCode() : 0)) * 31, 31);
        C c11 = this.f13976g;
        return Integer.hashCode(this.f13973d) + O.a.d(this.f13983o, O.a.d(this.f13982n, O.a.d(this.f13981m, O.a.d(this.f13980l, q.b(this.f13979k, q.b(this.j, O.a.d(this.f13978i, O.a.d(this.f13977h, (iD + (c11 != null ? c11.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
