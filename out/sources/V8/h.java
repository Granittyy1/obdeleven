package V8;

import B8.E0;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p134k8.D1;
import p220r9.Q;

/* JADX INFO: compiled from: SubsystemCodingFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/103/coding")
public class h extends BaseProFragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f6787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextInputLayout f6788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f6789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FloatingActionButton f6790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public D1 f6791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ControlUnit f6792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B0 f6793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SwipeRefreshLayout f6794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.f f6795v = (com.voltasit.obdeleven.domain.usecases.f) KoinJavaComponent.a(com.voltasit.obdeleven.domain.usecases.f.class);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f6796w = KoinJavaComponent.b(i.class, null, null);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        int color;
        ?? r10 = this.f6796w;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((i) r10.getValue()).f6798p.e(getViewLifecycleOwner(), new C0828b(this, 0));
        O().f32797E.e(getViewLifecycleOwner(), new C0829c(this, 0));
        O().f32795C.e(getViewLifecycleOwner(), new C0830d(this, 0));
        T();
        O().c(true);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_coding, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.controlUnitCodingFragment_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.controlUnitCodingFragment_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.controlUnitCodingFragment_number);
        this.f6787n = (TextView) viewInflate.findViewById(R.id.controlUnitCodingFragment_value);
        this.f6788o = (TextInputLayout) viewInflate.findViewById(R.id.controlUnitCodingFragment_inputLayout);
        this.f6789p = (EditText) viewInflate.findViewById(R.id.controlUnitCodingFragment_input);
        this.f6790q = (FloatingActionButton) viewInflate.findViewById(R.id.controlUnitCodingFragment_fab);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        Q(this.f6790q);
        if (this.f6792s == null || this.f6791r == null) {
            q().J();
        } else {
            com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(this.f6792s.a0());
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
            dVarM.a(dVarJ).x(imageView);
            textView2.setText(this.f6792s.t());
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            String string2 = this.f6792s.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activity).c()).b()) + "\n";
            if (this.f6795v.a()) {
                StringBuilder sbE = C4.b.e(string2);
                Locale locale = Locale.US;
                sbE.append("(" + this.f6791r.getId() + ") ");
                string2 = sbE.toString();
            }
            try {
                string = string2 + this.f6791r.u();
            } catch (ControlUnitException unused) {
                StringBuilder sbE2 = C4.b.e(string2);
                sbE2.append(getResources().getString(R.string.common_unknown));
                string = sbE2.toString();
            }
            textView.setText(string);
            if (!this.f6792s.b()) {
                color = getResources().getColor(R.color.black);
            } else if (this.f6792s.j0()) {
                color = this.f6792s.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
            } else {
                color = getResources().getColor(R.color.yellow_500);
            }
            textView2.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            U();
        }
        SwipeRefreshLayout swipeRefreshLayoutB = Q.b(viewInflate);
        this.f6794u = swipeRefreshLayoutB;
        return swipeRefreshLayoutB;
    }

    public final void U() {
        try {
            this.f6787n.setText((String) this.f6791r.q().f10040b);
            this.f6788o.setCounterMaxLength(8);
            this.f6790q.setEnabled(true);
            this.f6789p.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        } catch (ControlUnitException unused) {
            this.f6790q.setEnabled(false);
            this.f6791r.g().continueWith(new S8.a(1, this), Task.UI_THREAD_EXECUTOR);
        }
    }

    public final void V(String str) {
        this.f6794u.setRefreshing(true);
        this.f6790q.setEnabled(false);
        this.f6791r.s().continueWithTask(new C0831e(this, 0, str)).continueWith(new f(this, 0, str), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("SecurityAccessDialogFragment")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                V(bundle.getBundle("key_bundle").getString("key_coding"));
            }
            B0 b10 = this.f6793t;
            if (b10 != null) {
                b10.y();
                this.f6793t = null;
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "SubsystemCodingFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C2137c.a();
        B0 b10 = this.f6793t;
        if (b10 != null) {
            b10.y();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_coding);
    }
}
