package p163n2;

import androidx.collection.Y;
import androidx.collection.b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.k;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.a;
import kotlin.text.n;
import p141l2.B;
import p141l2.C;
import p141l2.E;

/* JADX INFO: compiled from: NavGraphImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f44819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y<C> f44820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44823e;

    public m(E graph) {
        i.e(graph, "graph");
        this.f44819a = graph;
        this.f44820b = new Y<>(0);
    }

    public final C a(int i10) {
        return c(i10, this.f44819a, null, false);
    }

    public final C b(String route, boolean z10) {
        Object next;
        E e10;
        C c10;
        i.e(route, "route");
        Y<C> y10 = this.f44820b;
        i.e(y10, "<this>");
        Iterator it = ((a) SequencesKt__SequencesKt.x(new b0(y10))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c10 = (C) next;
            if (kotlin.text.m.D(c10.f44219c.f44814e, route, false)) {
                break;
            }
        } while (c10.f44219c.a(route) == null);
        C c11 = (C) next;
        if (c11 != null) {
            return c11;
        }
        if (!z10 || (e10 = this.f44819a.f44220d) == null) {
            return null;
        }
        m mVar = e10.f44235g;
        mVar.getClass();
        if (n.S(route)) {
            return null;
        }
        return mVar.b(route, true);
    }

    public final C c(int i10, C c10, C c11, boolean z10) {
        Y<C> y10 = this.f44820b;
        C c12 = y10.c(i10);
        if (c11 != null) {
            if (i.a(c12, c11) && i.a(c12.f44220d, c11.f44220d)) {
                return c12;
            }
            c12 = null;
        } else if (c12 != null) {
            return c12;
        }
        E e10 = this.f44819a;
        if (z10) {
            Iterator it = ((a) SequencesKt__SequencesKt.x(new b0(y10))).iterator();
            do {
                if (!it.hasNext()) {
                    c12 = null;
                    break;
                }
                C c13 = (C) it.next();
                c12 = (!(c13 instanceof E) || i.a(c13, c10)) ? null : ((E) c13).f44235g.c(i10, e10, c11, true);
            } while (c12 == null);
        }
        if (c12 != null) {
            return c12;
        }
        E e11 = e10.f44220d;
        if (e11 == null || e11.equals(c10)) {
            return null;
        }
        E e12 = e10.f44220d;
        i.b(e12);
        return e12.f44235g.c(i10, e10, c11, z10);
    }

    public final C.b d(C.b bVar, B b10, boolean z10, C lastVisited) {
        C.b bVarA;
        i.e(lastVisited, "lastVisited");
        ArrayList arrayList = new ArrayList();
        E e10 = this.f44819a;
        Iterator<C> it = e10.iterator();
        while (true) {
            l lVar = (l) it;
            bVarA = null;
            if (!lVar.hasNext()) {
                break;
            }
            C c10 = (C) lVar.next();
            bVarA = i.a(c10, lastVisited) ? null : c10.v(b10);
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        C.b bVar2 = (C.b) q.X(arrayList);
        E e11 = e10.f44220d;
        if (e11 != null && z10 && !e11.equals(lastVisited)) {
            bVarA = e11.A(b10, e10);
        }
        return (C.b) q.X(k.O(new C.b[]{bVar, bVar2, bVarA}));
    }
}
