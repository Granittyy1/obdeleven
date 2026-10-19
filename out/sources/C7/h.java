package C7;

import A1.C0571f;
import R4.C0754a;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.E;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.firebase.abt.AbtException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.parse.ParseException;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.controlunitlist.online.SfdUnlockDialogOrigin;
import com.voltasit.obdeleven.ui.dialogs.J;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p114j1.r;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements InterfaceC2755a, k1.g.b, p191p5.e, E, w9.d.b, MaterialDialog.e, i8.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2432b;

    public /* synthetic */ h(Object obj) {
        this.f2432b = obj;
    }

    @Override // i8.i.b
    public void a() {
        p182o9.c cVar = (p182o9.c) this.f2432b;
        cVar.w();
        cVar.O();
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.e
    public void c(MaterialDialog materialDialog) {
        materialDialog.dismiss();
        ((TaskCompletionSource) this.f2432b).setResult(Boolean.FALSE);
    }

    @Override // k1.g.b
    public void d(long j, r rVar) {
        C0571f.a(j, rVar, ((U1.c) this.f2432b).f6167H);
    }

    @Override // w9.d.b
    public void g(List list, ParseException parseException) {
        J j = (J) this.f2432b;
        if (j.f33813v.isShowing()) {
            if (parseException != null) {
                if (parseException.getCode() == 120 || !j.f33809r.f36795b.isEmpty()) {
                    return;
                }
                j.f33800h.setVisibility(8);
                j.f33799g.setVisibility(0);
                j.f33799g.setText(R.string.common_check_network_try_again);
                return;
            }
            if (list.isEmpty()) {
                j.f33800h.setVisibility(8);
                j.f33796d.setVisibility(0);
                j.f33799g.setVisibility(0);
                j.f33809r.d();
                return;
            }
            j.f33800h.setVisibility(8);
            j.f33796d.setVisibility(0);
            j.f33798f.setVisibility(0);
            if (j.f33811t.size() != list.size()) {
                j.f33811t = list;
                p147l9.h hVar = j.f33809r;
                hVar.f36795b = J.a(j.f33797e.getText().toString(), list);
                hVar.notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        OnlineControlUnitListFragment this$0 = (OnlineControlUnitListFragment) this.f2432b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(str, "<anonymous parameter 0>");
        SfdUnlockDialogOrigin sfdUnlockDialogOriginD = this$0.V().f32077L.d();
        if (sfdUnlockDialogOriginD == null) {
            throw new IllegalStateException("Unknown SFD unlock origin");
        }
        if (sfdUnlockDialogOriginD == SfdUnlockDialogOrigin.f32108c) {
            this$0.V().n();
        } else {
            this$0.Y().c();
        }
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        boolean z10;
        i iVar = (i) this.f2432b;
        iVar.getClass();
        if (gVar.o()) {
            D7.e eVar = iVar.f2436d;
            synchronized (eVar) {
                eVar.f2836c = p191p5.j.e(null);
            }
            D7.o oVar = eVar.f2835b;
            synchronized (oVar) {
                oVar.f2869a.deleteFile(oVar.f2870b);
            }
            com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) gVar.k();
            if (bVar != null) {
                JSONArray jSONArray = bVar.f28588d;
                p157m6.b bVar2 = iVar.f2434b;
                if (bVar2 != null) {
                    try {
                        bVar2.c(i.d(jSONArray));
                    } catch (AbtException unused) {
                    } catch (JSONException e10) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                    }
                }
                E7.e eVar2 = iVar.f2443l;
                try {
                    G7.c cVarA = eVar2.f3123b.a(bVar);
                    Iterator<G7.f> it = eVar2.f3125d.iterator();
                    while (it.hasNext()) {
                        eVar2.f3124c.execute(new E7.c(it.next(), 0, cVarA));
                    }
                } catch (FirebaseRemoteConfigException unused2) {
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // p191p5.e
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.f2432b).lambda$handleProxiedNotificationData$5((C0754a) obj);
    }
}
