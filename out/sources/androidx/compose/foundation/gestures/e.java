package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.InterfaceC0918s;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0918s<Float> f10008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.j f10009b;

    public e() {
        throw null;
    }

    public e(InterfaceC0918s interfaceC0918s) {
        ScrollableKt.a aVar = ScrollableKt.f9969c;
        this.f10008a = interfaceC0918s;
        this.f10009b = aVar;
    }

    @Override // androidx.compose.foundation.gestures.j
    public final Object a(ScrollingLogic$doFlingAnimation$2.a aVar, float f10, kotlin.coroutines.c cVar) {
        return C2680e.f(this.f10009b, new DefaultFlingBehavior$performFling$2(f10, this, aVar, null), cVar);
    }
}
