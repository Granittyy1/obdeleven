package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.layout.InterfaceC1170p;
import java.util.Collection;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends E3.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PointerInteropFilter.DispatchToViewState f14043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PointerInteropFilter f14044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        super(2);
        this.f14044e = pointerInteropFilter;
        this.f14043d = PointerInteropFilter.DispatchToViewState.f14039b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void H(j jVar) {
        ?? r10 = jVar.f14091a;
        Collection collection = (Collection) r10;
        int size = collection.size();
        int i10 = 0;
        while (true) {
            final PointerInteropFilter pointerInteropFilter = this.f14044e;
            if (i10 >= size) {
                InterfaceC1170p interfaceC1170p = (InterfaceC1170p) this.f3048c;
                if (interfaceC1170p == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                kotlinx.coroutines.C.w(jVar, interfaceC1170p.g0(0L), new Ia.l<MotionEvent, p293xa.r>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(MotionEvent motionEvent) {
                        MotionEvent motionEvent2 = motionEvent;
                        if (motionEvent2.getActionMasked() == 0) {
                            PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
                            Ia.l<? super MotionEvent, Boolean> lVar = pointerInteropFilter.f14035b;
                            if (lVar == null) {
                                kotlin.jvm.internal.i.m("onTouchEvent");
                                throw null;
                            }
                            pointerInteropFilter$pointerInputFilter$1.f14043d = ((Boolean) ((PointerInteropFilter_androidKt$pointerInteropFilter$3) lVar).invoke(motionEvent2)).booleanValue() ? PointerInteropFilter.DispatchToViewState.f14040c : PointerInteropFilter.DispatchToViewState.f14041d;
                        } else {
                            Ia.l<? super MotionEvent, Boolean> lVar2 = pointerInteropFilter.f14035b;
                            if (lVar2 == null) {
                                kotlin.jvm.internal.i.m("onTouchEvent");
                                throw null;
                            }
                            ((PointerInteropFilter_androidKt$pointerInteropFilter$3) lVar2).invoke(motionEvent2);
                        }
                        return p293xa.r.f47939a;
                    }
                }, false);
                if (this.f14043d == PointerInteropFilter.DispatchToViewState.f14040c) {
                    int size2 = collection.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((q) r10.get(i11)).a();
                    }
                    C1154e c1154e = jVar.f14092b;
                    if (c1154e == null) {
                        return;
                    }
                    c1154e.f14075c = !pointerInteropFilter.f14037d;
                    return;
                }
                return;
            }
            if (((q) r10.get(i10)).b()) {
                if (this.f14043d == PointerInteropFilter.DispatchToViewState.f14040c) {
                    InterfaceC1170p interfaceC1170p2 = (InterfaceC1170p) this.f3048c;
                    if (interfaceC1170p2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    kotlinx.coroutines.C.w(jVar, interfaceC1170p2.g0(0L), new Ia.l<MotionEvent, p293xa.r>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(MotionEvent motionEvent) {
                            MotionEvent motionEvent2 = motionEvent;
                            Ia.l<? super MotionEvent, Boolean> lVar = pointerInteropFilter.f14035b;
                            if (lVar != null) {
                                ((PointerInteropFilter_androidKt$pointerInteropFilter$3) lVar).invoke(motionEvent2);
                                return p293xa.r.f47939a;
                            }
                            kotlin.jvm.internal.i.m("onTouchEvent");
                            throw null;
                        }
                    }, true);
                }
                this.f14043d = PointerInteropFilter.DispatchToViewState.f14041d;
                return;
            }
            i10++;
        }
    }

    public final void I() {
        if (this.f14043d == PointerInteropFilter.DispatchToViewState.f14040c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.f14044e;
            Ia.l<MotionEvent, p293xa.r> lVar = new Ia.l<MotionEvent, p293xa.r>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(MotionEvent motionEvent) {
                    MotionEvent motionEvent2 = motionEvent;
                    Ia.l<? super MotionEvent, Boolean> lVar2 = pointerInteropFilter.f14035b;
                    if (lVar2 != null) {
                        ((PointerInteropFilter_androidKt$pointerInteropFilter$3) lVar2).invoke(motionEvent2);
                        return p293xa.r.f47939a;
                    }
                    kotlin.jvm.internal.i.m("onTouchEvent");
                    throw null;
                }
            };
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            lVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.f14043d = PointerInteropFilter.DispatchToViewState.f14039b;
            pointerInteropFilter.f14037d = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void J(j jVar, PointerEventPass pointerEventPass) {
        boolean z10;
        ?? r10 = jVar.f14091a;
        PointerInteropFilter pointerInteropFilter = this.f14044e;
        if (pointerInteropFilter.f14037d) {
            z10 = true;
            break;
        }
        int size = ((Collection) r10).size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            }
            q qVar = (q) r10.get(i10);
            if (I.b.c(qVar) || I.b.e(qVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (this.f14043d != PointerInteropFilter.DispatchToViewState.f14041d) {
            if (pointerEventPass == PointerEventPass.f14029b && z10) {
                H(jVar);
            }
            if (pointerEventPass == PointerEventPass.f14031d && !z10) {
                H(jVar);
            }
        }
        if (pointerEventPass == PointerEventPass.f14031d) {
            int size2 = ((Collection) r10).size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!I.b.e((q) r10.get(i11))) {
                    return;
                }
            }
            this.f14043d = PointerInteropFilter.DispatchToViewState.f14039b;
            pointerInteropFilter.f14037d = false;
        }
    }
}
