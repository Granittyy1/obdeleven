package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import B8.E0;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.Z;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.core.app.p0;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.dialogs.h1;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p220r9.Q;

/* JADX INFO: compiled from: ControlUnitCodingFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/103/coding")
public class m extends BaseProFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f31745A = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f31746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextInputLayout f31748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f31749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FloatingActionButton f31750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ControlUnit f31751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B0 f31752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.compose.foundation.gestures.snapping.f f31753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h1 f31754v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SwipeRefreshLayout f31756x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31755w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f31757y = KoinJavaComponent.b(a.class, null, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f31758z = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int color;
        int i10 = 1;
        int i11 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_coding, viewGroup, false);
        T();
        O().c(true);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.controlUnitCodingFragment_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.controlUnitCodingFragment_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.controlUnitCodingFragment_number);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.controlUnitCodingFragment_codingTitleContainer);
        this.f31746n = (TextView) viewInflate.findViewById(R.id.controlUnitCodingFragment_value);
        this.f31748p = (TextInputLayout) viewInflate.findViewById(R.id.controlUnitCodingFragment_inputLayout);
        this.f31749q = (EditText) viewInflate.findViewById(R.id.controlUnitCodingFragment_input);
        this.f31747o = (TextView) viewInflate.findViewById(R.id.controlUnitCodingFragment_description);
        this.f31750r = (FloatingActionButton) viewInflate.findViewById(R.id.controlUnitCodingFragment_fab);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.controlUnitCodingFragment_cover);
        ?? r10 = this.f31757y;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((a) r10.getValue()).f31720q.e(getViewLifecycleOwner(), new g(this, i11));
        O().f32795C.e(getViewLifecycleOwner(), new h(this, i11));
        O().f32797E.e(getViewLifecycleOwner(), new i(this, i11));
        ((a) r10.getValue()).f31726w.e(getViewLifecycleOwner(), new j(this, i11));
        ((a) r10.getValue()).f31722s.e(getViewLifecycleOwner(), new k(this, i11));
        ((a) r10.getValue()).f31724u.e(getViewLifecycleOwner(), new l(this, i11));
        if (q().E()) {
            imageView.setVisibility(8);
            textView.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).topMargin = 0;
            frameLayout.setVisibility(8);
        }
        if (this.f31755w) {
            textView2.setVisibility(8);
            this.f31749q.setVisibility(8);
            this.f31750r.h();
            this.f31748p.setVisibility(8);
            com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(this.f31751s.a0());
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
            dVarM.a(dVarJ).x(imageView);
            textView2.setText(this.f31751s.t());
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            textView.setText(this.f31751s.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activity).c()).b()));
            C2134a0.b(getContext(), R.string.common_loading);
            Task.callInBackground(new C7.m(i10, this)).continueWith(new p022b9.b(2, this), Task.UI_THREAD_EXECUTOR);
        } else {
            this.f31749q.setOnFocusChangeListener(new b());
            Q(this.f31750r);
            if (!W7.c.e() || this.f31751s == null) {
                q().J();
            } else {
                com.bumptech.glide.d<Drawable> dVarM2 = com.bumptech.glide.b.c(getContext()).f(this).m(this.f31751s.a0());
                T3.d dVarJ2 = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
                kotlin.jvm.internal.i.d(dVarJ2, "placeholder(...)");
                dVarM2.a(dVarJ2).x(imageView);
                textView2.setText(this.f31751s.t());
                ActivityC1347l activity2 = getActivity();
                List<String> list2 = com.voltasit.obdeleven.a.f29638c;
                textView.setText(this.f31751s.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activity2).c()).b()));
                if (!this.f31751s.b()) {
                    color = getResources().getColor(R.color.black);
                } else if (this.f31751s.j0()) {
                    color = this.f31751s.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
                } else {
                    color = getResources().getColor(R.color.yellow_500);
                }
                textView2.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                U();
            }
        }
        SwipeRefreshLayout swipeRefreshLayoutB = Q.b(viewInflate);
        this.f31756x = swipeRefreshLayoutB;
        return swipeRefreshLayoutB;
    }

    public final void U() {
        try {
            androidx.compose.foundation.gestures.snapping.f fVarQ = this.f31751s.Q();
            this.f31753u = fVarQ;
            String str = (String) fVarQ.f10040b;
            this.f31746n.setText(str);
            int length = str.length();
            this.f31748p.setCounterMaxLength(length);
            this.f31750r.setEnabled(true);
            this.f31749q.setFilters(new InputFilter[]{new InputFilter.LengthFilter(length)});
            p121j8.c cVar = (p121j8.c) this.f31753u.f10041c;
            String strE = cVar != null ? cVar.e(-2) : null;
            if (strE == null || strE.isEmpty()) {
                strE = "...";
            }
            this.f31747o.setText(strE);
            UserTrackingUtils.c(UserTrackingUtils.Key.f34271p, 1);
        } catch (ControlUnitException unused) {
            this.f31750r.setEnabled(false);
            this.f31751s.n0().continueWith(new p009a8.f(2, this), Task.UI_THREAD_EXECUTOR);
        }
    }

    public final void V(String str) {
        this.f31756x.setRefreshing(true);
        this.f31750r.setEnabled(false);
        Task<Integer> taskK0 = this.f31751s.K0(str);
        f fVar = new f(this, str, 0);
        Executor executor = Task.UI_THREAD_EXECUTOR;
        taskK0.continueWithTask(fVar, executor).continueWith(new p0(this, 1, str), executor);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("WarningDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                boolean z10 = bundle.getBoolean("key_checkbox_bool");
                ActivityC1347l activity = getActivity();
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                com.voltasit.obdeleven.a.C0320a.a(activity).j("show_coding_warning", !z10);
                this.f31754v = null;
                return;
            }
            return;
        }
        if (str.equals("SecurityAccessDialogFragment")) {
            if (callbackType == DialogCallback.CallbackType.f31102c && bundle.containsKey("key_bundle")) {
                Bundle bundle2 = bundle.getBundle("key_bundle");
                if (bundle2.containsKey("key_coding")) {
                    V(bundle2.getString("key_coding"));
                }
            }
            B0 b10 = this.f31752t;
            if (b10 != null) {
                b10.y();
                this.f31752t = null;
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ControlUnitCodingFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        ActivityC1347l activity = getActivity();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        if (com.voltasit.obdeleven.a.C0320a.a(activity).b("show_coding_warning", true) && this.f31754v == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_title", R.string.common_attention);
            bundle2.putInt("key_positive_text", R.string.common_ok);
            bundle2.putInt("key_checkbox_text", R.string.common_do_not_show_again);
            h1 h1Var = new h1();
            h1Var.setArguments(bundle2);
            h1Var.f32261r = getParentFragmentManager();
            h1Var.setTargetFragment(this, 0);
            this.f31754v = h1Var;
            h1Var.A();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.developer, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C2137c.a();
        B0 b10 = this.f31752t;
        if (b10 != null) {
            b10.y();
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_develop) {
            return super.onOptionsItemSelected(menuItem);
        }
        a aVar = (a) this.f31757y.getValue();
        aVar.getClass();
        C2680e.c(Z.a(aVar), aVar.f32112a, null, new CodingKwpViewModel$onDevelopmentClicked$1(aVar, null), 2);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_coding);
    }
}
