package kotlinx.coroutines.flow;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationViewModel$3$invokeSuspend$$inlined$filter$1 f43414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f43415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ia.q f43416d;

    public o(ConversationViewModel$3$invokeSuspend$$inlined$filter$1 conversationViewModel$3$invokeSuspend$$inlined$filter$1, q qVar, Ia.q qVar2) {
        this.f43414b = conversationViewModel$3$invokeSuspend$$inlined$filter$1;
        this.f43415c = qVar;
        this.f43416d = qVar2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objA = kotlinx.coroutines.flow.internal.g.a(new Ia.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ Object invoke() {
                return null;
            }
        }, new FlowKt__ZipKt$combine$1$1(this.f43416d, null), cVar, interfaceC2687d, new InterfaceC2686c[]{this.f43414b, this.f43415c});
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }
}
