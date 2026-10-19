package androidx.compose.foundation.gestures.snapping;

import D2.V;
import Ia.l;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.foundation.gestures.s;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b, p247u1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10039b;

    public /* synthetic */ c(Object obj) {
        this.f10039b = obj;
    }

    @Override // p247u1.a
    public long a(long j) {
        ArrayList arrayList = (ArrayList) this.f10039b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((X1.c) arrayList.get(0)).f7142b) {
            return ((X1.c) arrayList.get(0)).f7142b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            X1.c cVar = (X1.c) arrayList.get(i10);
            if (j < cVar.f7142b) {
                long j10 = ((X1.c) arrayList.get(i10 - 1)).f7144d;
                long j11 = cVar.f7142b;
                return (j10 == -9223372036854775807L || j10 <= j || j10 >= j11) ? j11 : j10;
            }
        }
        long j12 = ((X1.c) L4.b.d(arrayList)).f7144d;
        if (j12 == -9223372036854775807L || j >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // p247u1.a
    public boolean b(X1.c cVar, long j) {
        boolean z10;
        long j10 = cVar.f7142b;
        p241t7.b.e(j10 != -9223372036854775807L);
        if (j10 <= j) {
            long j11 = cVar.f7144d;
            if (j11 == -9223372036854775807L || j < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) this.f10039b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((X1.c) arrayList.get(size)).f7142b) {
                arrayList.add(size + 1, cVar);
                return z10;
            }
            if (((X1.c) arrayList.get(size)).f7142b <= j) {
                z10 = false;
            }
        }
        arrayList.add(0, cVar);
        return z10;
    }

    @Override // p247u1.a
    public ImmutableList c(long j) {
        int iG = g(j);
        if (iG == 0) {
            return ImmutableList.K();
        }
        X1.c cVar = (X1.c) ((ArrayList) this.f10039b).get(iG - 1);
        long j10 = cVar.f7144d;
        return (j10 == -9223372036854775807L || j < j10) ? cVar.f7141a : ImmutableList.K();
    }

    @Override // p247u1.a
    public void clear() {
        ((ArrayList) this.f10039b).clear();
    }

    @Override // p247u1.a
    public long d(long j) {
        ArrayList arrayList = (ArrayList) this.f10039b;
        if (arrayList.isEmpty() || j < ((X1.c) arrayList.get(0)).f7142b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((X1.c) arrayList.get(i10)).f7142b;
            if (j == j10) {
                return j10;
            }
            if (j < j10) {
                X1.c cVar = (X1.c) arrayList.get(i10 - 1);
                long j11 = cVar.f7144d;
                return (j11 == -9223372036854775807L || j11 > j) ? cVar.f7142b : j11;
            }
        }
        X1.c cVar2 = (X1.c) L4.b.d(arrayList);
        long j12 = cVar2.f7144d;
        return (j12 == -9223372036854775807L || j < j12) ? cVar2.f7142b : j12;
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public Object e(s sVar, Float f10, Float f11, l lVar, kotlin.coroutines.c cVar) {
        Object objA = i.a(sVar, f10.floatValue(), V.d(0.0f, f11.floatValue(), 28), (InterfaceC0918s) this.f10039b, lVar, (ContinuationImpl) cVar);
        return objA == CoroutineSingletons.f43038b ? objA : (a) objA;
    }

    @Override // p247u1.a
    public void f(long j) {
        int iG = g(j);
        if (iG == 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f10039b;
        long j10 = ((X1.c) arrayList.get(iG - 1)).f7144d;
        if (j10 == -9223372036854775807L || j10 >= j) {
            iG--;
        }
        arrayList.subList(0, iG).clear();
    }

    public int g(long j) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f10039b;
            if (i10 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((X1.c) arrayList.get(i10)).f7142b) {
                return i10;
            }
            i10++;
        }
    }

    public c() {
        this.f10039b = new ArrayList();
    }
}
