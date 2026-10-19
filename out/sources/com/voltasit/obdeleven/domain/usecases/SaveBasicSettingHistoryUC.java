package com.voltasit.obdeleven.domain.usecases;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.DiagnosticSession;
import com.obdeleven.service.util.Texttabe;
import com.voltasit.parse.model.HistoryDB;
import java.util.LinkedHashSet;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p134k8.a2;
import p255u9.E;

/* JADX INFO: compiled from: SaveBasicSettingHistoryUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SaveBasicSettingHistoryUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.b f30620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.p f30621c;

    public SaveBasicSettingHistoryUC(K8.v vVar, p084g8.b bVar, J8.p pVar) {
        this.f30619a = vVar;
        this.f30620b = bVar;
        this.f30621c = pVar;
    }

    public final void a(ControlUnit controlUnit, p207q8.a basicSetting) {
        kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
        kotlin.jvm.internal.i.e(basicSetting, "basicSetting");
        J8.p pVar = this.f30621c;
        pVar.f("SaveBasicSettingHistoryUC", "SaveBasicSettingHistoryUC()");
        p084g8.b bVar = this.f30620b;
        LinkedHashSet<String> linkedHashSetG = bVar.g();
        if (linkedHashSetG.isEmpty()) {
            pVar.e("SaveBasicSettingHistoryUC", "Status list is empty");
            return;
        }
        bVar.h();
        a2 a2Var = controlUnit.f29321c;
        E e10 = a2Var != null ? a2Var.f42726c : null;
        if (e10 == null) {
            return;
        }
        HistoryDB historyDBK = bVar.k();
        historyDBK.o(this.f30619a.L());
        historyDBK.setVehicle(e10);
        historyDBK.i(controlUnit.f29320b);
        historyDBK.n("BASIC_SETTINGS-UDS");
        historyDBK.m(e10.getInt("mileage"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", basicSetting.f46175b);
            jSONObject.put("ti", basicSetting.f46176c);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("statuses", jSONArray);
            for (String str : linkedHashSetG) {
                JSONObject jSONObject2 = new JSONObject();
                jSONArray.put(jSONObject2);
                jSONObject2.put("value", Texttabe.c(str));
                jSONObject2.put("ti", str);
            }
            historyDBK.j(jSONObject);
            DiagnosticSession diagnosticSessionP = controlUnit.p();
            if (diagnosticSessionP != null) {
                String str2 = diagnosticSessionP.f29363c;
                if (str2 == null) {
                    str2 = "";
                }
                historyDBK.k(str2);
            }
            historyDBK.a();
            C2680e.c(C2673a0.f43223b, null, null, new SaveBasicSettingHistoryUC$invoke$2(historyDBK, this, null), 3);
        } catch (JSONException e11) {
            pVar.d(e11, false);
        }
    }
}
