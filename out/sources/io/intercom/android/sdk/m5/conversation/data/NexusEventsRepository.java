package io.intercom.android.sdk.m5.conversation.data;

import Aa.c;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.w;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: NexusEventsRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NexusEventsRepository {
    public static final int $stable = 8;
    private final NexusClient nexusClient;
    private final A scope;
    private final p<NexusEvent> typingEventsFlow;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: NexusEventsRepository.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1", f = "NexusEventsRepository.kt", l = {25}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return NexusEventsRepository.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                j jVarN = C2688e.n(NexusEventsRepository.this.typingEventsFlow);
                final NexusEventsRepository nexusEventsRepository = NexusEventsRepository.this;
                InterfaceC2687d<? super Object> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((NexusEvent) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(NexusEvent nexusEvent, kotlin.coroutines.c<? super r> cVar) {
                        nexusEventsRepository.nexusClient.fire(nexusEvent);
                        return r.f47939a;
                    }
                };
                this.label = 1;
                if (jVarN.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$userTyping$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: NexusEventsRepository.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$userTyping$1", f = "NexusEventsRepository.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    public static final class C23211 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23211(String str, kotlin.coroutines.c<? super C23211> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return NexusEventsRepository.this.new C23211(this.$conversationId, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                p pVar = NexusEventsRepository.this.typingEventsFlow;
                NexusEvent userIsTypingEvent = NexusEvent.getUserIsTypingEvent(this.$conversationId, NexusEventsRepository.this.userIdentity.getIntercomId());
                i.d(userIsTypingEvent, "getUserIsTypingEvent(...)");
                this.label = 1;
                if (pVar.emit(userIsTypingEvent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C23211) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public NexusEventsRepository(NexusClient nexusClient, UserIdentity userIdentity, A scope) {
        i.e(nexusClient, "nexusClient");
        i.e(userIdentity, "userIdentity");
        i.e(scope, "scope");
        this.nexusClient = nexusClient;
        this.userIdentity = userIdentity;
        this.scope = scope;
        this.typingEventsFlow = w.b(0, 0, null, 7);
        C2680e.c(scope, null, null, new AnonymousClass1(null), 3);
    }

    public final void markAsSeen(String conversationId) {
        i.e(conversationId, "conversationId");
        this.nexusClient.fire(NexusEvent.getConversationSeenEvent(conversationId, this.userIdentity.getIntercomId()));
    }

    public final void userTyping(String conversationId) {
        i.e(conversationId, "conversationId");
        C2680e.c(this.scope, null, null, new C23211(conversationId, null), 3);
    }

    public /* synthetic */ NexusEventsRepository(NexusClient nexusClient, UserIdentity userIdentity, A a10, int i10, e eVar) {
        this((i10 & 1) != 0 ? Injector.get().getNexusClient() : nexusClient, (i10 & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity, a10);
    }
}
