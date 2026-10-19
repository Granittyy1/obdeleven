package com.voltasit.obdeleven.ui.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public class BaseActivity extends p100i.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33529b = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<J8.p>(this) { // from class: com.voltasit.obdeleven.ui.activity.BaseActivity$special$$inlined$inject$default$1
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ Pb.a $qualifier = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_inject = this;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [J8.p, java.lang.Object] */
        @Override // Ia.a
        public final J8.p invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            Pb.a aVar = this.$qualifier;
            return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(J8.p.class));
        }
    });

    @Override // p100i.d, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context base) {
        Context contextCreateConfigurationContext;
        kotlin.jvm.internal.i.e(base, "base");
        w().e("MainActivity", "attachBaseContext()");
        try {
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            String strA = com.voltasit.obdeleven.a.C0320a.a(base).a("applicationLanguage", "");
            Locale localeF = strA.length() == 0 ? ApplicationLanguage.f30004b.f() : ApplicationLanguage.valueOf(strA).f();
            w().e("MainActivity", "Base context locale: " + localeF.getDisplayName());
            w().f("MainActivity", "updateResourcesLocale()");
            Configuration configuration = new Configuration();
            configuration.setLocale(localeF);
            contextCreateConfigurationContext = base.createConfigurationContext(configuration);
            kotlin.jvm.internal.i.d(contextCreateConfigurationContext, "createConfigurationContext(...)");
        } catch (Exception e10) {
            w().b("MainActivity", "Unable to set default language. Error: " + e10.getLocalizedMessage());
            contextCreateConfigurationContext = null;
        }
        if (contextCreateConfigurationContext != null) {
            base = contextCreateConfigurationContext;
        }
        super.attachBaseContext(base);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final J8.p w() {
        return (J8.p) this.f33529b.getValue();
    }
}
