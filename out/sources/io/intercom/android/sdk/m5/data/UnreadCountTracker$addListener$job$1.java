package io.intercom.android.sdk.m5.data;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: UnreadCountTracker.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1", f = "UnreadCountTracker.kt", l = {22}, m = "invokeSuspend")
public final class UnreadCountTracker$addListener$job$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ UnreadConversationCountListener $listener;
    int label;
    final /* synthetic */ UnreadCountTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadCountTracker$addListener$job$1(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, kotlin.coroutines.c<? super UnreadCountTracker$addListener$job$1> cVar) {
        super(2, cVar);
        this.this$0 = unreadCountTracker;
        this.$listener = unreadConversationCountListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UnreadCountTracker$addListener$job$1(this.this$0, this.$listener, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            kotlinx.coroutines.flow.A<Set<String>> unreadConversationIds = this.this$0.getDataLayer().getUnreadConversationIds();
            final UnreadConversationCountListener unreadConversationCountListener = this.$listener;
            InterfaceC2687d<? super Set<String>> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1.1
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                    return emit((Set<String>) obj2, (kotlin.coroutines.c<? super r>) cVar);
                }

                public final Object emit(Set<String> set, kotlin.coroutines.c<? super r> cVar) {
                    unreadConversationCountListener.onCountUpdate(set.size());
                    return r.f47939a;
                }
            };
            this.label = 1;
            if (unreadConversationIds.collect(interfaceC2687d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UnreadCountTracker$addListener$job$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
