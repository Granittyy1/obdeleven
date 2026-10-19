package com.voltasit.obdeleven.domain.usecases.vehicle;

import J8.x;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.domain.exceptions.ScanCancelledException;
import com.voltasit.obdeleven.domain.usecases.controlUnit.ScanControlUnitUC;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.N;
import p134k8.a2;
import p255u9.D;
import p255u9.E;

/* JADX INFO: compiled from: ScanVehicleUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static final List<Integer> j = kotlin.collections.l.s(0, 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f31072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.b f31073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.o f31074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.d f31075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K8.b f31076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GetUserDetailsUC f31077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScanControlUnitUC f31078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J8.a f31079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2712w f31080i;

    /* JADX INFO: compiled from: ScanVehicleUC.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f31081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<HistoryDB> f31082b;

        public a(List histories, boolean z10) {
            kotlin.jvm.internal.i.e(histories, "histories");
            this.f31081a = z10;
            this.f31082b = histories;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31081a == aVar.f31081a && kotlin.jvm.internal.i.a(this.f31082b, aVar.f31082b);
        }

        public final int hashCode() {
            return this.f31082b.hashCode() + (Boolean.hashCode(this.f31081a) * 31);
        }

        public final String toString() {
            return "ControlUnitsScanResult(isCanceled=" + this.f31081a + ", histories=" + this.f31082b + ")";
        }
    }

    /* JADX INFO: compiled from: ScanVehicleUC.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<p109i8.e> f31083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f31084b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends p109i8.e> controlUnits, Throwable th) {
            kotlin.jvm.internal.i.e(controlUnits, "controlUnits");
            this.f31083a = controlUnits;
            this.f31084b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.i.a(this.f31083a, bVar.f31083a) && kotlin.jvm.internal.i.a(this.f31084b, bVar.f31084b);
        }

        public final int hashCode() {
            int iHashCode = this.f31083a.hashCode() * 31;
            Throwable th = this.f31084b;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            return "Result(controlUnits=" + this.f31083a + ", historyError=" + this.f31084b + ")";
        }
    }

    public r(x xVar, p084g8.b bVar, K8.o oVar, com.voltasit.obdeleven.domain.usecases.controlUnit.d dVar, K8.b bVar2, GetUserDetailsUC getUserDetailsUC, ScanControlUnitUC scanControlUnitUC, J8.a aVar) {
        Sa.a historySavingDispatcher = N.f43200c;
        kotlin.jvm.internal.i.e(historySavingDispatcher, "historySavingDispatcher");
        this.f31072a = xVar;
        this.f31073b = bVar;
        this.f31074c = oVar;
        this.f31075d = dVar;
        this.f31076e = bVar2;
        this.f31077f = getUserDetailsUC;
        this.f31078g = scanControlUnitUC;
        this.f31079h = aVar;
        this.f31080i = historySavingDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(a2 a2Var, ContinuationImpl continuationImpl) {
        ScanVehicleUC$getScannableControlUnits$1 scanVehicleUC$getScannableControlUnits$1;
        if (continuationImpl instanceof ScanVehicleUC$getScannableControlUnits$1) {
            scanVehicleUC$getScannableControlUnits$1 = (ScanVehicleUC$getScannableControlUnits$1) continuationImpl;
            int i10 = scanVehicleUC$getScannableControlUnits$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanVehicleUC$getScannableControlUnits$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanVehicleUC$getScannableControlUnits$1 = new ScanVehicleUC$getScannableControlUnits$1(this, continuationImpl);
            }
        } else {
            scanVehicleUC$getScannableControlUnits$1 = new ScanVehicleUC$getScannableControlUnits$1(this, continuationImpl);
        }
        Object objH = scanVehicleUC$getScannableControlUnits$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanVehicleUC$getScannableControlUnits$1.label;
        if (i11 == 0) {
            kotlin.b.b(objH);
            scanVehicleUC$getScannableControlUnits$1.L$0 = a2Var;
            scanVehicleUC$getScannableControlUnits$1.label = 1;
            objH = this.f31072a.h(false, scanVehicleUC$getScannableControlUnits$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2Var = (a2) scanVehicleUC$getScannableControlUnits$1.L$0;
            kotlin.b.b(objH);
        }
        C8.a aVar = (C8.a) objH;
        if (!(aVar instanceof C8.a.b)) {
            return aVar;
        }
        D dI = a2Var.f42726c.i();
        List listB = dI != null ? dI.b() : EmptyList.f42983b;
        Iterable iterable = (Iterable) ((C8.a.b) aVar).f2463a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            ControlUnit controlUnit = (ControlUnit) obj;
            if (!listB.contains(controlUnit.n())) {
                if (!j.contains(new Integer(controlUnit.n().shortValue()))) {
                    arrayList.add(obj);
                }
            }
        }
        return new C8.a.b(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff A[LOOP:0: B:38:0x00f9->B:40:0x00ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x015d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0145, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(Ia.p pVar, a2 a2Var, boolean z10, ContinuationImpl continuationImpl) throws Throwable {
        ScanVehicleUC$invoke$1 scanVehicleUC$invoke$1;
        r rVar;
        boolean z11;
        boolean z12;
        Ia.p pVar2;
        r rVar2;
        C8.a aVar;
        List list;
        r rVar3;
        a2 a2Var2;
        List list2;
        a aVar2;
        Iterator it;
        int size;
        Object objJ;
        a aVar3;
        C8.a aVar4;
        C8.a.C0024a c0024a;
        if (continuationImpl instanceof ScanVehicleUC$invoke$1) {
            scanVehicleUC$invoke$1 = (ScanVehicleUC$invoke$1) continuationImpl;
            int i10 = scanVehicleUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanVehicleUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanVehicleUC$invoke$1 = new ScanVehicleUC$invoke$1(this, continuationImpl);
            }
        } else {
            scanVehicleUC$invoke$1 = new ScanVehicleUC$invoke$1(this, continuationImpl);
        }
        ScanVehicleUC$invoke$1 scanVehicleUC$invoke$2 = scanVehicleUC$invoke$1;
        Object objA = scanVehicleUC$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanVehicleUC$invoke$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                z10 = scanVehicleUC$invoke$2.Z$0;
                a2Var = (a2) scanVehicleUC$invoke$2.L$2;
                pVar = (Ia.p) scanVehicleUC$invoke$2.L$1;
                rVar = (r) scanVehicleUC$invoke$2.L$0;
                kotlin.b.b(objA);
            } else if (i11 == 2) {
                boolean z13 = scanVehicleUC$invoke$2.Z$1;
                boolean z14 = scanVehicleUC$invoke$2.Z$0;
                a2 a2Var3 = (a2) scanVehicleUC$invoke$2.L$2;
                Ia.p pVar3 = (Ia.p) scanVehicleUC$invoke$2.L$1;
                r rVar4 = (r) scanVehicleUC$invoke$2.L$0;
                kotlin.b.b(objA);
                z12 = z13;
                z11 = z14;
                a2Var = a2Var3;
                rVar2 = rVar4;
                pVar2 = pVar3;
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.b) {
                    if (aVar instanceof C8.a.C0024a) {
                        return aVar;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                list = (List) ((C8.a.b) aVar).f2463a;
                scanVehicleUC$invoke$2.L$0 = rVar2;
                scanVehicleUC$invoke$2.L$1 = a2Var;
                scanVehicleUC$invoke$2.L$2 = list;
                scanVehicleUC$invoke$2.label = 3;
                objA = rVar2.c(list, pVar2, z12, z11, scanVehicleUC$invoke$2);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rVar3 = rVar2;
                a2Var2 = a2Var;
                list2 = list;
                aVar2 = (a) objA;
                rVar3.f31072a.m();
                it = list2.iterator();
                size = 0;
                while (it.hasNext()) {
                    size += ((p109i8.e) it.next()).q().size();
                }
                int size2 = list2.size();
                boolean z15 = !aVar2.f31081a;
                E e10 = a2Var2.f42726c;
                kotlin.jvm.internal.i.d(e10, "getParseObject(...)");
                scanVehicleUC$invoke$2.L$0 = rVar3;
                scanVehicleUC$invoke$2.L$1 = list2;
                scanVehicleUC$invoke$2.L$2 = aVar2;
                scanVehicleUC$invoke$2.label = 4;
                objJ = rVar3.f31073b.j(size, size2, z15, e10, aVar2.f31082b, scanVehicleUC$invoke$2);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objA = objJ;
                aVar3 = aVar2;
            } else if (i11 == 3) {
                List list3 = (List) scanVehicleUC$invoke$2.L$2;
                a2 a2Var4 = (a2) scanVehicleUC$invoke$2.L$1;
                rVar3 = (r) scanVehicleUC$invoke$2.L$0;
                kotlin.b.b(objA);
                list2 = list3;
                a2Var2 = a2Var4;
                aVar2 = (a) objA;
                rVar3.f31072a.m();
                it = list2.iterator();
                size = 0;
                while (it.hasNext()) {
                    size += ((p109i8.e) it.next()).q().size();
                }
                int size3 = list2.size();
                boolean z16 = !aVar2.f31081a;
                E e11 = a2Var2.f42726c;
                kotlin.jvm.internal.i.d(e11, "getParseObject(...)");
                scanVehicleUC$invoke$2.L$0 = rVar3;
                scanVehicleUC$invoke$2.L$1 = list2;
                scanVehicleUC$invoke$2.L$2 = aVar2;
                scanVehicleUC$invoke$2.label = 4;
                objJ = rVar3.f31073b.j(size, size3, z16, e11, aVar2.f31082b, scanVehicleUC$invoke$2);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objA = objJ;
                aVar3 = aVar2;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (a) scanVehicleUC$invoke$2.L$2;
                list2 = (List) scanVehicleUC$invoke$2.L$1;
                rVar3 = (r) scanVehicleUC$invoke$2.L$0;
                kotlin.b.b(objA);
            }
            aVar4 = (C8.a) objA;
            if (aVar3.f31081a) {
                return new C8.a.C0024a(new ScanCancelledException());
            }
            rVar3.f31079h.e0(new J8.r("scan_performed"));
            if (aVar4 instanceof C8.a.C0024a) {
                c0024a = (C8.a.C0024a) aVar4;
            } else {
                c0024a = null;
            }
            return new C8.a.b(new b(list2, c0024a != null ? c0024a.f2462a : null));
        }
        kotlin.b.b(objA);
        scanVehicleUC$invoke$2.L$0 = this;
        scanVehicleUC$invoke$2.L$1 = pVar;
        scanVehicleUC$invoke$2.L$2 = a2Var;
        scanVehicleUC$invoke$2.Z$0 = z10;
        scanVehicleUC$invoke$2.label = 1;
        objA = this.f31077f.a(scanVehicleUC$invoke$2);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        rVar = this;
        C8.a aVar5 = (C8.a) objA;
        if (!(aVar5 instanceof C8.a.b)) {
            if (aVar5 instanceof C8.a.C0024a) {
                return aVar5;
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean zC = ((G8.D) ((C8.a.b) aVar5).f2463a).f3410a.c();
        scanVehicleUC$invoke$2.L$0 = rVar;
        scanVehicleUC$invoke$2.L$1 = pVar;
        scanVehicleUC$invoke$2.L$2 = a2Var;
        scanVehicleUC$invoke$2.Z$0 = z10;
        scanVehicleUC$invoke$2.Z$1 = zC;
        scanVehicleUC$invoke$2.label = 2;
        Object objA2 = rVar.a(a2Var, scanVehicleUC$invoke$2);
        if (objA2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        z11 = z10;
        z12 = zC;
        objA = objA2;
        pVar2 = pVar;
        rVar2 = rVar;
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        list = (List) ((C8.a.b) aVar).f2463a;
        scanVehicleUC$invoke$2.L$0 = rVar2;
        scanVehicleUC$invoke$2.L$1 = a2Var;
        scanVehicleUC$invoke$2.L$2 = list;
        scanVehicleUC$invoke$2.label = 3;
        objA = rVar2.c(list, pVar2, z12, z11, scanVehicleUC$invoke$2);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        rVar3 = rVar2;
        a2Var2 = a2Var;
        list2 = list;
        aVar2 = (a) objA;
        rVar3.f31072a.m();
        it = list2.iterator();
        size = 0;
        while (it.hasNext()) {
            size += ((p109i8.e) it.next()).q().size();
        }
        int size4 = list2.size();
        boolean z17 = !aVar2.f31081a;
        E e12 = a2Var2.f42726c;
        kotlin.jvm.internal.i.d(e12, "getParseObject(...)");
        scanVehicleUC$invoke$2.L$0 = rVar3;
        scanVehicleUC$invoke$2.L$1 = list2;
        scanVehicleUC$invoke$2.L$2 = aVar2;
        scanVehicleUC$invoke$2.label = 4;
        objJ = rVar3.f31073b.j(size, size4, z17, e12, aVar2.f31082b, scanVehicleUC$invoke$2);
        if (objJ == coroutineSingletons) {
            return coroutineSingletons;
        }
        objA = objJ;
        aVar3 = aVar2;
        aVar4 = (C8.a) objA;
        if (aVar3.f31081a) {
            return new C8.a.C0024a(new ScanCancelledException());
        }
        rVar3.f31079h.e0(new J8.r("scan_performed"));
        if (aVar4 instanceof C8.a.C0024a) {
            c0024a = (C8.a.C0024a) aVar4;
        } else {
            c0024a = null;
        }
        return new C8.a.b(new b(list2, c0024a != null ? c0024a.f2462a : null));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x010a  */
    /* JADX WARN: Code duplicated, block: B:27:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x012e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0146  */
    /* JADX WARN: Code duplicated, block: B:33:0x014c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:0x015a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x017a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x0219 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x021a  */
    /* JADX WARN: Code duplicated, block: B:64:0x022e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0235  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x021a -> B:62:0x0226). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r20, Ia.p r21, boolean r22, boolean r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.vehicle.r.c(java.util.List, Ia.p, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
