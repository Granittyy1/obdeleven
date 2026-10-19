package p060e9;

import androidx.fragment.app.ActivityC1347l;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.models.HistoryTypeLegacy;
import com.voltasit.obdeleven.presentation.history.k;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: BackupsAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f34832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f34833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f34834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j.a f34835o;

    @Override // com.voltasit.obdeleven.presentation.history.k
    public final void k(k.b bVar, JSONObject jSONObject, int i10, ControlUnitDB controlUnitDB) {
        char c10;
        String string;
        String strOptString = jSONObject.optString("name");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("coding");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("adaptations");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("advanced_info");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subsystems");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("liveData");
        l(bVar, this.f32465h.getString(R.string.dialog_backup_backup_name), strOptString, true, -1, null);
        HistoryTypeLegacy historyTypeLegacy = HistoryTypeLegacy.f31141b;
        String str = "value";
        if (jSONObjectOptJSONObject != null) {
            l(bVar, this.f32465h.getString(jSONObjectOptJSONObject.optString("type").equals(historyTypeLegacy.toString()) ? R.string.common_coding : R.string.common_long_coding), jSONObjectOptJSONObject.optString("value"), true, i10, (controlUnitDB == null || controlUnitDB.getProtocol() == null || !controlUnitDB.getProtocol().contains("KWP")) ? this.f34832l : null);
        }
        if (jSONObjectOptJSONObject2 != null) {
            l(bVar, this.f32465h.getString(R.string.common_adaptations), Integer.toString(jSONObjectOptJSONObject2.optJSONArray("values").length()), true, i10, this.f34833m);
        }
        if (jSONObjectOptJSONObject3 != null) {
            l(bVar, this.f32465h.getString(R.string.common_advanced_identification), Integer.toString(jSONObjectOptJSONObject3.optJSONArray("values").length()), true, i10, this.f34834n);
        }
        if (jSONObjectOptJSONObject4 != null) {
            l(bVar, this.f32465h.getString(R.string.common_live_data), Integer.toString(jSONObjectOptJSONObject4.optJSONArray(r6).length()), true, i10, this.f34835o);
        }
        if (jSONArrayOptJSONArray != null) {
            int i11 = 0;
            while (i11 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i11);
                String strOptString2 = jSONObjectOptJSONObject5.optString("name");
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("coding");
                ActivityC1347l activityC1347l = this.f32465h;
                l(bVar, activityC1347l.getString(R.string.common_subsystem), strOptString2, false, -1, null);
                if (jSONObjectOptJSONObject6.optString("type").equals(historyTypeLegacy.toString())) {
                    string = activityC1347l.getString(R.string.common_coding);
                    c10 = 814;
                } else {
                    c10 = 814;
                    string = activityC1347l.getString(R.string.common_long_coding);
                }
                l(bVar, string, jSONObjectOptJSONObject6.optString(str), true, -1, null);
                i11++;
                str = str;
            }
        }
    }
}
