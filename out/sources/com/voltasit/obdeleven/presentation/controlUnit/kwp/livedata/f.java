package com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata;

import B8.E0;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.Z;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.ui.dialogs.C2166q0;
import com.voltasit.obdeleven.ui.dialogs.h1;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p194p8.h;
import p220r9.Q;

/* JADX INFO: compiled from: ControlUnitMeasurementFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/104/live-data")
public class f extends BaseFragment implements View.OnClickListener, DialogCallback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public h1 f31769A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f31770B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2166q0 f31771C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f31772D = KoinJavaComponent.b(g.class, null, null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f31773E = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f31776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f31777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f31778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AppCompatImageButton f31779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatImageButton f31780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HistoryDB f31781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout[] f31782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ControlUnit f31783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f31784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ValueUnit f31786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SwipeRefreshLayout f31788z;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int color;
        int i10 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_measurement, viewGroup, false);
        if (this.f31783u == null) {
            return viewInflate;
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_number);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_channelLayout);
        this.f31774l = (TextView) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_title);
        this.f31775m = (TextView) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_channel);
        this.f31776n = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_measLayout);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas0);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas1);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas2);
        LinearLayout linearLayout5 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas3);
        this.f31777o = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas4);
        LinearLayout linearLayout6 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas5);
        LinearLayout linearLayout7 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas6);
        LinearLayout linearLayout8 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas7);
        LinearLayout linearLayout9 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas8);
        LinearLayout linearLayout10 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_meas9);
        this.f31778p = (TextView) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_description);
        this.f31779q = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_prev);
        this.f31780r = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitMeasurementFragment_next);
        this.f31782t = new LinearLayout[]{linearLayout2, linearLayout3, linearLayout4, linearLayout5, this.f31777o, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10};
        int i11 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f31782t;
            if (i11 >= linearLayoutArr.length) {
                break;
            }
            TextView textView3 = (TextView) linearLayoutArr[i11].getChildAt(0);
            Locale locale = Locale.US;
            i11++;
            textView3.setText(getString(R.string.common_value) + " " + i11);
        }
        linearLayout.setOnClickListener(this);
        Drawable drawable = getResources().getDrawable(2131231581);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        p234t0.a.C0532a.i(drawable, mode);
        p234t0.a.C0532a.g(drawable, getResources().getColor(R.color.checkbox_blue));
        Drawable drawable2 = getResources().getDrawable(2131231705);
        p234t0.a.C0532a.i(drawable2, mode);
        p234t0.a.C0532a.g(drawable2, getResources().getColor(R.color.checkbox_blue));
        this.f31779q.setImageDrawable(drawable);
        this.f31780r.setImageDrawable(drawable2);
        this.f31780r.setOnClickListener(this);
        this.f31779q.setOnClickListener(this);
        if (this.f31783u == null && this.f31781s == null) {
            r().o(false);
        } else {
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            this.f31786x = com.voltasit.obdeleven.a.C0320a.a(activity).i();
            if (q().E()) {
                imageView.setVisibility(8);
                textView.setVisibility(8);
                textView2.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.topMargin = 0;
                linearLayout.setLayoutParams(layoutParams);
            } else {
                com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(this.f31783u.a0());
                T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
                i.d(dVarJ, "placeholder(...)");
                dVarM.a(dVarJ).x(imageView);
            }
            textView2.setText(this.f31783u.t());
            textView.setText(this.f31783u.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(getActivity()).c()).b()));
            if (!this.f31783u.b()) {
                color = getResources().getColor(R.color.black);
            } else if (this.f31783u.j0()) {
                color = this.f31783u.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
            } else {
                color = getResources().getColor(R.color.yellow_500);
            }
            textView2.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        h hVar = this.f31784v;
        if (hVar != null) {
            this.f31775m.setText(String.format(Locale.US, "%03d", Integer.valueOf(hVar.getChannel())));
        } else {
            this.f31779q.setEnabled(false);
            this.f31780r.setEnabled(false);
        }
        this.f31788z = Q.b(viewInflate);
        ?? r10 = this.f31772D;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((g) r10.getValue()).f31795u.e(getViewLifecycleOwner(), new a(this, i10));
        ((g) r10.getValue()).f31791q.e(getViewLifecycleOwner(), new b(this, i10));
        ((g) r10.getValue()).f31793s.e(getViewLifecycleOwner(), new c(this, i10));
        return this.f31788z;
    }

    public void O() {
        this.f31783u.f29320b.saveInBackground();
        this.f31783u.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final void P() {
        ((J8.a) this.f31773E.getValue()).b();
        if (y()) {
            return;
        }
        ApplicationProtocol applicationProtocol = this.f31783u.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29262b;
        int i10 = applicationProtocol == applicationProtocol2 ? 0 : 1;
        int i11 = applicationProtocol == applicationProtocol2 ? 255 : 254;
        this.f31770B = new ArrayList();
        C2166q0 c2166q0 = this.f31771C;
        if (c2166q0 == null || !c2166q0.isVisible()) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_title", R.string.common_enter_channel);
            bundle.putInt("key_min", i10);
            bundle.putInt("key_max", i11);
            ControlUnit controlUnit = this.f31783u;
            bundle.putString("key_type", "MEASUREMENT");
            ArrayList arrayList = this.f31770B;
            C2166q0 c2166q1 = new C2166q0();
            c2166q1.setArguments(bundle);
            c2166q1.f34011x = arrayList;
            c2166q1.f32261r = getFragmentManager();
            c2166q1.setTargetFragment(this, 0);
            c2166q1.f34009v = controlUnit;
            this.f31771C = c2166q1;
            c2166q1.A();
        }
    }

    public void Q() {
        h hVar = this.f31784v;
        hVar.b(this.f31786x).continueWith(new d(this, 0, hVar), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("WarningDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                boolean z10 = bundle.getBoolean("key_checkbox_bool");
                ActivityC1347l activity = getActivity();
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                com.voltasit.obdeleven.a.C0320a.a(activity).j("show_live_data_warning", !z10);
                P();
                this.f31769A = null;
                return;
            }
            return;
        }
        if (str.equals("NumberLabelDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                this.f31779q.setEnabled(true);
                this.f31780r.setEnabled(true);
                int i10 = bundle.getInt("key_channel");
                this.f31784v = this.f31783u.R(i10);
                this.f31775m.setText(String.format(Locale.US, "%03d", Integer.valueOf(i10)));
                if (!this.f31785w) {
                    this.f31785w = true;
                    Q();
                }
                this.f31788z.setRefreshing(true);
            } else if (this.f31784v == null) {
                r().h();
            }
            this.f31771C = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ControlUnitMeasurementFragment";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int channel = this.f31784v.getChannel();
        int id = view.getId();
        if (id == R.id.controlUnitMeasurementFragment_channelLayout) {
            P();
            return;
        }
        ApplicationProtocol applicationProtocol = ApplicationProtocol.f29262b;
        if (id == R.id.controlUnitMeasurementFragment_next) {
            if (channel < 254 || (this.f31783u.f29327i == applicationProtocol && channel < 255)) {
                channel++;
                this.f31784v = this.f31783u.R(channel);
            }
            this.f31775m.setText(String.format(Locale.US, "%03d", Integer.valueOf(channel)));
            if (!this.f31785w) {
                this.f31785w = true;
                Q();
            }
            this.f31788z.setRefreshing(true);
            return;
        }
        if (id != R.id.controlUnitMeasurementFragment_prev) {
            return;
        }
        if (channel > 1 || (this.f31783u.f29327i == applicationProtocol && channel > 0)) {
            channel--;
            this.f31784v = this.f31783u.R(channel);
        }
        this.f31775m.setText(String.format(Locale.US, "%03d", Integer.valueOf(channel)));
        if (!this.f31785w) {
            this.f31785w = true;
            Q();
        }
        this.f31788z.setRefreshing(true);
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

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C2166q0 c2166q0 = this.f31771C;
        if (c2166q0 != null) {
            c2166q0.y();
            this.f31771C = null;
        }
        h1 h1Var = this.f31769A;
        if (h1Var != null) {
            h1Var.y();
            this.f31769A = null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_develop) {
            return super.onOptionsItemSelected(menuItem);
        }
        g gVar = (g) this.f31772D.getValue();
        gVar.getClass();
        C2680e.c(Z.a(gVar), gVar.f32112a, null, new LiveDataViewModel$onDevelopmentClicked$1(gVar, null), 2);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f31785w = false;
        if (this.f31783u != null) {
            O();
        }
        N();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ActivityC1347l activity = getActivity();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        if (com.voltasit.obdeleven.a.C0320a.a(activity).b("show_live_data_warning", true)) {
            if (this.f31769A == null) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_title", R.string.common_attention);
                bundle.putInt("key_positive_text", R.string.common_ok);
                bundle.putInt("key_checkbox_text", R.string.common_do_not_show_again);
                h1 h1Var = new h1();
                h1Var.setArguments(bundle);
                h1Var.f32261r = getParentFragmentManager();
                h1Var.setTargetFragment(this, 0);
                this.f31769A = h1Var;
                h1Var.A();
            }
        } else if (this.f31775m.getText().toString().isEmpty()) {
            P();
        }
        UserTrackingUtils.c(UserTrackingUtils.Key.f34246G, 1);
        if (this.f31784v != null) {
            this.f31785w = true;
            Q();
        }
        M();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_live_data);
    }
}
