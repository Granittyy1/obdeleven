package com.voltasit.obdeleven.data.repositories;

import A8.A;
import G8.H;
import com.braze.Constants;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.parse.util.VehicleComparator$By;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p255u9.D;
import p255u9.E;
import p255u9.F;
import p255u9.z;

/* JADX INFO: compiled from: VehicleRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VehicleRepositoryImpl implements K8.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f30323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.b f30324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.o f30325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J8.p f30326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.f f30327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F8.c f30328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.channels.a<H> f30329g = kotlinx.coroutines.channels.b.a(1);

    /* JADX INFO: compiled from: VehicleRepositoryImpl.kt */
    public static final class NoVehicleBase extends Exception {
        public NoVehicleBase() {
            super("No vehicle base");
        }
    }

    public VehicleRepositoryImpl(A a10, K8.b bVar, K8.o oVar, J8.p pVar, com.voltasit.obdeleven.domain.usecases.vehicle.f fVar, F8.c cVar) {
        this.f30323a = a10;
        this.f30324b = bVar;
        this.f30325c = oVar;
        this.f30326d = pVar;
        this.f30327e = fVar;
        this.f30328f = cVar;
    }

    @Override // K8.x
    public final A a() {
        return this.f30323a;
    }

    @Override // K8.x
    public final Object b(List<D> list, kotlin.coroutines.c<? super C8.a<? extends List<? extends F>>> cVar) {
        int i10 = F.f47460b;
        ParseQuery query = ParseQuery.getQuery(F.class);
        query.whereContainedIn("vehicleBase", list);
        query.include("vehicleBase");
        query.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        return C2680e.f(N.f43200c, new VehicleRepositoryImpl$getVehicleModificationList$2(p279w9.d.a(query, null, null), this, null), cVar);
    }

    @Override // K8.x
    public final Object c(String str, String str2, kotlin.coroutines.c<? super C8.a<? extends List<H>>> cVar) {
        HashMap map = new HashMap();
        map.put("vin", str);
        map.put("selectedVehicleModificationId", str2);
        map.put("auto", Boolean.FALSE);
        return C2680e.f(N.f43200c, new VehicleRepositoryImpl$submitVehicle$2(ParseCloud.callFunctionInBackground("submitVehicleV3", map), this, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // K8.x
    public final Object d(String str, ContinuationImpl continuationImpl) throws Throwable {
        VehicleRepositoryImpl$getVehicleById$1 vehicleRepositoryImpl$getVehicleById$1;
        VehicleRepositoryImpl vehicleRepositoryImpl;
        if (continuationImpl instanceof VehicleRepositoryImpl$getVehicleById$1) {
            vehicleRepositoryImpl$getVehicleById$1 = (VehicleRepositoryImpl$getVehicleById$1) continuationImpl;
            int i10 = vehicleRepositoryImpl$getVehicleById$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vehicleRepositoryImpl$getVehicleById$1.label = i10 - Integer.MIN_VALUE;
            } else {
                vehicleRepositoryImpl$getVehicleById$1 = new VehicleRepositoryImpl$getVehicleById$1(this, continuationImpl);
            }
        } else {
            vehicleRepositoryImpl$getVehicleById$1 = new VehicleRepositoryImpl$getVehicleById$1(this, continuationImpl);
        }
        Object objI = vehicleRepositoryImpl$getVehicleById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = vehicleRepositoryImpl$getVehicleById$1.label;
        if (i11 == 0) {
            kotlin.b.b(objI);
            vehicleRepositoryImpl$getVehicleById$1.L$0 = this;
            vehicleRepositoryImpl$getVehicleById$1.label = 1;
            objI = i(str, vehicleRepositoryImpl$getVehicleById$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
            vehicleRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vehicleRepositoryImpl = (VehicleRepositoryImpl) vehicleRepositoryImpl$getVehicleById$1.L$0;
            kotlin.b.b(objI);
        }
        C8.a aVar = (C8.a) objI;
        if (aVar instanceof C8.a.b) {
            A a10 = vehicleRepositoryImpl.f30323a;
            return new C8.a.b(A.i((E) ((C8.a.b) aVar).f2463a));
        }
        if (aVar instanceof C8.a.C0024a) {
            return new C8.a.C0024a(vehicleRepositoryImpl.f30328f.a(((C8.a.C0024a) aVar).f2462a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // K8.x
    public final void e(E vehicleDb) {
        kotlin.jvm.internal.i.e(vehicleDb, "vehicleDb");
        p279w9.a aVar = p279w9.a.f47817o;
        K8.b bVar = this.f30324b;
        Object objC = bVar.c(aVar, false);
        if (objC instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (E e10 : (List) objC) {
                if (!kotlin.jvm.internal.i.a(e10.getObjectId(), vehicleDb.getObjectId())) {
                    arrayList.add(e10);
                }
            }
            arrayList.add(vehicleDb);
            bVar.j(aVar, arrayList);
        }
    }

    @Override // K8.x
    public final Object f(H h8, SuspendLambda suspendLambda) throws Throwable {
        Object objF = C2680e.f(N.f43200c, new VehicleRepositoryImpl$updateVehicle$2(this, h8, null), suspendLambda);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }

    @Override // K8.x
    public final void g(E vehicleDb, F vehicleModificationDB) {
        kotlin.jvm.internal.i.e(vehicleDb, "vehicleDb");
        kotlin.jvm.internal.i.e(vehicleModificationDB, "vehicleModificationDB");
        vehicleDb.put("vehicleModification", vehicleModificationDB);
        vehicleDb.saveInBackground();
    }

    @Override // K8.x
    public final kotlinx.coroutines.channels.a<H> h() {
        return this.f30329g;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.x
    public final Object i(String str, ContinuationImpl continuationImpl) throws Throwable {
        VehicleRepositoryImpl$getVehicleDBById$1 vehicleRepositoryImpl$getVehicleDBById$1;
        VehicleRepositoryImpl vehicleRepositoryImpl;
        Object next;
        String str2;
        E e10;
        VehicleRepositoryImpl vehicleRepositoryImpl2;
        w9.d.a aVar;
        ParseException parseException;
        if (continuationImpl instanceof VehicleRepositoryImpl$getVehicleDBById$1) {
            vehicleRepositoryImpl$getVehicleDBById$1 = (VehicleRepositoryImpl$getVehicleDBById$1) continuationImpl;
            int i10 = vehicleRepositoryImpl$getVehicleDBById$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vehicleRepositoryImpl$getVehicleDBById$1.label = i10 - Integer.MIN_VALUE;
            } else {
                vehicleRepositoryImpl$getVehicleDBById$1 = new VehicleRepositoryImpl$getVehicleDBById$1(this, continuationImpl);
            }
        } else {
            vehicleRepositoryImpl$getVehicleDBById$1 = new VehicleRepositoryImpl$getVehicleDBById$1(this, continuationImpl);
        }
        Object objF = vehicleRepositoryImpl$getVehicleDBById$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = vehicleRepositoryImpl$getVehicleDBById$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                e10 = (E) vehicleRepositoryImpl$getVehicleDBById$1.L$2;
                str2 = (String) vehicleRepositoryImpl$getVehicleDBById$1.L$1;
                vehicleRepositoryImpl = (VehicleRepositoryImpl) vehicleRepositoryImpl$getVehicleDBById$1.L$0;
                kotlin.b.b(objF);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vehicleRepositoryImpl2 = (VehicleRepositoryImpl) vehicleRepositoryImpl$getVehicleDBById$1.L$0;
                kotlin.b.b(objF);
            }
            aVar = (w9.d.a) objF;
            parseException = aVar.f47830a;
            if (parseException != null) {
                return new C8.a.C0024a(vehicleRepositoryImpl2.f30328f.a(parseException));
            }
            List<T> list = aVar.f47831b;
            return list.isEmpty() ? new C8.a.C0024a(new Exception("Not found")) : new C8.a.b(list.get(0));
        }
        kotlin.b.b(objF);
        Object objC = this.f30324b.c(p279w9.a.f47817o, false);
        if (objC instanceof List) {
            Iterator it = ((List) objC).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.i.a(((E) next).getObjectId(), str));
            E e11 = (E) next;
            if (e11 != null) {
                this.f30326d.e("VehicleRepositoryImpl", androidx.compose.foundation.gestures.d.b("Found vehicle with id ", str, " in cache"));
                D dI = e11.i();
                if (dI != null && dI.isDataAvailable()) {
                    return new C8.a.b(e11);
                }
                D dI2 = e11.i();
                String objectId = dI2 != null ? dI2.getObjectId() : null;
                if (objectId == null) {
                    objectId = "";
                }
                vehicleRepositoryImpl$getVehicleDBById$1.L$0 = this;
                vehicleRepositoryImpl$getVehicleDBById$1.L$1 = str;
                vehicleRepositoryImpl$getVehicleDBById$1.L$2 = e11;
                vehicleRepositoryImpl$getVehicleDBById$1.label = 1;
                Object objO = this.f30327e.f31047a.o(objectId, vehicleRepositoryImpl$getVehicleDBById$1);
                if (objO == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vehicleRepositoryImpl = this;
                str2 = str;
                e10 = e11;
                objF = objO;
            }
            int i12 = E.f47459b;
            int i13 = z.f47484b;
            ParseQuery<T> query = ((z) ParseUser.getCurrentUser()).b().getQuery();
            query.whereEqualTo("objectId", str);
            query.include("vehicleModification");
            query.include("vehicleBase");
            query.include("engine");
            query.include("equipment");
            p279w9.a aVar2 = new p279w9.a(B7.b.c("VEHICLE_LIST", str), 3600000L);
            Sa.a aVar3 = N.f43200c;
            VehicleRepositoryImpl$getVehicleDBById$result$1 vehicleRepositoryImpl$getVehicleDBById$result$1 = new VehicleRepositoryImpl$getVehicleDBById$result$1(query, aVar2, null);
            vehicleRepositoryImpl$getVehicleDBById$1.L$0 = vehicleRepositoryImpl;
            vehicleRepositoryImpl$getVehicleDBById$1.L$1 = null;
            vehicleRepositoryImpl$getVehicleDBById$1.L$2 = null;
            vehicleRepositoryImpl$getVehicleDBById$1.label = 2;
            objF = C2680e.f(aVar3, vehicleRepositoryImpl$getVehicleDBById$result$1, vehicleRepositoryImpl$getVehicleDBById$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            vehicleRepositoryImpl2 = vehicleRepositoryImpl;
            aVar = (w9.d.a) objF;
            parseException = aVar.f47830a;
            if (parseException != null) {
                return new C8.a.C0024a(vehicleRepositoryImpl2.f30328f.a(parseException));
            }
            List<T> list2 = aVar.f47831b;
            if (list2.isEmpty()) {
            }
        }
        vehicleRepositoryImpl = this;
        int i14 = E.f47459b;
        int i15 = z.f47484b;
        ParseQuery<T> query2 = ((z) ParseUser.getCurrentUser()).b().getQuery();
        query2.whereEqualTo("objectId", str);
        query2.include("vehicleModification");
        query2.include("vehicleBase");
        query2.include("engine");
        query2.include("equipment");
        p279w9.a aVar4 = new p279w9.a(B7.b.c("VEHICLE_LIST", str), 3600000L);
        Sa.a aVar5 = N.f43200c;
        VehicleRepositoryImpl$getVehicleDBById$result$1 vehicleRepositoryImpl$getVehicleDBById$result$2 = new VehicleRepositoryImpl$getVehicleDBById$result$1(query2, aVar4, null);
        vehicleRepositoryImpl$getVehicleDBById$1.L$0 = vehicleRepositoryImpl;
        vehicleRepositoryImpl$getVehicleDBById$1.L$1 = null;
        vehicleRepositoryImpl$getVehicleDBById$1.L$2 = null;
        vehicleRepositoryImpl$getVehicleDBById$1.label = 2;
        objF = C2680e.f(aVar5, vehicleRepositoryImpl$getVehicleDBById$result$2, vehicleRepositoryImpl$getVehicleDBById$1);
        if (objF == coroutineSingletons) {
            return coroutineSingletons;
        }
        vehicleRepositoryImpl2 = vehicleRepositoryImpl;
        aVar = (w9.d.a) objF;
        parseException = aVar.f47830a;
        if (parseException != null) {
            return new C8.a.C0024a(vehicleRepositoryImpl2.f30328f.a(parseException));
        }
        List<T> list3 = aVar.f47831b;
        if (list3.isEmpty()) {
        }
        C8.a aVar6 = (C8.a) objF;
        if (aVar6 instanceof C8.a.b) {
            e10.put("vehicleBase", (D) ((C8.a.b) aVar6).f2463a);
            return new C8.a.b(e10);
        }
        str = str2;
        int i16 = E.f47459b;
        int i17 = z.f47484b;
        ParseQuery<T> query3 = ((z) ParseUser.getCurrentUser()).b().getQuery();
        query3.whereEqualTo("objectId", str);
        query3.include("vehicleModification");
        query3.include("vehicleBase");
        query3.include("engine");
        query3.include("equipment");
        p279w9.a aVar7 = new p279w9.a(B7.b.c("VEHICLE_LIST", str), 3600000L);
        Sa.a aVar8 = N.f43200c;
        VehicleRepositoryImpl$getVehicleDBById$result$1 vehicleRepositoryImpl$getVehicleDBById$result$3 = new VehicleRepositoryImpl$getVehicleDBById$result$1(query3, aVar7, null);
        vehicleRepositoryImpl$getVehicleDBById$1.L$0 = vehicleRepositoryImpl;
        vehicleRepositoryImpl$getVehicleDBById$1.L$1 = null;
        vehicleRepositoryImpl$getVehicleDBById$1.L$2 = null;
        vehicleRepositoryImpl$getVehicleDBById$1.label = 2;
        objF = C2680e.f(aVar8, vehicleRepositoryImpl$getVehicleDBById$result$3, vehicleRepositoryImpl$getVehicleDBById$1);
        if (objF == coroutineSingletons) {
            return coroutineSingletons;
        }
        vehicleRepositoryImpl2 = vehicleRepositoryImpl;
        aVar = (w9.d.a) objF;
        parseException = aVar.f47830a;
        if (parseException != null) {
            return new C8.a.C0024a(vehicleRepositoryImpl2.f30328f.a(parseException));
        }
        List<T> list4 = aVar.f47831b;
        if (list4.isEmpty()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.x
    public final Object j(ContinuationImpl continuationImpl) throws Throwable {
        VehicleRepositoryImpl$getUserVehicles$1 vehicleRepositoryImpl$getUserVehicles$1;
        VehicleRepositoryImpl vehicleRepositoryImpl;
        if (continuationImpl instanceof VehicleRepositoryImpl$getUserVehicles$1) {
            vehicleRepositoryImpl$getUserVehicles$1 = (VehicleRepositoryImpl$getUserVehicles$1) continuationImpl;
            int i10 = vehicleRepositoryImpl$getUserVehicles$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vehicleRepositoryImpl$getUserVehicles$1.label = i10 - Integer.MIN_VALUE;
            } else {
                vehicleRepositoryImpl$getUserVehicles$1 = new VehicleRepositoryImpl$getUserVehicles$1(this, continuationImpl);
            }
        } else {
            vehicleRepositoryImpl$getUserVehicles$1 = new VehicleRepositoryImpl$getUserVehicles$1(this, continuationImpl);
        }
        Object objF = vehicleRepositoryImpl$getUserVehicles$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = vehicleRepositoryImpl$getUserVehicles$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            ParseQuery<E> parseQueryA = E.a();
            p279w9.a aVar = p279w9.a.f47807d;
            Sa.a aVar2 = N.f43200c;
            VehicleRepositoryImpl$getUserVehicles$result$1 vehicleRepositoryImpl$getUserVehicles$result$1 = new VehicleRepositoryImpl$getUserVehicles$result$1(parseQueryA, aVar, null);
            vehicleRepositoryImpl$getUserVehicles$1.L$0 = this;
            vehicleRepositoryImpl$getUserVehicles$1.label = 1;
            objF = C2680e.f(aVar2, vehicleRepositoryImpl$getUserVehicles$result$1, vehicleRepositoryImpl$getUserVehicles$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            vehicleRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vehicleRepositoryImpl = (VehicleRepositoryImpl) vehicleRepositoryImpl$getUserVehicles$1.L$0;
            kotlin.b.b(objF);
        }
        w9.d.a aVar3 = (w9.d.a) objF;
        ParseException parseException = aVar3.f47830a;
        if (parseException != null) {
            return new C8.a.C0024a(vehicleRepositoryImpl.f30328f.a(parseException));
        }
        Object obj = aVar3.f47831b;
        if (obj == null) {
            obj = EmptyList.f42983b;
        }
        return new C8.a.b(obj);
    }

    @Override // K8.x
    public final Object k(String str, kotlin.coroutines.c<? super C8.a<? extends List<? extends Object>>> cVar) {
        HashMap map = new HashMap();
        map.put("vin", str);
        map.put("auto", Boolean.FALSE);
        return C2680e.f(N.f43200c, new VehicleRepositoryImpl$getVehiclesByVin$2(ParseCloud.callFunctionInBackground("identifyVehicle", map), this, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.x
    public final Object l(int i10, int i11, String str, ContinuationImpl continuationImpl) throws Throwable {
        VehicleRepositoryImpl$getUserVehicles$2 vehicleRepositoryImpl$getUserVehicles$2;
        ParseQuery query;
        VehicleRepositoryImpl vehicleRepositoryImpl;
        if (continuationImpl instanceof VehicleRepositoryImpl$getUserVehicles$2) {
            vehicleRepositoryImpl$getUserVehicles$2 = (VehicleRepositoryImpl$getUserVehicles$2) continuationImpl;
            int i12 = vehicleRepositoryImpl$getUserVehicles$2.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                vehicleRepositoryImpl$getUserVehicles$2.label = i12 - Integer.MIN_VALUE;
            } else {
                vehicleRepositoryImpl$getUserVehicles$2 = new VehicleRepositoryImpl$getUserVehicles$2(this, continuationImpl);
            }
        } else {
            vehicleRepositoryImpl$getUserVehicles$2 = new VehicleRepositoryImpl$getUserVehicles$2(this, continuationImpl);
        }
        Object objF = vehicleRepositoryImpl$getUserVehicles$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = vehicleRepositoryImpl$getUserVehicles$2.label;
        if (i13 == 0) {
            kotlin.b.b(objF);
            VehicleComparator$By vehicleComparator$ByN = this.f30325c.N();
            int i14 = E.f47459b;
            if (str != null) {
                int i15 = z.f47484b;
                ParseQuery<T> query2 = ((z) ParseUser.getCurrentUser()).b().getQuery();
                query2.whereContains("model_lowercase", str.toLowerCase());
                ParseQuery<T> query3 = ((z) ParseUser.getCurrentUser()).b().getQuery();
                query3.whereContains("make_lowercase", str.toLowerCase());
                ParseQuery<T> query4 = ((z) ParseUser.getCurrentUser()).b().getQuery();
                query4.whereContains("vin", str.toUpperCase());
                query = ParseQuery.or(Arrays.asList(query2, query3, query4));
            } else {
                int i16 = z.f47484b;
                query = ((z) ParseUser.getCurrentUser()).b().getQuery();
            }
            query.include("vehicleModification");
            query.include("vehicleBase");
            query.include("engine");
            query.include("equipment");
            if (vehicleComparator$ByN == VehicleComparator$By.NAME) {
                query.orderByAscending("model_lowercase");
                query.addAscendingOrder("make_lowercase");
            } else {
                query.orderByDescending(vehicleComparator$ByN.a());
            }
            query.setSkip(i10);
            query.setLimit(i11);
            p279w9.a aVar = new p279w9.a(B7.b.c("VEHICLE_LIST", vehicleComparator$ByN.a() + str + "O" + i10 + "L" + i11), 3600000L);
            Sa.a aVar2 = N.f43200c;
            VehicleRepositoryImpl$getUserVehicles$result$2 vehicleRepositoryImpl$getUserVehicles$result$2 = new VehicleRepositoryImpl$getUserVehicles$result$2(query, aVar, null);
            vehicleRepositoryImpl$getUserVehicles$2.L$0 = this;
            vehicleRepositoryImpl$getUserVehicles$2.label = 1;
            objF = C2680e.f(aVar2, vehicleRepositoryImpl$getUserVehicles$result$2, vehicleRepositoryImpl$getUserVehicles$2);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            vehicleRepositoryImpl = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vehicleRepositoryImpl = (VehicleRepositoryImpl) vehicleRepositoryImpl$getUserVehicles$2.L$0;
            kotlin.b.b(objF);
        }
        w9.d.a aVar3 = (w9.d.a) objF;
        ParseException parseException = aVar3.f47830a;
        if (parseException != null) {
            return new C8.a.C0024a(vehicleRepositoryImpl.f30328f.a(parseException));
        }
        Iterable<E> iterable = aVar3.f47831b;
        kotlin.jvm.internal.i.b(iterable);
        p279w9.a aVar4 = p279w9.a.f47817o;
        K8.b bVar = vehicleRepositoryImpl.f30324b;
        Object objC = bVar.c(aVar4, false);
        ArrayList arrayList = new ArrayList();
        if (objC instanceof List) {
            arrayList.addAll((List) objC);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((E) it.next()).getObjectId());
            }
            for (E e10 : iterable) {
                if (!arrayList2.contains(e10.getObjectId())) {
                    arrayList.add(e10);
                }
            }
            bVar.j(aVar4, iterable);
        } else {
            bVar.j(aVar4, iterable);
        }
        Iterable<E> iterable2 = iterable;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(iterable2, 10));
        for (E e11 : iterable2) {
            kotlin.jvm.internal.i.b(e11);
            arrayList3.add(A.i(e11));
        }
        return new C8.a.b(arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.x
    public final Object m(E e10, ContinuationImpl continuationImpl) throws Throwable {
        VehicleRepositoryImpl$getVehicleModifications$1 vehicleRepositoryImpl$getVehicleModifications$1;
        VehicleRepositoryImpl vehicleRepositoryImpl;
        if (continuationImpl instanceof VehicleRepositoryImpl$getVehicleModifications$1) {
            vehicleRepositoryImpl$getVehicleModifications$1 = (VehicleRepositoryImpl$getVehicleModifications$1) continuationImpl;
            int i10 = vehicleRepositoryImpl$getVehicleModifications$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vehicleRepositoryImpl$getVehicleModifications$1.label = i10 - Integer.MIN_VALUE;
            } else {
                vehicleRepositoryImpl$getVehicleModifications$1 = new VehicleRepositoryImpl$getVehicleModifications$1(this, continuationImpl);
            }
        } else {
            vehicleRepositoryImpl$getVehicleModifications$1 = new VehicleRepositoryImpl$getVehicleModifications$1(this, continuationImpl);
        }
        Object objF = vehicleRepositoryImpl$getVehicleModifications$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = vehicleRepositoryImpl$getVehicleModifications$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            D dI = e10.i();
            if (dI == null) {
                return new C8.a.C0024a(new NoVehicleBase());
            }
            int i12 = F.f47460b;
            ParseQuery query = ParseQuery.getQuery(F.class);
            query.include("vehicleBase");
            query.whereEqualTo("vehicleBase", dI);
            query.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
            p279w9.a aVar = new p279w9.a(B7.b.c("VEHICLE_MODIFICATIONS", e10.getObjectId()), 3600000L);
            Sa.a aVar2 = N.f43200c;
            VehicleRepositoryImpl$getVehicleModifications$result$1 vehicleRepositoryImpl$getVehicleModifications$result$1 = new VehicleRepositoryImpl$getVehicleModifications$result$1(query, aVar, null);
            vehicleRepositoryImpl$getVehicleModifications$1.L$0 = this;
            vehicleRepositoryImpl$getVehicleModifications$1.label = 1;
            objF = C2680e.f(aVar2, vehicleRepositoryImpl$getVehicleModifications$result$1, vehicleRepositoryImpl$getVehicleModifications$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            vehicleRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vehicleRepositoryImpl = (VehicleRepositoryImpl) vehicleRepositoryImpl$getVehicleModifications$1.L$0;
            kotlin.b.b(objF);
        }
        w9.d.a aVar3 = (w9.d.a) objF;
        ParseException parseException = aVar3.f47830a;
        return parseException == null ? new C8.a.b(aVar3.f47831b) : new C8.a.C0024a(vehicleRepositoryImpl.f30328f.a(parseException));
    }
}
