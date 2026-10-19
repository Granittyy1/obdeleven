package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.InterfaceC1376t;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    final /* synthetic */ InterfaceC1376t $source;
    final /* synthetic */ Ref$ObjectRef<C1242r0> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref$ObjectRef<C1242r0> ref$ObjectRef, Recomposer recomposer, InterfaceC1376t interfaceC1376t, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, kotlin.coroutines.c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> cVar) {
        super(2, cVar);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$source = interfaceC1376t;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, cVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2694i0 interfaceC2694i0;
        kotlinx.coroutines.z0 z0VarC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2694i0 = (InterfaceC2694i0) this.L$0;
            try {
                kotlin.b.b(obj);
                if (interfaceC2694i0 != null) {
                    interfaceC2694i0.i(null);
                }
                this.$source.getLifecycle().c(this.$self);
                return p293xa.r.f47939a;
            } catch (Throwable th) {
                th = th;
                if (interfaceC2694i0 != null) {
                    interfaceC2694i0.i(null);
                }
                this.$source.getLifecycle().c(this.$self);
                throw th;
            }
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
        try {
            C1242r0 c1242r0 = this.$systemDurationScaleSettingConsumer.element;
            if (c1242r0 != null) {
                kotlinx.coroutines.flow.A a11 = l1.a(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                c1242r0.f15090b.f(((Number) a11.getValue()).floatValue());
                z0VarC = C2680e.c(a10, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(a11, c1242r0, null), 3);
            } else {
                z0VarC = null;
            }
            try {
                Recomposer recomposer = this.$recomposer;
                this.L$0 = z0VarC;
                this.label = 1;
                if (recomposer.I(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2694i0 = z0VarC;
                if (interfaceC2694i0 != null) {
                    interfaceC2694i0.i(null);
                }
                this.$source.getLifecycle().c(this.$self);
                return p293xa.r.f47939a;
            } catch (Throwable th2) {
                interfaceC2694i0 = z0VarC;
                th = th2;
                if (interfaceC2694i0 != null) {
                    interfaceC2694i0.i(null);
                }
                this.$source.getLifecycle().c(this.$self);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC2694i0 = null;
        }
    }
}
