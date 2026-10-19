package com.voltasit.obdeleven.utils;

import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.exception.VehicleException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p134k8.D1;
import p134k8.a2;
import p255u9.E;
import p255u9.z;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UDSDataType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UDSDataType f34227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final UDSDataType f34228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ UDSDataType[] f34229d;

        static {
            UDSDataType uDSDataType = new UDSDataType("ADAPTATION", 0);
            f34227b = uDSDataType;
            UDSDataType uDSDataType2 = new UDSDataType("LONG_CODING", 1);
            f34228c = uDSDataType2;
            f34229d = new UDSDataType[]{uDSDataType, uDSDataType2};
        }

        public UDSDataType() {
            throw null;
        }

        public static UDSDataType valueOf(String str) {
            return (UDSDataType) Enum.valueOf(UDSDataType.class, str);
        }

        public static UDSDataType[] values() {
            return (UDSDataType[]) f34229d.clone();
        }
    }

    public static void a(E e10, ControlUnit controlUnit, String str, ArrayList arrayList) {
        HistoryDB historyDB = new HistoryDB();
        int i10 = z.f47484b;
        historyDB.o((z) ParseUser.getCurrentUser());
        historyDB.setVehicle(e10);
        historyDB.i(controlUnit.f29320b);
        if (controlUnit.p() != null) {
            historyDB.k(controlUnit.p().f29363c);
        }
        historyDB.n("BASIC_SETTINGS");
        historyDB.m(e10.getInt("mileage"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel", str);
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((Integer) it.next());
            }
            jSONObject.put("statuses", jSONArray);
            historyDB.j(jSONObject);
            historyDB.a();
            historyDB.saveEventually();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public static void b(D1 d10, String str, String str2, String str3) {
        ControlUnit controlUnitH = d10.h();
        a2 a2Var = controlUnitH.f29321c;
        HistoryDB historyDB = new HistoryDB();
        int i10 = z.f47484b;
        historyDB.o((z) ParseUser.getCurrentUser());
        historyDB.setVehicle(a2Var.f42726c);
        historyDB.i(controlUnitH.f29320b);
        if (controlUnitH.p() != null) {
            historyDB.k(controlUnitH.p().f29363c);
        }
        historyDB.n(str);
        try {
            int i11 = a2Var.f42726c.getInt("mileage");
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 == 0) {
                throw new VehicleException(2);
            }
            historyDB.put("mileage", numValueOf);
            JSONObject jSONObject = new JSONObject();
            try {
                try {
                    jSONObject.put("subName", d10.u());
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return;
                }
            } catch (ControlUnitException unused) {
            }
            jSONObject.put("oldValue", str2);
            jSONObject.put("newValue", str3);
            historyDB.j(jSONObject);
            historyDB.a();
            historyDB.saveEventually();
        } catch (VehicleException unused2) {
        }
    }

    public static ParseException c(UDSDataType uDSDataType, E e10, ControlUnit controlUnit, String str, String str2, HashMap<Param, Param> map) {
        HistoryDB historyDB = new HistoryDB();
        int i10 = z.f47484b;
        historyDB.o((z) ParseUser.getCurrentUser());
        historyDB.setVehicle(e10);
        historyDB.i(controlUnit.f29320b);
        int iOrdinal = uDSDataType.ordinal();
        if (iOrdinal == 0) {
            historyDB.put("type", HistoryDB.HistoryTypeValue.ADAPTATION_UDS.a());
        } else if (iOrdinal != 1) {
            historyDB.put("type", HistoryDB.HistoryTypeValue.UNKNOWN.a());
        } else {
            historyDB.put("type", HistoryDB.HistoryTypeValue.LONG_CODING_UDS.a());
        }
        historyDB.m(e10.getInt("mileage"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("ti", str2);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("changes", jSONArray);
            for (Param param : map.keySet()) {
                Param param2 = map.get(param);
                JSONObject jSONObject2 = new JSONObject();
                jSONArray.put(jSONObject2);
                String str3 = param.f29457e;
                String str4 = param.f29458f;
                jSONObject2.put("name", str3);
                if (str4 != null && !str4.isEmpty()) {
                    jSONObject2.put("ti", str4);
                }
                String str5 = param.f29461i;
                String str6 = param.j;
                jSONObject2.put("unit", str5);
                if (str6 != null && !str6.isEmpty()) {
                    jSONObject2.put("unitTi", str6);
                }
                jSONObject2.put("oldValue", param.f29459g);
                jSONObject2.put("oldTi", param.f29460h);
                jSONObject2.put("newValue", param2.f29459g);
                jSONObject2.put("newTi", param2.f29460h);
            }
            historyDB.j(jSONObject);
            if (controlUnit.p() != null) {
                historyDB.k(controlUnit.p().f29363c);
            }
            historyDB.a();
            try {
                historyDB.save();
                return null;
            } catch (ParseException e11) {
                historyDB.saveEventually();
                return e11;
            }
        } catch (JSONException e12) {
            e12.printStackTrace();
            return null;
        }
    }
}
