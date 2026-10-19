package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import V8.A;
import V8.w;
import Z3.RunnableC0837c;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.e0;
import androidx.fragment.app.ActivityC1347l;
import androidx.lifecycle.Z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.afollestad.materialdialogs.internal.MDButton;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.B;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.dialogs.C2158m0;
import com.voltasit.obdeleven.ui.dialogs.h1;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p134k8.C2642q1;
import p220r9.P;
import p220r9.Q;
import p255u9.u;

/* JADX INFO: compiled from: ControlUnitLongCodingFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/102/long-coding")
public class q extends BaseProFragment implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C2642q1 f31834E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f31835F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public MenuItem f31836G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public MaterialDialog f31837H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public B0 f31838I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SwipeRefreshLayout f31839J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public h1 f31840K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C2642q1 f31841L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f31845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f31847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f31848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatImageButton f31849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AppCompatImageButton f31850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FloatingActionButton f31851t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p122j9.g f31856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ControlUnit f31857z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout[] f31852u = new LinearLayout[8];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView[] f31853v = new TextView[8];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView[] f31854w = new TextView[8];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AppCompatCheckBox[] f31855x = new AppCompatCheckBox[8];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31830A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f31831B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f31832C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f31833D = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Object f31842M = KoinJavaComponent.b(r.class, null, null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Object f31843N = KoinJavaComponent.b(SfdViewModel.class, null, new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.a(0));

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Object f31844O = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: compiled from: ControlUnitLongCodingFragment.java */
    public class a extends MaterialDialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f31858a;

        public a(boolean z10) {
            this.f31858a = z10;
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.b
        public final void a(MaterialDialog materialDialog) {
            materialDialog.dismiss();
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.b
        public final void b(MaterialDialog materialDialog) {
            FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
            MDButton mDButtonC = materialDialog.c(DialogAction.f23185c);
            String string = floatingEditText.getText().toString();
            String string2 = mDButtonC.getText().toString();
            if (this.f31858a) {
                floatingEditText.setFilters(new InputFilter[0]);
                if (string2.equals("ASCII")) {
                    floatingEditText.setHint(R.string.common_value);
                    floatingEditText.setText(kotlin.jvm.internal.n.d(string));
                    mDButtonC.setText("HEX");
                } else {
                    floatingEditText.setHint("00 - FF HEX");
                    floatingEditText.setText(kotlin.jvm.internal.n.e(string));
                    mDButtonC.setText("ASCII");
                }
            } else if (string2.equals("DEC")) {
                floatingEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                floatingEditText.setHint("0 - 255 DEC");
                floatingEditText.setInputType(2);
                if (!string.isEmpty()) {
                    try {
                        Locale locale = Locale.US;
                        int i10 = Integer.parseInt(string, 16);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i10);
                        floatingEditText.setText(sb2.toString());
                    } catch (NumberFormatException unused) {
                        floatingEditText.setText("");
                    }
                }
                mDButtonC.setText("HEX");
            } else {
                floatingEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2)});
                floatingEditText.setHint("00 - FF HEX");
                floatingEditText.setInputType(1);
                if (!string.isEmpty()) {
                    floatingEditText.setText(String.format(Locale.US, "%02X", Integer.valueOf(Integer.parseInt(string, 10))));
                }
                mDButtonC.setText("DEC");
            }
            floatingEditText.setSelection(floatingEditText.getText().length());
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.b
        public final void c(MaterialDialog materialDialog) {
            FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
            String string = floatingEditText.getText().toString();
            String string2 = materialDialog.c(DialogAction.f23185c).getText().toString();
            boolean z10 = this.f31858a;
            q qVar = q.this;
            if (!z10) {
                try {
                    qVar.f31856y.f41191e.f(qVar.f31830A, Integer.parseInt(string, string2.equals("HEX") ? 10 : 16));
                    qVar.X(qVar.f31830A);
                    materialDialog.dismiss();
                    return;
                } catch (NumberFormatException unused) {
                    floatingEditText.c(R.string.common_wrong_value);
                    return;
                }
            }
            if (string2.equals("HEX")) {
                string = kotlin.jvm.internal.n.e(string);
            }
            if (string.length() / 2 != qVar.f31856y.getItemCount() || !string.matches("^([0-9a-fA-F]{2})+")) {
                floatingEditText.c(R.string.common_wrong_value);
                return;
            }
            qVar.f31856y.f41191e.f42831c = string;
            qVar.X(qVar.f31830A);
            materialDialog.dismiss();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        if (this.f31856y.a() && !this.f31833D) {
            C2137c.b(getActivity(), R.string.common_discard_changes, R.string.common_ok, R.string.common_cancel).continueWith(new V8.j(1, this), Task.UI_THREAD_EXECUTOR);
            return true;
        }
        if (this.f31835F || this.f31833D) {
            r().h();
            return true;
        }
        r().j(false);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout[] linearLayoutArr;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_long_coding, viewGroup, false);
        ?? r10 = this.f31842M;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ?? r11 = this.f31843N;
        ((SfdViewModel) r11.getValue()).f31218u.e(getViewLifecycleOwner(), new X8.i(this, i10));
        ((SfdViewModel) r11.getValue()).f31207A.e(getViewLifecycleOwner(), new X8.j(this, i10));
        ((SfdViewModel) r11.getValue()).f31220w.e(getViewLifecycleOwner(), new h(this, i12));
        ((SfdViewModel) r11.getValue()).f31222y.e(getViewLifecycleOwner(), new i(this, i12));
        ((SfdViewModel) r11.getValue()).f31218u.e(getViewLifecycleOwner(), new j(this, i12));
        ((SfdViewModel) r11.getValue()).f31209C.e(getViewLifecycleOwner(), new k(this, i12));
        ((r) r10.getValue()).f31862q.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.l(this, i11));
        O().f32797E.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.a(this, i11));
        O().f32795C.e(getViewLifecycleOwner(), new w(this, i11));
        ((r) r10.getValue()).f31868w.e(getViewLifecycleOwner(), new b(this, i12));
        ((r) r10.getValue()).f31864s.e(getViewLifecycleOwner(), new c(this, i12));
        ((r) r10.getValue()).f31866u.e(getViewLifecycleOwner(), new d(this, i12));
        T();
        O().c(true);
        if (this.f31857z == null) {
            return viewInflate;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_swipeRefreshLayout);
        this.f31839J = swipeRefreshLayout;
        Q.a(swipeRefreshLayout, this);
        this.f31845n = (RecyclerView) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_list);
        this.f31846o = (TextView) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_byte);
        this.f31847p = (TextView) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_hexDecvalue);
        this.f31848q = (LinearLayout) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_bits);
        this.f31849r = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_prev);
        this.f31851t = (FloatingActionButton) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_fab);
        this.f31850s = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_next);
        int[] iArr = {R.id.controlUnitLongCodingFragment_bit0, R.id.controlUnitLongCodingFragment_bit1, R.id.controlUnitLongCodingFragment_bit2, R.id.controlUnitLongCodingFragment_bit3, R.id.controlUnitLongCodingFragment_bit4, R.id.controlUnitLongCodingFragment_bit5, R.id.controlUnitLongCodingFragment_bit6, R.id.controlUnitLongCodingFragment_bit7};
        int i13 = 0;
        while (true) {
            linearLayoutArr = this.f31852u;
            if (i13 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i13] = (LinearLayout) viewInflate.findViewById(iArr[i13]);
            i13++;
        }
        this.f31845n.setHasFixedSize(false);
        this.f31845n.setAdapter(this.f31856y);
        this.f31846o.setOnClickListener(this);
        if (!this.f31832C) {
            this.f31847p.setOnClickListener(this);
        }
        for (final int i14 = 0; i14 < linearLayoutArr.length; i14++) {
            LinearLayout linearLayout = linearLayoutArr[i14];
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
            TextView textView = (TextView) linearLayout2.getChildAt(0);
            TextView textView2 = (TextView) linearLayout2.getChildAt(1);
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) linearLayout.getChildAt(1);
            this.f31853v[i14] = textView;
            this.f31854w[i14] = textView2;
            this.f31855x[i14] = appCompatCheckBox;
            if (!this.f31833D) {
                linearLayout.setOnClickListener(new e(i14, i12, this));
                linearLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.f
                    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        r rVar = (r) this.f31806b.f31842M.getValue();
                        int i15 = i14;
                        rVar.f31869x = i15;
                        C2680e.c(Z.a(rVar), null, null, new LongCodingKwpViewModel$onBitLongClicked$1(rVar, i15, null), 3);
                        return true;
                    }
                });
            }
            textView.setText(String.format(Locale.US, "%s %1d", getString(R.string.common_bit), Integer.valueOf(i14)));
            if (!this.f31832C) {
                appCompatCheckBox.setOnClickListener(new A(this, i14, i11));
            }
        }
        Drawable drawable = getResources().getDrawable(2131231581);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        p234t0.a.C0532a.i(drawable, mode);
        p234t0.a.C0532a.g(drawable, getResources().getColor(R.color.checkbox_blue));
        Drawable drawable2 = getResources().getDrawable(2131231705);
        p234t0.a.C0532a.i(drawable2, mode);
        p234t0.a.C0532a.g(drawable2, getResources().getColor(R.color.checkbox_blue));
        this.f31849r.setImageDrawable(drawable);
        this.f31850s.setImageDrawable(drawable2);
        this.f31849r.setOnClickListener(this);
        this.f31850s.setOnClickListener(this);
        Q(this.f31851t);
        if (this.f31832C) {
            this.f31851t.h();
            this.f31839J.setEnabled(false);
            try {
                if (!this.f31833D) {
                    p122j9.g gVar = this.f31856y;
                    C2642q1 c2642q1W = this.f31857z.W();
                    gVar.getClass();
                    gVar.f41190d = c2642q1W;
                    gVar.f41191e = c2642q1W.clone();
                    gVar.notifyDataSetChanged();
                }
                if (this.f31831B) {
                    this.f31831B = false;
                }
            } catch (ControlUnitException unused) {
                this.f31831B = false;
            }
        } else if (W7.c.e()) {
            this.f31839J.setEnabled(true);
            try {
                p122j9.g gVar2 = this.f31856y;
                C2642q1 c2642q1W2 = this.f31857z.W();
                boolean z10 = this.f31833D;
                gVar2.getClass();
                if (!z10) {
                    gVar2.f41190d = c2642q1W2;
                }
                gVar2.f41191e = c2642q1W2.clone();
                gVar2.notifyDataSetChanged();
                X(this.f31830A);
                if (this.f31831B) {
                    this.f31831B = false;
                    W();
                }
            } catch (ControlUnitException unused2) {
                this.f31831B = false;
                W();
            }
        } else {
            r().o(false);
        }
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new S6.k(4, this));
        getChildFragmentManager().b0("SfdAutoUnlockDialog", this, new Y1.d(5, this));
        return viewInflate;
    }

    public final void U(boolean z10) {
        for (LinearLayout linearLayout : this.f31852u) {
            linearLayout.setEnabled(z10);
        }
        this.f31849r.setEnabled(z10);
        this.f31850s.setEnabled(z10);
        this.f31851t.setEnabled(z10);
    }

    public final void V(final boolean z10) {
        ActivityC1347l activity = getActivity();
        MaterialDialog.a aVar = new MaterialDialog.a(activity);
        aVar.g(R.string.common_enter_value);
        aVar.f23212B = Theme.f23261b;
        aVar.a(R.layout.dialog_with_edittext);
        Typeface typefaceCreate = Typeface.create("sans-serif", 0);
        Typeface typefaceJ = C1787c0.j();
        aVar.f23219I = typefaceCreate;
        aVar.f23218H = typefaceJ;
        aVar.f23248r = p067f3.b.b(activity, getResources().getColor(R.color.grey_l));
        aVar.f23229S = true;
        aVar.e(R.string.common_ok);
        aVar.f23249s = p067f3.b.b(activity, getResources().getColor(R.color.grey_l));
        aVar.f23231U = true;
        aVar.d();
        aVar.f23250t = p067f3.b.b(activity, getResources().getColor(R.color.grey_l));
        aVar.f23230T = true;
        aVar.f23244n = "HEX";
        aVar.f23217G = false;
        aVar.f23252v = new a(z10);
        aVar.f23223M = new DialogInterface.OnShowListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.p
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                InputFilter[] inputFilterArr;
                q qVar = this.f31828b;
                qVar.getClass();
                MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
                FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
                MDButton mDButtonC = materialDialog.c(DialogAction.f23185c);
                floatingEditText.setHint("00 - FF HEX");
                floatingEditText.setInputType(1);
                if (z10) {
                    inputFilterArr = new InputFilter[0];
                    floatingEditText.setText(qVar.f31856y.f41191e.f42831c);
                    mDButtonC.setText("ASCII");
                } else {
                    inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(2)};
                    floatingEditText.setText(String.format(Locale.US, "%02X", Integer.valueOf(qVar.f31856y.f41191e.b(qVar.f31830A))));
                    mDButtonC.setText("DEC");
                }
                floatingEditText.setFilters(inputFilterArr);
                floatingEditText.setSelection(floatingEditText.getText().length());
                D9.o.p(floatingEditText);
            }
        };
        this.f31837H = aVar.f();
    }

    public final void W() {
        O.e.s("ControlUnitLongCodingFragment", "readLongCoding()");
        this.f31839J.setRefreshing(true);
        U(false);
        this.f31857z.e().continueWith(new V8.k(3, this), Task.UI_THREAD_EXECUTOR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.widget.TextView[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.TextView[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.widget.LinearLayout[]] */
    public final void X(int i10) {
        ?? r10;
        ?? r11;
        String string;
        ?? r12;
        int i11;
        int i12;
        this.f31830A = i10;
        p122j9.g gVar = this.f31856y;
        gVar.f41192f = i10;
        gVar.notifyDataSetChanged();
        this.f31845n.m0(i10);
        C2642q1 c2642q1 = this.f31856y.f41191e;
        if (c2642q1 == null) {
            O.e.l("ControlUnitLongCodingFragment", "Long coding is null in position: " + i10);
            return;
        }
        TextView textView = this.f31846o;
        Locale locale = Locale.US;
        textView.setText(String.format(locale, "%s %02d", getString(R.string.common_byte), Integer.valueOf(this.f31830A)));
        this.f31847p.setText(String.format(locale, "%s %02X", "Hex", Integer.valueOf(c2642q1.b(i10))));
        ?? r13 = 0;
        int i13 = 0;
        while (true) {
            AppCompatCheckBox[] appCompatCheckBoxArr = this.f31855x;
            r10 = 1;
            if (i13 >= appCompatCheckBoxArr.length) {
                break;
            }
            AppCompatCheckBox appCompatCheckBox = appCompatCheckBoxArr[i13];
            byte b10 = this.f31856y.f41190d.c(i10)[i13];
            byte b11 = c2642q1.c(i10)[i13];
            appCompatCheckBox.setChecked(b11 == 1);
            H0.b.c(appCompatCheckBox, ColorStateList.valueOf(b11 != b10 ? getResources().getColor(R.color.checkbox_green) : getResources().getColor(R.color.checkbox_blue)));
            i13++;
        }
        int i14 = 0;
        while (i14 < 8) {
            ?? r14 = this.f31853v;
            ?? r15 = r14[i14];
            ?? r16 = this.f31854w;
            ?? r17 = r16[i14];
            r17.setVisibility(r13);
            ?? r18 = this.f31852u;
            r18[i14].setEnabled(r10);
            r15.setVisibility(r13);
            p121j8.e eVar = c2642q1.f42830b;
            ?? B10 = eVar != null ? eVar.b(this.f31830A, i14) : Collections.emptyList();
            String string2 = "...";
            if (B10.isEmpty()) {
                Locale locale2 = Locale.US;
                r15.setText(getString(R.string.common_bit) + " " + i14);
                r17.setText("...");
                int iIndexOfChild = this.f31848q.indexOfChild(r18[i14]);
                if (iIndexOfChild > 0) {
                    this.f31848q.getChildAt(iIndexOfChild - 1).setVisibility(r13);
                }
                c2642q1 = c2642q1;
                r12 = r13;
                i12 = r10 == true ? 1 : 0;
            } else {
                int i15 = ((ControlUnitLabelDB) B10.get(r13)).getInt("bitLength");
                int i16 = 0;
                int i17 = 0;
                while (i16 < i15) {
                    r11 = r10;
                    i17 |= c2642q1.c(this.f31830A)[i14 + i16] << i16;
                    i16++;
                    r11 = 1;
                }
                if (i15 == r11) {
                    r11 = r10;
                    Locale locale3 = Locale.US;
                    string = getString(R.string.common_bit) + " " + i14;
                } else {
                    r11 = r10;
                    Locale locale4 = Locale.US;
                    String string3 = getString(R.string.common_bit);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string3);
                    sb2.append(" ");
                    sb2.append(i14);
                    sb2.append(" - ");
                    sb2.append((i14 + i15) - 1);
                    string = sb2.toString();
                }
                Iterator it = B10.iterator();
                while (it.hasNext()) {
                    ControlUnitLabelDB controlUnitLabelDB = (ControlUnitLabelDB) it.next();
                    Iterator it2 = it;
                    if (controlUnitLabelDB.getInt("value") == -1) {
                        List<u> listC = eVar.c(controlUnitLabelDB, p267v9.a.f47671a);
                        u uVar = listC != null ? listC.get(0) : null;
                        if (uVar != null) {
                            string = uVar.getString("value");
                        }
                    } else if (i17 == controlUnitLabelDB.getInt("value")) {
                        List<u> listC2 = eVar.c(controlUnitLabelDB, p267v9.a.f47671a);
                        u uVar2 = listC2 != null ? listC2.get(0) : null;
                        if (uVar2 != null) {
                            string2 = uVar2.getString("value");
                        }
                    }
                    it = it2;
                }
                r15.setText(string);
                r17.setText(string2);
                int iIndexOfChild2 = this.f31848q.indexOfChild(r18[i14]);
                if (iIndexOfChild2 > 0) {
                    r12 = 0;
                    this.f31848q.getChildAt(iIndexOfChild2 - 1).setVisibility(0);
                } else {
                    r12 = 0;
                }
                int i18 = r12 == true ? 1 : 0;
                while (true) {
                    i11 = i15 - 1;
                    if (i18 >= i11) {
                        break;
                    }
                    int i19 = i14 + i18;
                    int i20 = i19 + 1;
                    r18[i20].setEnabled(r12);
                    r14[i20].setVisibility(4);
                    r16[i20].setVisibility(4);
                    this.f31848q.getChildAt(this.f31848q.indexOfChild(r18[i19]) + 1).setVisibility(4);
                    i18++;
                }
                i12 = 1;
                i14 += i11;
            }
            i14 += i12;
            r10 = i12;
            r13 = r12;
            c2642q1 = c2642q1;
        }
    }

    public final void Y() {
        this.f31839J.setRefreshing(true);
        U(false);
        final String str = this.f31856y.f41191e.f42831c;
        final Handler handler = new Handler(Looper.getMainLooper());
        Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                Handler handler2 = handler;
                q qVar = this.f31808b;
                qVar.getClass();
                try {
                    qVar.Z(str2, handler2);
                    return null;
                } catch (Exception e10) {
                    O.e.m(e10);
                    handler2.post(new e0(3, qVar));
                    return null;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final void Z(final String str, Handler handler) throws Exception {
        ((J8.a) this.f31844O.getValue()).a0();
        O.e.s("ControlUnitLongCodingFragment", "writeLongCodingSync()");
        ControlUnit controlUnit = this.f31857z;
        if (controlUnit.f29321c.i(controlUnit)) {
            O.e.j("ControlUnitLongCodingFragment", "Showing pop the hood dialog");
            handler.post(new RunnableC0837c(2, this));
        } else {
            final int iIntValue = this.f31857z.M0(str).intValue();
            handler.post(new Runnable() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.l
                /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, xa.g] */
                @Override // java.lang.Runnable
                public final void run() {
                    q qVar = this.f31819b;
                    if (qVar.y()) {
                        return;
                    }
                    qVar.f31839J.setRefreshing(false);
                    qVar.U(true);
                    StringBuilder sb2 = new StringBuilder("writeLongCodingTask result: ");
                    int i10 = iIntValue;
                    sb2.append(i10);
                    O.e.j("ControlUnitLongCodingFragment", sb2.toString());
                    if (i10 == -1) {
                        P.b(qVar.requireActivity(), R.string.common_something_went_wrong);
                        return;
                    }
                    if (i10 != 0) {
                        if (i10 != 51) {
                            P.a(qVar.requireActivity(), String.format(Locale.US, "(%02X) %s", Integer.valueOf(i10), Texttabe.a(i10)));
                            return;
                        } else {
                            ((SfdViewModel) qVar.f31843N.getValue()).b(qVar.f31857z.f29320b.getControlUnitBase().getObjectId(), qVar.f31857z.n().shortValue());
                            return;
                        }
                    }
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34276u, 1);
                    P.f(qVar.requireActivity(), R.string.common_coding_accepted);
                    qVar.f31857z.E0(str, false);
                    qVar.P();
                    qVar.W();
                }
            });
        }
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("WarningDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                boolean z10 = bundle.getBoolean("key_checkbox_bool");
                ActivityC1347l activity = getActivity();
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                com.voltasit.obdeleven.a.C0320a.a(activity).j("show_long_coding_warning", !z10);
                this.f31840K = null;
                return;
            }
            return;
        }
        if (!str.equals("SecurityAccessDialogFragment")) {
            if ("PopTheHoodDialog".equals(str) && callbackType == DialogCallback.CallbackType.f31102c) {
                Y();
                return;
            }
            return;
        }
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            Y();
        }
        B0 b10 = this.f31838I;
        if (b10 != null) {
            b10.y();
            this.f31838I = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "ControlUnitLongCodingFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.controlUnitLongCodingFragment_byte /* 2131362286 */:
                C2158m0.a(getActivity(), R.string.view_long_coding_enter_byte_number, this.f31856y.getItemCount() - 1).continueWith(new B(1, this), Task.UI_THREAD_EXECUTOR);
                break;
            case R.id.controlUnitLongCodingFragment_hexDecvalue /* 2131362288 */:
                V(false);
                break;
            case R.id.controlUnitLongCodingFragment_next /* 2131362290 */:
                if (this.f31830A < (this.f31856y.f41191e.f42831c.length() / 2) - 1) {
                    X(this.f31830A + 1);
                }
                break;
            case R.id.controlUnitLongCodingFragment_prev /* 2131362291 */:
                int i10 = this.f31830A;
                if (i10 > 0) {
                    X(i10 - 1);
                }
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p122j9.g gVar = new p122j9.g(getActivity());
        this.f31856y = gVar;
        gVar.f41188b = this;
        if (!this.f31832C) {
            gVar.f41189c = this;
        }
        ActivityC1347l activity = getActivity();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        if (com.voltasit.obdeleven.a.C0320a.a(activity).b("show_long_coding_warning", true) && this.f31840K == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_title", R.string.common_attention);
            bundle2.putInt("key_positive_text", R.string.common_ok);
            bundle2.putInt("key_checkbox_text", R.string.common_do_not_show_again);
            h1 h1Var = new h1();
            h1Var.setArguments(bundle2);
            h1Var.f32261r = getParentFragmentManager();
            h1Var.setTargetFragment(this, 0);
            this.f31840K = h1Var;
            h1Var.A();
        }
        if (this.f31833D) {
            p122j9.g gVar2 = this.f31856y;
            gVar2.f41190d = this.f31834E;
            gVar2.notifyDataSetChanged();
            p122j9.g gVar3 = this.f31856y;
            C2642q1 c2642q1 = this.f31841L;
            gVar3.getClass();
            gVar3.f41191e = c2642q1.clone();
            gVar3.notifyDataSetChanged();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f31835F) {
            menuInflater.inflate(R.menu.switch_coding, menu);
            this.f31836G = menu.findItem(R.id.menu_switch_coding);
        }
        if (!this.f31833D) {
            menuInflater.inflate(R.menu.developer, menu);
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MaterialDialog materialDialog = C2158m0.f33992a;
        if (materialDialog != null && materialDialog.isShowing()) {
            C2158m0.f33992a.dismiss();
        }
        C2137c.a();
        MaterialDialog materialDialog2 = this.f31837H;
        if (materialDialog2 != null && materialDialog2.isShowing()) {
            this.f31837H.dismiss();
            this.f31837H = null;
        }
        B0 b10 = this.f31838I;
        if (b10 != null) {
            b10.y();
            this.f31838I = null;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        X(i10);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j) {
        V(true);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_develop /* 2131362899 */:
                MainActivity mainActivityQ = q();
                P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_negative_long_coding_developer_alert));
                return true;
            case R.id.menu_switch_coding /* 2131362900 */:
                if (!this.f31856y.a()) {
                    r().h();
                    return true;
                }
                MainActivity mainActivityQ2 = q();
                P.a(mainActivityQ2, mainActivityQ2.getString(R.string.snackbar_save_changes_first));
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        W();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        X(this.f31830A);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_long_coding);
    }
}
