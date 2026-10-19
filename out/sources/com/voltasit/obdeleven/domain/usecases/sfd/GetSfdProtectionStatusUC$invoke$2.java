package com.voltasit.obdeleven.domain.usecases.sfd;

import G8.w;
import Ia.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: GetSfdProtectionStatusUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.sfd.GetSfdProtectionStatusUC$invoke$2", f = "GetSfdProtectionStatusUC.kt", l = {R.styleable.AppCompatTheme_alertDialogTheme, R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "invokeSuspend")
final class GetSfdProtectionStatusUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends w>>, Object> {
    final /* synthetic */ short $klineId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSfdProtectionStatusUC$invoke$2(d dVar, short s10, kotlin.coroutines.c<? super GetSfdProtectionStatusUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = dVar;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GetSfdProtectionStatusUC$invoke$2(this.this$0, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends w>> cVar) {
        return ((GetSfdProtectionStatusUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00c7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a aVar;
        byte[] bArr;
        byte b10;
        boolean z10;
        p293xa.i iVar;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                if (aVar instanceof C8.a.C0024a) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.f30932a.b("GetSfdProtectionStatusUC", "Unable to read data by id: " + ((C8.a.C0024a) aVar).f2462a.getMessage());
                return aVar;
            }
            bArr = ((p293xa.j) ((C8.a.b) aVar).f2463a).f47923b;
            if (bArr.length > 0) {
                b10 = bArr[0];
            } else {
                b10 = 0;
            }
            if (Integer.compareUnsigned(b10 & 255, 2) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (3 < bArr.length) {
                iVar = new p293xa.i(bArr[3]);
            } else {
                iVar = null;
            }
            if (iVar != null) {
                i10 = iVar.f47922b & 255;
            } else {
                i10 = 0;
            }
            p293xa.i iVar2 = 1 < bArr.length ? new p293xa.i(bArr[1]) : null;
            w wVar = new w(i10, z10, iVar2 == null && iVar2.f47922b == 2);
            this.this$0.f30932a.e("GetSfdProtectionStatusUC", wVar.toString());
            return new C8.a.b(wVar);
        }
        kotlin.b.b(obj);
        this.this$0.f30932a.f("GetSfdProtectionStatusUC", "GetSfdProtectionStatusUC(klineId=" + p293xa.p.a(this.$klineId) + ")");
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f fVar = this.this$0.f30935d;
        short s10 = this.$klineId;
        this.label = 1;
        obj = fVar.a(s10, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        d dVar = this.this$0;
        short s11 = this.$klineId;
        this.label = 2;
        obj = dVar.b(s11, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            if (aVar instanceof C8.a.C0024a) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f30932a.b("GetSfdProtectionStatusUC", "Unable to read data by id: " + ((C8.a.C0024a) aVar).f2462a.getMessage());
            return aVar;
        }
        bArr = ((p293xa.j) ((C8.a.b) aVar).f2463a).f47923b;
        if (bArr.length > 0) {
            b10 = bArr[0];
        } else {
            b10 = 0;
        }
        if (Integer.compareUnsigned(b10 & 255, 2) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (3 < bArr.length) {
            iVar = new p293xa.i(bArr[3]);
        } else {
            iVar = null;
        }
        if (iVar != null) {
            i10 = iVar.f47922b & 255;
        } else {
            i10 = 0;
        }
        if (1 < bArr.length) {
        }
        w wVar2 = new w(i10, z10, iVar2 == null && iVar2.f47922b == 2);
        this.this$0.f30932a.e("GetSfdProtectionStatusUC", wVar2.toString());
        return new C8.a.b(wVar2);
    }
}
