package com.voltasit.obdeleven.presentation.dialogs.devicePassword;

import Ia.l;
import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: PasswordEnterViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordEnterViewModel$remindDevicePassword$1", f = "PasswordEnterViewModel.kt", l = {R.styleable.AppCompatTheme_actionModeWebSearchDrawable, R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
final class PasswordEnterViewModel$remindDevicePassword$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ l<C8.a<String>, r> $callback;
    final /* synthetic */ String $deviceId;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasswordEnterViewModel$remindDevicePassword$1(g gVar, String str, l<? super C8.a<String>, r> lVar, kotlin.coroutines.c<? super PasswordEnterViewModel$remindDevicePassword$1> cVar) {
        super(2, cVar);
        this.this$0 = gVar;
        this.$deviceId = str;
        this.$callback = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PasswordEnterViewModel$remindDevicePassword$1(this.this$0, this.$deviceId, this.$callback, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PasswordEnterViewModel$remindDevicePassword$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a<String> aVar;
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
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                this.$callback.invoke(new C8.a.b(((String) ((C8.a.b) aVar).f2463a).replaceAll("(?<=.{2}).(?=[^@]*?@)", "*")));
            } else if (aVar instanceof C8.a.C0024a) {
                this.$callback.invoke(aVar);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        K8.f fVar = this.this$0.f32260p;
        String str = this.$deviceId;
        this.label = 1;
        obj = fVar.q(str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a<String> aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.C0024a) {
            this.$callback.invoke(aVar2);
        } else if (aVar2 instanceof C8.a.b) {
            com.voltasit.obdeleven.domain.usecases.bonus.b bVar = this.this$0.f32259o;
            String str2 = this.$deviceId;
            this.label = 2;
            obj = bVar.a(str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                this.$callback.invoke(new C8.a.b(((String) ((C8.a.b) aVar).f2463a).replaceAll("(?<=.{2}).(?=[^@]*?@)", "*")));
            } else if (aVar instanceof C8.a.C0024a) {
                this.$callback.invoke(aVar);
            }
        }
        return r.f47939a;
    }
}
