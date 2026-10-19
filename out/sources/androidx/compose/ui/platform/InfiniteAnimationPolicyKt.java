package androidx.compose.ui.platform;

/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object a(Ia.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        InterfaceC1231l0 interfaceC1231l0 = (InterfaceC1231l0) cVar.getContext().get(InterfaceC1231l0.a.f15060b);
        if (interfaceC1231l0 == null) {
            return androidx.compose.runtime.P.a(cVar.getContext()).P0(lVar, cVar);
        }
        new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null);
        return interfaceC1231l0.j0();
    }
}
