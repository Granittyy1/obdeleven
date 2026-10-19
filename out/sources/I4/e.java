package I4;

import android.os.Bundle;
import androidx.compose.runtime.N0;
import androidx.fragment.app.E;
import androidx.media3.exoplayer.h0;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsFragment;
import com.voltasit.obdeleven.ui.adapter.pro.LabelInputAdapter;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.view.LineDataChart;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p078g1.v;
import p134k8.A1;
import p134k8.T1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements K4.a.InterfaceC0060a, p063f.b, androidx.compose.ui.graphics.colorspace.j, j1.j.a, p191p5.e, E, MaterialDialog.e, i8.i.a, p191p5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3849b;

    public /* synthetic */ e(Object obj) {
        this.f3849b = obj;
    }

    @Override // p063f.b
    public void b(Object obj) {
        ((Ia.l) ((N0) this.f3849b).getValue()).invoke(obj);
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        final B b10 = (B) this.f3849b;
        if (b10.f33743m) {
            final String strB = b10.f33736e.getItem(b10.f33739h.getSelectedItemPosition()).b();
            Task taskForResult = Task.forResult(null);
            LabelInputAdapter labelInputAdapter = b10.f33738g;
            String[] strArr = labelInputAdapter.f33706g;
            Task taskContinueWithTask = taskForResult;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                final String str = strArr[i10];
                final long itemId = labelInputAdapter.getItemId(i10);
                if (str != null) {
                    taskContinueWithTask = taskContinueWithTask.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.ui.dialogs.y
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task) {
                            B b11 = b10;
                            if (!b11.f33741k) {
                                UserTrackingUtils.c(UserTrackingUtils.Key.f34264h, 1);
                            }
                            int i11 = (int) itemId;
                            p121j8.c cVar = b11.f33733b;
                            cVar.getClass();
                            return Task.callInBackground(new p121j8.b(cVar, i11, strB, str));
                        }
                    });
                }
            }
            if (!taskContinueWithTask.isCompleted()) {
                C2134a0.b(b10.f33732a, R.string.common_saving);
                taskContinueWithTask.continueWith(new com.parse.a(4, b10), Task.UI_THREAD_EXECUTOR);
                return;
            }
        }
        b10.f33735d.dismiss();
        b10.f33744n.setResult(Boolean.FALSE);
    }

    @Override // p191p5.d
    public void d(Exception exc) {
        ((RemoteConfigManager) this.f3849b).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return androidx.compose.ui.graphics.colorspace.f.a((androidx.compose.ui.graphics.colorspace.t) this.f3849b, d10);
    }

    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        UDSBasicSettingsFragment this$0 = (UDSBasicSettingsFragment) this.f3849b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
        ControlUnit controlUnit = this$0.f31330t;
        if (controlUnit != null) {
            SfdViewModel sfdViewModelU = this$0.U();
            String objectId = controlUnit.f29320b.getControlUnitBase().getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            sfdViewModelU.d(objectId, controlUnit.n().shortValue());
        }
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((v.c) obj).n(((h0) this.f3849b).f18416f);
    }

    @Override // K4.a.InterfaceC0060a
    public Object k() {
        return ((J4.c) this.f3849b).h();
    }

    @Override // i8.i.a
    public void l(List list) {
        p073f9.k kVar = (p073f9.k) this.f3849b;
        kVar.w();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1 a10 = (A1) it.next();
            p109i8.j jVar = a10.f42568a;
            map.put(jVar, jVar.a(a10.f42569b));
        }
        for (T t8 : kVar.f35053E.f36779a) {
            List list2 = (List) map.get(t8.f35057a);
            if (list2 != null) {
                T1 t10 = (T1) list2.get(t8.f35058b);
                String str = t10.f42679b;
                if (str != null) {
                    t8.f35060d = str;
                }
                t8.f35061e = t10.f42680c;
                if (kVar.f35013t == 1) {
                    try {
                        LineDataChart.b bVar = t8.f35059c;
                        float f10 = Float.parseFloat(str);
                        bVar.f34191c = true;
                        LineDataSet lineDataSet = bVar.f34189a;
                        lineDataSet.addEntry(new Entry(lineDataSet.getEntryCount(), f10));
                        lineDataSet.notifyDataSetChanged();
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        if (kVar.f35013t == 1) {
            kVar.f35005l.f34182b.add(Long.toString(System.currentTimeMillis()));
            kVar.f35005l.c();
        }
        kVar.f35053E.notifyDataSetChanged();
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        p123ja.i iVar = (p123ja.i) this.f3849b;
        iVar.onSuccess(obj);
        iVar.a();
    }
}
