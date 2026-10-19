package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
public final class StartedLazily$command$1 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super SharingCommand>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ A<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    public static final class AnonymousClass1<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f43358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d<SharingCommand> f43359c;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, InterfaceC2687d<? super SharingCommand> interfaceC2687d) {
            this.f43358b = ref$BooleanRef;
            this.f43359c = interfaceC2687d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(int i10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (cVar instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) cVar;
                int i11 = startedLazily$command$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, cVar);
            }
            Object obj = startedLazily$command$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i12 = startedLazily$command$1$1$emit$1.label;
            if (i12 == 0) {
                kotlin.b.b(obj);
                if (i10 > 0) {
                    Ref$BooleanRef ref$BooleanRef = this.f43358b;
                    if (!ref$BooleanRef.element) {
                        ref$BooleanRef.element = true;
                        SharingCommand sharingCommand = SharingCommand.f43354b;
                        startedLazily$command$1$1$emit$1.label = 1;
                        if (this.f43359c.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return p293xa.r.f47939a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return p293xa.r.f47939a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            return a(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(A<Integer> a10, kotlin.coroutines.c<? super StartedLazily$command$1> cVar) {
        super(2, cVar);
        this.$subscriptionCount = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, cVar);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<? super SharingCommand> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        ((StartedLazily$command$1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            A<Integer> a10 = this.$subscriptionCount;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, interfaceC2687d);
            this.label = 1;
            if (a10.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
