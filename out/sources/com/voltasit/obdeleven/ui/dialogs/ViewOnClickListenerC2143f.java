package com.voltasit.obdeleven.ui.dialogs;

import G8.C0701c;
import P8.c;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.F;
import androidx.media3.exoplayer.C1406y;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2145g;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.AbstractControlUnitBackupUtil;
import com.voltasit.parse.model.CodingType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p110i9.p;
import p134k8.A1;
import p220r9.C2785q;
import p279w9.b;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2143f implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33936c;

    public /* synthetic */ ViewOnClickListenerC2143f(int i10, Object obj) {
        this.f33935b = i10;
        this.f33936c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseFragment<?> baseFragment;
        switch (this.f33935b) {
            case 0:
                C2147h c2147h = (C2147h) this.f33936c;
                c2147h.f33984s.f2128x.setError("");
                int i10 = c2147h.f33987v;
                if (i10 == 0) {
                    c2147h.f33984s.f2129y.setVisibility(8);
                    String string = c2147h.f33984s.f2128x.getEditText() != null ? c2147h.f33984s.f2128x.getEditText().getText().toString() : "";
                    c2147h.D(1);
                    c2147h.f33984s.f2115F.setText(R.string.common_scanning);
                    c2147h.f33984s.f2114E.setVisibility(8);
                    c2147h.f33984s.f2116G.setVisibility(8);
                    c2147h.f33984s.f2127w.setVisibility(8);
                    c2147h.f33984s.f2113D.setMax(100);
                    final C2785q c2785q = new C2785q(c2147h.f33985t);
                    c2147h.f33968z = c2785q;
                    final C2145g c2145g = new C2145g(c2147h, string);
                    final boolean zIsChecked = c2147h.f33984s.f2126v.f1923r.isChecked();
                    final boolean zIsChecked2 = c2147h.f33984s.f2122r.f1923r.isChecked();
                    final boolean zIsChecked3 = c2147h.f33984s.f2118I.f1923r.isChecked();
                    final boolean zIsChecked4 = c2147h.f33984s.f2123s.f1923r.isChecked();
                    final boolean zIsChecked5 = c2147h.f33984s.f2130z.f1923r.isChecked();
                    c2785q.f34210a = false;
                    Task.callInBackground(new Callable() { // from class: r9.p
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws InterruptedException {
                            int size;
                            C2785q c2785q2 = c2785q;
                            ControlUnit controlUnit = c2785q2.f46485m;
                            Task<Boolean> taskD = controlUnit.D(false);
                            taskD.waitForCompletion();
                            if (!taskD.getResult().booleanValue() || c2785q2.f34210a) {
                                return null;
                            }
                            boolean z10 = zIsChecked4;
                            if (z10) {
                                c2785q2.f34212c += (double) (c2785q2.l(controlUnit) == null ? 0 : c2785q2.l(controlUnit).size());
                            }
                            ControlUnitDB controlUnitDB = controlUnit.f29320b;
                            boolean z11 = zIsChecked;
                            if (z11) {
                                c2785q2.f34212c += (double) (!controlUnitDB.getCodingType().equals(CodingType.f34403c) ? 1 : 0);
                            }
                            boolean z12 = zIsChecked2;
                            if (z12) {
                                c2785q2.f34212c += (double) c2785q2.p(controlUnit);
                            }
                            boolean z13 = zIsChecked3;
                            if (z13) {
                                double d10 = c2785q2.f34212c;
                                try {
                                    size = controlUnit.c0(true).size();
                                } catch (ControlUnitException unused) {
                                    size = 0;
                                }
                                c2785q2.f34212c = d10 + ((double) size);
                            }
                            boolean z14 = zIsChecked5;
                            if (z14) {
                                c2785q2.f34212c = c2785q2.q(controlUnit) + c2785q2.f34212c;
                            }
                            if (c2785q2.f34210a) {
                                return null;
                            }
                            JSONObject jSONObject = new JSONObject();
                            c2785q2.f34214e = 100.0d / c2785q2.f34212c;
                            String str = "maxProgress=" + c2785q2.f34212c;
                            b bVar = Application.f29634b;
                            c.a(3, "ControlUnitBackupUtil", str, Arrays.copyOf(new Object[0], 0));
                            List<String> confirmedSecurityAccessCodesSync = controlUnitDB.getConfirmedSecurityAccessCodesSync();
                            C0701c c0701c = new C0701c(jSONObject);
                            AbstractControlUnitBackupUtil.s(c0701c, controlUnit);
                            C2145g c2145g2 = c2145g;
                            if (z10) {
                                c2785q2.b(jSONObject, c2145g2, controlUnit, confirmedSecurityAccessCodesSync);
                            }
                            if (z11) {
                                c2785q2.e(jSONObject, c2145g2, controlUnit);
                            }
                            if (z12) {
                                c2785q2.a(jSONObject, c2145g2, controlUnit, confirmedSecurityAccessCodesSync);
                            }
                            if (z13) {
                                c2785q2.j(jSONObject, c2145g2, controlUnit);
                            }
                            if (z14) {
                                c2785q2.h(jSONObject, c2145g2, controlUnit, confirmedSecurityAccessCodesSync);
                            }
                            controlUnit.a();
                            return c0701c;
                        }
                    }).continueWith(new V8.g(c2785q, 6, c2145g), Task.UI_THREAD_EXECUTOR);
                } else if (i10 == 1) {
                    c2147h.f33984s.f2115F.setText(R.string.common_cancelling);
                    c2147h.f33968z.f34210a = true;
                } else if (i10 == 2 || i10 == 4) {
                    c2147h.y();
                }
                break;
            case 1:
                p060e9.e eVar = (p060e9.e) this.f33936c;
                ControlUnit controlUnit = eVar.f35048t;
                if (controlUnit instanceof p109i8.i) {
                    p073f9.k kVar = new p073f9.k();
                    kVar.f35016w = eVar.f35048t;
                    kVar.f35017x = null;
                    baseFragment = kVar;
                } else if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                    p073f9.l lVar = new p073f9.l();
                    lVar.f35016w = eVar.f35048t;
                    lVar.f35017x = null;
                    baseFragment = lVar;
                } else {
                    p073f9.i iVar = new p073f9.i();
                    iVar.f35016w = eVar.f35048t;
                    iVar.f35017x = null;
                    iVar.f35050E = null;
                    baseFragment = iVar;
                }
                eVar.r().n(baseFragment, null);
                break;
            default:
                i9.p.a aVar = (i9.p.a) this.f33936c;
                C1406y c1406y = p110i9.p.this.f36822e;
                if (c1406y != null) {
                    final int adapterPosition = aVar.getAdapterPosition();
                    final p182o9.c cVar = (p182o9.c) c1406y.f18831b;
                    if (adapterPosition < 0) {
                        cVar.getClass();
                    } else {
                        ((p109i8.i) cVar.f31997n).m(new i8.i.b() { // from class: o9.a
                            @Override // i8.i.b
                            public final void a() {
                                c cVar2 = cVar;
                                if (cVar2.f45243x.f36779a.size() > 1) {
                                    ArrayList<String> arrayList = cVar2.f45244y;
                                    List<T> list = cVar2.f45243x.f36779a;
                                    int i11 = adapterPosition;
                                    arrayList.remove(((A1) list.get(i11)).f42568a.name());
                                    p pVar = cVar2.f45243x;
                                    pVar.c((A1) pVar.f36779a.get(i11));
                                    cVar2.f45243x.notifyItemRemoved(i11);
                                    new Handler().postDelayed(new F(1, cVar2), 1000L);
                                }
                            }
                        });
                    }
                }
                break;
        }
    }
}
