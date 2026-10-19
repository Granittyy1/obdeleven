package p141l2;

import I.b;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.q;
import kotlin.collections.x;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.s;
import p293xa.r;

/* JADX INFO: compiled from: NavigatorState.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f44274a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateFlowImpl f44275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateFlowImpl f44276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f44278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f44279f;

    public S() {
        StateFlowImpl stateFlowImplA = B.a(EmptyList.f42983b);
        this.f44275b = stateFlowImplA;
        StateFlowImpl stateFlowImplA2 = B.a(EmptySet.f42985b);
        this.f44276c = stateFlowImplA2;
        this.f44278e = C2688e.b(stateFlowImplA);
        this.f44279f = C2688e.b(stateFlowImplA2);
    }

    public abstract C2749t a(C c10, Bundle bundle);

    public void b(C2749t entry) {
        i.e(entry, "entry");
        StateFlowImpl stateFlowImpl = this.f44276c;
        Set set = (Set) stateFlowImpl.getValue();
        i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.n(set.size()));
        boolean z10 = false;
        for (Object obj : set) {
            boolean z11 = true;
            if (!z10 && i.a(obj, entry)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj);
            }
        }
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, linkedHashSet);
    }

    public void c(C2749t c2749t, boolean z10) {
        synchronized (this.f44274a) {
            try {
                StateFlowImpl stateFlowImpl = this.f44275b;
                Iterable iterable = (Iterable) stateFlowImpl.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (i.a((C2749t) obj, c2749t)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                stateFlowImpl.getClass();
                stateFlowImpl.k(null, arrayList);
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(C2749t c2749t, boolean z10) {
        Object objPrevious;
        StateFlowImpl stateFlowImpl = this.f44276c;
        Iterable iterable = (Iterable) stateFlowImpl.getValue();
        boolean z11 = iterable instanceof Collection;
        s sVar = this.f44278e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C2749t) it.next()) == c2749t) {
                    Iterable iterable2 = (Iterable) sVar.f43418b.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C2749t) it2.next()) == c2749t) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        LinkedHashSet linkedHashSetB = kotlin.collections.B.B((Set) stateFlowImpl.getValue(), c2749t);
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, linkedHashSetB);
        List list = (List) sVar.f43418b.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C2749t c2749t2 = (C2749t) objPrevious;
            if (!i.a(c2749t2, c2749t) && ((List) sVar.f43418b.getValue()).lastIndexOf(c2749t2) < ((List) sVar.f43418b.getValue()).lastIndexOf(c2749t)) {
                break;
            }
        }
        C2749t c2749t3 = (C2749t) objPrevious;
        if (c2749t3 != null) {
            LinkedHashSet linkedHashSetB2 = kotlin.collections.B.B((Set) stateFlowImpl.getValue(), c2749t3);
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, linkedHashSetB2);
        }
        c(c2749t, z10);
    }

    public void e(C2749t entry) {
        i.e(entry, "entry");
        StateFlowImpl stateFlowImpl = this.f44276c;
        LinkedHashSet linkedHashSetB = kotlin.collections.B.B((Set) stateFlowImpl.getValue(), entry);
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, linkedHashSetB);
    }

    public void f(C2749t backStackEntry) {
        i.e(backStackEntry, "backStackEntry");
        synchronized (this.f44274a) {
            StateFlowImpl stateFlowImpl = this.f44275b;
            ArrayList arrayListD0 = q.d0((Collection) stateFlowImpl.getValue(), backStackEntry);
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, arrayListD0);
            r rVar = r.f47939a;
        }
    }
}
