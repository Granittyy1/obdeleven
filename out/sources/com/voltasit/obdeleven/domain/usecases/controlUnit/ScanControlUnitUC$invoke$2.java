package com.voltasit.obdeleven.domain.usecases.controlUnit;

import Ia.p;
import com.obdeleven.service.model.fault.Fault;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ScanControlUnitUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.ScanControlUnitUC$invoke$2", f = "ScanControlUnitUC.kt", l = {28, R.styleable.AppCompatTheme_actionOverflowButtonStyle, R.styleable.AppCompatTheme_alertDialogButtonGroupStyle, R.styleable.AppCompatTheme_alertDialogCenterButtons}, m = "invokeSuspend")
public final class ScanControlUnitUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends List<? extends Fault>>>, Object> {
    final /* synthetic */ p109i8.e $controlUnit;
    final /* synthetic */ boolean $faultsOnly;
    final /* synthetic */ boolean $readFreezeFrame;
    Object L$0;
    int label;
    final /* synthetic */ ScanControlUnitUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanControlUnitUC$invoke$2(ScanControlUnitUC scanControlUnitUC, p109i8.e eVar, boolean z10, boolean z11, kotlin.coroutines.c<? super ScanControlUnitUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = scanControlUnitUC;
        this.$controlUnit = eVar;
        this.$faultsOnly = z10;
        this.$readFreezeFrame = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ScanControlUnitUC$invoke$2(this.this$0, this.$controlUnit, this.$faultsOnly, this.$readFreezeFrame, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends List<? extends Fault>>> cVar) {
        return ((ScanControlUnitUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a aVar;
        ScanControlUnitUC scanControlUnitUC;
        p109i8.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else if (i10 == 2) {
                kotlin.b.b(obj);
                ScanControlUnitUC scanControlUnitUC2 = this.this$0;
                p109i8.e eVar2 = this.$controlUnit;
                boolean z10 = this.$readFreezeFrame;
                this.label = 3;
                obj = ScanControlUnitUC.b(scanControlUnitUC2, eVar2, z10, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C8.a aVar2 = (C8.a) this.L$0;
                    kotlin.b.b(obj);
                    return aVar2;
                }
                kotlin.b.b(obj);
            }
            aVar = (C8.a) obj;
            scanControlUnitUC = this.this$0;
            eVar = this.$controlUnit;
            this.L$0 = aVar;
            this.label = 4;
            if (ScanControlUnitUC.a(scanControlUnitUC, eVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return aVar;
        }
        kotlin.b.b(obj);
        this.this$0.f30645a.e("ScanControlUnitUC", "Scanning cu: ".concat(this.$controlUnit.t()));
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f fVar = this.this$0.f30646b;
        short sShortValue = this.$controlUnit.n().shortValue();
        this.label = 1;
        obj = fVar.a(sShortValue, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar3 = (C8.a) obj;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        if (!this.$faultsOnly) {
            ScanControlUnitUC scanControlUnitUC3 = this.this$0;
            p109i8.e eVar3 = this.$controlUnit;
            this.label = 2;
            if (ScanControlUnitUC.c(scanControlUnitUC3, eVar3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ScanControlUnitUC scanControlUnitUC4 = this.this$0;
        p109i8.e eVar4 = this.$controlUnit;
        boolean z11 = this.$readFreezeFrame;
        this.label = 3;
        obj = ScanControlUnitUC.b(scanControlUnitUC4, eVar4, z11, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) obj;
        scanControlUnitUC = this.this$0;
        eVar = this.$controlUnit;
        this.L$0 = aVar;
        this.label = 4;
        if (ScanControlUnitUC.a(scanControlUnitUC, eVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return aVar;
    }
}
