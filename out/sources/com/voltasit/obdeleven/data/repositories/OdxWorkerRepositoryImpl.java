package com.voltasit.obdeleven.data.repositories;

import com.obdeleven.service.odx.model.COMPUSCALE;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p255u9.D;
import p255u9.E;

/* JADX INFO: compiled from: OdxWorkerRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OdxWorkerRepositoryImpl implements K8.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.x f30301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.d f30302b;

    public OdxWorkerRepositoryImpl(K8.x xVar, K8.d dVar) {
        this.f30301a = xVar;
        this.f30302b = dVar;
    }

    @Override // K8.l
    public final Object a(com.obdeleven.service.odx.e eVar, com.obdeleven.service.odx.e.g gVar, kotlin.coroutines.c<? super List<? extends COMPUSCALE>> cVar) {
        return C2680e.f(N.f43198a, new OdxWorkerRepositoryImpl$getCompuscales$2(eVar, gVar, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // K8.l
    public final Object b(String str, ContinuationImpl continuationImpl, short s10) throws Throwable {
        OdxWorkerRepositoryImpl$getOdxWorker$1 odxWorkerRepositoryImpl$getOdxWorker$1;
        short s11;
        Object objI;
        OdxWorkerRepositoryImpl odxWorkerRepositoryImpl;
        E e10;
        short s12;
        C8.a aVar;
        Iterator it;
        Object next;
        ControlUnitDB controlUnitDB;
        String oDXName;
        String oDXVersion;
        D dI;
        String string;
        String str2 = str;
        if (continuationImpl instanceof OdxWorkerRepositoryImpl$getOdxWorker$1) {
            odxWorkerRepositoryImpl$getOdxWorker$1 = (OdxWorkerRepositoryImpl$getOdxWorker$1) continuationImpl;
            int i10 = odxWorkerRepositoryImpl$getOdxWorker$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                odxWorkerRepositoryImpl$getOdxWorker$1.label = i10 - Integer.MIN_VALUE;
            } else {
                odxWorkerRepositoryImpl$getOdxWorker$1 = new OdxWorkerRepositoryImpl$getOdxWorker$1(this, continuationImpl);
            }
        } else {
            odxWorkerRepositoryImpl$getOdxWorker$1 = new OdxWorkerRepositoryImpl$getOdxWorker$1(this, continuationImpl);
        }
        Object objF = odxWorkerRepositoryImpl$getOdxWorker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = odxWorkerRepositoryImpl$getOdxWorker$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                short s13 = odxWorkerRepositoryImpl$getOdxWorker$1.S$0;
                String str3 = (String) odxWorkerRepositoryImpl$getOdxWorker$1.L$1;
                odxWorkerRepositoryImpl = (OdxWorkerRepositoryImpl) odxWorkerRepositoryImpl$getOdxWorker$1.L$0;
                kotlin.b.b(objF);
                s11 = s13;
                str2 = str3;
                objI = objF;
            } else if (i11 == 2) {
                s12 = odxWorkerRepositoryImpl$getOdxWorker$1.S$0;
                e10 = (E) odxWorkerRepositoryImpl$getOdxWorker$1.L$0;
                kotlin.b.b(objF);
                aVar = (C8.a) objF;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                if (aVar instanceof C8.a.b) {
                    throw new NoWhenBranchMatchedException();
                }
                it = ((Iterable) ((C8.a.b) aVar).f2463a).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((ControlUnitDB) next).getControlUnitBase().a().shortValue() != s12);
                controlUnitDB = (ControlUnitDB) next;
                if (controlUnitDB == null) {
                    return new C8.a.C0024a(new NotFoundException(B7.b.c("Control unit ", p293xa.p.a(s12))));
                }
                oDXName = controlUnitDB.getODXName();
                if (oDXName == null) {
                    return new C8.a.C0024a(new NotFoundException("odxName property"));
                }
                oDXVersion = controlUnitDB.getODXVersion();
                if (oDXVersion == null) {
                    return new C8.a.C0024a(new NotFoundException("odxVersion property"));
                }
                dI = e10.i();
                if (dI != null || (string = dI.getString("platform")) == null) {
                    return new C8.a.C0024a(new NotFoundException("vehicle platform"));
                }
                Sa.b bVar = N.f43198a;
                OdxWorkerRepositoryImpl$getOdxWorker$2 odxWorkerRepositoryImpl$getOdxWorker$2 = new OdxWorkerRepositoryImpl$getOdxWorker$2(s12, oDXName, oDXVersion, string, null);
                odxWorkerRepositoryImpl$getOdxWorker$1.L$0 = null;
                odxWorkerRepositoryImpl$getOdxWorker$1.label = 3;
                objF = C2680e.f(bVar, odxWorkerRepositoryImpl$getOdxWorker$2, odxWorkerRepositoryImpl$getOdxWorker$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objF);
            }
            return objF;
        }
        kotlin.b.b(objF);
        odxWorkerRepositoryImpl$getOdxWorker$1.L$0 = this;
        odxWorkerRepositoryImpl$getOdxWorker$1.L$1 = str2;
        s11 = s10;
        odxWorkerRepositoryImpl$getOdxWorker$1.S$0 = s11;
        odxWorkerRepositoryImpl$getOdxWorker$1.label = 1;
        objI = this.f30301a.i(str2, odxWorkerRepositoryImpl$getOdxWorker$1);
        if (objI == coroutineSingletons) {
            return coroutineSingletons;
        }
        odxWorkerRepositoryImpl = this;
        C8.a aVar2 = (C8.a) objI;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        if (!(aVar2 instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        e10 = (E) ((C8.a.b) aVar2).f2463a;
        K8.d dVar = odxWorkerRepositoryImpl.f30302b;
        odxWorkerRepositoryImpl$getOdxWorker$1.L$0 = e10;
        odxWorkerRepositoryImpl$getOdxWorker$1.L$1 = null;
        odxWorkerRepositoryImpl$getOdxWorker$1.S$0 = s11;
        odxWorkerRepositoryImpl$getOdxWorker$1.label = 2;
        Object objE = dVar.e(str2, odxWorkerRepositoryImpl$getOdxWorker$1);
        if (objE == coroutineSingletons) {
            return coroutineSingletons;
        }
        short s14 = s11;
        objF = objE;
        s12 = s14;
        aVar = (C8.a) objF;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (aVar instanceof C8.a.b) {
            throw new NoWhenBranchMatchedException();
        }
        it = ((Iterable) ((C8.a.b) aVar).f2463a).iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ControlUnitDB) next).getControlUnitBase().a().shortValue() != s12);
        controlUnitDB = (ControlUnitDB) next;
        if (controlUnitDB == null) {
            return new C8.a.C0024a(new NotFoundException(B7.b.c("Control unit ", p293xa.p.a(s12))));
        }
        oDXName = controlUnitDB.getODXName();
        if (oDXName == null) {
            return new C8.a.C0024a(new NotFoundException("odxName property"));
        }
        oDXVersion = controlUnitDB.getODXVersion();
        if (oDXVersion == null) {
            return new C8.a.C0024a(new NotFoundException("odxVersion property"));
        }
        dI = e10.i();
        if (dI != null) {
        }
        return new C8.a.C0024a(new NotFoundException("vehicle platform"));
    }

    @Override // K8.l
    public final Object c(com.obdeleven.service.odx.e eVar, kotlin.coroutines.c cVar) {
        return C2680e.f(N.f43198a, new OdxWorkerRepositoryImpl$getTableResult$2(eVar, "TAB_RecorDataIdentECUIdent", null), cVar);
    }
}
