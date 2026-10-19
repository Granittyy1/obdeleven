package com.voltasit.obdeleven.presentation.screens.profile.personalInfo;

import Aa.c;
import G8.C0707i;
import J8.p;
import K8.i;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.domain.usecases.user.m;
import com.voltasit.obdeleven.presentation.d;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: EditPersonalInfoWizardViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EditPersonalInfoWizardViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f32960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f32961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f32962q;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: EditPersonalInfoWizardViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardViewModel$1", f = "EditPersonalInfoWizardViewModel.kt", l = {20}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return EditPersonalInfoWizardViewModel.this.new AnonymousClass1(cVar);
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
                m mVar = EditPersonalInfoWizardViewModel.this.f32961p;
                this.label = 1;
                obj = mVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                EditPersonalInfoWizardViewModel.this.f32960o.a(new C0707i(Screen.SfdPersonalInfoForm, null, false, null, 14));
            } else {
                EditPersonalInfoWizardViewModel.this.f32960o.a(new C0707i(Screen.EmailVerificationInput, null, false, null, 14));
            }
            return r.f47939a;
        }
    }

    public EditPersonalInfoWizardViewModel(i iVar, m mVar, p pVar) {
        this.f32960o = iVar;
        this.f32961p = mVar;
        this.f32962q = pVar;
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
    }
}
