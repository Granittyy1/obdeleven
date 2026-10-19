package com.voltasit.obdeleven.domain.usecases.sfd;

import D9.o;
import Ia.p;
import K8.l;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.k;
import p293xa.r;

/* JADX INFO: compiled from: GetIsSfdSupportedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.sfd.GetIsSfdSupportedUC$invoke$2", f = "GetIsSfdSupportedUC.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons, R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_checkboxStyle, R.styleable.AppCompatTheme_checkedTextViewStyle, R.styleable.AppCompatTheme_colorControlActivated}, m = "invokeSuspend")
final class GetIsSfdSupportedUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends Boolean>>, Object> {
    final /* synthetic */ short $klineId;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIsSfdSupportedUC$invoke$2(b bVar, short s10, kotlin.coroutines.c<? super GetIsSfdSupportedUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GetIsSfdSupportedUC$invoke$2(this.this$0, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends Boolean>> cVar) {
        return ((GetIsSfdSupportedUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:81:0x0165  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a aVar;
        com.obdeleven.service.odx.e eVar;
        List list;
        COMPUSCALE compuscale;
        LIMIT lowerlimit;
        p293xa.p pVar;
        String value;
        k kVarM;
        C8.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        Object obj2 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 == 2) {
                    kotlin.b.b(obj);
                    aVar = (C8.a) obj;
                    if (aVar instanceof C8.a.C0024a) {
                        return aVar;
                    }
                    if (aVar instanceof C8.a.b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = (com.obdeleven.service.odx.e) ((C8.a.b) aVar).f2463a;
                    l lVar = this.this$0.f30926b;
                    this.L$0 = eVar;
                    this.label = 3;
                    obj = lVar.c(eVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l lVar2 = this.this$0.f30926b;
                    this.L$0 = null;
                    this.label = 4;
                    obj = lVar2.a(eVar, (com.obdeleven.service.odx.e.g) obj, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = (List) obj;
                    if (list != null) {
                        for (Object obj3 : list) {
                            compuscale = (COMPUSCALE) obj3;
                            kotlin.jvm.internal.i.e(compuscale, "<this>");
                            lowerlimit = compuscale.getLOWERLIMIT();
                            if (lowerlimit == null) {
                                lowerlimit = compuscale.getUPPERLIMIT();
                            }
                            if (lowerlimit != null) {
                                pVar = null;
                            } else {
                                pVar = null;
                            }
                            if (pVar != null) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        if (((COMPUSCALE) obj2) != null) {
                            com.voltasit.obdeleven.domain.usecases.controlUnit.f fVar = this.this$0.f30927c;
                            short s10 = this.$klineId;
                            String strU = o.u((short) -3660);
                            this.label = 5;
                            obj = fVar.a(strU, this, s10);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return new C8.a.b(Boolean.FALSE);
                }
                if (i10 == 3) {
                    eVar = (com.obdeleven.service.odx.e) this.L$0;
                    kotlin.b.b(obj);
                    l lVar3 = this.this$0.f30926b;
                    this.L$0 = null;
                    this.label = 4;
                    obj = lVar3.a(eVar, (com.obdeleven.service.odx.e.g) obj, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = (List) obj;
                    if (list != null) {
                        while (r11.hasNext()) {
                            compuscale = (COMPUSCALE) obj3;
                            kotlin.jvm.internal.i.e(compuscale, "<this>");
                            lowerlimit = compuscale.getLOWERLIMIT();
                            if (lowerlimit == null) {
                                lowerlimit = compuscale.getUPPERLIMIT();
                            }
                            if (lowerlimit != null) {
                                pVar = null;
                            } else {
                                pVar = null;
                            }
                            if (pVar != null) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        if (((COMPUSCALE) obj2) != null) {
                            com.voltasit.obdeleven.domain.usecases.controlUnit.f fVar2 = this.this$0.f30927c;
                            short s11 = this.$klineId;
                            String strU2 = o.u((short) -3660);
                            this.label = 5;
                            obj = fVar2.a(strU2, this, s11);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return new C8.a.b(Boolean.FALSE);
                }
                if (i10 == 4) {
                    kotlin.b.b(obj);
                    list = (List) obj;
                    if (list != null) {
                        while (r11.hasNext()) {
                            compuscale = (COMPUSCALE) obj3;
                            kotlin.jvm.internal.i.e(compuscale, "<this>");
                            lowerlimit = compuscale.getLOWERLIMIT();
                            if (lowerlimit == null) {
                                lowerlimit = compuscale.getUPPERLIMIT();
                            }
                            if (lowerlimit != null || (value = lowerlimit.getValue()) == null || (kVarM = F8.a.m(10, value)) == null) {
                                pVar = null;
                            } else {
                                int i11 = kVarM.f47926b;
                                if (Integer.compareUnsigned(i11, 65535) > 0) {
                                    pVar = null;
                                } else {
                                    pVar = new p293xa.p((short) i11);
                                }
                            }
                            if (pVar != null && pVar.f47935b == -3660) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        if (((COMPUSCALE) obj2) != null) {
                            com.voltasit.obdeleven.domain.usecases.controlUnit.f fVar3 = this.this$0.f30927c;
                            short s12 = this.$klineId;
                            String strU3 = o.u((short) -3660);
                            this.label = 5;
                            obj = fVar3.a(strU3, this, s12);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return new C8.a.b(Boolean.FALSE);
                }
                if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            aVar2 = (C8.a) obj;
            if (aVar2 instanceof C8.a.C0024a) {
                return new C8.a.b(Boolean.FALSE);
            }
            if (aVar2 instanceof C8.a.b) {
                throw new NoWhenBranchMatchedException();
            }
            byte[] bArrB = E8.a.b((String) ((C8.a.b) aVar2).f2463a);
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(...)");
            return new C8.a.b(Boolean.valueOf(Integer.compareUnsigned(bArrCopyOf[0] & 255, 0) > 0));
        }
        kotlin.b.b(obj);
        this.this$0.f30925a.f("GetIsSfdUnlockNeededUC", "GetIsSfdUnlockNeededUC()");
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f fVar4 = this.this$0.f30929e;
        short s13 = this.$klineId;
        this.label = 1;
        obj = fVar4.a(s13, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar3 = (C8.a) obj;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        b bVar = this.this$0;
        l lVar4 = bVar.f30926b;
        short s14 = this.$klineId;
        String objectId = bVar.f30928d.k().f42726c.getObjectId();
        kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
        this.label = 2;
        obj = lVar4.b(objectId, this, s14);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) obj;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (aVar instanceof C8.a.b) {
            throw new NoWhenBranchMatchedException();
        }
        eVar = (com.obdeleven.service.odx.e) ((C8.a.b) aVar).f2463a;
        l lVar5 = this.this$0.f30926b;
        this.L$0 = eVar;
        this.label = 3;
        obj = lVar5.c(eVar, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        l lVar6 = this.this$0.f30926b;
        this.L$0 = null;
        this.label = 4;
        obj = lVar6.a(eVar, (com.obdeleven.service.odx.e.g) obj, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        list = (List) obj;
        if (list != null) {
            while (r11.hasNext()) {
                compuscale = (COMPUSCALE) obj3;
                kotlin.jvm.internal.i.e(compuscale, "<this>");
                lowerlimit = compuscale.getLOWERLIMIT();
                if (lowerlimit == null) {
                    lowerlimit = compuscale.getUPPERLIMIT();
                }
                if (lowerlimit != null) {
                    pVar = null;
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    obj2 = obj3;
                    break;
                }
            }
            if (((COMPUSCALE) obj2) != null) {
                com.voltasit.obdeleven.domain.usecases.controlUnit.f fVar5 = this.this$0.f30927c;
                short s15 = this.$klineId;
                String strU4 = o.u((short) -3660);
                this.label = 5;
                obj = fVar5.a(strU4, this, s15);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = (C8.a) obj;
                if (aVar2 instanceof C8.a.C0024a) {
                    return new C8.a.b(Boolean.FALSE);
                }
                if (aVar2 instanceof C8.a.b) {
                    throw new NoWhenBranchMatchedException();
                }
                byte[] bArrB2 = E8.a.b((String) ((C8.a.b) aVar2).f2463a);
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB2, bArrB2.length);
                kotlin.jvm.internal.i.d(bArrCopyOf2, "copyOf(...)");
                return new C8.a.b(Boolean.valueOf(Integer.compareUnsigned(bArrCopyOf2[0] & 255, 0) > 0));
            }
        }
        return new C8.a.b(Boolean.FALSE);
    }
}
