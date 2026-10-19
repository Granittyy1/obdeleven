package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1197s;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClockDialNode extends AbstractC1187h implements androidx.compose.ui.node.Y, InterfaceC1182c, InterfaceC1197s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1047b f12079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f12082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f12083v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12084w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.compose.ui.input.pointer.D f12085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final androidx.compose.ui.input.pointer.D f12086y;

    public ClockDialNode(C1047b c1047b, boolean z10, int i10) {
        this.f12079r = c1047b;
        this.f12080s = z10;
        this.f12081t = i10;
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this, null);
        androidx.compose.ui.input.pointer.j jVar = androidx.compose.ui.input.pointer.B.f14012a;
        androidx.compose.ui.input.pointer.E e10 = androidx.compose.ui.input.pointer.E.f14016b;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = new SuspendingPointerInputModifierNodeImpl(null, null, null, e10);
        suspendingPointerInputModifierNodeImpl.f14055s = clockDialNode$pointerInputTapNode$1;
        Q1(suspendingPointerInputModifierNodeImpl);
        this.f12085x = suspendingPointerInputModifierNodeImpl;
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this, null);
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl2 = new SuspendingPointerInputModifierNodeImpl(null, null, null, e10);
        suspendingPointerInputModifierNodeImpl2.f14055s = clockDialNode$pointerInputDragNode$1;
        Q1(suspendingPointerInputModifierNodeImpl2);
        this.f12086y = suspendingPointerInputModifierNodeImpl2;
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void T(long j) {
        this.f12084w = A8.A.e(j);
    }

    @Override // androidx.compose.ui.node.Y
    public final void q0(androidx.compose.ui.input.pointer.j jVar, PointerEventPass pointerEventPass, long j) {
        this.f12085x.q0(jVar, pointerEventPass, j);
        this.f12086y.q0(jVar, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        this.f12085x.u0();
        this.f12086y.u0();
    }
}
