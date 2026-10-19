package V8;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.afollestad.materialdialogs.internal.MDButton;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.dialogs.C2158m0;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p134k8.D1;
import p220r9.Q;

/* JADX INFO: compiled from: SubsystemLongCodingFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/102/long-coding")
public class D extends BaseProFragment implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MaterialDialog f6746B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public B0 f6747C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SwipeRefreshLayout f6748D;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f6750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f6751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f6752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AppCompatImageButton f6753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatImageButton f6754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FloatingActionButton f6755s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p122j9.g f6760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public D1 f6761y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ControlUnit f6762z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout[] f6756t = new LinearLayout[8];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView[] f6757u = new TextView[8];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView[] f6758v = new TextView[8];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AppCompatCheckBox[] f6759w = new AppCompatCheckBox[8];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6745A = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f6749E = KoinJavaComponent.b(E.class, null, null);

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        if (!this.f6760x.a() || !W7.c.e()) {
            return super.A();
        }
        C2137c.b(getActivity(), R.string.common_discard_changes, R.string.common_ok, R.string.common_cancel).continueWith(new y(0, this), Task.UI_THREAD_EXECUTOR);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout[] linearLayoutArr;
        ?? r10 = this.f6749E;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((E) r10.getValue()).f6764p.e(getViewLifecycleOwner(), new u(this, 0));
        O().f32797E.e(getViewLifecycleOwner(), new v(this, 0));
        O().f32795C.e(getViewLifecycleOwner(), new w(this, 0));
        T();
        O().c(true);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_long_coding, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_swipeRefreshLayout);
        this.f6748D = swipeRefreshLayout;
        Q.a(swipeRefreshLayout, this);
        this.f6750n = (RecyclerView) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_list);
        this.f6751o = (TextView) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_byte);
        this.f6752p = (TextView) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_hexDecvalue);
        this.f6753q = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_prev);
        this.f6754r = (AppCompatImageButton) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_next);
        this.f6755s = (FloatingActionButton) viewInflate.findViewById(R.id.controlUnitLongCodingFragment_fab);
        int[] iArr = {R.id.controlUnitLongCodingFragment_bit0, R.id.controlUnitLongCodingFragment_bit1, R.id.controlUnitLongCodingFragment_bit2, R.id.controlUnitLongCodingFragment_bit3, R.id.controlUnitLongCodingFragment_bit4, R.id.controlUnitLongCodingFragment_bit5, R.id.controlUnitLongCodingFragment_bit6, R.id.controlUnitLongCodingFragment_bit7};
        int i10 = 0;
        while (true) {
            linearLayoutArr = this.f6756t;
            if (i10 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i10] = (LinearLayout) viewInflate.findViewById(iArr[i10]);
            i10++;
        }
        this.f6750n.setHasFixedSize(false);
        this.f6750n.setAdapter(this.f6760x);
        this.f6751o.setOnClickListener(this);
        this.f6752p.setOnClickListener(this);
        for (int i11 = 0; i11 < linearLayoutArr.length; i11++) {
            LinearLayout linearLayout = linearLayoutArr[i11];
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
            TextView textView = (TextView) linearLayout2.getChildAt(0);
            TextView textView2 = (TextView) linearLayout2.getChildAt(1);
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) linearLayout.getChildAt(1);
            this.f6757u[i11] = textView;
            this.f6758v[i11] = textView2;
            this.f6759w[i11] = appCompatCheckBox;
            textView.setText(String.format(Locale.US, "%s %1d", getString(R.string.common_bit), Integer.valueOf(i11)));
            textView2.setText("...");
            A a10 = new A(this, i11, 0);
            linearLayout.setOnClickListener(a10);
            appCompatCheckBox.setOnClickListener(a10);
        }
        Drawable drawable = getResources().getDrawable(2131231581);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        p234t0.a.C0532a.i(drawable, mode);
        p234t0.a.C0532a.g(drawable, getResources().getColor(R.color.checkbox_blue));
        Drawable drawable2 = getResources().getDrawable(2131231705);
        p234t0.a.C0532a.i(drawable2, mode);
        p234t0.a.C0532a.g(drawable2, getResources().getColor(R.color.checkbox_blue));
        this.f6753q.setImageDrawable(drawable);
        this.f6754r.setImageDrawable(drawable2);
        this.f6753q.setOnClickListener(this);
        this.f6754r.setOnClickListener(this);
        Q(this.f6755s);
        if (this.f6761y == null) {
            q().J();
        } else {
            W();
        }
        return viewInflate;
    }

    public final void U(boolean z10) {
        boolean z11 = false;
        for (LinearLayout linearLayout : this.f6756t) {
            linearLayout.setEnabled(z10);
        }
        this.f6753q.setEnabled(z10);
        this.f6754r.setEnabled(z10);
        FloatingActionButton floatingActionButton = this.f6755s;
        if (z10 && W7.c.e()) {
            z11 = true;
        }
        floatingActionButton.setEnabled(z11);
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
        aVar.f23252v = new C(this, z10);
        aVar.f23223M = new DialogInterface.OnShowListener() { // from class: V8.t
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                InputFilter[] inputFilterArr;
                D d10 = this.f6829b;
                d10.getClass();
                MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
                FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
                MDButton mDButtonC = materialDialog.c(DialogAction.f23185c);
                floatingEditText.setHint("00 - FF HEX");
                floatingEditText.setInputType(1);
                if (z10) {
                    inputFilterArr = new InputFilter[0];
                    floatingEditText.setText(d10.f6760x.f41191e.f42831c);
                    mDButtonC.setText("ASCII");
                } else {
                    inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(2)};
                    floatingEditText.setText(String.format(Locale.US, "%02X", Integer.valueOf(d10.f6760x.f41191e.b(d10.f6745A))));
                    mDButtonC.setText("DEC");
                }
                floatingEditText.setFilters(inputFilterArr);
                floatingEditText.setSelection(floatingEditText.getText().length());
                D9.o.p(floatingEditText);
            }
        };
        this.f6746B = aVar.f();
    }

    public final void W() {
        this.f6748D.setRefreshing(true);
        U(false);
        this.f6761y.e().continueWith(new B(0, this), Task.UI_THREAD_EXECUTOR);
    }

    public final void X(int i10) {
        this.f6745A = i10;
        p122j9.g gVar = this.f6760x;
        gVar.f41192f = i10;
        gVar.notifyDataSetChanged();
        this.f6750n.m0(i10);
        TextView textView = this.f6751o;
        Locale locale = Locale.US;
        textView.setText(String.format(locale, "%s %02d", getString(R.string.common_byte), Integer.valueOf(this.f6745A)));
        this.f6752p.setText(String.format(locale, "%s %02X", "Hex", Integer.valueOf(this.f6760x.f41191e.b(i10))));
        int i11 = 0;
        while (true) {
            AppCompatCheckBox[] appCompatCheckBoxArr = this.f6759w;
            if (i11 >= appCompatCheckBoxArr.length) {
                return;
            }
            AppCompatCheckBox appCompatCheckBox = appCompatCheckBoxArr[i11];
            byte b10 = this.f6760x.f41190d.c(i10)[i11];
            byte b11 = this.f6760x.f41191e.c(i10)[i11];
            appCompatCheckBox.setChecked(b11 == 1);
            H0.b.c(appCompatCheckBox, ColorStateList.valueOf(b11 != b10 ? getResources().getColor(R.color.checkbox_green) : getResources().getColor(R.color.checkbox_blue)));
            i11++;
        }
    }

    public final void Y() {
        this.f6748D.setRefreshing(true);
        U(false);
        String str = this.f6760x.f41191e.f42831c;
        this.f6761y.w(str).continueWith(new z(this, 0, str), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("SecurityAccessDialogFragment")) {
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                Y();
            }
            B0 b10 = this.f6747C;
            if (b10 != null) {
                b10.y();
                this.f6747C = null;
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "SubsystemLongCodingFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.controlUnitLongCodingFragment_byte /* 2131362286 */:
                C2158m0.a(getActivity(), R.string.view_long_coding_enter_byte_number, this.f6760x.getItemCount() - 1).continueWith(new x(0, this), Task.UI_THREAD_EXECUTOR);
                break;
            case R.id.controlUnitLongCodingFragment_hexDecvalue /* 2131362288 */:
                V(false);
                break;
            case R.id.controlUnitLongCodingFragment_next /* 2131362290 */:
                if (this.f6745A < (this.f6760x.f41191e.f42831c.length() / 2) - 1) {
                    X(this.f6745A + 1);
                }
                break;
            case R.id.controlUnitLongCodingFragment_prev /* 2131362291 */:
                int i10 = this.f6745A;
                if (i10 > 0) {
                    X(i10 - 1);
                }
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        p122j9.g gVar = new p122j9.g(getActivity());
        this.f6760x = gVar;
        gVar.f41188b = this;
        gVar.f41189c = this;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MaterialDialog materialDialog = C2158m0.f33992a;
        if (materialDialog != null && materialDialog.isShowing()) {
            C2158m0.f33992a.dismiss();
        }
        C2137c.a();
        MaterialDialog materialDialog2 = this.f6746B;
        if (materialDialog2 != null && materialDialog2.isShowing()) {
            this.f6746B.dismiss();
        }
        B0 b10 = this.f6747C;
        if (b10 != null) {
            b10.y();
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

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void onRefresh() {
        W();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_long_coding);
    }
}
