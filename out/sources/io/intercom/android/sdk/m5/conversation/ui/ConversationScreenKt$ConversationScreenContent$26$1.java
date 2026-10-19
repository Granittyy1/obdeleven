package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.J0;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1", f = "ConversationScreen.kt", l = {439}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$26$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $lazyListJumpToBottomScrollOffset;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Ia.l<ConversationScrolledState, p293xa.r> $onConversationScrolled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$26$1(LazyListState lazyListState, float f10, Ia.l<? super ConversationScrolledState, p293xa.r> lVar, boolean z10, boolean z11, kotlin.coroutines.c<? super ConversationScreenKt$ConversationScreenContent$26$1> cVar) {
        super(2, cVar);
        this.$lazyListState = lazyListState;
        this.$lazyListJumpToBottomScrollOffset = f10;
        this.$onConversationScrolled = lVar;
        this.$isLandscape = z10;
        this.$isLargeFont = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(LazyListState lazyListState) {
        return lazyListState.j().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$2(boolean z10) {
        return z10 ? 200L : 0L;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConversationScreenKt$ConversationScreenContent$26$1(this.$lazyListState, this.$lazyListJumpToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final LazyListState lazyListState = this.$lazyListState;
            final kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.W
                @Override // Ia.a
                public final Object invoke() {
                    return ConversationScreenKt$ConversationScreenContent$26$1.invokeSuspend$lambda$0(lazyListState);
                }
            });
            final float f10 = this.$lazyListJumpToBottomScrollOffset;
            final LazyListState lazyListState2 = this.$lazyListState;
            kotlinx.coroutines.flow.internal.j jVarA = kotlinx.coroutines.flow.g.a(new InterfaceC2686c<Boolean>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                public static final class AnonymousClass2<T> implements InterfaceC2687d {
                    final /* synthetic */ float $lazyListJumpToBottomScrollOffset$inlined;
                    final /* synthetic */ LazyListState $lazyListState$inlined;
                    final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1$invokeSuspend$$inlined$map$1$2", f = "ConversationScreen.kt", l = {219}, m = "emit")
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

                    public AnonymousClass2(InterfaceC2687d interfaceC2687d, float f10, LazyListState lazyListState) {
                        this.$this_unsafeFlow = interfaceC2687d;
                        this.$lazyListJumpToBottomScrollOffset$inlined = f10;
                        this.$lazyListState$inlined = lazyListState;
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
                            Boolean boolValueOf = Boolean.valueOf(ConversationScreenKt.isLazyListScrolled((List) obj, this.$lazyListJumpToBottomScrollOffset$inlined, this.$lazyListState$inlined.j().d()));
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
                    Object objCollect = tVarJ.collect(new AnonymousClass2(interfaceC2687d, f10, lazyListState2), cVar);
                    return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
                }
            }, new X());
            final Ia.l<ConversationScrolledState, p293xa.r> lVar = this.$onConversationScrolled;
            final LazyListState lazyListState3 = this.$lazyListState;
            final boolean z10 = this.$isLandscape;
            final boolean z11 = this.$isLargeFont;
            InterfaceC2687d<? super Object> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1.4
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                    return emit(((Boolean) obj2).booleanValue(), (kotlin.coroutines.c<? super p293xa.r>) cVar);
                }

                public final Object emit(boolean z12, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    Ia.l<ConversationScrolledState, p293xa.r> lVar2 = lVar;
                    int iD = lazyListState3.j().d() - 1;
                    if (iD < 0) {
                        iD = 0;
                    }
                    lVar2.invoke(new ConversationScrolledState(z12, 0, z10, z11, iD));
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (jVarA.collect(interfaceC2687d, this) == coroutineSingletons) {
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
        return ((ConversationScreenKt$ConversationScreenContent$26$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
