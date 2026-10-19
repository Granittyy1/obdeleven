package com.voltasit.obdeleven.domain.timers;

import Aa.c;
import Ia.l;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.t;
import m8.o;
import me.zhanghai.android.materialprogressbar.R;
import p109i8.k;
import p293xa.r;

/* JADX INFO: compiled from: BasicSettingStatusTimer.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer$startTimer$1", f = "BasicSettingStatusTimer.kt", l = {R.styleable.AppCompatTheme_alertDialogTheme}, m = "invokeSuspend")
public final class BasicSettingStatusTimer$startTimer$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ l<o, r> $action;
    final /* synthetic */ ControlUnit $controlUnit;
    final /* synthetic */ k $requestProvider;
    int label;
    final /* synthetic */ BasicSettingStatusTimer this$0;

    /* JADX INFO: compiled from: BasicSettingStatusTimer.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<o, r> f30608b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super o, r> lVar) {
            this.f30608b = lVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.f30608b.invoke((o) obj);
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicSettingStatusTimer$startTimer$1(BasicSettingStatusTimer basicSettingStatusTimer, k kVar, ControlUnit controlUnit, l<? super o, r> lVar, kotlin.coroutines.c<? super BasicSettingStatusTimer$startTimer$1> cVar) {
        super(2, cVar);
        this.this$0 = basicSettingStatusTimer;
        this.$requestProvider = kVar;
        this.$controlUnit = controlUnit;
        this.$action = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BasicSettingStatusTimer$startTimer$1(this.this$0, this.$requestProvider, this.$controlUnit, this.$action, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((BasicSettingStatusTimer$startTimer$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            BasicSettingStatusTimer basicSettingStatusTimer = this.this$0;
            k kVar = this.$requestProvider;
            ControlUnit controlUnit = this.$controlUnit;
            basicSettingStatusTimer.getClass();
            t tVar = new t(new BasicSettingStatusTimer$initFlow$1(controlUnit, kVar, basicSettingStatusTimer, null));
            a aVar = new a(this.$action);
            this.label = 1;
            if (tVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return r.f47939a;
    }
}
