package com.voltasit.obdeleven.presentation.vagpromo;

import J8.d;
import J8.u;
import K5.q;
import Z3.RunnableC0837c;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagRedirectPromo;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: VagProRedirectPromoPresenter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VagProRedirectPromoPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.a f33360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f33361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f33362c;

    public VagProRedirectPromoPresenter(J8.a aVar, u uVar, d dVar) {
        this.f33360a = aVar;
        this.f33361b = uVar;
        this.f33362c = dVar.getContext().getApplicationContext().getApplicationContext().getSharedPreferences("vag_pro_redirect_promo", 0);
    }

    public final void a(final Fragment fragment, final Runnable runnable) {
        if (fragment == null) {
            runnable.run();
            return;
        }
        if (!this.f33361b.h()) {
            runnable.run();
            return;
        }
        if (this.f33362c.getLong("vagProRedirect.suppressedUntil", 0L) > System.currentTimeMillis()) {
            runnable.run();
            return;
        }
        y parentFragmentManager = fragment.getParentFragmentManager();
        i.d(parentFragmentManager, "getParentFragmentManager(...)");
        if (parentFragmentManager.D("VagProRedirectPromoDialogFragment") != null) {
            runnable.run();
            return;
        }
        final c cVar = new c();
        cVar.f33366r = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter$presentIfNeeded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                this.this$0.f33360a.f(AnalyticsProvider$EventParamValue$VagRedirectPromo.RedirectToMain);
                ActivityC1347l activityC1347lRequireActivity = fragment.requireActivity();
                i.d(activityC1347lRequireActivity, "requireActivity(...)");
                com.voltasit.obdeleven.ui.activity.a.a(activityC1347lRequireActivity);
                cVar.o();
                return r.f47939a;
            }
        };
        cVar.f33367s = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter$presentIfNeeded$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                this.this$0.f33360a.f(AnalyticsProvider$EventParamValue$VagRedirectPromo.Cancel);
                SharedPreferences prefs = this.this$0.f33362c;
                i.d(prefs, "prefs");
                SharedPreferences.Editor editorEdit = prefs.edit();
                editorEdit.putLong("vagProRedirect.suppressedUntil", System.currentTimeMillis() + 604800000);
                editorEdit.apply();
                cVar.o();
                View view = fragment.getView();
                if (view != null) {
                    view.post(new q(2, runnable));
                } else {
                    fragment.requireActivity().runOnUiThread(new RunnableC0837c(3, runnable));
                }
                return r.f47939a;
            }
        };
        cVar.v(parentFragmentManager, "VagProRedirectPromoDialogFragment");
    }
}
