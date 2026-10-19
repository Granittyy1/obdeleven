package com.voltasit.obdeleven.presentation.controlUnit.basicsettings;

import X8.j;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.Z;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2086b;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2166q0;
import com.voltasit.obdeleven.ui.dialogs.h1;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p220r9.Q;

/* JADX INFO: compiled from: ControlUnitBasicSettingsFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/100/basic-settings")
public class i extends BaseProFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f31512A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ValueUnit f31513B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public B0 f31514C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SwipeRefreshLayout f31515D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public h1 f31516E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2166q0 f31517F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Object f31518G = KoinJavaComponent.b(a.class, null, null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Object f31519H = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f31520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f31522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f31523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f31524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ProgressBar f31525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f31526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AppCompatImageButton f31527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FloatingActionButton f31528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AppCompatImageButton f31529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout[] f31530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ControlUnit f31531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m8.g f31532z;

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 1;
        int i11 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_basic_settings, viewGroup, false);
        T();
        O().c(true);
        ?? r14 = this.f31518G;
        z((com.voltasit.obdeleven.presentation.d) r14.getValue());
        ((a) r14.getValue()).f31491q.e(getViewLifecycleOwner(), new X8.f(this, i10));
        O().f32795C.e(getViewLifecycleOwner(), new f(this, i11));
        O().f32797E.e(getViewLifecycleOwner(), new X8.h(this, i10));
        ((a) r14.getValue()).f31497w.e(getViewLifecycleOwner(), new X8.i(this, i10));
        ((a) r14.getValue()).f31493s.e(getViewLifecycleOwner(), new j(this, i10));
        ((a) r14.getValue()).f31495u.e(getViewLifecycleOwner(), new g(this, i11));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_channelLayout);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas0);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas1);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas2);
        LinearLayout linearLayout5 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas3);
        LinearLayout linearLayout6 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas5);
        LinearLayout linearLayout7 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas6);
        LinearLayout linearLayout8 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas7);
        LinearLayout linearLayout9 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas8);
        LinearLayout linearLayout10 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas9);
        this.f31520n = (TextView) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_title);
        this.f31521o = (TextView) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_channel);
        this.f31522p = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_measLayout);
        this.f31523q = (LinearLayout) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_meas4);
        this.f31524r = (TextView) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_status);
        this.f31525s = (ProgressBar) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_progress);
        this.f31526t = (TextView) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_description);
        this.f31527u = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_prev);
        this.f31529w = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_next);
        this.f31528v = (FloatingActionButton) viewInflate.findViewById(R.id.controlUnitBasicSettingsFragment_fab);
        this.f31530x = new LinearLayout[]{linearLayout2, linearLayout3, linearLayout4, linearLayout5, this.f31523q, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10};
        int i12 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f31530x;
            if (i12 >= linearLayoutArr.length) {
                break;
            }
            TextView textView = (TextView) linearLayoutArr[i12].getChildAt(0);
            Locale locale = Locale.US;
            i12++;
            textView.setText(getString(R.string.common_value) + " " + i12);
        }
        linearLayout.setOnClickListener(this);
        Drawable drawable = getResources().getDrawable(2131231581);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        p234t0.a.C0532a.i(drawable, mode);
        p234t0.a.C0532a.g(drawable, getResources().getColor(R.color.checkbox_blue));
        Drawable drawable2 = getResources().getDrawable(2131231705);
        p234t0.a.C0532a.i(drawable2, mode);
        p234t0.a.C0532a.g(drawable2, getResources().getColor(R.color.checkbox_blue));
        Q(this.f31528v);
        this.f31527u.setImageDrawable(drawable);
        this.f31529w.setImageDrawable(drawable2);
        this.f31527u.setOnClickListener(this);
        this.f31529w.setOnClickListener(this);
        this.f31527u.setEnabled(false);
        this.f31528v.setEnabled(false);
        this.f31529w.setEnabled(false);
        if (this.f31531y == null) {
            return viewInflate;
        }
        if (W7.c.e()) {
            if (this.f31531y.f29327i == ApplicationProtocol.f29262b) {
                this.f31528v.h();
            }
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            this.f31513B = com.voltasit.obdeleven.a.C0320a.a(activity).i();
        } else {
            r().o(false);
        }
        SwipeRefreshLayout swipeRefreshLayoutB = Q.b(viewInflate);
        this.f31515D = swipeRefreshLayoutB;
        return swipeRefreshLayoutB;
    }

    public final void U() {
        ApplicationProtocol applicationProtocol = this.f31531y.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29262b;
        int i10 = applicationProtocol == applicationProtocol2 ? 0 : 1;
        int i11 = applicationProtocol == applicationProtocol2 ? 255 : 254;
        C2166q0 c2166q0 = this.f31517F;
        if (c2166q0 == null || !c2166q0.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_title", R.string.common_enter_channel);
            bundle.putInt("key_min", i10);
            bundle.putInt("key_max", i11);
            ControlUnit controlUnit = this.f31531y;
            bundle.putString("key_type", "BASIC_SETTINGS");
            C2166q0 c2166q1 = new C2166q0();
            c2166q1.setArguments(bundle);
            c2166q1.f34011x = null;
            c2166q1.f32261r = getFragmentManager();
            c2166q1.setTargetFragment(this, 0);
            c2166q1.f34009v = controlUnit;
            this.f31517F = c2166q1;
            c2166q1.A();
        }
    }

    public final void V(boolean z10) {
        B0 b10 = this.f31514C;
        if (b10 == null || !b10.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_activate", z10);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("key_login_finder_enabled", true);
            bundle2.putBundle("key_bundle", bundle);
            bundle2.putBoolean("key_is_offline", !W7.c.e());
            B0 b11 = new B0();
            b11.setArguments(bundle2);
            b11.setTargetFragment(this, 0);
            b11.f32261r = getFragmentManager();
            this.f31514C = b11;
            b11.f33753w = this.f31531y;
            b11.A();
        }
    }

    public final void W() {
        this.f31531y.D(false).continueWithTask(new C2086b(this, 1, this.f31532z));
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        int i10 = 0;
        str.getClass();
        switch (str) {
            case "SecurityAccessDialogFragment":
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    this.f31512A = true;
                    if (bundle.containsKey("key_bundle")) {
                        if (bundle.getBundle("key_bundle").getBoolean("key_activate")) {
                            ((J8.a) this.f31519H.getValue()).N();
                            m8.g gVar = this.f31532z;
                            Task taskContinueWithTask = gVar.f44619d.continueWithTask(new m8.c(gVar));
                            gVar.f44619d = taskContinueWithTask;
                            taskContinueWithTask.continueWith(new e(i10, this), Task.UI_THREAD_EXECUTOR);
                        } else {
                            W();
                        }
                    }
                }
                B0 b10 = this.f31514C;
                if (b10 != null) {
                    b10.y();
                    this.f31514C = null;
                    break;
                }
                break;
            case "NumberLabelDialog":
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    this.f31527u.setEnabled(true);
                    this.f31528v.setEnabled(true);
                    this.f31529w.setEnabled(true);
                    int i11 = bundle.getInt("key_channel");
                    this.f31532z = this.f31531y.N(i11);
                    this.f31521o.setText(String.format(Locale.US, "%03d", Integer.valueOf(i11)));
                    if (!this.f31512A) {
                        this.f31512A = true;
                        W();
                    }
                    this.f31515D.setRefreshing(true);
                } else if (this.f31532z == null) {
                    r().h();
                }
                this.f31517F = null;
                break;
            case "WarningDialog":
                if (callbackType == DialogCallback.CallbackType.f31102c) {
                    boolean z10 = bundle.getBoolean("key_checkbox_bool");
                    ActivityC1347l activity = getActivity();
                    List<String> list = com.voltasit.obdeleven.a.f29638c;
                    com.voltasit.obdeleven.a.C0320a.a(activity).j("show_basic_settings_warning", !z10);
                    U();
                    this.f31516E = null;
                    break;
                }
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ControlUnitBasicSettingsFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f31532z.f44616a;
        int id = view.getId();
        ApplicationProtocol applicationProtocol = ApplicationProtocol.f29262b;
        switch (id) {
            case R.id.controlUnitBasicSettingsFragment_channelLayout /* 2131362213 */:
                U();
                break;
            case R.id.controlUnitBasicSettingsFragment_next /* 2131362227 */:
                if (i10 < 254 || (this.f31531y.f29327i == applicationProtocol && i10 < 255)) {
                    i10++;
                    this.f31532z = this.f31531y.N(i10);
                }
                this.f31521o.setText(String.format(Locale.US, "%03d", Integer.valueOf(i10)));
                if (!this.f31512A) {
                    this.f31512A = true;
                    W();
                }
                this.f31515D.setRefreshing(true);
                break;
            case R.id.controlUnitBasicSettingsFragment_prev /* 2131362228 */:
                if (i10 > 1 || (this.f31531y.f29327i == applicationProtocol && i10 > 0)) {
                    i10--;
                    this.f31532z = this.f31531y.N(i10);
                }
                this.f31521o.setText(String.format(Locale.US, "%03d", Integer.valueOf(i10)));
                if (!this.f31512A) {
                    this.f31512A = true;
                    W();
                }
                this.f31515D.setRefreshing(true);
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.developer, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C2166q0 c2166q0 = this.f31517F;
        if (c2166q0 != null) {
            c2166q0.y();
            this.f31517F = null;
        }
        B0 b10 = this.f31514C;
        if (b10 != null) {
            b10.y();
        }
        h1 h1Var = this.f31516E;
        if (h1Var != null) {
            h1Var.y();
            this.f31516E = null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_develop) {
            return super.onOptionsItemSelected(menuItem);
        }
        a aVar = (a) this.f31518G.getValue();
        aVar.getClass();
        C2680e.c(Z.a(aVar), aVar.f32112a, null, new BasicSettingsKwpViewModel$onDevelopmentClicked$1(aVar, null), 2);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        m8.g gVar;
        super.onPause();
        this.f31512A = false;
        if (this.f31531y != null && (gVar = this.f31532z) != null) {
            Task taskContinueWithTask = gVar.f44619d.continueWithTask(new m8.e(gVar));
            gVar.f44619d = taskContinueWithTask;
            taskContinueWithTask.continueWithTask(new b(0, this));
        }
        N();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ActivityC1347l activity = getActivity();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        if (!com.voltasit.obdeleven.a.C0320a.a(activity).b("show_basic_settings_warning", true)) {
            U();
        } else if (this.f31516E == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_title", R.string.common_attention);
            bundle.putInt("key_positive_text", R.string.common_ok);
            bundle.putInt("key_checkbox_text", R.string.common_do_not_show_again);
            h1 h1Var = new h1();
            h1Var.setArguments(bundle);
            h1Var.f32261r = getParentFragmentManager();
            h1Var.setTargetFragment(this, 0);
            this.f31516E = h1Var;
            h1Var.A();
        }
        if (this.f31532z != null) {
            this.f31512A = true;
            W();
        }
        M();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_basic_settings);
    }
}
