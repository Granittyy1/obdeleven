package com.voltasit.obdeleven.domain.usecases.gateway;

import J8.p;
import J8.x;
import androidx.collection.Y;
import com.obdeleven.service.model.DiagnosticSession;
import com.parse.ParseException;
import com.voltasit.obdeleven.domain.exceptions.CouldNotSaveException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p109i8.h;
import p134k8.S0;
import p134k8.T0;
import p134k8.a2;
import p293xa.r;

/* JADX INFO: compiled from: SaveGatewayCodingResultUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f30843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.b f30844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f30845c;

    public c(x xVar, p084g8.b bVar, p pVar) {
        this.f30843a = xVar;
        this.f30844b = bVar;
        this.f30845c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(h hVar, T0 t8, ContinuationImpl continuationImpl) {
        SaveGatewayCodingResultUC$invoke$1 saveGatewayCodingResultUC$invoke$1;
        a2 a2VarK;
        c cVar;
        Object objB;
        if (continuationImpl instanceof SaveGatewayCodingResultUC$invoke$1) {
            saveGatewayCodingResultUC$invoke$1 = (SaveGatewayCodingResultUC$invoke$1) continuationImpl;
            int i10 = saveGatewayCodingResultUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                saveGatewayCodingResultUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                saveGatewayCodingResultUC$invoke$1 = new SaveGatewayCodingResultUC$invoke$1(this, continuationImpl);
            }
        } else {
            saveGatewayCodingResultUC$invoke$1 = new SaveGatewayCodingResultUC$invoke$1(this, continuationImpl);
        }
        Object obj = saveGatewayCodingResultUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = saveGatewayCodingResultUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            a2VarK = this.f30843a.k();
            if (hVar.d().getObjectId() == null) {
                String objectId = a2VarK.f42726c.getObjectId();
                i.d(objectId, "getObjectId(...)");
                saveGatewayCodingResultUC$invoke$1.L$0 = this;
                saveGatewayCodingResultUC$invoke$1.L$1 = hVar;
                saveGatewayCodingResultUC$invoke$1.L$2 = t8;
                saveGatewayCodingResultUC$invoke$1.L$3 = a2VarK;
                saveGatewayCodingResultUC$invoke$1.label = 1;
                objB = b(hVar, t8, objectId, saveGatewayCodingResultUC$invoke$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = this;
            } else {
                cVar = this;
            }
            p084g8.b bVar = cVar.f30844b;
            String objectId2 = a2VarK.f42726c.getObjectId();
            i.d(objectId2, "getObjectId(...)");
            String objectId3 = hVar.d().getObjectId();
            i.d(objectId3, "getObjectId(...)");
            DiagnosticSession diagnosticSessionP = hVar.p();
            Y<S0> y10 = t8.f42675a;
            Y<S0> y11 = t8.f42676b;
            i.d(y11, "getNewStatuses(...)");
            bVar.d(objectId2, objectId3, diagnosticSessionP, y10, y11);
            return new C8.a.b(r.f47939a);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a2 a2Var = (a2) saveGatewayCodingResultUC$invoke$1.L$3;
        t8 = (T0) saveGatewayCodingResultUC$invoke$1.L$2;
        h hVar2 = (h) saveGatewayCodingResultUC$invoke$1.L$1;
        c cVar2 = (c) saveGatewayCodingResultUC$invoke$1.L$0;
        kotlin.b.b(obj);
        a2VarK = a2Var;
        hVar = hVar2;
        cVar = cVar2;
        objB = obj;
        C8.a aVar = (C8.a) objB;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        p084g8.b bVar2 = cVar.f30844b;
        String objectId4 = a2VarK.f42726c.getObjectId();
        i.d(objectId4, "getObjectId(...)");
        String objectId5 = hVar.d().getObjectId();
        i.d(objectId5, "getObjectId(...)");
        DiagnosticSession diagnosticSessionP2 = hVar.p();
        Y<S0> y12 = t8.f42675a;
        Y<S0> y13 = t8.f42676b;
        i.d(y13, "getNewStatuses(...)");
        bVar2.d(objectId4, objectId5, diagnosticSessionP2, y12, y13);
        return new C8.a.b(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(h hVar, T0 t8, String str, ContinuationImpl continuationImpl) {
        SaveGatewayCodingResultUC$saveControlUnit$1 saveGatewayCodingResultUC$saveControlUnit$1;
        c cVar;
        if (continuationImpl instanceof SaveGatewayCodingResultUC$saveControlUnit$1) {
            saveGatewayCodingResultUC$saveControlUnit$1 = (SaveGatewayCodingResultUC$saveControlUnit$1) continuationImpl;
            int i10 = saveGatewayCodingResultUC$saveControlUnit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                saveGatewayCodingResultUC$saveControlUnit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                saveGatewayCodingResultUC$saveControlUnit$1 = new SaveGatewayCodingResultUC$saveControlUnit$1(this, continuationImpl);
            }
        } else {
            saveGatewayCodingResultUC$saveControlUnit$1 = new SaveGatewayCodingResultUC$saveControlUnit$1(this, continuationImpl);
        }
        Object obj = saveGatewayCodingResultUC$saveControlUnit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = saveGatewayCodingResultUC$saveControlUnit$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) saveGatewayCodingResultUC$saveControlUnit$1.L$3;
            t8 = (T0) saveGatewayCodingResultUC$saveControlUnit$1.L$2;
            hVar = (h) saveGatewayCodingResultUC$saveControlUnit$1.L$1;
            cVar = (c) saveGatewayCodingResultUC$saveControlUnit$1.L$0;
            try {
                kotlin.b.b(obj);
                return new C8.a.b(r.f47939a);
            } catch (ParseException e10) {
                e = e10;
                cVar.f30845c.d(e, false);
                hVar.d().saveEventually(new b(cVar, str, hVar, t8));
                return new C8.a.C0024a(new CouldNotSaveException());
            }
        }
        kotlin.b.b(obj);
        try {
            Sa.a aVar = N.f43200c;
            SaveGatewayCodingResultUC$saveControlUnit$2 saveGatewayCodingResultUC$saveControlUnit$2 = new SaveGatewayCodingResultUC$saveControlUnit$2(hVar, null);
            saveGatewayCodingResultUC$saveControlUnit$1.L$0 = this;
            saveGatewayCodingResultUC$saveControlUnit$1.L$1 = hVar;
            saveGatewayCodingResultUC$saveControlUnit$1.L$2 = t8;
            saveGatewayCodingResultUC$saveControlUnit$1.L$3 = str;
            saveGatewayCodingResultUC$saveControlUnit$1.label = 1;
            if (C2680e.f(aVar, saveGatewayCodingResultUC$saveControlUnit$2, saveGatewayCodingResultUC$saveControlUnit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return new C8.a.b(r.f47939a);
        } catch (ParseException e11) {
            e = e11;
            cVar = this;
            cVar.f30845c.d(e, false);
            hVar.d().saveEventually(new b(cVar, str, hVar, t8));
            return new C8.a.C0024a(new CouldNotSaveException());
        }
    }
}
