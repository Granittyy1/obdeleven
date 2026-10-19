package com.voltasit.obdeleven.domain.usecases.vehicle;

import J8.x;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p134k8.a2;
import p255u9.C2801d;
import p255u9.E;

/* JADX INFO: compiled from: GetVehicleCUByKlineIdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f31048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f31049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.c f31050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.d f31051d;

    public g(J8.p pVar, x xVar, K8.c cVar, K8.d dVar) {
        this.f31048a = pVar;
        this.f31049b = xVar;
        this.f31050c = cVar;
        this.f31051d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        GetVehicleCUByKlineIdUC$invoke$1 getVehicleCUByKlineIdUC$invoke$1;
        a2 a2Var;
        Map<Short, ? extends ControlUnitDB> map;
        g gVar;
        if (continuationImpl instanceof GetVehicleCUByKlineIdUC$invoke$1) {
            getVehicleCUByKlineIdUC$invoke$1 = (GetVehicleCUByKlineIdUC$invoke$1) continuationImpl;
            int i10 = getVehicleCUByKlineIdUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getVehicleCUByKlineIdUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getVehicleCUByKlineIdUC$invoke$1 = new GetVehicleCUByKlineIdUC$invoke$1(this, continuationImpl);
            }
        } else {
            getVehicleCUByKlineIdUC$invoke$1 = new GetVehicleCUByKlineIdUC$invoke$1(this, continuationImpl);
        }
        Object obj = getVehicleCUByKlineIdUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getVehicleCUByKlineIdUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            short s11 = s10;
            String strB = androidx.compose.foundation.gestures.d.b("GetVehicleCUByKlineIdUC(", E8.a.f(s11 & 65535), ")");
            J8.p pVar = this.f31048a;
            pVar.f("GetVehicleCUByKlineIdUC", strB);
            x xVar = this.f31049b;
            if (!xVar.b()) {
                pVar.e("GetVehicleCUByKlineIdUC", "vehicle is not connected");
                return new C8.a.C0024a(new VehicleNotConnectedException());
            }
            Map<Short, ControlUnitDB> mapC = this.f31050c.c();
            LinkedHashMap linkedHashMapY = mapC != null ? y.y(mapC) : new LinkedHashMap();
            ControlUnitDB controlUnitDB = (ControlUnitDB) linkedHashMapY.get(new Short(s11));
            if (controlUnitDB != null) {
                return new C8.a.b(controlUnitDB);
            }
            a2 a2VarK = xVar.k();
            getVehicleCUByKlineIdUC$invoke$1.L$0 = this;
            getVehicleCUByKlineIdUC$invoke$1.L$1 = linkedHashMapY;
            getVehicleCUByKlineIdUC$invoke$1.L$2 = a2VarK;
            getVehicleCUByKlineIdUC$invoke$1.S$0 = s10;
            getVehicleCUByKlineIdUC$invoke$1.label = 1;
            Object objF = this.f31051d.f(getVehicleCUByKlineIdUC$invoke$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            a2Var = a2VarK;
            obj = objF;
            map = linkedHashMapY;
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s10 = getVehicleCUByKlineIdUC$invoke$1.S$0;
            a2Var = (a2) getVehicleCUByKlineIdUC$invoke$1.L$2;
            map = (Map) getVehicleCUByKlineIdUC$invoke$1.L$1;
            gVar = (g) getVehicleCUByKlineIdUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            short s12 = s10;
            C2801d c2801d = (C2801d) ((Map) ((C8.a.b) aVar).f2463a).get(new Short(s12));
            if (c2801d != null) {
                K8.d dVar = gVar.f31051d;
                E e10 = a2Var.f42726c;
                kotlin.jvm.internal.i.d(e10, "getParseObject(...)");
                ControlUnitDB controlUnitDBB = dVar.b(c2801d, e10);
                map.put(new Short(s12), controlUnitDBB);
                gVar.f31050c.b(map);
                return new C8.a.b(controlUnitDBB);
            }
        }
        return new C8.a.C0024a(new NotFoundException(B7.b.c("Control unit db with id ", E8.a.f(s10 & 65535))));
    }
}
