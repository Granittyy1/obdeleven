package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit;

import Aa.c;
import C8.a;
import G8.G;
import Ia.p;
import K8.i;
import K8.v;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.user.h;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EditPhoneNumberViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EditPhoneNumberViewModel extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f33073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f33074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f33075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f33076d = J0.f(new G(null, null, null, null, null, null, null, null, 2047));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f33077e = J0.f(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f33078f = J0.f(Boolean.FALSE);

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: EditPhoneNumberViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModel$1", f = "EditPhoneNumberViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return EditPhoneNumberViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                h hVar = EditPhoneNumberViewModel.this.f33073a;
                this.label = 1;
                obj = hVar.f30992a.h(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            a aVar = (a) obj;
            if (aVar instanceof a.C0024a) {
                EditPhoneNumberViewModel editPhoneNumberViewModel = EditPhoneNumberViewModel.this;
                editPhoneNumberViewModel.f33077e.setValue(new Integer(com.voltasit.obdeleven.R.string.common_check_network));
            } else if (aVar instanceof a.b) {
                EditPhoneNumberViewModel editPhoneNumberViewModel2 = EditPhoneNumberViewModel.this;
                editPhoneNumberViewModel2.f33076d.setValue((G) ((a.b) aVar).f2463a);
            }
            return r.f47939a;
        }
    }

    public EditPhoneNumberViewModel(h hVar, v vVar, i iVar) {
        this.f33073a = hVar;
        this.f33074b = vVar;
        this.f33075c = iVar;
        C2680e.c(Z.a(this), null, null, new AnonymousClass1(null), 3);
    }
}
