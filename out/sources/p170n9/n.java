package p170n9;

import V8.q;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f;
import com.voltasit.parse.model.ControlUnitLabelDB;
import com.voltasit.parse.model.HistoryDB;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p121j8.c;
import p134k8.T1;
import p134k8.a2;
import p194p8.h;
import p255u9.E;

/* JADX INFO: compiled from: OfflineControlUnitMeasurementFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class n extends f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f45021F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ApplicationProtocol f45022G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public E f45023H;

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.f45023H = (E) bundle.getParcelable("vehicleDb");
            this.f31781s = (HistoryDB) bundle.getParcelable("historyDb");
        } else if (getArguments() != null) {
            this.f45023H = (E) getArguments().getParcelable("vehicleDb");
            this.f31781s = (HistoryDB) getArguments().getParcelable("historyDb");
        }
        HistoryDB historyDB = this.f31781s;
        if (historyDB == null || TextUtils.isEmpty(historyDB.c().getProtocol())) {
            ControlUnit controlUnit = this.f31783u;
            if (controlUnit != null && !TextUtils.isEmpty(controlUnit.f29320b.getProtocol())) {
                this.f45022G = ApplicationProtocol.a(this.f31783u.f29320b.getProtocol().split(":")[1]);
            }
        } else {
            this.f45022G = ApplicationProtocol.a(this.f31781s.c().getProtocol().split(":")[1]);
        }
        if (this.f31781s != null && this.f45023H != null) {
            this.f31783u = new ControlUnit(this.f31781s.c(), new a2(this.f45023H), null, null);
        }
        return super.B(layoutInflater, viewGroup, bundle);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f
    public final void Q() {
        Task<List<T1>> taskH;
        HistoryDB historyDB = this.f31781s;
        final String kWP1281DataById = "";
        if (historyDB != null) {
            JSONArray jSONArrayOptJSONArray = historyDB.d().optJSONObject("liveData").optJSONArray("values");
            JSONObject jSONObject = new JSONObject();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                try {
                    jSONObject.put(jSONArrayOptJSONArray.getJSONObject(i10).getString("channel"), jSONArrayOptJSONArray.getJSONObject(i10).getString("data"));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            kWP1281DataById = jSONObject.getString(String.valueOf(this.f45021F));
        } else {
            ApplicationProtocol applicationProtocol = this.f45022G;
            if (applicationProtocol == ApplicationProtocol.f29263c) {
                kWP1281DataById = this.f31783u.f29320b.getKWP2000DataById(this.f45021F);
            } else if (applicationProtocol == ApplicationProtocol.f29262b) {
                kWP1281DataById = this.f31783u.f29320b.getKWP1281DataById(this.f45021F);
            }
        }
        final h hVar = this.f31784v;
        final ValueUnit valueUnit = this.f31786x;
        if (hVar.f45913d == null) {
            ControlUnitLabelDB.Type type = ControlUnitLabelDB.Type.f34409b;
            taskH = c.a(hVar.f45911b, hVar.f45910a, type).continueWithTask(new Continuation() { // from class: p8.g
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    h hVar2 = hVar;
                    hVar2.getClass();
                    hVar2.f45913d = (c) task.getResult();
                    hVar2.i();
                    return hVar2.h(kWP1281DataById, valueUnit);
                }
            });
        } else {
            taskH = hVar.h(kWP1281DataById, valueUnit);
        }
        taskH.continueWith(new q(5, this), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f, com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("WarningDialog")) {
            super.g(str, callbackType, bundle);
            return;
        }
        if (str.equals("NumberLabelDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                this.f31779q.setEnabled(true);
                this.f31780r.setEnabled(true);
                int i10 = bundle.getInt("key_channel");
                this.f45021F = i10;
                this.f31784v = this.f31783u.S(i10, this.f45022G);
                this.f31775m.setText(String.format(Locale.US, "%03d", Integer.valueOf(this.f45021F)));
                Q();
            } else if (this.f31784v == null) {
                r().h();
            }
            this.f31771C = null;
        }
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f, android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f45021F = this.f31784v.getChannel();
        int id = view.getId();
        ApplicationProtocol applicationProtocol = ApplicationProtocol.f29262b;
        if (id == R.id.controlUnitMeasurementFragment_next) {
            int i10 = this.f45021F;
            if (i10 < 254 || (this.f31783u.f29327i == applicationProtocol && i10 < 255)) {
                int i11 = i10 + 1;
                this.f45021F = i11;
                this.f31784v = this.f31783u.S(i11, this.f45022G);
            }
            this.f31775m.setText(String.format(Locale.US, "%03d", Integer.valueOf(this.f45021F)));
            Q();
            this.f31788z.setRefreshing(true);
            return;
        }
        if (id != R.id.controlUnitMeasurementFragment_prev) {
            super.onClick(view);
            return;
        }
        int i12 = this.f45021F;
        if (i12 > 1 || (this.f31783u.f29327i == applicationProtocol && i12 > 0)) {
            int i13 = i12 - 1;
            this.f45021F = i13;
            this.f31784v = this.f31783u.S(i13, this.f45022G);
        }
        this.f31775m.setText(String.format(Locale.US, "%03d", Integer.valueOf(this.f45021F)));
        Q();
        this.f31788z.setRefreshing(true);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f
    public final void O() {
    }
}
