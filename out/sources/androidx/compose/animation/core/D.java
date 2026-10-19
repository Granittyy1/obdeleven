package androidx.compose.animation.core;

import androidx.compose.ui.platform.InterfaceC1231l0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D {
    public static final Object a(Ia.l lVar, ContinuationImpl continuationImpl) {
        InterfaceC1231l0 interfaceC1231l0 = (InterfaceC1231l0) continuationImpl.getContext().get(InterfaceC1231l0.a.f15060b);
        if (interfaceC1231l0 == null) {
            return androidx.compose.runtime.P.a(continuationImpl.getContext()).P0(lVar, continuationImpl);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null);
        return interfaceC1231l0.j0();
    }
}
