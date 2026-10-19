package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation;

import Aa.c;
import Ia.p;
import J8.d;
import K8.i;
import K8.v;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.w;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: NumberConfirmationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NumberConfirmationViewModel extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f33063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f33064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f33065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f33066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f33067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f33068f;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: NumberConfirmationViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationViewModel$1", f = "NumberConfirmationViewModel.kt", l = {R.styleable.AppCompatTheme_checkboxStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return NumberConfirmationViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                v vVar = NumberConfirmationViewModel.this.f33065c;
                this.label = 1;
                if (vVar.I(this) == coroutineSingletons) {
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

    public NumberConfirmationViewModel(String number, d dVar, i iVar, v vVar) {
        kotlin.jvm.internal.i.e(number, "number");
        this.f33063a = dVar;
        this.f33064b = iVar;
        this.f33065c = vVar;
        this.f33066d = J0.f(new a(number, "", "", false));
        kotlinx.coroutines.flow.v vVarB = w.b(0, 1, BufferOverflow.f43244c, 1);
        this.f33067e = vVarB;
        this.f33068f = vVarB;
        C2680e.c(Z.a(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a b() {
        return (a) this.f33066d.getValue();
    }
}
