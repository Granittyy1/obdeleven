package com.voltasit.obdeleven.domain.usecases.vehicle;

import J8.x;
import com.obdeleven.service.enums.GatewayType;
import com.parse.ControlUnitDB;
import com.parse.ParseObject;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p134k8.a2;
import p255u9.C2801d;
import p255u9.E;

/* JADX INFO: compiled from: GetVehicleGatewayCUsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f31056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f31057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.c f31058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.d f31059d;

    public i(J8.p pVar, x xVar, K8.c cVar, K8.d dVar) {
        this.f31056a = pVar;
        this.f31057b = xVar;
        this.f31058c = cVar;
        this.f31059d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(List list, GatewayType gatewayType, String str, ContinuationImpl continuationImpl) {
        GetVehicleGatewayCUsUC$invoke$1 getVehicleGatewayCUsUC$invoke$1;
        i iVar;
        a2 a2Var;
        if (continuationImpl instanceof GetVehicleGatewayCUsUC$invoke$1) {
            getVehicleGatewayCUsUC$invoke$1 = (GetVehicleGatewayCUsUC$invoke$1) continuationImpl;
            int i10 = getVehicleGatewayCUsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getVehicleGatewayCUsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getVehicleGatewayCUsUC$invoke$1 = new GetVehicleGatewayCUsUC$invoke$1(this, continuationImpl);
            }
        } else {
            getVehicleGatewayCUsUC$invoke$1 = new GetVehicleGatewayCUsUC$invoke$1(this, continuationImpl);
        }
        GetVehicleGatewayCUsUC$invoke$1 getVehicleGatewayCUsUC$invoke$2 = getVehicleGatewayCUsUC$invoke$1;
        Object obj = getVehicleGatewayCUsUC$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getVehicleGatewayCUsUC$invoke$2.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            String strB = androidx.compose.foundation.gestures.d.b("GetVehicleGatewayCUsUC(", gatewayType.name(), ")");
            J8.p pVar = this.f31056a;
            pVar.f("GetVehicleGatewayCUsUC", strB);
            x xVar = this.f31057b;
            if (!xVar.b()) {
                pVar.e("GetVehicleGatewayCUsUC", "vehicle is not connected");
                return new C8.a.C0024a(new VehicleNotConnectedException());
            }
            a2 a2VarK = xVar.k();
            String objectId = a2VarK.f42726c.getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            String strName = gatewayType.name();
            getVehicleGatewayCUsUC$invoke$2.L$0 = this;
            getVehicleGatewayCUsUC$invoke$2.L$1 = a2VarK;
            getVehicleGatewayCUsUC$invoke$2.label = 1;
            Object objC = this.f31059d.c(list, objectId, strName, str, getVehicleGatewayCUsUC$invoke$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            iVar = this;
            obj = objC;
            a2Var = a2VarK;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2Var = (a2) getVehicleGatewayCUsUC$invoke$2.L$1;
            iVar = (i) getVehicleGatewayCUsUC$invoke$2.L$0;
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.common.Output.Success<kotlin.collections.Map<kotlin.String, com.parse.ParseObject>>");
        Map map = (Map) ((C8.a.b) aVar).f2463a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<Short, ControlUnitDB> mapC = iVar.f31058c.c();
        LinkedHashMap linkedHashMapY = mapC != null ? y.y(mapC) : new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            ParseObject parseObject = (ParseObject) entry.getValue();
            E e10 = a2Var.f42726c;
            kotlin.jvm.internal.i.d(e10, "getParseObject(...)");
            short sIntValue = (short) Integer.valueOf(str2, 16).intValue();
            if (parseObject instanceof ControlUnitDB) {
                ControlUnitDB controlUnitDB = (ControlUnitDB) parseObject;
                linkedHashMapY.put(controlUnitDB.getControlUnitBase().a(), controlUnitDB);
                linkedHashMap.put(Short.valueOf(sIntValue), controlUnitDB);
            } else if (parseObject instanceof C2801d) {
                C2801d c2801d = (C2801d) parseObject;
                Short shA = c2801d.a();
                ControlUnitDB controlUnitDB2 = (ControlUnitDB) linkedHashMapY.get(shA);
                if (controlUnitDB2 != null) {
                    linkedHashMapY.put(shA, controlUnitDB2);
                    linkedHashMap.put(Short.valueOf(sIntValue), controlUnitDB2);
                } else {
                    ControlUnitDB controlUnitDBB = iVar.f31059d.b(c2801d, e10);
                    linkedHashMapY.put(shA, controlUnitDBB);
                    linkedHashMap.put(Short.valueOf(sIntValue), controlUnitDBB);
                }
            }
        }
        iVar.f31058c.b(linkedHashMapY);
        return new C8.a.b(linkedHashMap);
    }
}
