package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B0 implements H.a, Iterable<Object>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0 f12780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12782d;

    public B0(A0 a10, int i10, int i11) {
        this.f12780b = a10;
        this.f12781c = i10;
        this.f12782d = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        int i10;
        ArrayList<C1074a> arrayList;
        int iE;
        A0 a10 = this.f12780b;
        if (a10.f12777i != this.f12782d) {
            C0.f();
        }
        HashMap<C1074a, H> map = a10.f12778k;
        H h8 = null;
        int i11 = this.f12781c;
        if (map != null) {
            if (a10.f12776h) {
                C1090i.c("use active SlotWriter to crate an anchor for location instead");
            }
            C1074a c1074a = (i11 < 0 || i11 >= (i10 = a10.f12771c) || (iE = C0.e((arrayList = a10.j), i11, i10)) < 0) ? null : arrayList.get(iE);
            if (c1074a != null) {
                h8 = map.get(c1074a);
            }
        }
        return h8 != null ? new L0(a10, i11, h8, new C1076b()) : new G(a10, i11 + 1, a10.f12770b[(i11 * 5) + 3] + i11);
    }
}
