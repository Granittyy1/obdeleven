package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: androidx.compose.foundation.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public class C0938j extends AbstractClickableNode {
    public C0938j() {
        throw null;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final Object U1(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objD = TapGestureDetectorKt.d(wVar, new ClickableNode$clickPointerInput$2(this, null), new Ia.l<I.d, p293xa.r>() { // from class: androidx.compose.foundation.ClickableNode$clickPointerInput$3
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(I.d dVar) {
                long j = dVar.f3754a;
                C0938j c0938j = this.this$0;
                if (c0938j.f9690v) {
                    c0938j.f9691w.invoke();
                }
                return p293xa.r.f47939a;
            }
        }, cVar);
        return objD == CoroutineSingletons.f43038b ? objD : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final boolean Y1(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void Z1(KeyEvent keyEvent) {
        this.f9691w.invoke();
    }
}
