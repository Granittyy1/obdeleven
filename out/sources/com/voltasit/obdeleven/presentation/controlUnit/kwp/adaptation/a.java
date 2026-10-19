package com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation;

import Ia.l;
import M0.h;
import O8.b;
import W7.c;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.D;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.dialogs.j;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2166q0;
import com.voltasit.obdeleven.ui.dialogs.h1;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.parse.model.AdaptationType;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.n;
import org.koin.java.KoinJavaComponent;
import p220r9.Q;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: ControlUnitAdaptationFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/101/adaptations")
public abstract class a extends BaseProFragment<h> implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31667A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ControlUnit f31668B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p146l8.a f31669C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AdaptationType f31670D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f31671E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f31672F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ValueUnit f31673G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public h1 f31674H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C2166q0 f31675I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public B0 f31676J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Object f31677K = KoinJavaComponent.b(com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a.class, null, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SwipeRefreshLayout f31679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f31680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f31681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f31682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f31683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextInputLayout f31684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EditText f31685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppCompatImageButton f31686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f31687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AppCompatImageButton f31688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FloatingActionButton f31689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout[] f31690z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ControlUnitAdaptationFragment.kt */
    public static final class C0334a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31691b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0334a(l lVar) {
            this.f31691b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f31691b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31691b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f31691b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f31691b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_control_unit_adaptation, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.controlUnitAdaptationFragment_channelLayout);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitAdaptationFragment_meas1);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitAdaptationFragment_meas2);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitAdaptationFragment_meas3);
        LinearLayout linearLayout5 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitAdaptationFragment_meas4);
        View viewFindViewById = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_channelTitle);
        i.d(viewFindViewById, "findViewById(...)");
        this.f31680p = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_channel);
        i.d(viewFindViewById2, "findViewById(...)");
        this.f31681q = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_hexAscii);
        i.d(viewFindViewById3, "findViewById(...)");
        this.f31682r = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_value);
        i.d(viewFindViewById4, "findViewById(...)");
        this.f31683s = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_inputLayout);
        i.d(viewFindViewById5, "findViewById(...)");
        this.f31684t = (TextInputLayout) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_input);
        i.d(viewFindViewById6, "findViewById(...)");
        this.f31685u = (EditText) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_description);
        i.d(viewFindViewById7, "findViewById(...)");
        this.f31687w = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_prev);
        i.d(viewFindViewById8, "findViewById(...)");
        this.f31686v = (AppCompatImageButton) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_next);
        i.d(viewFindViewById9, "findViewById(...)");
        this.f31688x = (AppCompatImageButton) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(R.id.controlUnitAdaptationFragment_fab);
        i.d(viewFindViewById10, "findViewById(...)");
        this.f31689y = (FloatingActionButton) viewFindViewById10;
        linearLayout.setOnClickListener(this);
        i.b(linearLayout2);
        i.b(linearLayout3);
        i.b(linearLayout4);
        i.b(linearLayout5);
        this.f31690z = new LinearLayout[]{linearLayout2, linearLayout3, linearLayout4, linearLayout5};
        int length = a0().length;
        int i10 = 0;
        while (i10 < length) {
            View childAt = a0()[i10].getChildAt(0);
            i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
            i10++;
            ((TextView) childAt).setText(String.format(Locale.US, "%s %d", Arrays.copyOf(new Object[]{getString(R.string.common_value), Integer.valueOf(i10)}, 2)));
        }
        X().setOnClickListener(this);
        Drawable drawableB = p186p0.a.C0517a.b(requireContext(), 2131231581);
        i.b(drawableB);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        p234t0.a.C0532a.i(drawableB, mode);
        p234t0.a.C0532a.g(drawableB, getResources().getColor(R.color.checkbox_blue));
        Drawable drawableB2 = p186p0.a.C0517a.b(requireContext(), 2131231705);
        i.b(drawableB2);
        p234t0.a.C0532a.i(drawableB2, mode);
        p234t0.a.C0532a.g(drawableB2, getResources().getColor(R.color.checkbox_blue));
        AppCompatImageButton appCompatImageButton = this.f31686v;
        if (appCompatImageButton == null) {
            i.m("prev");
            throw null;
        }
        appCompatImageButton.setImageDrawable(drawableB);
        AppCompatImageButton appCompatImageButton2 = this.f31688x;
        if (appCompatImageButton2 == null) {
            i.m("next");
            throw null;
        }
        appCompatImageButton2.setImageDrawable(drawableB2);
        AppCompatImageButton appCompatImageButton3 = this.f31686v;
        if (appCompatImageButton3 == null) {
            i.m("prev");
            throw null;
        }
        appCompatImageButton3.setOnClickListener(this);
        AppCompatImageButton appCompatImageButton4 = this.f31688x;
        if (appCompatImageButton4 == null) {
            i.m("next");
            throw null;
        }
        appCompatImageButton4.setOnClickListener(this);
        AppCompatImageButton appCompatImageButton5 = this.f31686v;
        if (appCompatImageButton5 == null) {
            i.m("prev");
            throw null;
        }
        appCompatImageButton5.setEnabled(false);
        W().setEnabled(false);
        AppCompatImageButton appCompatImageButton6 = this.f31688x;
        if (appCompatImageButton6 == null) {
            i.m("next");
            throw null;
        }
        appCompatImageButton6.setEnabled(false);
        if (this.f31670D == AdaptationType.ADAPTATION) {
            Y().setInputType(2);
        } else {
            Y().setInputType(4097);
            X().setVisibility(0);
        }
        if (this.f31668B == null) {
            return viewInflate;
        }
        if (c.e()) {
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            ActivityC1347l activityC1347lRequireActivity = requireActivity();
            i.d(activityC1347lRequireActivity, "requireActivity(...)");
            this.f31673G = com.voltasit.obdeleven.a.C0320a.a(activityC1347lRequireActivity).i();
        } else {
            c0();
        }
        this.f31679o = Q.b(viewInflate);
        ?? r10 = this.f31677K;
        ((com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a) r10.getValue()).f31708y.e(getViewLifecycleOwner(), new C0334a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.ControlUnitAdaptationFragment$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                final a aVar = this.this$0;
                aVar.getClass();
                aVar.K(new l<Object, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.ControlUnitAdaptationFragment$showTryAgainDialog$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Object dialog) {
                        i.e(dialog, "dialog");
                        aVar.getClass();
                        ((DialogInterface) dialog).dismiss();
                        return r.f47939a;
                    }
                }, new l<Object, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.ControlUnitAdaptationFragment$showTryAgainDialog$2
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xa.g] */
                    @Override // Ia.l
                    public final r invoke(Object dialog) {
                        i.e(dialog, "dialog");
                        a aVar2 = aVar;
                        aVar2.getClass();
                        ((DialogInterface) dialog).dismiss();
                        ((com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a) aVar2.f31677K.getValue()).b();
                        return r.f47939a;
                    }
                });
                return r.f47939a;
            }
        }));
        ((com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a) r10.getValue()).f31704u.e(getViewLifecycleOwner(), new C0334a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.ControlUnitAdaptationFragment$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                Context contextRequireContext = this.this$0.requireContext();
                i.d(contextRequireContext, "requireContext(...)");
                new j(contextRequireContext).show();
                return r.f47939a;
            }
        }));
        ((com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a) r10.getValue()).f31706w.e(getViewLifecycleOwner(), new C0334a(new l<r, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.ControlUnitAdaptationFragment$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(r rVar) {
                this.this$0.e0();
                return r.f47939a;
            }
        }));
        return this.f31679o;
    }

    public final void U() {
        if (this.f31668B == null) {
            NavigationManager navigationManager = q().f33533B;
            i.b(navigationManager);
            navigationManager.o(false);
        }
        ControlUnit controlUnit = this.f31668B;
        i.b(controlUnit);
        int i10 = controlUnit.f29327i == ApplicationProtocol.f29262b ? 99 : 255;
        C2166q0 c2166q0 = this.f31675I;
        if (c2166q0 == null || !c2166q0.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_title", R.string.common_enter_channel);
            bundle.putInt("key_min", 0);
            bundle.putInt("key_max", i10);
            ControlUnit controlUnit2 = this.f31668B;
            bundle.putString("key_type", "ADAPTATION");
            C2166q0 c2166q1 = new C2166q0();
            c2166q1.setArguments(bundle);
            c2166q1.f34011x = null;
            c2166q1.f32261r = getFragmentManager();
            c2166q1.setTargetFragment(this, 0);
            c2166q1.f34009v = controlUnit2;
            this.f31675I = c2166q1;
            c2166q1.A();
        }
    }

    public final TextView V() {
        TextView textView = this.f31681q;
        if (textView != null) {
            return textView;
        }
        i.m("channel");
        throw null;
    }

    public final FloatingActionButton W() {
        FloatingActionButton floatingActionButton = this.f31689y;
        if (floatingActionButton != null) {
            return floatingActionButton;
        }
        i.m("fab");
        throw null;
    }

    public final TextView X() {
        TextView textView = this.f31682r;
        if (textView != null) {
            return textView;
        }
        i.m("hexAscii");
        throw null;
    }

    public final EditText Y() {
        EditText editText = this.f31685u;
        if (editText != null) {
            return editText;
        }
        i.m(MetricTracker.Object.INPUT);
        throw null;
    }

    public final TextInputLayout Z() {
        TextInputLayout textInputLayout = this.f31684t;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        i.m("inputLayout");
        throw null;
    }

    public final LinearLayout[] a0() {
        LinearLayout[] linearLayoutArr = this.f31690z;
        if (linearLayoutArr != null) {
            return linearLayoutArr;
        }
        i.m("measurements");
        throw null;
    }

    public final TextView b0() {
        TextView textView = this.f31683s;
        if (textView != null) {
            return textView;
        }
        i.m("value");
        throw null;
    }

    public abstract void c0();

    public final void d0(String str) {
        O.e.j("MainActivityFragment", "setAdaptationValueWithFormat()");
        if (this.f31670D == AdaptationType.LONG_ADAPTATION && E8.a.c(E8.a.b(str)) && i.a(X().getText(), "ASCII")) {
            b0().setText(O.h.i(str));
        } else {
            X().setText("HEX");
            b0().setText(str);
        }
    }

    public void e0() {
        p146l8.a aVar = this.f31669C;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        MainActivity mainActivityQ = q();
        p146l8.a aVar2 = this.f31669C;
        i.b(aVar2);
        new B(mainActivityQ, aVar2.b(), 4).b();
    }

    public final void f0() {
        B0 b10 = this.f31676J;
        if (b10 == null || !b10.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_login_finder_enabled", false);
            B0 b11 = new B0();
            b11.setArguments(bundle);
            b11.setTargetFragment(this, 0);
            b11.f32261r = getFragmentManager();
            this.f31676J = b11;
            b11.f33753w = this.f31668B;
            b11.A();
        }
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        p146l8.a aVarV;
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        int iHashCode = dialogId.hashCode();
        if (iHashCode == 111107516) {
            if (dialogId.equals("SecurityAccessDialogFragment")) {
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    if (data.containsKey("last_used_login")) {
                        this.f31672F = data.getString("last_used_login");
                    }
                    this.f31671E = true;
                    c0();
                }
                B0 b10 = this.f31676J;
                if (b10 != null) {
                    b10.y();
                    this.f31676J = null;
                    return;
                }
                return;
            }
            return;
        }
        if (iHashCode != 946779699) {
            if (iHashCode == 1940956132 && dialogId.equals("WarningDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                boolean z10 = data.getBoolean("key_checkbox_bool");
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                ActivityC1347l activityC1347lRequireActivity = requireActivity();
                i.d(activityC1347lRequireActivity, "requireActivity(...)");
                com.voltasit.obdeleven.a.C0320a.a(activityC1347lRequireActivity).j("show_adaptations_warning", !z10);
                U();
                this.f31674H = null;
                return;
            }
            return;
        }
        if (dialogId.equals("NumberLabelDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                AppCompatImageButton appCompatImageButton = this.f31686v;
                if (appCompatImageButton == null) {
                    i.m("prev");
                    throw null;
                }
                appCompatImageButton.setEnabled(true);
                W().setEnabled(true);
                AppCompatImageButton appCompatImageButton2 = this.f31688x;
                if (appCompatImageButton2 == null) {
                    i.m("next");
                    throw null;
                }
                appCompatImageButton2.setEnabled(true);
                int i10 = data.getInt("key_channel");
                this.f31678n = true;
                Y().setText("");
                Z().setError("");
                if (!c.e()) {
                    this.f31667A = i10;
                    c0();
                }
                if (this.f31670D == AdaptationType.ADAPTATION) {
                    ControlUnit controlUnit = this.f31668B;
                    i.b(controlUnit);
                    aVarV = controlUnit.L(i10);
                } else {
                    ControlUnit controlUnit2 = this.f31668B;
                    i.b(controlUnit2);
                    aVarV = controlUnit2.V(i10);
                }
                this.f31669C = aVarV;
                V().setText(String.format(Locale.US, "%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)));
                if (!this.f31671E) {
                    this.f31671E = true;
                    c0();
                }
                SwipeRefreshLayout swipeRefreshLayout = this.f31679o;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
            } else if (this.f31669C == null) {
                r().h();
            }
            this.f31675I = null;
        }
    }

    public final void g0() {
        if (i.a(X().getText(), "ASCII")) {
            X().setText("HEX");
            b0().setText(n.e(b0().getText().toString()));
        } else if (E8.a.c(E8.a.b(b0().getText().toString()))) {
            X().setText("ASCII");
            b0().setText(O.h.i(b0().getText().toString()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        p146l8.a aVarV;
        p146l8.a aVarV2;
        i.e(v10, "v");
        int id = v10.getId();
        AdaptationType adaptationType = AdaptationType.ADAPTATION;
        switch (id) {
            case R.id.controlUnitAdaptationFragment_channelLayout /* 2131362198 */:
                U();
                break;
            case R.id.controlUnitAdaptationFragment_hexAscii /* 2131362202 */:
                Y().setText("");
                Z().setError("");
                g0();
                break;
            case R.id.controlUnitAdaptationFragment_next /* 2131362209 */:
                if (!c.e()) {
                    this.f31667A = Integer.parseInt(V().getText().toString()) + 1;
                    c0();
                    break;
                } else {
                    p146l8.a aVar = this.f31669C;
                    i.b(aVar);
                    int i10 = aVar.f44412a;
                    if (i10 >= 99) {
                        ControlUnit controlUnit = this.f31668B;
                        i.b(controlUnit);
                        if (controlUnit.f29327i != ApplicationProtocol.f29262b && i10 < 255) {
                            i10++;
                            Y().setText("");
                            Z().setError("");
                            if (this.f31670D == adaptationType) {
                                ControlUnit controlUnit2 = this.f31668B;
                                i.b(controlUnit2);
                                aVarV = controlUnit2.L(i10);
                            } else {
                                ControlUnit controlUnit3 = this.f31668B;
                                i.b(controlUnit3);
                                aVarV = controlUnit3.V(i10);
                            }
                            this.f31669C = aVarV;
                        }
                    } else {
                        i10++;
                        Y().setText("");
                        Z().setError("");
                        if (this.f31670D == adaptationType) {
                            ControlUnit controlUnit4 = this.f31668B;
                            i.b(controlUnit4);
                            aVarV = controlUnit4.L(i10);
                        } else {
                            ControlUnit controlUnit5 = this.f31668B;
                            i.b(controlUnit5);
                            aVarV = controlUnit5.V(i10);
                        }
                        this.f31669C = aVarV;
                    }
                    V().setText(String.format(Locale.US, "%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)));
                    if (!this.f31671E) {
                        this.f31671E = true;
                        c0();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = this.f31679o;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(true);
                        break;
                    }
                }
                break;
            case R.id.controlUnitAdaptationFragment_prev /* 2131362210 */:
                if (!c.e()) {
                    this.f31667A = Integer.parseInt(V().getText().toString()) - 1;
                    c0();
                    break;
                } else {
                    p146l8.a aVar2 = this.f31669C;
                    i.b(aVar2);
                    int i11 = aVar2.f44412a;
                    if (i11 > 0) {
                        i11--;
                        Y().setText("");
                        Z().setError("");
                        if (this.f31670D == adaptationType) {
                            ControlUnit controlUnit6 = this.f31668B;
                            i.b(controlUnit6);
                            aVarV2 = controlUnit6.L(i11);
                        } else {
                            ControlUnit controlUnit7 = this.f31668B;
                            i.b(controlUnit7);
                            aVarV2 = controlUnit7.V(i11);
                        }
                        this.f31669C = aVarV2;
                    }
                    V().setText(String.format(Locale.US, "%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1)));
                    if (!this.f31671E) {
                        this.f31671E = true;
                        c0();
                    }
                    SwipeRefreshLayout swipeRefreshLayout2 = this.f31679o;
                    if (swipeRefreshLayout2 != null) {
                        swipeRefreshLayout2.setRefreshing(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            String string = bundle.getString("adaptation_type");
            i.b(string);
            this.f31670D = AdaptationType.valueOf(string);
        }
        setHasOptionsMenu(true);
        setMenuVisibility(true);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        i.e(menu, "menu");
        i.e(inflater, "inflater");
        inflater.inflate(R.menu.developer, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        i.e(item, "item");
        if (item.getItemId() != R.id.menu_develop) {
            return super.onOptionsItemSelected(item);
        }
        ((com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a) this.f31677K.getValue()).b();
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        p146l8.a aVar;
        super.onPause();
        this.f31671E = false;
        if (this.f31668B != null && (aVar = this.f31669C) != null) {
            i.b(aVar);
            aVar.a().continueWithTask(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(1, this));
        }
        C2166q0 c2166q0 = this.f31675I;
        if (c2166q0 != null) {
            i.b(c2166q0);
            c2166q0.y();
            this.f31675I = null;
        }
        B0 b10 = this.f31676J;
        if (b10 != null) {
            i.b(b10);
            b10.y();
            this.f31676J = null;
        }
        h1 h1Var = this.f31674H;
        if (h1Var != null) {
            i.b(h1Var);
            h1Var.y();
            this.f31674H = null;
        }
        N();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        ActivityC1347l activityC1347lRequireActivity = requireActivity();
        i.d(activityC1347lRequireActivity, "requireActivity(...)");
        if (com.voltasit.obdeleven.a.C0320a.a(activityC1347lRequireActivity).b("show_adaptations_warning", true)) {
            if (this.f31674H == null) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_title", R.string.common_attention);
                bundle.putInt("key_positive_text", R.string.common_ok);
                bundle.putInt("key_checkbox_text", R.string.common_do_not_show_again);
                h1 h1Var = new h1();
                h1Var.setArguments(bundle);
                h1Var.f32261r = getParentFragmentManager();
                h1Var.setTargetFragment(this, 0);
                this.f31674H = h1Var;
                h1Var.A();
            }
        } else if (V().getText().toString().length() == 0) {
            U();
        }
        if (this.f31669C != null) {
            this.f31671E = true;
            c0();
        }
        M();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        i.e(bundle, "bundle");
        super.onSaveInstanceState(bundle);
        AdaptationType adaptationType = this.f31670D;
        i.b(adaptationType);
        bundle.putString("adaptation_type", adaptationType.name());
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_adaptation);
        i.d(string, "getString(...)");
        return string;
    }
}
