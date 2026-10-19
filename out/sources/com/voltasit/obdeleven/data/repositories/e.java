package com.voltasit.obdeleven.data.repositories;

import G8.C0704f;
import com.parse.ControlUnitDB;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p255u9.C2801d;
import p255u9.E;
import p304y9.C2828g;

/* JADX INFO: compiled from: ControlUnitRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements K8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.b f30339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A8.d f30340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F8.c f30341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J8.p f30342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f30343f = kotlin.collections.y.p();

    public e(com.voltasit.sharednetwork.a aVar, K8.b bVar, A8.e eVar, A8.h hVar, A8.c cVar, A8.d dVar, F8.c cVar2, J8.p pVar) {
        this.f30338a = aVar;
        this.f30339b = bVar;
        this.f30340c = dVar;
        this.f30341d = cVar2;
        this.f30342e = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.d
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        ControlUnitRepositoryImpl$getExistingControlUnitBB$1 controlUnitRepositoryImpl$getExistingControlUnitBB$1;
        e eVar;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getExistingControlUnitBB$1) {
            controlUnitRepositoryImpl$getExistingControlUnitBB$1 = (ControlUnitRepositoryImpl$getExistingControlUnitBB$1) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getExistingControlUnitBB$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getExistingControlUnitBB$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getExistingControlUnitBB$1 = new ControlUnitRepositoryImpl$getExistingControlUnitBB$1(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getExistingControlUnitBB$1 = new ControlUnitRepositoryImpl$getExistingControlUnitBB$1(this, continuationImpl);
        }
        Object objJ = controlUnitRepositoryImpl$getExistingControlUnitBB$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getExistingControlUnitBB$1.label;
        if (i11 == 0) {
            kotlin.b.b(objJ);
            this.f30342e.f("ControlUnitRepository", "getExistingControlUnitBB()");
            controlUnitRepositoryImpl$getExistingControlUnitBB$1.L$0 = this;
            controlUnitRepositoryImpl$getExistingControlUnitBB$1.label = 1;
            objJ = j(str, controlUnitRepositoryImpl$getExistingControlUnitBB$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) controlUnitRepositoryImpl$getExistingControlUnitBB$1.L$0;
            kotlin.b.b(objJ);
        }
        w9.d.a aVar = (w9.d.a) objJ;
        ParseException parseException = aVar.f47830a;
        if (parseException != null) {
            new C8.a.C0024a(eVar.f30341d.a(parseException));
        }
        Iterable iterable = aVar.f47831b;
        kotlin.jvm.internal.i.b(iterable);
        ArrayList<ControlUnitDB> arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C2801d controlUnitBase = ((ControlUnitDB) next).getControlUnitBase();
            if ((controlUnitBase != null ? controlUnitBase.a() : null) != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        for (ControlUnitDB controlUnitDB : arrayList) {
            C2801d controlUnitBase2 = controlUnitDB.getControlUnitBase();
            Short shA = controlUnitBase2 != null ? controlUnitBase2.a() : null;
            arrayList2.add(new Pair(new Short(shA == null ? (short) 0 : shA.shortValue()), controlUnitDB));
        }
        return new C8.a.b(kotlin.collections.y.w(arrayList2));
    }

    @Override // K8.d
    public final ControlUnitDB b(C2801d c2801d, E vehicle) {
        kotlin.jvm.internal.i.e(vehicle, "vehicle");
        ControlUnitDB controlUnitDB = new ControlUnitDB();
        controlUnitDB.setVehicle(vehicle);
        controlUnitDB.setControlUnitBase(c2801d);
        return controlUnitDB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.d
    public final Object c(List list, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ControlUnitRepositoryImpl$getControlUnitsForGateway$1 controlUnitRepositoryImpl$getControlUnitsForGateway$1;
        Task taskCallFunctionInBackground;
        e eVar;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getControlUnitsForGateway$1) {
            controlUnitRepositoryImpl$getControlUnitsForGateway$1 = (ControlUnitRepositoryImpl$getControlUnitsForGateway$1) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getControlUnitsForGateway$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getControlUnitsForGateway$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getControlUnitsForGateway$1 = new ControlUnitRepositoryImpl$getControlUnitsForGateway$1(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getControlUnitsForGateway$1 = new ControlUnitRepositoryImpl$getControlUnitsForGateway$1(this, continuationImpl);
        }
        Object obj = controlUnitRepositoryImpl$getControlUnitsForGateway$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getControlUnitsForGateway$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            HashMap map = new HashMap();
            char[] cArr = com.obdeleven.service.util.b.f29554a;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Short) it.next()).intValue();
                    arrayList.add(((65535 & iIntValue) >> 8) > 0 ? String.format("%04X", Integer.valueOf(iIntValue)) : String.format("%02X", Integer.valueOf(iIntValue)));
                }
            }
            map.put("vehicleId", str);
            map.put("gatewayType", str2);
            map.put("controlUnitIds", arrayList);
            map.put("params", str3);
            taskCallFunctionInBackground = ParseCloud.callFunctionInBackground("findControlUnitsForGateway", map);
            Sa.a aVar = N.f43200c;
            ControlUnitRepositoryImpl$getControlUnitsForGateway$2 controlUnitRepositoryImpl$getControlUnitsForGateway$2 = new ControlUnitRepositoryImpl$getControlUnitsForGateway$2(taskCallFunctionInBackground, this, null);
            controlUnitRepositoryImpl$getControlUnitsForGateway$1.L$0 = this;
            controlUnitRepositoryImpl$getControlUnitsForGateway$1.L$1 = taskCallFunctionInBackground;
            controlUnitRepositoryImpl$getControlUnitsForGateway$1.label = 1;
            if (C2680e.f(aVar, controlUnitRepositoryImpl$getControlUnitsForGateway$2, controlUnitRepositoryImpl$getControlUnitsForGateway$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskCallFunctionInBackground = (Task) controlUnitRepositoryImpl$getControlUnitsForGateway$1.L$1;
            eVar = (e) controlUnitRepositoryImpl$getControlUnitsForGateway$1.L$0;
            kotlin.b.b(obj);
        }
        if (taskCallFunctionInBackground.getError() != null) {
            F8.c cVar = eVar.f30341d;
            Exception error = taskCallFunctionInBackground.getError();
            kotlin.jvm.internal.i.d(error, "getError(...)");
            return new C8.a.C0024a(cVar.a(error));
        }
        Object map2 = (Map) taskCallFunctionInBackground.getResult();
        if (map2 == null) {
            map2 = new HashMap();
        }
        return new C8.a.b(map2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.d
    public final Object d(String str, ContinuationImpl continuationImpl) {
        ControlUnitRepositoryImpl$getControlUnitBase$1 controlUnitRepositoryImpl$getControlUnitBase$1;
        e eVar;
        Object obj;
        p293xa.p pVar;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getControlUnitBase$1) {
            controlUnitRepositoryImpl$getControlUnitBase$1 = (ControlUnitRepositoryImpl$getControlUnitBase$1) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getControlUnitBase$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getControlUnitBase$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getControlUnitBase$1 = new ControlUnitRepositoryImpl$getControlUnitBase$1(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getControlUnitBase$1 = new ControlUnitRepositoryImpl$getControlUnitBase$1(this, continuationImpl);
        }
        Object objG = controlUnitRepositoryImpl$getControlUnitBase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getControlUnitBase$1.label;
        if (i11 == 0) {
            kotlin.b.b(objG);
            C0704f c0704f = (C0704f) this.f30339b.a(new p279w9.a("CONTROL_UNIT_BASEScontrolUnitBaseMap", 604800000L)).get(str);
            if (c0704f != null) {
                return new C8.a.b(c0704f);
            }
            controlUnitRepositoryImpl$getControlUnitBase$1.L$0 = this;
            controlUnitRepositoryImpl$getControlUnitBase$1.L$1 = str;
            controlUnitRepositoryImpl$getControlUnitBase$1.label = 1;
            objG = g(controlUnitRepositoryImpl$getControlUnitBase$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) controlUnitRepositoryImpl$getControlUnitBase$1.L$1;
            eVar = (e) controlUnitRepositoryImpl$getControlUnitBase$1.L$0;
            kotlin.b.b(objG);
        }
        C8.a aVar = (C8.a) objG;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return new C8.a.C0024a(eVar.f30341d.a(((C8.a.C0024a) aVar).f2462a));
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = ((Iterable) ((C8.a.b) aVar).f2463a).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            short s10 = ((C0704f) next).f3487c;
            kotlin.jvm.internal.i.e(str, "<this>");
            p293xa.k kVarM = F8.a.m(16, str);
            if (kVarM != null) {
                int i12 = kVarM.f47926b;
                if (Integer.compareUnsigned(i12, 65535) > 0) {
                    pVar = null;
                } else {
                    pVar = new p293xa.p((short) i12);
                }
            } else {
                pVar = null;
            }
            if (pVar == null) {
                kotlin.text.l.x(str);
                throw null;
            }
            if (s10 == pVar.f47935b) {
                obj = next;
                break;
            }
        }
        C0704f c0704f2 = (C0704f) obj;
        return c0704f2 == null ? new C8.a.C0024a(new NotFoundException(B7.b.c("ControlUnitBase with klineId: ", str))) : new C8.a.b(c0704f2);
    }

    @Override // K8.d
    public final Object e(String str, ContinuationImpl continuationImpl) {
        p279w9.a aVar = new p279w9.a(B7.b.c("CONTROL_UNITS", str), 3600000L);
        List list = (List) Application.f29634b.e(aVar);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return i(aVar, str, continuationImpl);
        }
        kotlin.jvm.internal.i.b(list);
        return new C8.a.b(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    @Override // K8.d
    public final Object f(ContinuationImpl continuationImpl) throws Throwable {
        ControlUnitRepositoryImpl$getControlUnitBasesDB$1 controlUnitRepositoryImpl$getControlUnitBasesDB$1;
        e eVar;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getControlUnitBasesDB$1) {
            controlUnitRepositoryImpl$getControlUnitBasesDB$1 = (ControlUnitRepositoryImpl$getControlUnitBasesDB$1) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getControlUnitBasesDB$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getControlUnitBasesDB$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getControlUnitBasesDB$1 = new ControlUnitRepositoryImpl$getControlUnitBasesDB$1(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getControlUnitBasesDB$1 = new ControlUnitRepositoryImpl$getControlUnitBasesDB$1(this, continuationImpl);
        }
        Object objH = controlUnitRepositoryImpl$getControlUnitBasesDB$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getControlUnitBasesDB$1.label;
        if (i11 == 0) {
            kotlin.b.b(objH);
            this.f30342e.f("ControlUnitRepository", "getControlUnitBasesDB()");
            if (!this.f30343f.isEmpty()) {
                Object obj = this.f30343f;
                kotlin.jvm.internal.i.b(obj);
                return new C8.a.b(obj);
            }
            controlUnitRepositoryImpl$getControlUnitBasesDB$1.L$0 = this;
            controlUnitRepositoryImpl$getControlUnitBasesDB$1.label = 1;
            objH = h(controlUnitRepositoryImpl$getControlUnitBasesDB$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) controlUnitRepositoryImpl$getControlUnitBasesDB$1.L$0;
            kotlin.b.b(objH);
        }
        w9.d.a aVar = (w9.d.a) objH;
        ParseException parseException = aVar.f47830a;
        if (parseException != null) {
            new C8.a.C0024a(eVar.f30341d.a(parseException));
        }
        Iterable<C2801d> iterable = aVar.f47831b;
        kotlin.jvm.internal.i.b(iterable);
        eVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C2801d c2801d : iterable) {
            linkedHashMap.put(c2801d.a(), c2801d);
        }
        eVar.f30343f = linkedHashMap;
        return new C8.a.b(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        ControlUnitRepositoryImpl$getControlUnitBases$3 controlUnitRepositoryImpl$getControlUnitBases$3;
        e eVar;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getControlUnitBases$3) {
            controlUnitRepositoryImpl$getControlUnitBases$3 = (ControlUnitRepositoryImpl$getControlUnitBases$3) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getControlUnitBases$3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getControlUnitBases$3.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getControlUnitBases$3 = new ControlUnitRepositoryImpl$getControlUnitBases$3(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getControlUnitBases$3 = new ControlUnitRepositoryImpl$getControlUnitBases$3(this, continuationImpl);
        }
        Object objU = controlUnitRepositoryImpl$getControlUnitBases$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getControlUnitBases$3.label;
        if (i11 == 0) {
            kotlin.b.b(objU);
            Map mapA = this.f30339b.a(new p279w9.a("CONTROL_UNIT_BASEScontrolUnitBaseMap", 604800000L));
            if (!mapA.isEmpty()) {
                return new C8.a.b(kotlin.collections.q.o0(mapA.values()));
            }
            try {
                com.voltasit.sharednetwork.a aVar = this.f30338a;
                controlUnitRepositoryImpl$getControlUnitBases$3.L$0 = this;
                controlUnitRepositoryImpl$getControlUnitBases$3.label = 1;
                objU = aVar.u(controlUnitRepositoryImpl$getControlUnitBases$3);
                if (objU == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar = this;
            } catch (Throwable th) {
                th = th;
                eVar = this;
                return new C8.a.C0024a(eVar.f30341d.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) controlUnitRepositoryImpl$getControlUnitBases$3.L$0;
            try {
                kotlin.b.b(objU);
            } catch (Throwable th2) {
                th = th2;
                return new C8.a.C0024a(eVar.f30341d.a(th));
            }
        }
        List list = (List) objU;
        ArrayList<C0704f> arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(eVar.f30340c.a((C2828g) it.next()));
        }
        K8.b bVar = eVar.f30339b;
        p279w9.a aVar2 = new p279w9.a("CONTROL_UNIT_BASEScontrolUnitBaseMap", 604800000L);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        for (C0704f c0704f : arrayList) {
            arrayList2.add(new Pair(new p293xa.p(c0704f.f3487c), c0704f));
        }
        bVar.j(aVar2, kotlin.collections.y.w(arrayList2));
        return new C8.a.b(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ContinuationImpl continuationImpl) throws Throwable {
        ControlUnitRepositoryImpl$getControlUnitBasesFromQuery$1 controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getControlUnitBasesFromQuery$1) {
            controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1 = (ControlUnitRepositoryImpl$getControlUnitBasesFromQuery$1) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1 = new ControlUnitRepositoryImpl$getControlUnitBasesFromQuery$1(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1 = new ControlUnitRepositoryImpl$getControlUnitBasesFromQuery$1(this, continuationImpl);
        }
        Object objF = controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            p279w9.a aVar = p279w9.a.j;
            ParseQuery query = ParseQuery.getQuery(C2801d.class);
            query.whereExists("klineId");
            query.include("texttable");
            query.setLimit(500);
            Sa.a aVar2 = N.f43200c;
            ControlUnitRepositoryImpl$getControlUnitBasesFromQuery$2 controlUnitRepositoryImpl$getControlUnitBasesFromQuery$2 = new ControlUnitRepositoryImpl$getControlUnitBasesFromQuery$2(query, aVar, null);
            controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1.label = 1;
            objF = C2680e.f(aVar2, controlUnitRepositoryImpl$getControlUnitBasesFromQuery$2, controlUnitRepositoryImpl$getControlUnitBasesFromQuery$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objF);
        }
        kotlin.jvm.internal.i.d(objF, "withContext(...)");
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(p279w9.a aVar, String str, ContinuationImpl continuationImpl) throws Throwable {
        ControlUnitRepositoryImpl$getControlUnitsFromDatabase$1 controlUnitRepositoryImpl$getControlUnitsFromDatabase$1;
        e eVar;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getControlUnitsFromDatabase$1) {
            controlUnitRepositoryImpl$getControlUnitsFromDatabase$1 = (ControlUnitRepositoryImpl$getControlUnitsFromDatabase$1) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getControlUnitsFromDatabase$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getControlUnitsFromDatabase$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getControlUnitsFromDatabase$1 = new ControlUnitRepositoryImpl$getControlUnitsFromDatabase$1(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getControlUnitsFromDatabase$1 = new ControlUnitRepositoryImpl$getControlUnitsFromDatabase$1(this, continuationImpl);
        }
        Object objF = controlUnitRepositoryImpl$getControlUnitsFromDatabase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getControlUnitsFromDatabase$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            ParseQuery query = ParseQuery.getQuery(ControlUnitDB.class);
            E e10 = new E();
            e10.setObjectId(str);
            query.whereEqualTo("vehicle", e10);
            query.whereDoesNotExist("parent");
            query.include("controlUnitBase");
            query.include("controlUnitBase.texttable");
            query.setLimit(100);
            Sa.a aVar2 = N.f43200c;
            ControlUnitRepositoryImpl$getControlUnitsFromDatabase$results$1 controlUnitRepositoryImpl$getControlUnitsFromDatabase$results$1 = new ControlUnitRepositoryImpl$getControlUnitsFromDatabase$results$1(query, aVar, null);
            controlUnitRepositoryImpl$getControlUnitsFromDatabase$1.L$0 = this;
            controlUnitRepositoryImpl$getControlUnitsFromDatabase$1.label = 1;
            objF = C2680e.f(aVar2, controlUnitRepositoryImpl$getControlUnitsFromDatabase$results$1, controlUnitRepositoryImpl$getControlUnitsFromDatabase$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) controlUnitRepositoryImpl$getControlUnitsFromDatabase$1.L$0;
            kotlin.b.b(objF);
        }
        w9.d.a aVar3 = (w9.d.a) objF;
        ParseException parseException = aVar3.f47830a;
        if (parseException != null && parseException.getCode() == 101) {
            return new C8.a.b(EmptyList.f42983b);
        }
        ParseException parseException2 = aVar3.f47830a;
        if (parseException2 != null) {
            return new C8.a.C0024a(eVar.f30341d.a(parseException2));
        }
        Object obj = aVar3.f47831b;
        if (obj == null) {
            obj = EmptyList.f42983b;
        }
        return new C8.a.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, ContinuationImpl continuationImpl) throws Throwable {
        ControlUnitRepositoryImpl$getControlUnitsFromQuery$1 controlUnitRepositoryImpl$getControlUnitsFromQuery$1;
        if (continuationImpl instanceof ControlUnitRepositoryImpl$getControlUnitsFromQuery$1) {
            controlUnitRepositoryImpl$getControlUnitsFromQuery$1 = (ControlUnitRepositoryImpl$getControlUnitsFromQuery$1) continuationImpl;
            int i10 = controlUnitRepositoryImpl$getControlUnitsFromQuery$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitRepositoryImpl$getControlUnitsFromQuery$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitRepositoryImpl$getControlUnitsFromQuery$1 = new ControlUnitRepositoryImpl$getControlUnitsFromQuery$1(this, continuationImpl);
            }
        } else {
            controlUnitRepositoryImpl$getControlUnitsFromQuery$1 = new ControlUnitRepositoryImpl$getControlUnitsFromQuery$1(this, continuationImpl);
        }
        Object objF = controlUnitRepositoryImpl$getControlUnitsFromQuery$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitRepositoryImpl$getControlUnitsFromQuery$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            E e10 = new E();
            e10.setObjectId(str);
            ParseQuery query = ParseQuery.getQuery(ControlUnitDB.class);
            query.whereEqualTo("vehicle", e10);
            query.whereDoesNotExist("parent");
            query.include("controlUnitBase");
            query.include("controlUnitBase.texttable");
            query.setLimit(500);
            Sa.a aVar = N.f43200c;
            ControlUnitRepositoryImpl$getControlUnitsFromQuery$2 controlUnitRepositoryImpl$getControlUnitsFromQuery$2 = new ControlUnitRepositoryImpl$getControlUnitsFromQuery$2(query, null);
            controlUnitRepositoryImpl$getControlUnitsFromQuery$1.label = 1;
            objF = C2680e.f(aVar, controlUnitRepositoryImpl$getControlUnitsFromQuery$2, controlUnitRepositoryImpl$getControlUnitsFromQuery$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objF);
        }
        kotlin.jvm.internal.i.d(objF, "withContext(...)");
        return objF;
    }
}
