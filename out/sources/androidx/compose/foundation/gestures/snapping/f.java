package androidx.compose.foundation.gestures.snapping;

import Na.l;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.z;
import androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: LazyListSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements j, p109i8.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10041c;

    public /* synthetic */ f(Object obj, Object obj2) {
        this.f10040b = obj;
        this.f10041c = obj2;
    }

    public void a(Object data) {
        kotlin.jvm.internal.i.e(data, "data");
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.f10040b;
        Pair pair = new Pair(Integer.valueOf(((Number) ((Pair) stateFlowImpl.getValue()).c()).intValue() + 1), data);
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, pair);
    }

    @Override // androidx.compose.foundation.gestures.snapping.j
    public float c(float f10, float f11) {
        float fAbs = Math.abs(f11);
        androidx.compose.foundation.lazy.k kVarJ = ((LazyListState) this.f10040b).j();
        int size = 0;
        if (!kVarJ.f().isEmpty()) {
            int size2 = kVarJ.f().size();
            Iterator<T> it = kVarJ.f().iterator();
            while (it.hasNext()) {
                size += ((androidx.compose.foundation.lazy.g) it.next()).getSize();
            }
            size /= size2;
        }
        return Math.signum(f11) * l.x(fAbs - size, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.snapping.j
    public float d(float f10) {
        LazyListState lazyListState = (LazyListState) this.f10040b;
        List<androidx.compose.foundation.lazy.g> listF = lazyListState.j().f();
        int size = listF.size();
        float f11 = Float.POSITIVE_INFINITY;
        float f12 = Float.NEGATIVE_INFINITY;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.foundation.lazy.g gVar = listF.get(i10);
            z zVar = gVar instanceof z ? (z) gVar : null;
            if (zVar == null || !zVar.h()) {
                androidx.compose.foundation.lazy.k kVarJ = lazyListState.j();
                int iA = (int) (kVarJ.getOrientation() == Orientation.f9957b ? kVarJ.a() & 4294967295L : kVarJ.a() >> 32);
                int iC = lazyListState.j().c();
                int iB = lazyListState.j().b();
                int size2 = gVar.getSize();
                int offset = gVar.getOffset();
                lazyListState.j().d();
                float f13 = offset - ((k) this.f10041c).f(iA, size2, iC, iB);
                if (f13 <= 0.0f && f13 > f12) {
                    f12 = f13;
                }
                if (f13 >= 0.0f && f13 < f11) {
                    f11 = f13;
                }
            }
        }
        int i11 = Math.abs(f10) < ((androidx.compose.foundation.lazy.l) lazyListState.f10355e.getValue()).f10560i.T0(i.f10049a) ? 0 : f10 > 0.0f ? 1 : 2;
        if (d.a(i11, 0)) {
            if (Math.abs(f11) <= Math.abs(f12)) {
                f12 = f11;
            }
        } else if (d.a(i11, 1)) {
            f12 = f11;
        } else if (!d.a(i11, 2)) {
            f12 = 0.0f;
        }
        if (f12 == Float.POSITIVE_INFINITY || f12 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f12;
    }

    @Override // p109i8.c
    public String getValue() {
        return (String) this.f10040b;
    }

    public f(int i10) {
        StateFlowImpl stateFlowImplA = B.a(new Pair(Integer.MIN_VALUE, null));
        this.f10040b = stateFlowImplA;
        this.f10041c = new ConflatedEventBus$special$$inlined$mapNotNull$1(stateFlowImplA);
    }
}
