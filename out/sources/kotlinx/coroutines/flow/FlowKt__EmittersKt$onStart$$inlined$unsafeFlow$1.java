package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.SafeCollector;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f43325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2686c f43326c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Aa.c(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(Ia.p pVar, InterfaceC2686c interfaceC2686c) {
        this.f43325b = (SuspendLambda) pVar;
        this.f43326c = interfaceC2686c;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        InterfaceC2687d<? super Object> interfaceC2687d2;
        InterfaceC2686c interfaceC2686c;
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
            SafeCollector safeCollector2 = new SafeCollector(interfaceC2687d, anonymousClass1.getContext());
            try {
                ?? r10 = this.f43325b;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = interfaceC2687d;
                anonymousClass1.L$2 = safeCollector2;
                anonymousClass1.label = 1;
                if (r10.invoke(safeCollector2, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                interfaceC2687d2 = interfaceC2687d;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                interfaceC2686c = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f43326c;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (interfaceC2686c.collect(interfaceC2687d2, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th2) {
                th = th2;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        } else if (i11 == 1) {
            safeCollector = (SafeCollector) anonymousClass1.L$2;
            interfaceC2687d2 = (InterfaceC2687d) anonymousClass1.L$1;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) anonymousClass1.L$0;
            try {
                kotlin.b.b(obj);
                safeCollector.releaseIntercepted();
                interfaceC2686c = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f43326c;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (interfaceC2686c.collect(interfaceC2687d2, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th3) {
                th = th3;
                safeCollector.releaseIntercepted();
                throw th;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
