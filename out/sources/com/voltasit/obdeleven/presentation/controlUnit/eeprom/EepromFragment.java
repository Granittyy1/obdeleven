package com.voltasit.obdeleven.presentation.controlUnit.eeprom;

import B8.AbstractC0626f0;
import Ia.l;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.login.r;
import com.google.android.gms.internal.measurement.M1;
import com.google.android.material.textfield.TextInputEditText;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.parse.model.HistoryDB;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlinx.coroutines.C2680e;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p220r9.x;
import p255u9.E;
import p255u9.z;

/* JADX INFO: compiled from: EepromFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class EepromFragment extends BaseFragment<M0.h> implements DialogCallback, i9.c.a<EepromData>, View.OnLongClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f31538A;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC0626f0 f31539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ControlUnit f31540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.controlUnit.eeprom.a f31541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f31542o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f31543p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f31544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f31545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HistoryDB f31546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f31549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B0 f31550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f31551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f31552y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f31553z;

    /* JADX INFO: compiled from: EepromFragment.kt */
    public static final class EepromData implements Serializable {
        private final String changedVal;
        private final String key;
        private final String originalVal;

        public EepromData(String key, String changedVal, String originalVal) {
            i.e(key, "key");
            i.e(changedVal, "changedVal");
            i.e(originalVal, "originalVal");
            this.key = key;
            this.changedVal = changedVal;
            this.originalVal = originalVal;
        }

        public final String a() {
            return this.changedVal;
        }

        public final String b() {
            return this.key;
        }

        public final String c() {
            return this.originalVal;
        }
    }

    /* JADX INFO: compiled from: EepromFragment.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31554b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f31554b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31554b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31554b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f31554b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f31554b.hashCode();
        }
    }

    /* JADX INFO: compiled from: EepromFragment.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable s10) {
            i.e(s10, "s");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
            i.e(s10, "s");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
            i.e(s10, "s");
            EepromFragment.this.R(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$special$$inlined$viewModel$default$1] */
    public EepromFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$special$$inlined$viewModel$default$1
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
        this.f31552y = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<h>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlUnit.eeprom.h] */
            @Override // Ia.a
            public final h invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(h.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
        this.f31553z = KoinJavaComponent.b(SfdViewModel.class, null, new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$sfdViewModel$1
            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(Feature.Eeprom);
            }
        });
        this.f31538A = new b();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        if (!this.f31545r || this.f31544q) {
            return super.A();
        }
        C2137c.b(getActivity(), R.string.common_discard_changes, R.string.common_ok, R.string.common_cancel).continueWith(new p009a8.c(4, this), Task.UI_THREAD_EXECUTOR);
        return true;
    }

    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        M0.h hVarA = M0.e.a(inflater, R.layout.fragment_input_eeprom, viewGroup, false, null);
        i.d(hVarA, "inflate(...)");
        AbstractC0626f0 abstractC0626f0 = (AbstractC0626f0) hVarA;
        this.f31539l = abstractC0626f0;
        abstractC0626f0.t(this);
        if (this.f31540m == null) {
            AbstractC0626f0 abstractC0626f1 = this.f31539l;
            if (abstractC0626f1 == null) {
                i.m("binding");
                throw null;
            }
            View view = abstractC0626f1.f4488d;
            i.d(view, "getRoot(...)");
            return view;
        }
        if (bundle != null) {
            this.f31546s = (HistoryDB) bundle.getParcelable("key_history_db");
        } else if (getArguments() != null) {
            this.f31546s = (HistoryDB) requireArguments().getParcelable("key_history_db");
        }
        if (this.f31546s == null) {
            ControlUnit controlUnit = this.f31540m;
            i.b(controlUnit);
            if (controlUnit.f29327i == ApplicationProtocol.f29263c) {
                AbstractC0626f0 abstractC0626f2 = this.f31539l;
                if (abstractC0626f2 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0626f2.f1913w.setText("33");
                AbstractC0626f0 abstractC0626f3 = this.f31539l;
                if (abstractC0626f3 == null) {
                    i.m("binding");
                    throw null;
                }
                abstractC0626f3.f1913w.setEnabled(false);
            }
        }
        this.f31544q = this.f31546s != null;
        com.voltasit.obdeleven.presentation.controlUnit.eeprom.a aVar = new com.voltasit.obdeleven.presentation.controlUnit.eeprom.a(requireContext());
        this.f31541n = aVar;
        AbstractC0626f0 abstractC0626f4 = this.f31539l;
        if (abstractC0626f4 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f4.f1914x.setAdapter(aVar);
        AbstractC0626f0 abstractC0626f5 = this.f31539l;
        if (abstractC0626f5 == null) {
            i.m("binding");
            throw null;
        }
        RecyclerView recyclerView = abstractC0626f5.f1914x;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        AbstractC0626f0 abstractC0626f6 = this.f31539l;
        if (abstractC0626f6 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f6.f1914x.setLayoutManager(linearLayoutManager);
        AbstractC0626f0 abstractC0626f7 = this.f31539l;
        if (abstractC0626f7 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f7.f1914x.setHasFixedSize(true);
        com.voltasit.obdeleven.presentation.controlUnit.eeprom.a aVar2 = this.f31541n;
        i.b(aVar2);
        aVar2.f36781c = this;
        AbstractC0626f0 abstractC0626f8 = this.f31539l;
        if (abstractC0626f8 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f8.f1911u.setOnLongClickListener(this);
        AbstractC0626f0 abstractC0626f9 = this.f31539l;
        if (abstractC0626f9 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f9.f1914x.setNestedScrollingEnabled(false);
        AbstractC0626f0 abstractC0626f10 = this.f31539l;
        if (abstractC0626f10 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f10.f1910t.setVisibility(4);
        AbstractC0626f0 abstractC0626f11 = this.f31539l;
        if (abstractC0626f11 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f11.f1913w.setText("33");
        R(0);
        if (this.f31544q) {
            HistoryDB historyDB = this.f31546s;
            i.b(historyDB);
            String strOptString = historyDB.d().optString("oldValue");
            HistoryDB historyDB2 = this.f31546s;
            i.b(historyDB2);
            String strOptString2 = historyDB2.d().optString("newValue");
            HistoryDB historyDB3 = this.f31546s;
            i.b(historyDB3);
            String strOptString3 = historyDB3.d().optString("address");
            AbstractC0626f0 abstractC0626f12 = this.f31539l;
            if (abstractC0626f12 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0626f12.f1912v.setVisibility(8);
            AbstractC0626f0 abstractC0626f13 = this.f31539l;
            if (abstractC0626f13 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0626f13.f1911u.h();
            com.voltasit.obdeleven.presentation.controlUnit.eeprom.a aVar3 = this.f31541n;
            i.b(aVar3);
            i.b(strOptString3);
            i.b(strOptString2);
            i.b(strOptString);
            aVar3.d(M1.k(new EepromData(strOptString3, strOptString2, strOptString)));
            AbstractC0626f0 abstractC0626f14 = this.f31539l;
            if (abstractC0626f14 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0626f14.f1910t.setVisibility(0);
            S(strOptString, strOptString2, strOptString3);
        }
        AbstractC0626f0 abstractC0626f15 = this.f31539l;
        if (abstractC0626f15 == null) {
            i.m("binding");
            throw null;
        }
        TextInputEditText textInputEditText = abstractC0626f15.f1908r;
        b bVar = this.f31538A;
        textInputEditText.addTextChangedListener(bVar);
        AbstractC0626f0 abstractC0626f16 = this.f31539l;
        if (abstractC0626f16 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f16.f1909s.addTextChangedListener(bVar);
        AbstractC0626f0 abstractC0626f17 = this.f31539l;
        if (abstractC0626f17 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f17.f1913w.addTextChangedListener(bVar);
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new r(this));
        getChildFragmentManager().b0("SfdAutoUnlockDialog", this, new S6.i(4, this));
        ?? r10 = this.f31553z;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((SfdViewModel) r10.getValue()).f31218u.e(getViewLifecycleOwner(), new a(new l<Integer, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$setupSfdObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Integer num) {
                Integer num2 = num;
                com.voltasit.obdeleven.presentation.dialogs.i iVar = new com.voltasit.obdeleven.presentation.dialogs.i();
                i.b(num2);
                iVar.w(num2.intValue());
                iVar.v(this.this$0.getChildFragmentManager(), "SfdRateLimitDialog");
                return p293xa.r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31207A.e(getViewLifecycleOwner(), new a(new l<Short, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$setupSfdObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Short sh) {
                if (this.this$0.f31540m != null) {
                    SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                    ControlUnit controlUnit2 = this.this$0.f31540m;
                    i.b(controlUnit2);
                    sfdWizardFullScreenDialog.F(controlUnit2.n());
                    sfdWizardFullScreenDialog.v(this.this$0.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                }
                return p293xa.r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31220w.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$setupSfdObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                EepromFragment eepromFragment = this.this$0;
                eepromFragment.P().getClass();
                eepromFragment.O(0);
                return p293xa.r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31222y.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$setupSfdObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                this.this$0.P().getClass();
                this.this$0.getClass();
                this.this$0.Q();
                return p293xa.r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31209C.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$setupSfdObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                new SfdAutoUnlockDialog().v(this.this$0.getChildFragmentManager(), "SfdAutoUnlockDialog");
                return p293xa.r.f47939a;
            }
        }));
        z(P());
        P().f31584q.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                this.this$0.T();
                return p293xa.r.f47939a;
            }
        }));
        P().f31586s.e(getViewLifecycleOwner(), new a(new l<p293xa.r, p293xa.r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(p293xa.r rVar) {
                new com.voltasit.obdeleven.presentation.dialogs.f(0).J(this.this$0);
                return p293xa.r.f47939a;
            }
        }));
        AbstractC0626f0 abstractC0626f18 = this.f31539l;
        if (abstractC0626f18 == null) {
            i.m("binding");
            throw null;
        }
        View view2 = abstractC0626f18.f4488d;
        i.d(view2, "getRoot(...)");
        return view2;
    }

    public final void O(int i10) {
        B0 b10 = this.f31550w;
        if (b10 == null || !b10.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_action", i10);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("key_login_finder_enabled", false);
            bundle2.putBundle("key_bundle", bundle);
            B0 b11 = new B0();
            b11.setArguments(bundle2);
            b11.setTargetFragment(this, 0);
            b11.f32261r = getFragmentManager();
            this.f31550w = b11;
            b11.f33753w = this.f31540m;
            b11.A();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final h P() {
        return (h) this.f31552y.getValue();
    }

    public final void Q() {
        AbstractC0626f0 abstractC0626f0 = this.f31539l;
        if (abstractC0626f0 == null) {
            i.m("binding");
            throw null;
        }
        String strValueOf = String.valueOf(abstractC0626f0.f1908r.getText());
        AbstractC0626f0 abstractC0626f1 = this.f31539l;
        if (abstractC0626f1 == null) {
            i.m("binding");
            throw null;
        }
        String strValueOf2 = String.valueOf(abstractC0626f1.f1909s.getText());
        AbstractC0626f0 abstractC0626f2 = this.f31539l;
        if (abstractC0626f2 == null) {
            i.m("binding");
            throw null;
        }
        String strValueOf3 = String.valueOf(abstractC0626f2.f1913w.getText());
        if (TextUtils.isEmpty(strValueOf)) {
            E(R.string.snackbar_enter_address);
            return;
        }
        if (TextUtils.isEmpty(strValueOf2)) {
            E(R.string.snackbar_enter_length);
            return;
        }
        if (TextUtils.isEmpty(strValueOf3)) {
            E(R.string.snackbar_enter_alfid);
            return;
        }
        if (TextUtils.isEmpty(strValueOf) || !strValueOf.matches("^[0-9a-fA-F]+$")) {
            E(R.string.snackbar_alfid_not_hex);
            return;
        }
        AbstractC0626f0 abstractC0626f3 = this.f31539l;
        if (abstractC0626f3 == null) {
            i.m("binding");
            throw null;
        }
        this.f31547t = Integer.parseInt(String.valueOf(abstractC0626f3.f1913w.getText()));
        AbstractC0626f0 abstractC0626f4 = this.f31539l;
        if (abstractC0626f4 == null) {
            i.m("binding");
            throw null;
        }
        this.f31549v = String.valueOf(abstractC0626f4.f1908r.getText());
        AbstractC0626f0 abstractC0626f5 = this.f31539l;
        if (abstractC0626f5 == null) {
            i.m("binding");
            throw null;
        }
        this.f31548u = Integer.parseInt(String.valueOf(abstractC0626f5.f1909s.getText()));
        H(R.string.view_eeprom_reading);
        ControlUnit controlUnit = this.f31540m;
        if (controlUnit != null) {
            controlUnit.D(false).continueWith(new p009a8.f(1, this));
        }
    }

    public final void R(int i10) {
        if (i10 == 0) {
            this.f31551x = true;
            AbstractC0626f0 abstractC0626f0 = this.f31539l;
            if (abstractC0626f0 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0626f0.f1911u.setImageBitmap(x.b("R"));
            AbstractC0626f0 abstractC0626f1 = this.f31539l;
            if (abstractC0626f1 == null) {
                i.m("binding");
                throw null;
            }
            abstractC0626f1.f1911u.setBackgroundTintList(getResources().getColorStateList(R.color.button_blue));
            return;
        }
        this.f31551x = false;
        AbstractC0626f0 abstractC0626f2 = this.f31539l;
        if (abstractC0626f2 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f2.f1911u.setImageBitmap(x.b("W"));
        AbstractC0626f0 abstractC0626f3 = this.f31539l;
        if (abstractC0626f3 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0626f3.f1911u.setBackgroundTintList(getResources().getColorStateList(R.color.button_green));
    }

    public final void S(String str, String str2, String str3) {
        this.f31543p = new ArrayList();
        String strG = new Regex("0x").g(str3);
        O.h.c(16);
        int i10 = Integer.parseInt(strG, 16);
        int i11 = 0;
        while (i11 < str2.length()) {
            int i12 = i11 + 16;
            String strSubstring = i12 > str.length() ? str.substring(i11) : str.substring(i11, i12);
            i.d(strSubstring, "substring(...)");
            String strSubstring2 = i12 > str2.length() ? str2.substring(i11) : str2.substring(i11, i12);
            i.d(strSubstring2, "substring(...)");
            ArrayList arrayList = this.f31543p;
            String str4 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            String strF = new Regex("..").f("$0 ", strSubstring2);
            int length = strF.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length) {
                boolean z11 = i.g(strF.charAt(!z10 ? i13 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i13++;
                } else {
                    z10 = true;
                }
            }
            String string = strF.subSequence(i13, length + 1).toString();
            String strF2 = new Regex("..").f("$0 ", strSubstring);
            int length2 = strF2.length() - 1;
            int i14 = 0;
            boolean z12 = false;
            while (i14 <= length2) {
                boolean z13 = i.g(strF2.charAt(!z12 ? i14 : length2), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z13) {
                    i14++;
                } else {
                    z12 = true;
                }
            }
            arrayList.add(new EepromData(str4, string, strF2.subSequence(i14, length2 + 1).toString()));
            i10 += 8;
            i11 = i12;
        }
        com.voltasit.obdeleven.presentation.controlUnit.eeprom.a aVar = this.f31541n;
        i.b(aVar);
        aVar.d(this.f31543p);
    }

    public final void T() {
        if (!this.f31545r) {
            E(R.string.common_value_not_changed);
            return;
        }
        H(R.string.view_eeprom_writing);
        final StringBuilder sb2 = new StringBuilder();
        final StringBuilder sb3 = new StringBuilder();
        com.voltasit.obdeleven.presentation.controlUnit.eeprom.a aVar = this.f31541n;
        i.b(aVar);
        for (T t8 : aVar.f36779a) {
            sb2.append(m.G(t8.a(), " ", ""));
            sb3.append(m.G(t8.c(), " ", ""));
        }
        ControlUnit controlUnit = this.f31540m;
        if (controlUnit != null) {
            controlUnit.D(false).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.f
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task1) {
                    final EepromFragment this$0 = this.f31576a;
                    i.e(this$0, "this$0");
                    final StringBuilder newVal = sb2;
                    i.e(newVal, "$newVal");
                    final StringBuilder oldVal = sb3;
                    i.e(oldVal, "$oldVal");
                    i.e(task1, "task1");
                    if (task1.isFaulted()) {
                        this$0.w();
                        this$0.E(R.string.common_connection_failed);
                        return null;
                    }
                    Calendar calendar = Calendar.getInstance();
                    ControlUnit controlUnit2 = this$0.f31540m;
                    i.b(controlUnit2);
                    controlUnit2.t0("F199", String.format(Locale.US, "%ty%tm%td", Arrays.copyOf(new Object[]{calendar, calendar, calendar}, 3))).continueWithTask(new S8.a(3, this$0)).continueWithTask(new V8.g(this$0, 2, newVal)).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.eeprom.g
                        /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, xa.g] */
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task) {
                            EepromFragment this$1 = this$0;
                            i.e(this$1, "this$0");
                            StringBuilder sb4 = newVal;
                            StringBuilder sb5 = oldVal;
                            i.e(task, "task");
                            this$1.w();
                            AbstractC0626f0 abstractC0626f0 = this$1.f31539l;
                            if (abstractC0626f0 == null) {
                                i.m("binding");
                                throw null;
                            }
                            abstractC0626f0.f1910t.setVisibility(0);
                            Object result = task.getResult();
                            i.d(result, "getResult(...)");
                            int iIntValue = ((Number) result).intValue();
                            if (iIntValue == -1) {
                                this$1.F(this$1.getString(R.string.common_something_went_wrong));
                            } else if (iIntValue == 0) {
                                this$1.G(R.string.view_eeprom_accepted);
                                this$1.f31545r = false;
                                ControlUnit controlUnit3 = this$1.f31540m;
                                String str = this$1.f31549v;
                                i.b(str);
                                O.h.c(16);
                                String str2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(Integer.parseInt(str, 16))}, 1));
                                int i10 = this$1.f31548u;
                                int i11 = this$1.f31547t;
                                String string = sb5.toString();
                                String string2 = sb4.toString();
                                ControlUnitDB controlUnitDB = controlUnit3.f29320b;
                                E e10 = controlUnit3.f29321c.f42726c;
                                HistoryDB historyDB = new HistoryDB();
                                int i12 = z.f47484b;
                                historyDB.o((z) ParseUser.getCurrentUser());
                                historyDB.setVehicle(e10);
                                historyDB.i(controlUnitDB);
                                if (controlUnit3.p() != null) {
                                    historyDB.k(controlUnit3.p().f29363c);
                                }
                                historyDB.n("EEPROM");
                                historyDB.m(e10.getInt("mileage"));
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("oldValue", string);
                                    jSONObject.put("newValue", string2);
                                    jSONObject.put("address", str2);
                                    jSONObject.put("lenght", i10);
                                    jSONObject.put("lfid", i11);
                                    historyDB.j(jSONObject);
                                    historyDB.a();
                                    historyDB.saveEventually();
                                } catch (JSONException e11) {
                                    p279w9.b bVar = Application.f29634b;
                                    P8.c.b(e11);
                                }
                            } else if (iIntValue != 51) {
                                this$1.F(String.format(Locale.US, "(%02X) %s", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Texttabe.a(iIntValue)}, 2)));
                            } else {
                                this$1.P().getClass();
                                SfdViewModel sfdViewModel = (SfdViewModel) this$1.f31553z.getValue();
                                ControlUnit controlUnit4 = this$1.f31540m;
                                i.b(controlUnit4);
                                String objectId = controlUnit4.f29320b.getControlUnitBase().getObjectId();
                                i.d(objectId, "getObjectId(...)");
                                ControlUnit controlUnit5 = this$1.f31540m;
                                i.b(controlUnit5);
                                sfdViewModel.b(objectId, controlUnit5.n().shortValue());
                                this$1.O(1);
                            }
                            return null;
                        }
                    }, Task.UI_THREAD_EXECUTOR);
                    return null;
                }
            });
        }
    }

    @Override // i9.c.a
    public final void d(Object obj) {
        EepromData eepromData = (EepromData) obj;
        e eVar = this.f31542o;
        if (eVar == null || !eVar.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("eepromItem", eepromData);
            bundle.putString("key_start_address", eepromData != null ? eepromData.b() : null);
            bundle.putBoolean("key_is_history", this.f31544q);
            e eVar2 = new e();
            eVar2.setArguments(bundle);
            eVar2.f32261r = getFragmentManager();
            eVar2.setTargetFragment(this, 0);
            this.f31542o = eVar2;
            eVar2.A();
        }
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        String string;
        String strC;
        int length;
        int i10;
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        int iHashCode = dialogId.hashCode();
        if (iHashCode == -1828132316) {
            if (dialogId.equals("PopTheHoodDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                h hVarP = P();
                hVarP.getClass();
                C2680e.c(Z.a(hVarP), null, null, new EepromViewModel$writeEepromIfPossible$1(hVarP, null), 3);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (iHashCode == 111107516) {
            if (dialogId.equals("SecurityAccessDialogFragment") && callbackType == DialogCallback.CallbackType.f31102c) {
                Bundle bundle = data.getBundle("key_bundle");
                Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("key_action")) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    Q();
                    return;
                } else {
                    if (numValueOf != null && numValueOf.intValue() == 1) {
                        T();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (iHashCode == 865904018 && dialogId.equals("EepromCodingDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                EepromData eepromData = (EepromData) data.getSerializable("eepromData");
                ArrayList arrayList = this.f31543p;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        i11 = 0;
                        break;
                    }
                    Object obj = this.f31543p.get(i11);
                    i.b(obj);
                    String strB = ((EepromData) obj).b();
                    i.b(eepromData);
                    if (i.a(strB, eepromData.b())) {
                        break;
                    } else {
                        i11++;
                    }
                }
                arrayList.set(i11, eepromData);
                com.voltasit.obdeleven.presentation.controlUnit.eeprom.a aVar = this.f31541n;
                i.b(aVar);
                aVar.d(this.f31543p);
                Iterator it = this.f31543p.iterator();
                do {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    EepromData eepromData2 = (EepromData) it.next();
                    i.b(eepromData2);
                    String strA = eepromData2.a();
                    int length2 = strA.length() - 1;
                    int i12 = 0;
                    boolean z11 = false;
                    while (i12 <= length2) {
                        boolean z12 = i.g(strA.charAt(!z11 ? i12 : length2), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            } else {
                                length2--;
                            }
                        } else if (z12) {
                            i12++;
                        } else {
                            z11 = true;
                        }
                    }
                    string = strA.subSequence(i12, length2 + 1).toString();
                    strC = eepromData2.c();
                    length = strC.length() - 1;
                    i10 = 0;
                    boolean z13 = false;
                    while (i10 <= length) {
                        boolean z14 = i.g(strC.charAt(!z13 ? i10 : length), 32) <= 0;
                        if (z13) {
                            if (!z14) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z14) {
                            i10++;
                        } else {
                            z13 = true;
                        }
                    }
                } while (i.a(string, strC.subSequence(i10, length + 1).toString()));
                this.f31545r = z10;
            }
            e eVar = this.f31542o;
            if (eVar != null) {
                eVar.y();
            }
            this.f31542o = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "EepromFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View v10) {
        i.e(v10, "v");
        h hVarP = P();
        hVarP.getClass();
        C2680e.c(Z.a(hVarP), null, null, new EepromViewModel$writeEepromIfPossible$1(hVarP, null), 3);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.view_eeprom_title);
        i.d(string, "getString(...)");
        return string;
    }
}
