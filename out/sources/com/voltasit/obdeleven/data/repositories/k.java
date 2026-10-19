package com.voltasit.obdeleven.data.repositories;

import androidx.collection.Y;
import com.obdeleven.service.model.DiagnosticSession;
import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.voltasit.obdeleven.models.BackupFunctionType;
import com.voltasit.parse.model.HistoryDB;
import java.util.LinkedHashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p134k8.S0;
import p255u9.E;
import p255u9.z;
import p304y9.C2825d;
import p304y9.L;

/* JADX INFO: compiled from: HistoryRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements p084g8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.b f30359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.v f30360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F8.c f30361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f30362f = new LinkedHashSet();

    public k(J8.p pVar, com.voltasit.sharednetwork.a aVar, K8.b bVar, K8.v vVar, F8.c cVar) {
        this.f30357a = pVar;
        this.f30358b = aVar;
        this.f30359c = bVar;
        this.f30360d = vVar;
        this.f30361e = cVar;
    }

    @Override // p084g8.b
    public final C8.a a(HistoryDB historyDB) {
        try {
            historyDB.save();
            return new C8.a.b(p293xa.r.f47939a);
        } catch (Throwable th) {
            return new C8.a.C0024a(this.f30361e.a(th));
        }
    }

    @Override // p084g8.b
    public final HistoryDB b(JSONArray jSONArray, E vehicleDB, ControlUnitDB controlUnitDB) {
        kotlin.jvm.internal.i.e(vehicleDB, "vehicleDB");
        kotlin.jvm.internal.i.e(controlUnitDB, "controlUnitDB");
        HistoryDB historyDBL = l(controlUnitDB, vehicleDB);
        historyDBL.l(jSONArray, "");
        return historyDBL;
    }

    @Override // p084g8.b
    public final void c(String str, String str2) {
        this.f30359c.j(new p279w9.a(B7.b.c("VEHICLE_BACKUP", str.concat(str2)), 31536000000L), Boolean.TRUE);
    }

    @Override // p084g8.b
    public final void d(String vehicleId, String str, DiagnosticSession diagnosticSession, Y<S0> y10, Y<S0> newStatuses) {
        J8.p pVar = this.f30357a;
        kotlin.jvm.internal.i.e(vehicleId, "vehicleId");
        kotlin.jvm.internal.i.e(newStatuses, "newStatuses");
        E e10 = new E();
        e10.setObjectId(vehicleId);
        ControlUnitDB controlUnitDB = new ControlUnitDB();
        controlUnitDB.setObjectId(str);
        HistoryDB historyDB = new HistoryDB();
        int i10 = z.f47484b;
        historyDB.o((z) ParseUser.getCurrentUser());
        historyDB.setVehicle(e10);
        historyDB.i(controlUnitDB);
        historyDB.k(diagnosticSession != null ? diagnosticSession.f29363c : null);
        historyDB.n("GATEWAY_CODING");
        historyDB.m(e10.getInt("mileage"));
        historyDB.a();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        int iF = y10.f();
        for (int i11 = 0; i11 < iF; i11++) {
            S0 s0G = y10.g(i11);
            S0 s0G2 = newStatuses.g(i11);
            if (s0G != null) {
                boolean z10 = s0G.f42671c;
                boolean z11 = s0G2.f42671c;
                if (z10 != z11) {
                    short sShortValue = s0G.f42669a.shortValue();
                    if (z11) {
                        jSONArray.put(E8.a.f(sShortValue & 65535));
                    } else {
                        jSONArray2.put(E8.a.f(sShortValue & 65535));
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("added", jSONArray);
            jSONObject.put("removed", jSONArray2);
            historyDB.j(jSONObject);
            historyDB.save();
        } catch (ParseException e11) {
            pVar.d(e11, false);
            historyDB.saveEventually();
        } catch (JSONException e12) {
            pVar.d(e12, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p084g8.b
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        HistoryRepositoryImpl$isVehicleBackupAvailable$1 historyRepositoryImpl$isVehicleBackupAvailable$1;
        k kVar;
        if (continuationImpl instanceof HistoryRepositoryImpl$isVehicleBackupAvailable$1) {
            historyRepositoryImpl$isVehicleBackupAvailable$1 = (HistoryRepositoryImpl$isVehicleBackupAvailable$1) continuationImpl;
            int i10 = historyRepositoryImpl$isVehicleBackupAvailable$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                historyRepositoryImpl$isVehicleBackupAvailable$1.label = i10 - Integer.MIN_VALUE;
            } else {
                historyRepositoryImpl$isVehicleBackupAvailable$1 = new HistoryRepositoryImpl$isVehicleBackupAvailable$1(this, continuationImpl);
            }
        } else {
            historyRepositoryImpl$isVehicleBackupAvailable$1 = new HistoryRepositoryImpl$isVehicleBackupAvailable$1(this, continuationImpl);
        }
        Object objD = historyRepositoryImpl$isVehicleBackupAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = historyRepositoryImpl$isVehicleBackupAvailable$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objD);
                Object objC = this.f30359c.c(new p279w9.a(B7.b.c("VEHICLE_BACKUP", str + str2), 31536000000L), false);
                if ((objC instanceof Boolean) && ((Boolean) objC).booleanValue()) {
                    return new C8.a.b(objC);
                }
                com.voltasit.sharednetwork.a aVar = this.f30358b;
                L l10 = new L(str2, kotlin.collections.l.s(BackupFunctionType.ADAPTATION.a(), BackupFunctionType.CODING.a()));
                historyRepositoryImpl$isVehicleBackupAvailable$1.L$0 = this;
                historyRepositoryImpl$isVehicleBackupAvailable$1.L$1 = str;
                historyRepositoryImpl$isVehicleBackupAvailable$1.L$2 = str2;
                historyRepositoryImpl$isVehicleBackupAvailable$1.label = 1;
                objD = aVar.D(l10, historyRepositoryImpl$isVehicleBackupAvailable$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) historyRepositoryImpl$isVehicleBackupAvailable$1.L$2;
                str = (String) historyRepositoryImpl$isVehicleBackupAvailable$1.L$1;
                kVar = (k) historyRepositoryImpl$isVehicleBackupAvailable$1.L$0;
                kotlin.b.b(objD);
            }
            C2825d c2825d = (C2825d) objD;
            kVar.f30359c.j(new p279w9.a("VEHICLE_BACKUP" + (str + str2), 31536000000L), c2825d);
            return new C8.a.b(Boolean.valueOf(c2825d.f48554a));
        } catch (Throwable th) {
            return new C8.a.C0024a(th);
        }
    }

    @Override // p084g8.b
    public final HistoryDB f(JSONArray jSONArray, E vehicleDB, ControlUnitDB controlUnitDB, String str, String str2) {
        kotlin.jvm.internal.i.e(vehicleDB, "vehicleDB");
        kotlin.jvm.internal.i.e(controlUnitDB, "controlUnitDB");
        HistoryDB historyDBL = l(controlUnitDB, vehicleDB);
        if (str != null) {
            historyDBL.put("odxFileName", str);
        }
        historyDBL.l(jSONArray, str2);
        return historyDBL;
    }

    @Override // p084g8.b
    public final LinkedHashSet g() {
        return this.f30362f;
    }

    @Override // p084g8.b
    public final void h() {
        this.f30362f.clear();
    }

    @Override // p084g8.b
    public final void i(String str) {
        this.f30362f.add(str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [C8.a, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e8 -> B:37:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p084g8.b
    public final java.lang.Object j(int r8, int r9, boolean r10, p255u9.E r11, java.util.List r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.data.repositories.k.j(int, int, boolean, u9.E, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // p084g8.b
    public final HistoryDB k() {
        return new HistoryDB();
    }

    public final HistoryDB l(ControlUnitDB controlUnitDB, E e10) {
        HistoryDB historyDB = new HistoryDB();
        historyDB.o(this.f30360d.L());
        historyDB.setVehicle(e10);
        historyDB.i(controlUnitDB);
        historyDB.put("type", HistoryDB.HistoryTypeValue.FAULT.a());
        int i10 = e10.getInt("mileage");
        if (i10 > 0) {
            historyDB.m(i10);
        }
        historyDB.a();
        return historyDB;
    }
}
