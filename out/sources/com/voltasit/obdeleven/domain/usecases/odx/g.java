package com.voltasit.obdeleven.domain.usecases.odx;

import G8.s;
import J8.p;
import K8.k;
import com.voltasit.obdeleven.domain.exceptions.OdxNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: compiled from: GetOdxByVersionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f30897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f30898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f30899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f30900d;

    public g(i iVar, f fVar, k kVar, p pVar) {
        this.f30897a = iVar;
        this.f30898b = fVar;
        this.f30899c = kVar;
        this.f30900d = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0163  */
    /* JADX WARN: Code duplicated, block: B:60:0x0194 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:63:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x0206  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x020a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x020b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0219  */
    /* JADX WARN: Code duplicated, block: B:87:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0199, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0224, please report this as an issue */
    public final Object a(short s10, String str, String str2, String str3, boolean z10, ContinuationImpl continuationImpl) {
        GetOdxByVersionUC$invoke$1 getOdxByVersionUC$invoke$1;
        boolean z11;
        Object objA;
        g gVar;
        List list;
        Object next;
        s sVar;
        Object next2;
        g gVar2;
        String str4;
        String str5;
        List list2;
        g gVar3;
        C8.a aVar;
        s sVar2;
        C8.a aVar2;
        short s11 = s10;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        if (continuationImpl instanceof GetOdxByVersionUC$invoke$1) {
            getOdxByVersionUC$invoke$1 = (GetOdxByVersionUC$invoke$1) continuationImpl;
            int i10 = getOdxByVersionUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getOdxByVersionUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getOdxByVersionUC$invoke$1 = new GetOdxByVersionUC$invoke$1(this, continuationImpl);
            }
        } else {
            getOdxByVersionUC$invoke$1 = new GetOdxByVersionUC$invoke$1(this, continuationImpl);
        }
        Object objA2 = getOdxByVersionUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getOdxByVersionUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z12 = getOdxByVersionUC$invoke$1.Z$0;
                short s12 = getOdxByVersionUC$invoke$1.S$0;
                String str9 = (String) getOdxByVersionUC$invoke$1.L$3;
                String str10 = (String) getOdxByVersionUC$invoke$1.L$2;
                String str11 = (String) getOdxByVersionUC$invoke$1.L$1;
                gVar = (g) getOdxByVersionUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                z11 = z12;
                s11 = s12;
                str6 = str11;
                objA = objA2;
                str8 = str9;
                str7 = str10;
            } else {
                if (i11 == 2) {
                    list2 = (List) getOdxByVersionUC$invoke$1.L$3;
                    str5 = (String) getOdxByVersionUC$invoke$1.L$2;
                    str4 = (String) getOdxByVersionUC$invoke$1.L$1;
                    gVar3 = (g) getOdxByVersionUC$invoke$1.L$0;
                    kotlin.b.b(objA2);
                    aVar = (C8.a) objA2;
                    if (aVar instanceof C8.a.b) {
                        return aVar;
                    }
                    if (aVar instanceof C8.a.C0024a) {
                        gVar3.f30900d.e("GetOdxVersionUC", "No odx found by name only: " + ((C8.a.C0024a) aVar).f2462a.getMessage());
                    }
                    list = list2;
                    gVar2 = gVar3;
                    str8 = str5;
                    str6 = str4;
                    if (list.isEmpty() && m.I(str6, "EV_ECM", false) && str6.length() > 14) {
                        gVar2.f30900d.e("GetOdxVersionUC", "Attempting to get base engine odx");
                        String strSubstring = str6.substring(0, 14);
                        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                        getOdxByVersionUC$invoke$1.L$0 = gVar2;
                        getOdxByVersionUC$invoke$1.L$1 = null;
                        getOdxByVersionUC$invoke$1.L$2 = null;
                        getOdxByVersionUC$invoke$1.L$3 = null;
                        getOdxByVersionUC$invoke$1.label = 3;
                        objA2 = gVar2.f30897a.a(strSubstring, "", str8, getOdxByVersionUC$invoke$1);
                        if (objA2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    sVar2 = (s) q.P(list);
                    if (sVar2 == null) {
                        return new C8.a.C0024a(new OdxNotFoundException());
                    }
                    gVar2.f30900d.e("GetOdxVersionUC", "Using odx: " + sVar2.f3538c);
                    return new C8.a.b(sVar2);
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar2 = (g) getOdxByVersionUC$invoke$1.L$0;
                kotlin.b.b(objA2);
            }
            aVar2 = (C8.a) objA2;
            if (aVar2 instanceof C8.a.b) {
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            list = (List) ((C8.a.b) aVar2).f2463a;
            sVar2 = (s) q.P(list);
            if (sVar2 == null) {
                return new C8.a.C0024a(new OdxNotFoundException());
            }
            gVar2.f30900d.e("GetOdxVersionUC", "Using odx: " + sVar2.f3538c);
            return new C8.a.b(sVar2);
        }
        kotlin.b.b(objA2);
        StringBuilder sbC = B6.a.c("GetOdxByVersionUC(controlUnitId=", p293xa.p.a(s11), ", odxName=", str6, ", odxVersion=");
        sbC.append(str7);
        sbC.append(", platform=");
        sbC.append(str8);
        sbC.append(")");
        this.f30900d.f("GetOdxVersionUC", sbC.toString());
        getOdxByVersionUC$invoke$1.L$0 = this;
        getOdxByVersionUC$invoke$1.L$1 = str6;
        getOdxByVersionUC$invoke$1.L$2 = str7;
        getOdxByVersionUC$invoke$1.L$3 = str8;
        getOdxByVersionUC$invoke$1.S$0 = s11;
        z11 = z10;
        getOdxByVersionUC$invoke$1.Z$0 = z11;
        getOdxByVersionUC$invoke$1.label = 1;
        objA = this.f30897a.a(str6, str7, str8, getOdxByVersionUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        gVar = this;
        C8.a aVar3 = (C8.a) objA;
        if (!(aVar3 instanceof C8.a.b)) {
            if (aVar3 instanceof C8.a.C0024a) {
                return aVar3;
            }
            throw new NoWhenBranchMatchedException();
        }
        list = (List) ((C8.a.b) aVar3).f2463a;
        gVar.f30900d.e("GetOdxVersionUC", "Received odx list (by name and platform) size: " + list.size());
        String strA = gVar.f30899c.a((short) s11);
        String strF = O.a.f(str6, "_", str7);
        boolean zS = n.S(strA);
        p pVar = gVar.f30900d;
        if ((!zS || z11) && !list.isEmpty()) {
            if (z11) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!kotlin.jvm.internal.i.a(((s) next2).f3538c, strF));
                sVar = (s) next2;
            } else {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!kotlin.jvm.internal.i.a(((s) next).f3538c, strA));
                sVar = (s) next;
            }
            if (sVar != null) {
                pVar.e("GetOdxVersionUC", "Found user selected odx file version: " + sVar.f3538c);
            } else {
                sVar = null;
            }
        } else {
            sVar = null;
        }
        if (sVar != null) {
            return new C8.a.b(sVar);
        }
        if (list.isEmpty()) {
            pVar.b("GetOdxVersionUC", "No odx found by name and platform");
            getOdxByVersionUC$invoke$1.L$0 = gVar;
            getOdxByVersionUC$invoke$1.L$1 = str6;
            getOdxByVersionUC$invoke$1.L$2 = str8;
            getOdxByVersionUC$invoke$1.L$3 = list;
            getOdxByVersionUC$invoke$1.label = 2;
            objA2 = gVar.f30898b.a(str6, str7, getOdxByVersionUC$invoke$1);
            if (objA2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            str4 = str6;
            str5 = str8;
            list2 = list;
            gVar3 = gVar;
            aVar = (C8.a) objA2;
            if (aVar instanceof C8.a.b) {
                return aVar;
            }
            if (aVar instanceof C8.a.C0024a) {
                gVar3.f30900d.e("GetOdxVersionUC", "No odx found by name only: " + ((C8.a.C0024a) aVar).f2462a.getMessage());
            }
            list = list2;
            gVar2 = gVar3;
            str8 = str5;
            str6 = str4;
        } else {
            gVar2 = gVar;
        }
        if (list.isEmpty()) {
            gVar2.f30900d.e("GetOdxVersionUC", "Attempting to get base engine odx");
            String strSubstring2 = str6.substring(0, 14);
            kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
            getOdxByVersionUC$invoke$1.L$0 = gVar2;
            getOdxByVersionUC$invoke$1.L$1 = null;
            getOdxByVersionUC$invoke$1.L$2 = null;
            getOdxByVersionUC$invoke$1.L$3 = null;
            getOdxByVersionUC$invoke$1.label = 3;
            objA2 = gVar2.f30897a.a(strSubstring2, "", str8, getOdxByVersionUC$invoke$1);
            if (objA2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar2 = (C8.a) objA2;
            if (aVar2 instanceof C8.a.b) {
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            list = (List) ((C8.a.b) aVar2).f2463a;
        }
        sVar2 = (s) q.P(list);
        if (sVar2 == null) {
            return new C8.a.C0024a(new OdxNotFoundException());
        }
        gVar2.f30900d.e("GetOdxVersionUC", "Using odx: " + sVar2.f3538c);
        return new C8.a.b(sVar2);
    }
}
