package com.voltasit.obdeleven.presentation.settings;

import B8.AbstractC0614a1;
import B8.AbstractC0638l0;
import Ia.l;
import M0.h;
import V8.C0828b;
import V8.C0829c;
import V8.C0830d;
import V8.w;
import X8.j;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.firebase.messaging.RunnableC2056t;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.controlUnit.basicsettings.g;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.d;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.k;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.M;
import com.voltasit.obdeleven.ui.dialogs.T;
import com.voltasit.obdeleven.ui.dialogs.r;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.bluetooth.o;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p293xa.e;

/* JADX INFO: compiled from: SettingsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingsFragment extends BaseFragment<AbstractC0638l0> implements DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public M f33079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f33080m = R.layout.fragment_settings;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f33081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0638l0 f33082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.voltasit.obdeleven.a f33083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public T f33084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public T f33085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public T f33086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public T f33087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r f33088u;

    /* JADX INFO: compiled from: SettingsFragment.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33089b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f33089b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33089b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33089b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33089b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33089b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.settings.SettingsFragment$special$$inlined$viewModel$default$1] */
    public SettingsFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ Fragment $this_viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_viewModel;
            }
        };
        this.f33081n = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<SettingsViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.settings.SettingsViewModel] */
            @Override // Ia.a
            public final SettingsViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(SettingsViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        SettingsViewModel settingsViewModelO = O();
        if (!settingsViewModelO.f33143Z0) {
            return super.A();
        }
        settingsViewModelO.f33123P0.j(p293xa.r.f47939a);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(h hVar) {
        int i10 = 4;
        int i11 = 3;
        int i12 = 1;
        int i13 = 2;
        AbstractC0638l0 abstractC0638l0 = (AbstractC0638l0) hVar;
        this.f33082o = abstractC0638l0;
        abstractC0638l0.t(O());
        abstractC0638l0.f2008H.f1858s.setHint(getString(R.string.view_settings_email_for_sharing));
        AbstractC0614a1 abstractC0614a1 = abstractC0638l0.f2009I;
        abstractC0614a1.f1858s.setHint(getString(R.string.view_settings_unique_workshop_number));
        EditText editText = abstractC0614a1.f1857r;
        editText.setInputType(2);
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
        if (W7.c.f7066d instanceof o) {
            P();
        }
        z(O());
        O().f33124Q.e(getViewLifecycleOwner(), new g(this, i13));
        O().f33132U.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.b(this, i13));
        O().f33140Y.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.c(this, i13));
        O().f33150e0.e(getViewLifecycleOwner(), new d(this, i11));
        O().f33158m0.e(getViewLifecycleOwner(), new X8.e(this, i13));
        O().f33161o0.e(getViewLifecycleOwner(), new X8.f(this, i10));
        O().f33167r0.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.f(this, i13));
        O().f33169s0.e(getViewLifecycleOwner(), new X8.h(this, i11));
        O().f33173u0.e(getViewLifecycleOwner(), new a(new l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$9
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                if (num2 == null) {
                    AbstractC0638l0 abstractC0638l1 = this.this$0.f33082o;
                    if (abstractC0638l1 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0638l1.f2008H.f1858s.setError("");
                    AbstractC0638l0 abstractC0638l2 = this.this$0.f33082o;
                    if (abstractC0638l2 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0638l2.f2008H.f1858s.clearFocus();
                } else {
                    SettingsFragment settingsFragment = this.this$0;
                    AbstractC0638l0 abstractC0638l3 = settingsFragment.f33082o;
                    if (abstractC0638l3 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0638l3.f2008H.f1858s.setError(settingsFragment.getString(num2.intValue()));
                }
                return p293xa.r.f47939a;
            }
        }));
        O().f33178x0.e(getViewLifecycleOwner(), new a(new l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$10
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                if (num2 == null) {
                    AbstractC0638l0 abstractC0638l1 = this.this$0.f33082o;
                    if (abstractC0638l1 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0638l1.f2009I.f1858s.setError("");
                    AbstractC0638l0 abstractC0638l2 = this.this$0.f33082o;
                    if (abstractC0638l2 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0638l2.f2009I.f1858s.clearFocus();
                } else {
                    SettingsFragment settingsFragment = this.this$0;
                    AbstractC0638l0 abstractC0638l3 = settingsFragment.f33082o;
                    if (abstractC0638l3 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0638l3.f2009I.f1858s.setError(settingsFragment.getString(num2.intValue()));
                }
                return p293xa.r.f47939a;
            }
        }));
        O().f33093A0.e(getViewLifecycleOwner(), new X8.i(this, i10));
        O().f33182z0.e(getViewLifecycleOwner(), new j(this, i10));
        O().f33101E0.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.j(this, i13));
        O().f33097C0.e(getViewLifecycleOwner(), new k(this, i13));
        O().f33113K0.e(getViewLifecycleOwner(), new androidx.compose.runtime.livedata.a(i12, this));
        O().f33109I0.e(getViewLifecycleOwner(), new D() { // from class: com.voltasit.obdeleven.presentation.settings.c
            @Override // androidx.lifecycle.D
            public final void d(Object obj) {
                Bundle bundle = (Bundle) obj;
                SettingsFragment this$0 = this.f33196b;
                i.e(this$0, "this$0");
                i.b(bundle);
                com.voltasit.obdeleven.ui.module.b bVar = new com.voltasit.obdeleven.ui.module.b();
                bVar.setArguments(bundle);
                RunnableC2056t runnableC2056t = new RunnableC2056t(this$0, 1, bVar);
                if (this$0.j) {
                    runnableC2056t.run();
                } else {
                    this$0.f34084d = runnableC2056t;
                }
            }
        });
        O().f33105G0.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.garage.g(this, i12));
        O().f33117M0.e(getViewLifecycleOwner(), new C0828b(this, i13));
        O().f33121O0.e(getViewLifecycleOwner(), new C0829c(this, i13));
        O().f33125Q0.e(getViewLifecycleOwner(), new C0830d(this, i13));
        O().f32120i.e(getViewLifecycleOwner(), new w(this, i11));
        O().f33129S0.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$22
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                Context contextRequireContext = this.this$0.requireContext();
                i.d(contextRequireContext, "requireContext(...)");
                new com.voltasit.obdeleven.presentation.dialogs.k(contextRequireContext).show();
                return p293xa.r.f47939a;
            }
        }));
        O().f33133U0.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$23
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                Context contextRequireContext = this.this$0.requireContext();
                i.d(contextRequireContext, "requireContext(...)");
                new com.voltasit.obdeleven.presentation.dialogs.j(contextRequireContext).show();
                return p293xa.r.f47939a;
            }
        }));
        O().f33137W0.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$24
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                final SettingsFragment settingsFragment = this.this$0;
                settingsFragment.K(new l<DialogInterface, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$24.1
                    @Override // Ia.l
                    public final p293xa.r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        return p293xa.r.f47939a;
                    }
                }, new l<DialogInterface, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$24.2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        settingsFragment.O().d();
                        return p293xa.r.f47939a;
                    }
                });
                return p293xa.r.f47939a;
            }
        }));
        O().f33141Y0.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$25
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                final SettingsFragment settingsFragment = this.this$0;
                settingsFragment.K(new l<DialogInterface, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$25.1
                    @Override // Ia.l
                    public final p293xa.r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        return p293xa.r.f47939a;
                    }
                }, new l<DialogInterface, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.settings.SettingsFragment$setupObservers$25.2
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(DialogInterface dialogInterface) {
                        DialogInterface it = dialogInterface;
                        i.e(it, "it");
                        settingsFragment.O().e();
                        return p293xa.r.f47939a;
                    }
                });
                return p293xa.r.f47939a;
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final SettingsViewModel O() {
        return (SettingsViewModel) this.f33081n.getValue();
    }

    public final void P() {
        AbstractC0638l0 abstractC0638l0 = this.f33082o;
        if (abstractC0638l0 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0638l0.f2001A.setVisibility(0);
        AbstractC0638l0 abstractC0638l1 = this.f33082o;
        if (abstractC0638l1 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0638l1.f2037z.setVisibility(0);
        int[] iArr = {-65281, -16776961, -16711936, -256, -65536};
        AbstractC0638l0 abstractC0638l2 = this.f33082o;
        if (abstractC0638l2 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0638l2.f2002B.setShowAlphaBar(true);
        AbstractC0638l0 abstractC0638l3 = this.f33082o;
        if (abstractC0638l3 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0638l3.f2002B.setColorSeeds(iArr);
        AbstractC0638l0 abstractC0638l4 = this.f33082o;
        if (abstractC0638l4 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0638l4.f2002B.setBarHeight(6.0f);
        AbstractC0638l0 abstractC0638l5 = this.f33082o;
        if (abstractC0638l5 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0638l5.f2002B.setThumbHeight(16.0f);
        AbstractC0638l0 abstractC0638l6 = this.f33082o;
        if (abstractC0638l6 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0638l6.f2013M.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.settings.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsFragment this$0 = this.f33193b;
                i.e(this$0, "this$0");
                SettingsViewModel settingsViewModelO = this$0.O();
                AbstractC0638l0 abstractC0638l7 = this$0.f33082o;
                if (abstractC0638l7 == null) {
                    i.m("binding");
                    throw null;
                }
                String hexString = Integer.toHexString(abstractC0638l7.f2002B.getColor());
                i.d(hexString, "toHexString(...)");
                String strSubstring = hexString.substring(2);
                i.d(strSubstring, "substring(...)");
                settingsViewModelO.getClass();
                C2680e.c(Z.a(settingsViewModelO), settingsViewModelO.f32112a, null, new SettingsViewModel$clickWriteColor$1(settingsViewModelO, strSubstring, null), 2);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        Bundle bundle;
        String string;
        String string2;
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        switch (dialogId.hashCode()) {
            case -2005515464:
                if (dialogId.equals("orientationDialog")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        int i10 = data.getInt("key_selected_item", -1);
                        if (i10 == 0 && q().E()) {
                            com.voltasit.obdeleven.a aVar = this.f33083p;
                            i.b(aVar);
                            aVar.j("is_landscape", false);
                            MainActivity.N(q(), false, false, 3);
                        }
                        if (i10 == 1 && !q().E()) {
                            com.voltasit.obdeleven.a aVar2 = this.f33083p;
                            i.b(aVar2);
                            aVar2.j("is_landscape", true);
                            MainActivity.N(q(), false, false, 3);
                        }
                    }
                    T t8 = this.f33084q;
                    if (t8 != null) {
                        t8.y();
                        this.f33084q = null;
                    }
                }
                break;
            case -679765312:
                if (dialogId.equals("languageDialog")) {
                    SettingsViewModel settingsViewModelO = O();
                    settingsViewModelO.getClass();
                    int i11 = data.getInt("key_selected_item", -1);
                    if (callbackType == DialogCallback.CallbackType.f31102c && (bundle = data.getBundle("key_bundle")) != null) {
                        boolean z10 = bundle.getBoolean("key_app_db");
                        String string3 = bundle.getString("key_app_language");
                        if (string3 != null) {
                            com.voltasit.obdeleven.presentation.d.a aVar3 = settingsViewModelO.f32112a;
                            if (z10) {
                                C2680e.c(Z.a(settingsViewModelO), aVar3, null, new SettingsViewModel$handleDatabaseLanguageSelection$1(i11, DatabaseLanguage.valueOf(string3), settingsViewModelO, null), 2);
                            } else {
                                C2680e.c(Z.a(settingsViewModelO), aVar3, null, new SettingsViewModel$handleApplicationLanguageSelection$1(i11, ApplicationLanguage.valueOf(string3), settingsViewModelO, null), 2);
                            }
                        }
                    }
                    T t10 = this.f33087t;
                    if (t10 != null) {
                        t10.y();
                        this.f33087t = null;
                    }
                    break;
                }
                break;
            case -401939889:
                if (dialogId.equals("startViewDialog")) {
                    SettingsViewModel settingsViewModelO2 = O();
                    settingsViewModelO2.getClass();
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        int i12 = data.getInt("key_selected_item", -1);
                        C<Y8.b> c10 = settingsViewModelO2.f33126R;
                        p279w9.a aVar4 = p279w9.a.f47808e;
                        K8.b bVar = settingsViewModelO2.f33170t;
                        K8.o oVar = settingsViewModelO2.f33160o;
                        if (i12 == 0) {
                            oVar.O(StartView.AUTO);
                            bVar.g(aVar4);
                            c10.j(Y8.c.a(R.string.view_settings_auto, true));
                            settingsViewModelO2.f33143Z0 = true;
                        } else if (i12 != 1) {
                            settingsViewModelO2.f33099D0.j(p293xa.r.f47939a);
                        } else {
                            oVar.O(StartView.GARAGE);
                            bVar.g(aVar4);
                            c10.j(Y8.c.a(R.string.common_garage, true));
                            settingsViewModelO2.f33143Z0 = true;
                        }
                    }
                    T t11 = this.f33085r;
                    if (t11 != null) {
                        t11.y();
                        this.f33085r = null;
                    }
                    break;
                }
                break;
            case 992562089:
                if (dialogId.equals("ChangeDevicePasswordDialog")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c && (string = data.getString("key_new_pass")) != null) {
                        SettingsViewModel settingsViewModelO3 = O();
                        settingsViewModelO3.getClass();
                        C2680e.c(Z.a(settingsViewModelO3), settingsViewModelO3.f32112a, null, new SettingsViewModel$handleDevicePasswordChange$1(settingsViewModelO3, string, null), 2);
                    }
                    r rVar = this.f33088u;
                    if (rVar != null) {
                        rVar.y();
                    }
                    this.f33088u = null;
                    break;
                }
                break;
            case 1249909734:
                if (dialogId.equals("changeBackgroundDialog")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c) {
                        if (data.getInt("key_selected_item", -1) == 0) {
                            O().f33115L0.j(3);
                        } else {
                            O().f33119N0.j(4);
                        }
                    } else if (callbackType == DialogCallback.CallbackType.f31103d) {
                        if (data.getInt("key_selected_item", -1) == 0) {
                            SettingsViewModel settingsViewModelO4 = O();
                            settingsViewModelO4.f33175w.a();
                            settingsViewModelO4.f33160o.k0();
                            settingsViewModelO4.f33111J0.j(p293xa.r.f47939a);
                        } else {
                            SettingsViewModel settingsViewModelO5 = O();
                            settingsViewModelO5.f33175w.d();
                            settingsViewModelO5.f33160o.c();
                            settingsViewModelO5.f33111J0.j(p293xa.r.f47939a);
                        }
                    }
                    T t12 = this.f33086s;
                    if (t12 != null) {
                        t12.y();
                    }
                    this.f33086s = null;
                    break;
                }
                break;
            case 1508016489:
                if (dialogId.equals("CalibrateDeviceVoltageDialog")) {
                    if (callbackType == DialogCallback.CallbackType.f31102c && (string2 = data.getString("key_input")) != null) {
                        SettingsViewModel settingsViewModelO6 = O();
                        settingsViewModelO6.getClass();
                        C2680e.c(Z.a(settingsViewModelO6), settingsViewModelO6.f32112a, null, new SettingsViewModel$handleVoltageCalibrateVoltage$1(settingsViewModelO6, string2, null), 2);
                    }
                    M m7 = this.f33079l;
                    if (m7 != null) {
                        m7.y();
                    }
                    this.f33079l = null;
                    break;
                }
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "SettingsFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        J8.h.a aVarB;
        int i12;
        String str;
        SettingsViewModel settingsViewModelO = O();
        settingsViewModelO.getClass();
        if (i11 == -1) {
            if (i10 == 3 || i10 == 4) {
                if (intent != null) {
                    J8.h hVar = settingsViewModelO.f33172u;
                    if (i10 == 3) {
                        aVarB = hVar.d();
                        str = "background.jpg";
                        i12 = 5;
                    } else {
                        aVarB = hVar.b();
                        i12 = 6;
                        str = "menu_background.jpg";
                    }
                    Uri data = intent.getData();
                    if (data == null) {
                        return;
                    }
                    settingsViewModelO.f33103F0.j(new SettingsViewModel.a(i10 == 3, data, settingsViewModelO.f33175w.b(str), aVarB.f4045a, aVarB.f4046b, i12));
                    return;
                }
                return;
            }
            U7.a<Bundle> aVar = settingsViewModelO.f33107H0;
            if (i10 == 5) {
                if (intent != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("uri", (Uri) intent.getParcelableExtra("output"));
                    bundle.putInt("type", 0);
                    aVar.j(bundle);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (intent != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("uri", (Uri) intent.getParcelableExtra("output"));
                    bundle2.putInt("type", 1);
                    aVar.j(bundle2);
                    return;
                }
                return;
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        this.f33083p = com.voltasit.obdeleven.a.C0320a.a(q());
        getString(R.string.common_show);
        getString(R.string.common_hide);
        getString(R.string.common_include);
        getString(R.string.common_exclude);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f33080m;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_settings);
        i.d(string, "getString(...)");
        return string;
    }
}
