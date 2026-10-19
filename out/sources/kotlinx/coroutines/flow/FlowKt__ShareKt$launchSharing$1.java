package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ p<Object> $shared;
    final /* synthetic */ z $started;
    final /* synthetic */ InterfaceC2686c<Object> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @Aa.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<Integer, kotlin.coroutines.c<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        public AnonymousClass1() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, cVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(Integer num, kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(Integer.valueOf(num.intValue()), cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return Boolean.valueOf(this.I$0 > 0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @Aa.c(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<SharingCommand, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ p<Object> $shared;
        final /* synthetic */ InterfaceC2686c<Object> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2686c<Object> interfaceC2686c, p<Object> pVar, Object obj, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$upstream = interfaceC2686c;
            this.$shared = pVar;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Ia.p
        public final Object invoke(SharingCommand sharingCommand, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(sharingCommand, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                int iOrdinal = ((SharingCommand) this.L$0).ordinal();
                if (iOrdinal == 0) {
                    InterfaceC2686c<Object> interfaceC2686c = this.$upstream;
                    p<Object> pVar = this.$shared;
                    this.label = 1;
                    if (interfaceC2686c.collect(pVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (iOrdinal == 2) {
                    Object obj2 = this.$initialValue;
                    if (obj2 == w.f43431a) {
                        this.$shared.e();
                    } else {
                        this.$shared.f(obj2);
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(z zVar, InterfaceC2686c<Object> interfaceC2686c, p<Object> pVar, Object obj, kotlin.coroutines.c<? super FlowKt__ShareKt$launchSharing$1> cVar) {
        super(2, cVar);
        this.$started = zVar;
        this.$upstream = interfaceC2686c;
        this.$shared = pVar;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowKt__ShareKt$launchSharing$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2686c<Object> interfaceC2686c;
        p<Object> pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    kotlin.b.b(obj);
                    interfaceC2686c = this.$upstream;
                    pVar = this.$shared;
                    this.label = 3;
                    if (interfaceC2686c.collect(pVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.b.b(obj);
        } else {
            kotlin.b.b(obj);
            z zVar = this.$started;
            if (zVar == z.a.f43438a) {
                InterfaceC2686c<Object> interfaceC2686c2 = this.$upstream;
                p<Object> pVar2 = this.$shared;
                this.label = 1;
                if (interfaceC2686c2.collect(pVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (zVar == z.a.f43439b) {
                kotlinx.coroutines.flow.internal.q qVarH = this.$shared.h();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
                this.label = 2;
                if (C2688e.i(qVarH, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2686c = this.$upstream;
                pVar = this.$shared;
                this.label = 3;
                if (interfaceC2686c.collect(pVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                InterfaceC2686c interfaceC2686cH = C2688e.h(zVar.b(this.$shared.h()));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, null);
                this.label = 4;
                if (C2688e.e(interfaceC2686cH, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return p293xa.r.f47939a;
    }
}
