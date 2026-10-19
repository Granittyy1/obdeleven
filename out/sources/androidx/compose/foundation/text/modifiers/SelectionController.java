package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.D;
import androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1;
import androidx.compose.foundation.text.selection.r;
import androidx.compose.runtime.t0;
import androidx.compose.ui.input.pointer.B;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.InterfaceC1170p;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SelectionController implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f11374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f11376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.h f11377f;

    public SelectionController(long j, r rVar, long j10) {
        j jVar = j.f11489c;
        this.f11373b = j;
        this.f11374c = rVar;
        this.f11375d = j10;
        this.f11376e = jVar;
        SelectionController$modifier$1 selectionController$modifier$1 = new SelectionController$modifier$1(this);
        h hVar = new h(selectionController$modifier$1, rVar, j);
        i iVar = new i(selectionController$modifier$1, rVar, j);
        SelectionGesturesKt$selectionGestureInput$1 selectionGesturesKt$selectionGestureInput$1 = new SelectionGesturesKt$selectionGestureInput$1(iVar, hVar);
        androidx.compose.ui.input.pointer.j jVar2 = B.f14012a;
        this.f11377f = Fa.d.f(new SuspendPointerInputElement(iVar, hVar, selectionGesturesKt$selectionGestureInput$1, 4), D.f11093a);
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
        new Ia.a<InterfaceC1170p>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$1
            {
                super(0);
            }

            @Override // Ia.a
            public final InterfaceC1170p invoke() {
                return this.this$0.f11376e.f11490a;
            }
        };
        new Ia.a<androidx.compose.ui.text.B>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$2
            {
                super(0);
            }

            @Override // Ia.a
            public final androidx.compose.ui.text.B invoke() {
                return this.this$0.f11376e.f11491b;
            }
        };
        this.f11374c.a();
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
    }
}
