package com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest;

import Ia.l;
import M0.h;
import V8.j;
import V8.k;
import V8.m;
import V8.n;
import V8.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.media3.exoplayer.E;
import androidx.media3.exoplayer.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.usecases.f;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.O0;
import com.voltasit.obdeleven.ui.dialogs.Z0;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p220r9.C2783o;
import p220r9.P;
import p293xa.r;

/* JADX INFO: compiled from: UDSOutputTestFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/126/output-test-uds")
public final class UDSOutputTestFragment extends BaseFragment<h> implements AdapterView.OnItemClickListener, DialogCallback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31955A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public B0 f31957C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList<String> f31958D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f31960F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Object f31961G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Object f31962H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Object f31963I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f31964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f31966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FloatingActionButton f31968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O0 f31969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p135k9.a f31970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ControlUnit f31971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<? extends COMPUSCALE> f31972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public COMPUSCALE f31973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.obdeleven.service.odx.e.g f31974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Param f31975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.obdeleven.service.odx.e f31976x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31977y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f31978z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Z0 f31956B = new Z0();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final f f31959E = (f) KoinJavaComponent.a(f.class);

    /* JADX INFO: compiled from: UDSOutputTestFragment.kt */
    public static final class a<TTaskResult, TContinuationResult> implements Continuation {
        public a() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            i.e(task, "task");
            Object result = task.getResult();
            i.d(result, "getResult(...)");
            if (!((Boolean) result).booleanValue()) {
                return null;
            }
            p135k9.a aVar = UDSOutputTestFragment.this.f31970r;
            i.b(aVar);
            aVar.notifyDataSetChanged();
            return null;
        }
    }

    /* JADX INFO: compiled from: UDSOutputTestFragment.kt */
    public static final class b implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31980b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l lVar) {
            this.f31980b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31980b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31980b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f31980b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f31980b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$special$$inlined$viewModel$default$1] */
    public UDSOutputTestFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$special$$inlined$viewModel$default$1
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
        this.f31961G = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<e>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.e] */
            @Override // Ia.a
            public final e invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(e.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
        this.f31962H = KoinJavaComponent.b(SfdViewModel.class, null, new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$sfdViewModel$1
            @Override // Ia.a
            public final Ob.a invoke() {
                return I.e.j(Feature.OutputTests);
            }
        });
        this.f31963I = KoinJavaComponent.b(J8.a.class, null, null);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        O0 o10 = this.f31969q;
        if (o10 != null) {
            o10.y();
            r().h();
            return true;
        }
        if (this.f31978z) {
            S(false);
        }
        Q();
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        z(O());
        ?? r10 = this.f31962H;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((SfdViewModel) r10.getValue()).f31218u.e(getViewLifecycleOwner(), new b(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$setupSfdObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                com.voltasit.obdeleven.presentation.dialogs.i iVar = new com.voltasit.obdeleven.presentation.dialogs.i();
                i.b(num2);
                iVar.w(num2.intValue());
                iVar.v(this.this$0.getChildFragmentManager(), "SfdRateLimitDialog");
                return r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31207A.e(getViewLifecycleOwner(), new b(new l<Short, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$setupSfdObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Short sh) {
                if (this.this$0.f31971s != null) {
                    SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                    ControlUnit controlUnit = this.this$0.f31971s;
                    i.b(controlUnit);
                    sfdWizardFullScreenDialog.F(controlUnit.n());
                    sfdWizardFullScreenDialog.v(this.this$0.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                }
                return r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31220w.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$setupSfdObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                UDSOutputTestFragment uDSOutputTestFragment = this.this$0;
                B0 b10 = uDSOutputTestFragment.f31957C;
                if (b10 == null || !b10.isVisible()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("key_login_finder_enabled", false);
                    B0 b11 = new B0();
                    b11.setArguments(bundle2);
                    b11.setTargetFragment(uDSOutputTestFragment, 0);
                    b11.f32261r = uDSOutputTestFragment.getFragmentManager();
                    uDSOutputTestFragment.f31957C = b11;
                    b11.f33753w = uDSOutputTestFragment.f31971s;
                    b11.A();
                }
                return r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31222y.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$setupSfdObservers$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.R();
                return r.f47939a;
            }
        }));
        ((SfdViewModel) r10.getValue()).f31209C.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$setupSfdObservers$5
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new SfdAutoUnlockDialog().v(this.this$0.getChildFragmentManager(), "SfdAutoUnlockDialog");
                return r.f47939a;
            }
        }));
        O().f31992r.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                UDSOutputTestFragment uDSOutputTestFragment = this.this$0;
                if (uDSOutputTestFragment.f31978z) {
                    uDSOutputTestFragment.S(false);
                } else {
                    uDSOutputTestFragment.R();
                }
                return r.f47939a;
            }
        }));
        O().f31994t.e(getViewLifecycleOwner(), new b(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                new com.voltasit.obdeleven.presentation.dialogs.f(0).J(this.this$0);
                return r.f47939a;
            }
        }));
        View viewInflate = inflater.inflate(R.layout.fragment_uds_data, viewGroup, false);
        this.f31964l = (LinearLayout) viewInflate.findViewById(R.id.fragmentUdsData_statusLayout);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fragmentUdsData_statusTitle);
        this.f31965m = (TextView) viewInflate.findViewById(R.id.fragmentUdsData_statusValue);
        this.f31966n = (LinearLayout) viewInflate.findViewById(R.id.fragmentUdsData_dataLayout);
        this.f31967o = (TextView) viewInflate.findViewById(R.id.fragmentUdsData_dataTitle);
        View viewFindViewById = viewInflate.findViewById(R.id.fragmentUdsData_dataList);
        i.d(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f31968p = (FloatingActionButton) viewInflate.findViewById(R.id.fragmentUdsData_fab);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        p208q9.a aVar = new p208q9.a(getContext(), linearLayoutManager.f19521p);
        aVar.f46180a = getResources().getDrawable(R.drawable.divider_content);
        aVar.f46181b = dimensionPixelSize;
        aVar.f46182c = dimensionPixelSize;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.i(aVar);
        recyclerView.setHasFixedSize(true);
        LinearLayout linearLayout = this.f31964l;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        textView.setText(R.string.view_output_test_status);
        if (this.f31970r == null) {
            p135k9.a aVar2 = new p135k9.a(q(), this.f31959E.a());
            this.f31970r = aVar2;
            aVar2.f42885c = this;
            if (this.f31971s != null) {
                C2134a0.b(getActivity(), R.string.common_loading);
                ControlUnit controlUnit = this.f31971s;
                i.b(controlUnit);
                controlUnit.X().onSuccess(new j(2, this), Task.BACKGROUND_EXECUTOR).continueWith(new k(4, this), Task.UI_THREAD_EXECUTOR);
            }
        }
        recyclerView.setAdapter(this.f31970r);
        COMPUSCALE compuscale = this.f31973u;
        if (compuscale != null) {
            TextView textView2 = this.f31967o;
            if (textView2 != null) {
                textView2.setText(C2783o.a(compuscale, false));
            }
            LinearLayout linearLayout2 = this.f31964l;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        }
        FloatingActionButton floatingActionButton = this.f31968p;
        if (floatingActionButton != null) {
            floatingActionButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.c
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    UDSOutputTestFragment this$0 = this.f31987b;
                    i.e(this$0, "this$0");
                    e eVarO = this$0.O();
                    eVarO.getClass();
                    C2680e.c(Z.a(eVarO), null, null, new UDSOutputTestViewModel$startOutputTestIfPossible$1(eVarO, null), 3);
                    return true;
                }
            });
        }
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new I(this));
        getChildFragmentManager().b0("SfdAutoUnlockDialog", this, new E(4, this));
        return viewInflate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final e O() {
        return (e) this.f31961G.getValue();
    }

    public final void P() {
        ControlUnit controlUnit = this.f31971s;
        i.b(controlUnit);
        controlUnit.D(false).continueWithTask(new m(2, this), Task.BACKGROUND_EXECUTOR).continueWith(new n(3, this), Task.UI_THREAD_EXECUTOR);
    }

    public final void Q() {
        this.f31958D = C2783o.b(this.f31972t, false);
        Bundle bundle = new Bundle();
        bundle.putInt("key_last_position", this.f31955A);
        bundle.putStringArrayList("items", this.f31958D);
        bundle.putStringArrayList("key_selected_items", new ArrayList<>());
        O0 o10 = new O0();
        o10.setArguments(bundle);
        o10.f32261r = getFragmentManager();
        o10.setTargetFragment(this, 0);
        this.f31969q = o10;
        o10.A();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
    public final void R() {
        ((J8.a) this.f31963I.getValue()).K();
        p135k9.a aVar = this.f31970r;
        i.b(aVar);
        final boolean z10 = false;
        for (Param param : aVar.f42884b) {
            String str = param.f29459g;
            i.d(str, "getValue(...)");
            if (str.length() == 0) {
                MainActivity mainActivityQ = q();
                P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_select_missing_params));
                return;
            } else if (i.a(param.f29459g, "Short Term Adjustment")) {
                z10 = true;
            }
        }
        FloatingActionButton floatingActionButton = this.f31968p;
        i.b(floatingActionButton);
        floatingActionButton.setEnabled(false);
        try {
            StringBuilder sb2 = new StringBuilder();
            Param param2 = this.f31975w;
            i.b(param2);
            byte[] bArrG = param2.g();
            p279w9.b bVar = Application.f29634b;
            P8.c.a(3, "UDSOutputTestFragment", "pduData: " + Arrays.toString(bArrG), Arrays.copyOf(new Object[0], 0));
            int length = bArrG.length;
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append(String.format(Locale.US, "%02X", Arrays.copyOf(new Object[]{Byte.valueOf(bArrG[i10])}, 1)));
            }
            final String string = sb2.toString();
            i.d(string, "toString(...)");
            ControlUnit controlUnit = this.f31971s;
            i.b(controlUnit);
            controlUnit.D(false).continueWithTask(new S8.a(4, this)).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.a
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    UDSOutputTestFragment this$0 = this.f31982a;
                    i.e(this$0, "this$0");
                    String finalPdu = string;
                    i.e(finalPdu, "$finalPdu");
                    ControlUnit controlUnit2 = this$0.f31971s;
                    i.b(controlUnit2);
                    return controlUnit2.H0(this$0.f31973u, z10 ? "" : "03", finalPdu);
                }
            }).continueWith(new d(this), Task.UI_THREAD_EXECUTOR);
        } catch (Exception e10) {
            C2134a0.a();
            e10.printStackTrace();
            P.b(requireActivity(), R.string.common_something_went_wrong);
            FloatingActionButton floatingActionButton2 = this.f31968p;
            i.b(floatingActionButton2);
            floatingActionButton2.setEnabled(true);
        }
    }

    public final void S(final boolean z10) {
        Task.forResult(Boolean.valueOf(this.f31978z)).continueWithTask(new p(1, this)).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.b
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                UDSOutputTestFragment this$0 = this;
                i.e(this$0, "this$0");
                if (!z10) {
                    return null;
                }
                ControlUnit controlUnit = this$0.f31971s;
                i.b(controlUnit);
                controlUnit.a();
                return null;
            }
        });
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        int i10 = 1;
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        int iHashCode = dialogId.hashCode();
        if (iHashCode == -1828132316) {
            if (dialogId.equals("PopTheHoodDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                e eVarO = O();
                eVarO.getClass();
                C2680e.c(Z.a(eVarO), null, null, new UDSOutputTestViewModel$startOutputTestIfPossible$1(eVarO, null), 3);
                return;
            }
            return;
        }
        if (iHashCode == 111107516) {
            if (dialogId.equals("SecurityAccessDialogFragment")) {
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    R();
                }
                B0 b10 = this.f31957C;
                if (b10 != null) {
                    b10.y();
                    this.f31957C = null;
                    return;
                }
                return;
            }
            return;
        }
        if (iHashCode == 818488834 && dialogId.equals("MultiChoiceDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                ArrayList<String> stringArrayList = data.getStringArrayList("items");
                int i11 = data.getInt("key_last_position");
                this.f31955A = i11;
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "UDSOutputTestFragment", "currentPosition:(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                if (stringArrayList == null || stringArrayList.isEmpty()) {
                    O0 o10 = this.f31969q;
                    i.b(o10);
                    o10.y();
                    r().h();
                } else {
                    List<? extends COMPUSCALE> list = this.f31972t;
                    i.b(list);
                    ArrayList<String> arrayList = this.f31958D;
                    i.b(arrayList);
                    this.f31973u = list.get(arrayList.indexOf(stringArrayList.get(0)));
                    TextView textView = this.f31967o;
                    i.b(textView);
                    textView.setText(C2783o.a(this.f31973u, false));
                    LinearLayout linearLayout = this.f31964l;
                    i.b(linearLayout);
                    linearLayout.setVisibility(0);
                    if (W7.c.e()) {
                        TextView textView2 = this.f31965m;
                        i.b(textView2);
                        textView2.setText(R.string.common_loading);
                        e eVarO2 = O();
                        COMPUSCALE compuscale = this.f31973u;
                        i.b(compuscale);
                        eVarO2.getClass();
                        String ti = compuscale.getCOMPUCONST().getVT().getTI();
                        if (ti == null) {
                            ti = "";
                        }
                        eVarO2.f31990p.J(Feature.OutputTests.a(), ti);
                    } else {
                        TextView textView3 = this.f31965m;
                        i.b(textView3);
                        textView3.setText(R.string.common_not_available);
                    }
                    C2134a0.b(q(), R.string.common_loading);
                    Task.callInBackground(new R2.k(i10, this)).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.E(2, this), Task.UI_THREAD_EXECUTOR);
                }
            } else if (callbackType == DialogCallback.CallbackType.f31101b) {
                r().h();
            }
            O0 o11 = this.f31969q;
            if (o11 != null) {
                o11.y();
                this.f31969q = null;
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "UDSOutputTestFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f31977y = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f31956B.a();
        O0 o10 = this.f31969q;
        if (o10 != null) {
            i.b(o10);
            o10.y();
            this.f31969q = null;
        }
        B0 b10 = this.f31957C;
        if (b10 != null) {
            i.b(b10);
            b10.y();
            this.f31957C = null;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        i.e(view, "view");
        p135k9.a aVar = this.f31970r;
        i.b(aVar);
        Param paramC = aVar.c(i10);
        Param.Type type = paramC.f29453a;
        if (type == Param.Type.f29473h || type == Param.Type.f29472g) {
            return;
        }
        String strD = paramC.d();
        if (strD == null || strD.length() == 0) {
            TextView textView = this.f31967o;
            i.b(textView);
            strD = textView.getText().toString();
        }
        String str = strD;
        this.f31956B.b(getActivity(), str, paramC, false, this.f31959E.a()).continueWith(new a(), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        N();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.f31977y && W7.c.e()) {
            this.f31977y = true;
            P();
        }
        M();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_output_test);
        i.d(string, "getString(...)");
        return string;
    }
}
