package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation;

import Aa.c;
import Ia.l;
import Ia.p;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.v;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: NumberConfirmationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationScreenKt$NumberConfirmationScreen$1", f = "NumberConfirmationScreen.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
public final class NumberConfirmationScreenKt$NumberConfirmationScreen$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ l<String, r> $showToast;
    final /* synthetic */ NumberConfirmationViewModel $viewModel;
    int label;

    /* JADX INFO: compiled from: NumberConfirmationScreen.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<String, r> f33062b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, r> lVar) {
            this.f33062b = lVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.f33062b.invoke((String) obj);
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NumberConfirmationScreenKt$NumberConfirmationScreen$1(NumberConfirmationViewModel numberConfirmationViewModel, l<? super String, r> lVar, kotlin.coroutines.c<? super NumberConfirmationScreenKt$NumberConfirmationScreen$1> cVar) {
        super(2, cVar);
        this.$viewModel = numberConfirmationViewModel;
        this.$showToast = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new NumberConfirmationScreenKt$NumberConfirmationScreen$1(this.$viewModel, this.$showToast, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) throws Throwable {
        ((NumberConfirmationScreenKt$NumberConfirmationScreen$1) create(a10, cVar)).invokeSuspend(r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            throw new KotlinNothingValueException();
        }
        b.b(obj);
        v vVar = this.$viewModel.f33068f;
        a aVar = new a(this.$showToast);
        this.label = 1;
        vVar.collect(aVar, this);
        return coroutineSingletons;
    }
}
