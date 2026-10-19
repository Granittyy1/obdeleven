package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {R.styleable.AppCompatTheme_colorBackgroundFloating, R.styleable.AppCompatTheme_listChoiceBackgroundIndicator, R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend")
public final class CombineKt$combineInternal$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Ia.a<Object[]> $arrayFactory;
    final /* synthetic */ InterfaceC2686c<Object>[] $flows;
    final /* synthetic */ InterfaceC2687d<Object> $this_combineInternal;
    final /* synthetic */ Ia.q<InterfaceC2687d<Object>, Object[], kotlin.coroutines.c<? super r>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @Aa.c(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ InterfaceC2686c<Object>[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ kotlinx.coroutines.channels.d<s<Object>> $resultChannel;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Combine.kt */
        public static final class C04801<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.d<s<Object>> f43380b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f43381c;

            public C04801(kotlinx.coroutines.channels.d<s<Object>> dVar, int i10) {
                this.f43380b = dVar;
                this.f43381c = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(T t8, kotlin.coroutines.c<? super r> cVar) {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                if (cVar instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) cVar;
                    int i10 = combineKt$combineInternal$2$1$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                    }
                } else {
                    combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                }
                Object obj = combineKt$combineInternal$2$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i11 = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        kotlin.b.b(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return r.f47939a;
                }
                kotlin.b.b(obj);
                s<Object> sVar = new s<>(this.f43381c, t8);
                combineKt$combineInternal$2$1$1$emit$1.label = 1;
                if (this.f43380b.t(sVar, combineKt$combineInternal$2$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
                if (S4.o.r(combineKt$combineInternal$2$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2686c<Object>[] interfaceC2686cArr, int i10, AtomicInteger atomicInteger, kotlinx.coroutines.channels.d<s<Object>> dVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$flows = interfaceC2686cArr;
            this.$i = i10;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    InterfaceC2686c<Object>[] interfaceC2686cArr = this.$flows;
                    int i11 = this.$i;
                    InterfaceC2686c<Object> interfaceC2686c = interfaceC2686cArr[i11];
                    C04801 c04801 = new C04801(this.$resultChannel, i11);
                    this.label = 1;
                    if (interfaceC2686c.collect(c04801, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.a(null);
                }
                return r.f47939a;
            } catch (Throwable th) {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.a(null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(Ia.a aVar, Ia.q qVar, kotlin.coroutines.c cVar, InterfaceC2687d interfaceC2687d, InterfaceC2686c[] interfaceC2686cArr) {
        super(2, cVar);
        this.$flows = interfaceC2686cArr;
        this.$arrayFactory = aVar;
        this.$transform = qVar;
        this.$this_combineInternal = interfaceC2687d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$arrayFactory, this.$transform, cVar, this.$this_combineInternal, this.$flows);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((CombineKt$combineInternal$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[EDGE_INSN: B:35:0x00e5->B:21:0x00a6 BREAK  A[LOOP:0: B:28:0x00c6->B:46:?]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:28:0x00c6->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0105 -> B:21:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0122 -> B:21:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x00e5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
