package com.voltasit.obdeleven.presentation.settings;

import Ia.p;
import J8.g;
import Na.i;
import com.voltasit.obdeleven.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel$handleDevicePasswordChange$1", f = "SettingsViewModel.kt", l = {569, 570}, m = "invokeSuspend")
final class SettingsViewModel$handleDevicePasswordChange$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$handleDevicePasswordChange$1(SettingsViewModel settingsViewModel, String str, kotlin.coroutines.c<? super SettingsViewModel$handleDevicePasswordChange$1> cVar) {
        super(2, cVar);
        this.this$0 = settingsViewModel;
        this.$password = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingsViewModel$handleDevicePasswordChange$1(this.this$0, this.$password, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SettingsViewModel$handleDevicePasswordChange$1) create(a10, cVar)).invokeSuspend(r.f47939a);
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
            r rVar = r.f47939a;
            i iVar = E8.a.f3126a;
            return rVar;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0.f33162p;
        String str = this.$password;
        this.label = 1;
        obj = gVar.b(str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            SettingsViewModel settingsViewModel = this.this$0;
            String str2 = this.$password;
            this.label = 2;
            if (SettingsViewModel.b(settingsViewModel, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            B7.b.h(R.string.common_could_not_write_pass, this.this$0.f32119h);
        }
        r rVar2 = r.f47939a;
        i iVar2 = E8.a.f3126a;
        return rVar2;
    }
}
