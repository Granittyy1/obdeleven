package com.voltasit.obdeleven.domain.usecases;

import G8.I;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.q0;
import org.json.JSONException;
import org.json.JSONObject;
import p134k8.a2;

/* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VehicleClearFaultsUseCase extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.x f30622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p084g8.b f30623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K8.v f30624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J8.a f30625f;

    /* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
    public static final class ClearCancelledException extends Exception {
        public ClearCancelledException() {
            super("Clear cancelled");
        }
    }

    /* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f30626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f30628c;

        public a(int i10, int i11, Throwable th) {
            this.f30626a = i10;
            this.f30627b = i11;
            this.f30628c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30626a == aVar.f30626a && this.f30627b == aVar.f30627b && kotlin.jvm.internal.i.a(this.f30628c, aVar.f30628c);
        }

        public final int hashCode() {
            int iB = p005a4.q.b(this.f30627b, Integer.hashCode(this.f30626a) * 31, 31);
            Throwable th = this.f30628c;
            return iB + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            return "ClearResult(faultsBeforeClearCount=" + this.f30626a + ", clearedControlUnitsCount=" + this.f30627b + ", error=" + this.f30628c + ")";
        }
    }

    /* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ia.p<I, kotlin.coroutines.c<? super Boolean>, Object> f30629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a2 f30630b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ia.p<? super I, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> progressCallback, a2 vehicle) {
            kotlin.jvm.internal.i.e(progressCallback, "progressCallback");
            kotlin.jvm.internal.i.e(vehicle, "vehicle");
            this.f30629a = progressCallback;
            this.f30630b = vehicle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.i.a(this.f30629a, bVar.f30629a) && kotlin.jvm.internal.i.a(this.f30630b, bVar.f30630b);
        }

        public final int hashCode() {
            return this.f30630b.hashCode() + (this.f30629a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(progressCallback=" + this.f30629a + ", vehicle=" + this.f30630b + ")";
        }
    }

    public VehicleClearFaultsUseCase(J8.x xVar, p084g8.b bVar, K8.v vVar, J8.a aVar) {
        this.f30622c = xVar;
        this.f30623d = bVar;
        this.f30624e = vVar;
        this.f30625f = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:26:0x0123 A[LOOP:0: B:22:0x00d1->B:26:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0146  */
    /* JADX WARN: Code duplicated, block: B:33:0x0157  */
    /* JADX WARN: Code duplicated, block: B:35:0x0162  */
    /* JADX WARN: Code duplicated, block: B:37:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0184  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x01db  */
    /* JADX WARN: Code duplicated, block: B:50:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x021a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x021b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x021b -> B:54:0x0225). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:35:0x0162
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i0(java.util.List r18, com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase.b r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase.i0(java.util.List, com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0135  */
    /* JADX WARN: Code duplicated, block: B:38:0x013a  */
    /* JADX WARN: Code duplicated, block: B:40:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x015b  */
    /* JADX WARN: Code duplicated, block: B:45:0x016a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x016b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0174  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0190  */
    /* JADX WARN: Code duplicated, block: B:54:0x0199  */
    /* JADX WARN: Code duplicated, block: B:56:0x01af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object j0(b bVar, ContinuationImpl continuationImpl) throws Throwable {
        VehicleClearFaultsUseCase$execute$1 vehicleClearFaultsUseCase$execute$1;
        VehicleClearFaultsUseCase vehicleClearFaultsUseCase;
        C8.a aVar;
        ArrayList arrayList;
        List<? extends p109i8.e> list;
        VehicleClearFaultsUseCase vehicleClearFaultsUseCase2;
        boolean zBooleanValue;
        HistoryDB historyDBK;
        int i10;
        VehicleClearFaultsUseCase vehicleClearFaultsUseCase3;
        List<? extends p109i8.e> list2;
        HistoryDB historyDB;
        a aVar2;
        VehicleClearFaultsUseCase vehicleClearFaultsUseCase4;
        List<? extends p109i8.e> list3;
        a aVar3;
        if (continuationImpl instanceof VehicleClearFaultsUseCase$execute$1) {
            vehicleClearFaultsUseCase$execute$1 = (VehicleClearFaultsUseCase$execute$1) continuationImpl;
            int i11 = vehicleClearFaultsUseCase$execute$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vehicleClearFaultsUseCase$execute$1.label = i11 - Integer.MIN_VALUE;
            } else {
                vehicleClearFaultsUseCase$execute$1 = new VehicleClearFaultsUseCase$execute$1(this, continuationImpl);
            }
        } else {
            vehicleClearFaultsUseCase$execute$1 = new VehicleClearFaultsUseCase$execute$1(this, continuationImpl);
        }
        VehicleClearFaultsUseCase$execute$1 vehicleClearFaultsUseCase$execute$2 = vehicleClearFaultsUseCase$execute$1;
        Object objH = vehicleClearFaultsUseCase$execute$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (vehicleClearFaultsUseCase$execute$2.label) {
            case 0:
                kotlin.b.b(objH);
                O.e.j("VehicleClearFaultsUseCase", "Clearing faults for vehicle: " + bVar.f30630b.f42726c.d() + " " + bVar.f30630b.f42726c.e());
                vehicleClearFaultsUseCase$execute$2.L$0 = this;
                vehicleClearFaultsUseCase$execute$2.L$1 = bVar;
                vehicleClearFaultsUseCase$execute$2.label = 1;
                objH = this.f30622c.h(false, vehicleClearFaultsUseCase$execute$2);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase = this;
                aVar = (C8.a) objH;
                if (aVar instanceof C8.a.b) {
                    return aVar;
                }
                List list4 = (List) ((C8.a.b) aVar).f2463a;
                arrayList = new ArrayList();
                for (Object obj : list4) {
                    if (((ControlUnit) obj).f29337t) {
                        arrayList.add(obj);
                    }
                }
                Sa.b bVar2 = N.f43198a;
                q0 q0Var = kotlinx.coroutines.internal.q.f43500a;
                VehicleClearFaultsUseCase$execute$shouldCancel$1 vehicleClearFaultsUseCase$execute$shouldCancel$1 = new VehicleClearFaultsUseCase$execute$shouldCancel$1(bVar, arrayList, null);
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase;
                vehicleClearFaultsUseCase$execute$2.L$1 = bVar;
                vehicleClearFaultsUseCase$execute$2.L$2 = arrayList;
                vehicleClearFaultsUseCase$execute$2.label = 2;
                objH = C2680e.f(q0Var, vehicleClearFaultsUseCase$execute$shouldCancel$1, vehicleClearFaultsUseCase$execute$2);
                vehicleClearFaultsUseCase2 = vehicleClearFaultsUseCase;
                list = arrayList;
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zBooleanValue = ((Boolean) objH).booleanValue();
                historyDBK = vehicleClearFaultsUseCase2.f30623d.k();
                historyDBK.o(vehicleClearFaultsUseCase2.f30624e.L());
                historyDBK.setVehicle(bVar.f30630b.f42726c);
                historyDBK.put("type", HistoryDB.HistoryTypeValue.CLEAR.a());
                i10 = bVar.f30630b.f42726c.getInt("mileage");
                if (i10 > 0) {
                    historyDBK.m(i10);
                }
                if (zBooleanValue) {
                    vehicleClearFaultsUseCase$execute$2.L$0 = null;
                    vehicleClearFaultsUseCase$execute$2.L$1 = null;
                    vehicleClearFaultsUseCase$execute$2.L$2 = null;
                    vehicleClearFaultsUseCase$execute$2.label = 3;
                    if (vehicleClearFaultsUseCase2.k0(list, historyDBK, false, 0, 0, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(new CancellationException());
                }
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase2;
                vehicleClearFaultsUseCase$execute$2.L$1 = list;
                vehicleClearFaultsUseCase$execute$2.L$2 = historyDBK;
                vehicleClearFaultsUseCase$execute$2.label = 4;
                objH = vehicleClearFaultsUseCase2.i0(list, bVar, vehicleClearFaultsUseCase$execute$2);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase3 = vehicleClearFaultsUseCase2;
                list2 = list;
                historyDB = historyDBK;
                aVar2 = (a) objH;
                if (aVar2.f30628c != null) {
                    O.e.j("VehicleClearFaultsUseCase", "Clear operation failed");
                    vehicleClearFaultsUseCase$execute$2.L$0 = aVar2;
                    vehicleClearFaultsUseCase$execute$2.L$1 = null;
                    vehicleClearFaultsUseCase$execute$2.L$2 = null;
                    vehicleClearFaultsUseCase$execute$2.label = 5;
                    if (vehicleClearFaultsUseCase3.k0(list2, historyDB, false, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar3 = aVar2;
                    return new C8.a.C0024a(aVar3.f30628c);
                }
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase3;
                vehicleClearFaultsUseCase$execute$2.L$1 = list2;
                vehicleClearFaultsUseCase$execute$2.L$2 = null;
                vehicleClearFaultsUseCase$execute$2.label = 6;
                if (vehicleClearFaultsUseCase3.k0(list2, historyDB, true, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase4 = vehicleClearFaultsUseCase3;
                list3 = list2;
                O.e.j("VehicleClearFaultsUseCase", "Clear operation succeeded");
                vehicleClearFaultsUseCase4.f30625f.e0(new J8.r("clear_performed"));
                return new C8.a.b(list3);
            case 1:
                bVar = (b) vehicleClearFaultsUseCase$execute$2.L$1;
                VehicleClearFaultsUseCase vehicleClearFaultsUseCase5 = (VehicleClearFaultsUseCase) vehicleClearFaultsUseCase$execute$2.L$0;
                kotlin.b.b(objH);
                vehicleClearFaultsUseCase = vehicleClearFaultsUseCase5;
                aVar = (C8.a) objH;
                if (aVar instanceof C8.a.b) {
                    return aVar;
                }
                List list5 = (List) ((C8.a.b) aVar).f2463a;
                arrayList = new ArrayList();
                while (r13.hasNext()) {
                    if (((ControlUnit) obj).f29337t) {
                        arrayList.add(obj);
                    }
                }
                Sa.b bVar3 = N.f43198a;
                q0 q0Var2 = kotlinx.coroutines.internal.q.f43500a;
                VehicleClearFaultsUseCase$execute$shouldCancel$1 vehicleClearFaultsUseCase$execute$shouldCancel$2 = new VehicleClearFaultsUseCase$execute$shouldCancel$1(bVar, arrayList, null);
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase;
                vehicleClearFaultsUseCase$execute$2.L$1 = bVar;
                vehicleClearFaultsUseCase$execute$2.L$2 = arrayList;
                vehicleClearFaultsUseCase$execute$2.label = 2;
                objH = C2680e.f(q0Var2, vehicleClearFaultsUseCase$execute$shouldCancel$2, vehicleClearFaultsUseCase$execute$2);
                vehicleClearFaultsUseCase2 = vehicleClearFaultsUseCase;
                list = arrayList;
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zBooleanValue = ((Boolean) objH).booleanValue();
                historyDBK = vehicleClearFaultsUseCase2.f30623d.k();
                historyDBK.o(vehicleClearFaultsUseCase2.f30624e.L());
                historyDBK.setVehicle(bVar.f30630b.f42726c);
                historyDBK.put("type", HistoryDB.HistoryTypeValue.CLEAR.a());
                i10 = bVar.f30630b.f42726c.getInt("mileage");
                if (i10 > 0) {
                    historyDBK.m(i10);
                }
                if (zBooleanValue) {
                    vehicleClearFaultsUseCase$execute$2.L$0 = null;
                    vehicleClearFaultsUseCase$execute$2.L$1 = null;
                    vehicleClearFaultsUseCase$execute$2.L$2 = null;
                    vehicleClearFaultsUseCase$execute$2.label = 3;
                    if (vehicleClearFaultsUseCase2.k0(list, historyDBK, false, 0, 0, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(new CancellationException());
                }
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase2;
                vehicleClearFaultsUseCase$execute$2.L$1 = list;
                vehicleClearFaultsUseCase$execute$2.L$2 = historyDBK;
                vehicleClearFaultsUseCase$execute$2.label = 4;
                objH = vehicleClearFaultsUseCase2.i0(list, bVar, vehicleClearFaultsUseCase$execute$2);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase3 = vehicleClearFaultsUseCase2;
                list2 = list;
                historyDB = historyDBK;
                aVar2 = (a) objH;
                if (aVar2.f30628c != null) {
                    O.e.j("VehicleClearFaultsUseCase", "Clear operation failed");
                    vehicleClearFaultsUseCase$execute$2.L$0 = aVar2;
                    vehicleClearFaultsUseCase$execute$2.L$1 = null;
                    vehicleClearFaultsUseCase$execute$2.L$2 = null;
                    vehicleClearFaultsUseCase$execute$2.label = 5;
                    if (vehicleClearFaultsUseCase3.k0(list2, historyDB, false, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar3 = aVar2;
                    return new C8.a.C0024a(aVar3.f30628c);
                }
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase3;
                vehicleClearFaultsUseCase$execute$2.L$1 = list2;
                vehicleClearFaultsUseCase$execute$2.L$2 = null;
                vehicleClearFaultsUseCase$execute$2.label = 6;
                if (vehicleClearFaultsUseCase3.k0(list2, historyDB, true, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase4 = vehicleClearFaultsUseCase3;
                list3 = list2;
                O.e.j("VehicleClearFaultsUseCase", "Clear operation succeeded");
                vehicleClearFaultsUseCase4.f30625f.e0(new J8.r("clear_performed"));
                return new C8.a.b(list3);
            case 2:
                List<? extends p109i8.e> list6 = (List) vehicleClearFaultsUseCase$execute$2.L$2;
                b bVar4 = (b) vehicleClearFaultsUseCase$execute$2.L$1;
                VehicleClearFaultsUseCase vehicleClearFaultsUseCase6 = (VehicleClearFaultsUseCase) vehicleClearFaultsUseCase$execute$2.L$0;
                kotlin.b.b(objH);
                list = list6;
                bVar = bVar4;
                vehicleClearFaultsUseCase2 = vehicleClearFaultsUseCase6;
                zBooleanValue = ((Boolean) objH).booleanValue();
                historyDBK = vehicleClearFaultsUseCase2.f30623d.k();
                historyDBK.o(vehicleClearFaultsUseCase2.f30624e.L());
                historyDBK.setVehicle(bVar.f30630b.f42726c);
                historyDBK.put("type", HistoryDB.HistoryTypeValue.CLEAR.a());
                i10 = bVar.f30630b.f42726c.getInt("mileage");
                if (i10 > 0) {
                    historyDBK.m(i10);
                }
                if (zBooleanValue) {
                    vehicleClearFaultsUseCase$execute$2.L$0 = null;
                    vehicleClearFaultsUseCase$execute$2.L$1 = null;
                    vehicleClearFaultsUseCase$execute$2.L$2 = null;
                    vehicleClearFaultsUseCase$execute$2.label = 3;
                    if (vehicleClearFaultsUseCase2.k0(list, historyDBK, false, 0, 0, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(new CancellationException());
                }
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase2;
                vehicleClearFaultsUseCase$execute$2.L$1 = list;
                vehicleClearFaultsUseCase$execute$2.L$2 = historyDBK;
                vehicleClearFaultsUseCase$execute$2.label = 4;
                objH = vehicleClearFaultsUseCase2.i0(list, bVar, vehicleClearFaultsUseCase$execute$2);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase3 = vehicleClearFaultsUseCase2;
                list2 = list;
                historyDB = historyDBK;
                aVar2 = (a) objH;
                if (aVar2.f30628c != null) {
                    O.e.j("VehicleClearFaultsUseCase", "Clear operation failed");
                    vehicleClearFaultsUseCase$execute$2.L$0 = aVar2;
                    vehicleClearFaultsUseCase$execute$2.L$1 = null;
                    vehicleClearFaultsUseCase$execute$2.L$2 = null;
                    vehicleClearFaultsUseCase$execute$2.label = 5;
                    if (vehicleClearFaultsUseCase3.k0(list2, historyDB, false, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar3 = aVar2;
                    return new C8.a.C0024a(aVar3.f30628c);
                }
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase3;
                vehicleClearFaultsUseCase$execute$2.L$1 = list2;
                vehicleClearFaultsUseCase$execute$2.L$2 = null;
                vehicleClearFaultsUseCase$execute$2.label = 6;
                if (vehicleClearFaultsUseCase3.k0(list2, historyDB, true, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase4 = vehicleClearFaultsUseCase3;
                list3 = list2;
                O.e.j("VehicleClearFaultsUseCase", "Clear operation succeeded");
                vehicleClearFaultsUseCase4.f30625f.e0(new J8.r("clear_performed"));
                return new C8.a.b(list3);
            case 3:
                kotlin.b.b(objH);
                return new C8.a.C0024a(new CancellationException());
            case 4:
                HistoryDB historyDB2 = (HistoryDB) vehicleClearFaultsUseCase$execute$2.L$2;
                List<? extends p109i8.e> list7 = (List) vehicleClearFaultsUseCase$execute$2.L$1;
                VehicleClearFaultsUseCase vehicleClearFaultsUseCase7 = (VehicleClearFaultsUseCase) vehicleClearFaultsUseCase$execute$2.L$0;
                kotlin.b.b(objH);
                list2 = list7;
                historyDB = historyDB2;
                vehicleClearFaultsUseCase3 = vehicleClearFaultsUseCase7;
                aVar2 = (a) objH;
                if (aVar2.f30628c != null) {
                    O.e.j("VehicleClearFaultsUseCase", "Clear operation failed");
                    vehicleClearFaultsUseCase$execute$2.L$0 = aVar2;
                    vehicleClearFaultsUseCase$execute$2.L$1 = null;
                    vehicleClearFaultsUseCase$execute$2.L$2 = null;
                    vehicleClearFaultsUseCase$execute$2.label = 5;
                    if (vehicleClearFaultsUseCase3.k0(list2, historyDB, false, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar3 = aVar2;
                    return new C8.a.C0024a(aVar3.f30628c);
                }
                vehicleClearFaultsUseCase$execute$2.L$0 = vehicleClearFaultsUseCase3;
                vehicleClearFaultsUseCase$execute$2.L$1 = list2;
                vehicleClearFaultsUseCase$execute$2.L$2 = null;
                vehicleClearFaultsUseCase$execute$2.label = 6;
                if (vehicleClearFaultsUseCase3.k0(list2, historyDB, true, aVar2.f30627b, aVar2.f30626a, vehicleClearFaultsUseCase$execute$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleClearFaultsUseCase4 = vehicleClearFaultsUseCase3;
                list3 = list2;
                O.e.j("VehicleClearFaultsUseCase", "Clear operation succeeded");
                vehicleClearFaultsUseCase4.f30625f.e0(new J8.r("clear_performed"));
                return new C8.a.b(list3);
            case 5:
                aVar3 = (a) vehicleClearFaultsUseCase$execute$2.L$0;
                kotlin.b.b(objH);
                return new C8.a.C0024a(aVar3.f30628c);
            case 6:
                List<? extends p109i8.e> list8 = (List) vehicleClearFaultsUseCase$execute$2.L$1;
                VehicleClearFaultsUseCase vehicleClearFaultsUseCase8 = (VehicleClearFaultsUseCase) vehicleClearFaultsUseCase$execute$2.L$0;
                kotlin.b.b(objH);
                vehicleClearFaultsUseCase4 = vehicleClearFaultsUseCase8;
                list3 = list8;
                O.e.j("VehicleClearFaultsUseCase", "Clear operation succeeded");
                vehicleClearFaultsUseCase4.f30625f.e0(new J8.r("clear_performed"));
                return new C8.a.b(list3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object k0(List<? extends p109i8.e> list, HistoryDB historyDB, boolean z10, int i10, int i11, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((p109i8.e) it.next()).q().size();
        }
        historyDB.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("faultsAfter", size);
            jSONObject.put("faultsBefore", i11);
            jSONObject.put(MetricTracker.Action.COMPLETED, z10);
            jSONObject.put("controlUnitCount", i10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        historyDB.put("data", jSONObject);
        historyDB.a();
        C8.a aVarA = this.f30623d.a(historyDB);
        return aVarA == CoroutineSingletons.f43038b ? aVarA : p293xa.r.f47939a;
    }
}
