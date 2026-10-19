package androidx.paging;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: MutableCombinedLoadStateCollection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutableCombinedLoadStateCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<Ia.l<C1428d, p293xa.r>> f19256a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateFlowImpl f19257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.flow.s f19258c;

    public MutableCombinedLoadStateCollection() {
        StateFlowImpl stateFlowImplA = kotlinx.coroutines.flow.B.a(null);
        this.f19257b = stateFlowImplA;
        this.f19258c = C2688e.b(stateFlowImplA);
    }

    public static final C1428d a(MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection, C1428d c1428d, n nVar, n nVar2) {
        m mVar;
        m mVar2;
        m mVar3;
        mutableCombinedLoadStateCollection.getClass();
        m mVar4 = m.c.f19374c;
        if (c1428d == null || (mVar = c1428d.f19339a) == null) {
            mVar = mVar4;
        }
        m mVar5 = nVar.f19376a;
        m mVarB = b(mVar, mVar5, mVar5, nVar2 != null ? nVar2.f19376a : null);
        if (c1428d == null || (mVar2 = c1428d.f19340b) == null) {
            mVar2 = mVar4;
        }
        m mVar6 = nVar2 != null ? nVar2.f19377b : null;
        m mVar7 = nVar.f19376a;
        m mVarB2 = b(mVar2, mVar7, nVar.f19377b, mVar6);
        if (c1428d != null && (mVar3 = c1428d.f19341c) != null) {
            mVar4 = mVar3;
        }
        return new C1428d(mVarB, mVarB2, b(mVar4, mVar7, nVar.f19378c, nVar2 != null ? nVar2.f19378c : null), nVar, nVar2);
    }

    public static m b(m mVar, m mVar2, m mVar3, m mVar4) {
        if (mVar4 == null) {
            return mVar3;
        }
        return (!(mVar instanceof m.b) || ((mVar2 instanceof m.c) && (mVar4 instanceof m.c)) || (mVar4 instanceof m.a)) ? mVar4 : mVar;
    }

    public final void c(Ia.l<? super C1428d, C1428d> lVar) {
        StateFlowImpl stateFlowImpl;
        Object value;
        C1428d c1428dInvoke;
        do {
            stateFlowImpl = this.f19257b;
            value = stateFlowImpl.getValue();
            C1428d c1428d = (C1428d) value;
            c1428dInvoke = lVar.invoke(c1428d);
            if (kotlin.jvm.internal.i.a(c1428d, c1428dInvoke)) {
                return;
            }
        } while (!stateFlowImpl.d(value, c1428dInvoke));
        if (c1428dInvoke != null) {
            Iterator<Ia.l<C1428d, p293xa.r>> it = this.f19256a.iterator();
            while (it.hasNext()) {
                it.next().invoke(c1428dInvoke);
            }
        }
    }

    public final void d(final n sourceLoadStates, final n nVar) {
        kotlin.jvm.internal.i.e(sourceLoadStates, "sourceLoadStates");
        c(new Ia.l<C1428d, C1428d>() { // from class: androidx.paging.MutableCombinedLoadStateCollection$set$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final C1428d invoke(C1428d c1428d) {
                return MutableCombinedLoadStateCollection.a(this.this$0, c1428d, sourceLoadStates, nVar);
            }
        });
    }
}
