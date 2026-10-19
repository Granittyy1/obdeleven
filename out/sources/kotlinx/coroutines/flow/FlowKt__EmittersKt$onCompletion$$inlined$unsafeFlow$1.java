package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.SafeCollector;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2686c f43323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f43324c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Aa.c(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_windowFixedHeightMajor, 127}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(InterfaceC2686c interfaceC2686c, Ia.q qVar) {
        this.f43323b = interfaceC2686c;
        this.f43324c = (SuspendLambda) qVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Ia.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Ia.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        E e10;
        ?? r10;
        SafeCollector safeCollector;
        Throwable th;
        SafeCollector safeCollector2;
        ?? r11;
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
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                InterfaceC2686c interfaceC2686c = this.f43323b;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = interfaceC2687d;
                anonymousClass1.label = 1;
                if (interfaceC2686c.collect(interfaceC2687d, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                safeCollector = new SafeCollector(interfaceC2687d, anonymousClass1.getContext());
                r11 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f43324c;
                anonymousClass1.L$0 = safeCollector;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (r11.invoke(safeCollector, null, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return p293xa.r.f47939a;
            } catch (Throwable th2) {
                th = th2;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                e10 = new E(th);
                r10 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f43324c;
                anonymousClass1.L$0 = th;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (h.a(e10, r10, th, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                throw th;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                Throwable th3 = (Throwable) anonymousClass1.L$0;
                kotlin.b.b(obj);
                throw th3;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector2 = (SafeCollector) anonymousClass1.L$0;
            try {
                kotlin.b.b(obj);
                safeCollector2.releaseIntercepted();
                return p293xa.r.f47939a;
            } catch (Throwable th4) {
                th = th4;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC2687d = (InterfaceC2687d) anonymousClass1.L$1;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.L$0;
        try {
            kotlin.b.b(obj);
            safeCollector = new SafeCollector(interfaceC2687d, anonymousClass1.getContext());
            try {
                r11 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f43324c;
                anonymousClass1.L$0 = safeCollector;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (r11.invoke(safeCollector, null, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                return p293xa.r.f47939a;
            } catch (Throwable th5) {
                th = th5;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            e10 = new E(th);
            r10 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f43324c;
            anonymousClass1.L$0 = th;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (h.a(e10, r10, th, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw th;
        }
    }
}
