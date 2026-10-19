package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit;

import Aa.c;
import C8.a;
import G8.C0707i;
import G8.G;
import Ia.p;
import K8.v;
import androidx.compose.ui.text.font.s;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.network.NetworkException;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EditPhoneNumberViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModel$onNextClick$1", f = "EditPhoneNumberViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
final class EditPhoneNumberViewModel$onNextClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EditPhoneNumberViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPhoneNumberViewModel$onNextClick$1(EditPhoneNumberViewModel editPhoneNumberViewModel, kotlin.coroutines.c<? super EditPhoneNumberViewModel$onNextClick$1> cVar) {
        super(2, cVar);
        this.this$0 = editPhoneNumberViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new EditPhoneNumberViewModel$onNextClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((EditPhoneNumberViewModel$onNextClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            this.this$0.f33077e.setValue(null);
            this.this$0.f33078f.setValue(Boolean.TRUE);
            str = ((G) this.this$0.f33076d.getValue()).f3420d;
            String str3 = ((G) this.this$0.f33076d.getValue()).f3421e;
            v vVar = this.this$0.f33074b;
            this.L$0 = str;
            this.L$1 = str3;
            this.label = 1;
            Object objO = vVar.o(str, str3, this);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str3;
            obj = objO;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            str = (String) this.L$0;
            b.b(obj);
        }
        a aVar = (a) obj;
        this.this$0.f33078f.setValue(Boolean.FALSE);
        if (!(aVar instanceof a.C0024a)) {
            this.this$0.f33075c.a(new C0707i(Screen.PhoneNumberConfirmation, x.o(new Pair("mobile", s.b(str, str2))), false, null, 12));
            return r.f47939a;
        }
        Throwable th = ((a.C0024a) aVar).f2462a;
        this.this$0.f33077e.setValue(((th instanceof NetworkException) && ((NetworkException) th).a() == 400) ? new Integer(com.voltasit.obdeleven.R.string.common_incorrect_phone_number) : new Integer(com.voltasit.obdeleven.R.string.common_check_network));
        return r.f47939a;
    }
}
