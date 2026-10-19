package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
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

/* JADX INFO: compiled from: SfdPersonalInfoFormScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$2", f = "SfdPersonalInfoFormScreen.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
public final class SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Ia.a<r> $onComplete;
    final /* synthetic */ CreatePersonalInfoViewModel $viewModel;
    int label;

    /* JADX INFO: compiled from: SfdPersonalInfoFormScreen.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ia.a<r> f33015b;

        public a(Ia.a<r> aVar) {
            this.f33015b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            this.f33015b.invoke();
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$2(CreatePersonalInfoViewModel createPersonalInfoViewModel, Ia.a<r> aVar, kotlin.coroutines.c<? super SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$2> cVar) {
        super(2, cVar);
        this.$viewModel = createPersonalInfoViewModel;
        this.$onComplete = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$2(this.$viewModel, this.$onComplete, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) throws Throwable {
        ((SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$2) create(a10, cVar)).invokeSuspend(r.f47939a);
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
        v vVar = this.$viewModel.f33011y;
        a aVar = new a(this.$onComplete);
        this.label = 1;
        vVar.collect(aVar, this);
        return coroutineSingletons;
    }
}
