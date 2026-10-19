package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.J0;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: LazyMessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1", f = "LazyMessageList.kt", l = {141}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$12$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: LazyMessageList.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$3", f = "LazyMessageList.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Ia.p<Boolean, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ androidx.compose.runtime.X<Boolean> $isListAtTheBottom$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(androidx.compose.runtime.X<Boolean> x10, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$isListAtTheBottom$delegate = x10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$isListAtTheBottom$delegate, cVar);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            LazyMessageListKt.LazyMessageList$lambda$18(this.$isListAtTheBottom$delegate, this.Z$0);
            return p293xa.r.f47939a;
        }

        public final Object invoke(boolean z10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass3) create(Boolean.valueOf(z10), cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$12$1(LazyListState lazyListState, androidx.compose.runtime.X<Boolean> x10, kotlin.coroutines.c<? super LazyMessageListKt$LazyMessageList$12$1> cVar) {
        super(2, cVar);
        this.$lazyListState = lazyListState;
        this.$isListAtTheBottom$delegate = x10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(LazyListState lazyListState) {
        return lazyListState.j().f();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyMessageListKt$LazyMessageList$12$1(this.$lazyListState, this.$isListAtTheBottom$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final LazyListState lazyListState = this.$lazyListState;
            final kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.F
                @Override // Ia.a
                public final Object invoke() {
                    return LazyMessageListKt$LazyMessageList$12$1.invokeSuspend$lambda$0(lazyListState);
                }
            });
            InterfaceC2686c<Boolean> interfaceC2686c = new InterfaceC2686c<Boolean>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements InterfaceC2687d {
                    final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$invokeSuspend$$inlined$map$1$2", f = "LazyMessageList.kt", l = {219}, m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2687d interfaceC2687d) {
                        this.$this_unsafeFlow = interfaceC2687d;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.label;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            kotlin.b.b(obj2);
                            InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                            androidx.compose.foundation.lazy.g gVar = (androidx.compose.foundation.lazy.g) kotlin.collections.q.W((List) obj);
                            Boolean boolValueOf = Boolean.valueOf(kotlin.jvm.internal.i.a(gVar != null ? gVar.getKey() : null, ConversationUiStateKt.LastAnchorRowKey));
                            anonymousClass1.label = 1;
                            if (interfaceC2687d.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj2);
                        }
                        return p293xa.r.f47939a;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2686c
                public Object collect(InterfaceC2687d<? super Boolean> interfaceC2687d, kotlin.coroutines.c cVar) {
                    Object objCollect = tVarJ.collect(new AnonymousClass2(interfaceC2687d), cVar);
                    return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
                }
            };
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$isListAtTheBottom$delegate, null);
            this.label = 1;
            if (C2688e.e(interfaceC2686c, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LazyMessageListKt$LazyMessageList$12$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
