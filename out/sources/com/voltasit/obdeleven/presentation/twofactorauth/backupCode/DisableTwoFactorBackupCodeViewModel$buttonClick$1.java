package com.voltasit.obdeleven.presentation.twofactorauth.backupCode;

import Aa.c;
import Ia.p;
import J4.n;
import K8.v;
import com.voltasit.obdeleven.domain.usecases.user.C2123d;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DisableTwoFactorBackupCodeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeViewModel$buttonClick$1", f = "DisableTwoFactorBackupCodeViewModel.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle, R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "invokeSuspend")
final class DisableTwoFactorBackupCodeViewModel$buttonClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ DisableTwoFactorBackupCodeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableTwoFactorBackupCodeViewModel$buttonClick$1(DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel, kotlin.coroutines.c<? super DisableTwoFactorBackupCodeViewModel$buttonClick$1> cVar) {
        super(2, cVar);
        this.this$0 = disableTwoFactorBackupCodeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DisableTwoFactorBackupCodeViewModel$buttonClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((DisableTwoFactorBackupCodeViewModel$buttonClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.f33310w.j(r.f47939a);
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        this.this$0.f33304q.j(new Integer(-1));
        DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel = this.this$0;
        C2123d c2123d = disableTwoFactorBackupCodeViewModel.f33302o;
        String strD = disableTwoFactorBackupCodeViewModel.f33306s.d();
        i.b(strD);
        Locale locale = Locale.ROOT;
        String strD2 = n.d(locale, "ROOT", strD, locale, "toLowerCase(...)");
        this.label = 1;
        obj = c2123d.a(strD2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C2123d.a aVar = (C2123d.a) obj;
        if (aVar instanceof C2123d.a.c) {
            v vVar = this.this$0.f33303p;
            this.label = 2;
            if (vVar.F(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.this$0.f33310w.j(r.f47939a);
        } else if (aVar instanceof C2123d.a.b) {
            this.this$0.f33304q.j(new Integer(com.voltasit.obdeleven.R.string.view_two_factor_invalid_backup_code));
        } else {
            B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
