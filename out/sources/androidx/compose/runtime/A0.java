package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A0 implements H.a, Iterable<Object>, Ja.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12771c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12777i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap<C1074a, H> f12778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.collection.B<androidx.collection.C> f12779l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12770b = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f12772d = new Object[0];
    public ArrayList<C1074a> j = new ArrayList<>();

    public final boolean A(C1074a c1074a) {
        int iE;
        return c1074a.a() && (iE = C0.e(this.j, c1074a.f12935a, this.f12771c)) >= 0 && kotlin.jvm.internal.i.a(this.j.get(iE), c1074a);
    }

    public final int e(C1074a c1074a) {
        if (this.f12776h) {
            C1090i.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1074a.a()) {
            C1091i0.a("Anchor refers to a group that was removed");
        }
        return c1074a.f12935a;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new G(this, 0, this.f12771c);
    }

    public final void k() {
        this.f12778k = new HashMap<>();
    }

    public final z0 q() {
        if (this.f12776h) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f12774f++;
        return new z0(this);
    }

    public final D0 v() {
        if (this.f12776h) {
            C1090i.c("Cannot start a writer when another writer is pending");
        }
        if (this.f12774f > 0) {
            C1090i.c("Cannot start a writer when a reader is pending");
        }
        this.f12776h = true;
        this.f12777i++;
        return new D0(this);
    }
}
