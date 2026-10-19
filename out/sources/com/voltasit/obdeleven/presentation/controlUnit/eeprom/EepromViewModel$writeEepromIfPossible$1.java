package com.voltasit.obdeleven.presentation.controlUnit.eeprom;

import Ia.p;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EepromViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromViewModel$writeEepromIfPossible$1", f = "EepromViewModel.kt", l = {R.styleable.AppCompatTheme_actionOverflowButtonStyle}, m = "invokeSuspend")
final class EepromViewModel$writeEepromIfPossible$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EepromViewModel$writeEepromIfPossible$1(h hVar, kotlin.coroutines.c<? super EepromViewModel$writeEepromIfPossible$1> cVar) {
        super(2, cVar);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new EepromViewModel$writeEepromIfPossible$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((EepromViewModel$writeEepromIfPossible$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            h hVar = this.this$0;
            this.label = 1;
            obj = h.b(hVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            U7.a<r> aVar = this.this$0.f31585r;
            r rVar = r.f47939a;
            aVar.j(rVar);
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return rVar;
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        U7.a<r> aVar2 = this.this$0.f31583p;
        r rVar2 = r.f47939a;
        aVar2.j(rVar2);
        return rVar2;
    }
}
