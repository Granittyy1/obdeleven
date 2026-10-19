package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.C1079c0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: CursorAnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CursorAnimationState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<InterfaceC2694i0> f11285b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1079c0 f11286c = new C1079c0(0.0f);

    public CursorAnimationState(boolean z10) {
        this.f11284a = z10;
    }

    public final Object a(kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objD = kotlinx.coroutines.B.d(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), cVar);
        return objD == CoroutineSingletons.f43038b ? objD : p293xa.r.f47939a;
    }
}
