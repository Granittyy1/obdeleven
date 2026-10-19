package com.voltasit.obdeleven.ui.dialogs.autocodeprogress;

import B8.AbstractC0645p;
import Ia.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.braze.ui.inappmessage.views.d;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.models.AutocodingState;
import com.voltasit.obdeleven.presentation.dialogs.e;
import com.voltasit.obdeleven.presentation.profile.k;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import p109i8.h;
import p293xa.r;

/* JADX INFO: compiled from: AutocodeProgressDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AutocodeProgressDialog extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<? extends h> f33886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0645p f33887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p110i9.a f33888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f33889v;

    /* JADX INFO: compiled from: AutocodeProgressDialog.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f33890b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f33890b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f33890b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33890b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33890b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33890b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog$special$$inlined$viewModel$default$1] */
    public AutocodeProgressDialog() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                List<? extends h> list = this.this$0.f33886s;
                if (list != null) {
                    return I.e.j(list);
                }
                i.m("gateways");
                throw null;
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog$special$$inlined$viewModel$default$1
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
        this.f33889v = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b] */
            @Override // Ia.a
            public final b invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r10;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(b.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final b B() {
        return (b) this.f33889v.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        M0.h hVarA = M0.e.a(inflater, R.layout.dialog_autocode_progress, viewGroup, false, null);
        i.d(hVarA, "inflate(...)");
        this.f33887t = (AbstractC0645p) hVarA;
        B().f33902k.e(getViewLifecycleOwner(), new a(new l<AutocodingState, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(AutocodingState autocodingState) {
                AutocodingState autocodingState2 = autocodingState;
                AutocodeProgressDialog autocodeProgressDialog = this.this$0;
                i.b(autocodingState2);
                autocodeProgressDialog.getClass();
                int iOrdinal = autocodingState2.ordinal();
                if (iOrdinal == 0) {
                    AbstractC0645p abstractC0645p = autocodeProgressDialog.f33887t;
                    if (abstractC0645p == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p.f2096s.setEnabled(true);
                    AbstractC0645p abstractC0645p2 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p2 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p2.f2096s.setOnClickListener(new a(autocodeProgressDialog, 0));
                    AbstractC0645p abstractC0645p3 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p3 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p3.f2095r.setOnClickListener(new k(autocodeProgressDialog, 2));
                } else if (iOrdinal == 1) {
                    AbstractC0645p abstractC0645p4 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p4 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p4.f2096s.setEnabled(false);
                    AbstractC0645p abstractC0645p5 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p5 == null) {
                        i.m("binding");
                        throw null;
                    }
                    Context contextRequireContext = autocodeProgressDialog.requireContext();
                    i.d(contextRequireContext, "requireContext(...)");
                    abstractC0645p5.f2096s.setTextColor(contextRequireContext.getResources().getColor(R.color.grey_l));
                    AbstractC0645p abstractC0645p6 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p6 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p6.f2095r.setVisibility(8);
                    AbstractC0645p abstractC0645p7 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p7 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p7.f2096s.setText(R.string.common_coding);
                } else if (iOrdinal == 2) {
                    AbstractC0645p abstractC0645p8 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p8 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p8.f2096s.setText(R.string.common_done);
                    AbstractC0645p abstractC0645p9 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p9 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p9.f2096s.setEnabled(true);
                    AbstractC0645p abstractC0645p10 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p10 == null) {
                        i.m("binding");
                        throw null;
                    }
                    Context contextRequireContext2 = autocodeProgressDialog.requireContext();
                    i.d(contextRequireContext2, "requireContext(...)");
                    abstractC0645p10.f2096s.setTextColor(contextRequireContext2.getResources().getColor(R.color.button_blue));
                    AbstractC0645p abstractC0645p11 = autocodeProgressDialog.f33887t;
                    if (abstractC0645p11 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0645p11.f2096s.setOnClickListener(new d(3, autocodeProgressDialog));
                }
                return r.f47939a;
            }
        }));
        B().f33901i.e(getViewLifecycleOwner(), new a(new l<List<? extends Q8.a>, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends Q8.a> list) {
                List<? extends Q8.a> list2 = list;
                AutocodeProgressDialog autocodeProgressDialog = this.this$0;
                i.b(list2);
                p110i9.a aVar = autocodeProgressDialog.f33888u;
                if (aVar != null) {
                    aVar.d(list2);
                    return r.f47939a;
                }
                i.m("adapter");
                throw null;
            }
        }));
        B().f33899g.e(getViewLifecycleOwner(), new a(new l<Short, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Short sh) {
                SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                sfdWizardFullScreenDialog.F(sh);
                sfdWizardFullScreenDialog.v(this.this$0.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                return r.f47939a;
            }
        }));
        Context context = getContext();
        p110i9.a aVar = new p110i9.a(context);
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        aVar.f36772d = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(context).c());
        this.f33888u = aVar;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        AbstractC0645p abstractC0645p = this.f33887t;
        if (abstractC0645p == null) {
            i.m("binding");
            throw null;
        }
        abstractC0645p.f2097t.setLayoutManager(linearLayoutManager);
        AbstractC0645p abstractC0645p2 = this.f33887t;
        if (abstractC0645p2 == null) {
            i.m("binding");
            throw null;
        }
        p110i9.a aVar2 = this.f33888u;
        if (aVar2 == null) {
            i.m("adapter");
            throw null;
        }
        abstractC0645p2.f2097t.setAdapter(aVar2);
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new I4.f(8, this));
        AbstractC0645p abstractC0645p3 = this.f33887t;
        if (abstractC0645p3 == null) {
            i.m("binding");
            throw null;
        }
        View view = abstractC0645p3.f4488d;
        i.d(view, "getRoot(...)");
        return view;
    }
}
