package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.A;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends v<Integer> implements A<Integer> {
    @Override // kotlinx.coroutines.flow.A
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f43423i;
            kotlin.jvm.internal.i.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.j + ((long) ((int) ((q() + ((long) this.f43425l)) - this.j)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i10) {
        synchronized (this) {
            Object[] objArr = this.f43423i;
            kotlin.jvm.internal.i.b(objArr);
            f(Integer.valueOf(((Number) objArr[((int) ((this.j + ((long) ((int) ((q() + ((long) this.f43425l)) - this.j)))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
