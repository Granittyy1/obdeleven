package com.voltasit.obdeleven.presentation.history;

import com.obdeleven.service.model.fault.Fault;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.R;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: FaultsAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends k {
    @Override // com.voltasit.obdeleven.presentation.history.k
    public final void k(k.b bVar, JSONObject jSONObject, int i10, ControlUnitDB controlUnitDB) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("faults");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        int iA = Fault.a(jSONArrayOptJSONArray);
        int length = jSONArrayOptJSONArray.length() - iA;
        l(bVar, this.f32465h.getString(R.string.common_active_faults), String.valueOf(iA), true, -1, null);
        l(bVar, this.f32465h.getString(R.string.common_inactive_faults), String.valueOf(length), true, -1, null);
    }
}
