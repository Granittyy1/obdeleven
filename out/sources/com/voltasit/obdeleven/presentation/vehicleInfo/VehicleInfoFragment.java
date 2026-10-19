package com.voltasit.obdeleven.presentation.vehicleInfo;

import B8.E0;
import B8.I0;
import D9.o;
import V8.x;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.BodyType;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2161o;
import com.voltasit.obdeleven.ui.dialogs.Q;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.n;
import p134k8.T1;
import p220r9.B;
import p220r9.P;
import p220r9.y;
import p220r9.z;
import p255u9.C2802e;
import p255u9.C2803f;
import p255u9.D;
import p255u9.E;
import p255u9.F;
import p293xa.r;

/* JADX INFO: compiled from: VehicleInfoFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VehicleInfoFragment extends BaseFragment<I0> implements View.OnClickListener, View.OnLongClickListener, DialogCallback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f33458A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LinearLayout f33459B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public LinearLayout f33460C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f33461D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextInputLayout f33462E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EditText f33463F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LinearLayout f33464G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f33465H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public View f33466I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public View f33467J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public y f33468K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f33469L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public E f33470M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SwipeRefreshLayout f33471N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public MenuItem f33472O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C2161o f33473P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Q f33474Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f33475R = R.layout.fragment_vehicle_info;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Object f33476S;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f33477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f33478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f33479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f33480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f33481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f33482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f33483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f33484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f33485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f33486u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextInputLayout f33487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EditText f33488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f33489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f33490y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f33491z;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment$special$$inlined$viewModel$default$1] */
    public VehicleInfoFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment$special$$inlined$viewModel$default$1
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
        this.f33476S = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<VehicleInfoViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoViewModel] */
            @Override // Ia.a
            public final VehicleInfoViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(VehicleInfoViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    public static void P(LinearLayout linearLayout, View view) {
        kotlin.jvm.internal.i.b(linearLayout);
        View childAt = linearLayout.getChildAt(1);
        kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
        if (TextUtils.isEmpty(((TextView) childAt).getText().toString())) {
            if (view != null) {
                view.setVisibility(8);
            }
            linearLayout.setVisibility(8);
        }
    }

    public static void Q(LinearLayout linearLayout, View view, String str) {
        if (TextUtils.isEmpty(str)) {
            kotlin.jvm.internal.i.b(linearLayout);
            linearLayout.setVisibility(8);
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        kotlin.jvm.internal.i.b(linearLayout);
        View childAt = linearLayout.getChildAt(1);
        kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt).setText(str);
        linearLayout.setVisibility(0);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_vehicle_info, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vehicleInfoFragment_container);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_imageFrame);
        this.f33477l = (ImageView) viewInflate.findViewById(R.id.vehicleInfoFragment_image);
        this.f33478m = (ImageView) viewInflate.findViewById(R.id.vehicleInfoFragment_changeImage);
        this.f33479n = (TextView) viewInflate.findViewById(R.id.vehicleInfoFragment_name);
        this.f33480o = viewInflate.findViewById(R.id.vehicleInfoFragment_changeName);
        this.f33481p = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_vin);
        this.f33482q = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_year);
        this.f33483r = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_body);
        this.f33484s = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_mileage);
        this.f33485t = (TextView) viewInflate.findViewById(R.id.vehicleInfoFragment_engine);
        this.f33486u = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_engineSearchLayout);
        this.f33487v = (TextInputLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_engineSearchTextInputLayout);
        this.f33488w = (EditText) viewInflate.findViewById(R.id.vehicleInfoFragment_engineInput);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.vehicleInfoFragment_engineSearch);
        this.f33489x = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_engineInfoLayout);
        this.f33490y = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_engineCode);
        this.f33491z = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_enginePower);
        this.f33458A = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_engineVolume);
        this.f33459B = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_engineCylinders);
        this.f33460C = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_engineRemark);
        this.f33461D = (TextView) viewInflate.findViewById(R.id.vehicleInfoFragment_equipment);
        this.f33462E = (TextInputLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_equipmentSearchTextInputLayout);
        this.f33463F = (EditText) viewInflate.findViewById(R.id.vehicleInfoFragment_equipmentInput);
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(R.id.vehicleInfoFragment_equipmentSearch);
        this.f33464G = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_equipmentInfoLayout);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.vehicleInfoFragment_cardTitle);
        View viewFindViewById = viewInflate.findViewById(R.id.vehicleInfoFragment_vinDivider);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vehicleInfoFragment_yearDivider);
        View viewFindViewById3 = viewInflate.findViewById(R.id.vehicleInfoFragment_bodyDivider);
        View viewFindViewById4 = viewInflate.findViewById(R.id.vehicleInfoFragment_engineCodeDivider);
        this.f33465H = viewInflate.findViewById(R.id.vehicleInfoFragment_enginePowerDivider);
        this.f33466I = viewInflate.findViewById(R.id.vehicleInfoFragment_engineVolumeDivider);
        this.f33467J = viewInflate.findViewById(R.id.vehicleInfoFragment_engineCylindersDivider);
        if (bundle != null) {
            this.f33469L = bundle.getString("vehicle");
        }
        if (q().E()) {
            frameLayout.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            kotlin.jvm.internal.i.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            kotlin.jvm.internal.i.c(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), 0, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
        }
        ImageView imageView = this.f33478m;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        TextView textView = this.f33479n;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f33485t;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        imageButton.setOnClickListener(this);
        TextView textView3 = this.f33461D;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        imageButton2.setOnClickListener(this);
        LinearLayout linearLayout2 = this.f33481p;
        if (linearLayout2 != null) {
            linearLayout2.setOnLongClickListener(this);
        }
        LinearLayout linearLayout3 = this.f33482q;
        if (linearLayout3 != null) {
            linearLayout3.setOnLongClickListener(this);
        }
        LinearLayout linearLayout4 = this.f33483r;
        if (linearLayout4 != null) {
            linearLayout4.setOnLongClickListener(this);
        }
        LinearLayout linearLayout5 = this.f33484s;
        if (linearLayout5 != null) {
            linearLayout5.setOnLongClickListener(this);
        }
        LinearLayout linearLayout6 = this.f33490y;
        if (linearLayout6 != null) {
            linearLayout6.setOnLongClickListener(this);
        }
        LinearLayout linearLayout7 = this.f33491z;
        if (linearLayout7 != null) {
            linearLayout7.setOnLongClickListener(this);
        }
        LinearLayout linearLayout8 = this.f33458A;
        if (linearLayout8 != null) {
            linearLayout8.setOnLongClickListener(this);
        }
        LinearLayout linearLayout9 = this.f33459B;
        if (linearLayout9 != null) {
            linearLayout9.setOnLongClickListener(this);
        }
        LinearLayout linearLayout10 = this.f33460C;
        if (linearLayout10 != null) {
            linearLayout10.setOnLongClickListener(this);
        }
        LinearLayout linearLayout11 = this.f33481p;
        View childAt = linearLayout11 != null ? linearLayout11.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt).setText(getString(R.string.common_vin));
        LinearLayout linearLayout12 = this.f33482q;
        View childAt2 = linearLayout12 != null ? linearLayout12.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt2).setText(getString(R.string.common_year));
        LinearLayout linearLayout13 = this.f33483r;
        View childAt3 = linearLayout13 != null ? linearLayout13.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt3).setText(getString(R.string.common_body_type));
        LinearLayout linearLayout14 = this.f33484s;
        View childAt4 = linearLayout14 != null ? linearLayout14.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt4).setText(getString(R.string.common_mileage));
        LinearLayout linearLayout15 = this.f33490y;
        View childAt5 = linearLayout15 != null ? linearLayout15.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt5, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt5).setText(getString(R.string.common_engine_code));
        LinearLayout linearLayout16 = this.f33491z;
        View childAt6 = linearLayout16 != null ? linearLayout16.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt6).setText(getString(R.string.common_power));
        LinearLayout linearLayout17 = this.f33458A;
        View childAt7 = linearLayout17 != null ? linearLayout17.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt7, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt7).setText(getString(R.string.common_volume));
        LinearLayout linearLayout18 = this.f33459B;
        View childAt8 = linearLayout18 != null ? linearLayout18.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt8, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt8).setText(getString(R.string.common_cylinders));
        LinearLayout linearLayout19 = this.f33460C;
        View childAt9 = linearLayout19 != null ? linearLayout19.getChildAt(0) : null;
        kotlin.jvm.internal.i.c(childAt9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt9).setText(getString(R.string.common_remark));
        if (this.f33470M == null) {
            E.h().getInBackground(this.f33469L, new GetCallback() { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.b
                @Override // com.parse.ParseCallback2
                public final void done(Object obj, Throwable th) {
                    ParseException parseException = (ParseException) th;
                    E e10 = (E) ((ParseObject) obj);
                    VehicleInfoFragment this$0 = this.f33495a;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    if (this$0.isVisible()) {
                        if (parseException == null) {
                            this$0.f33470M = e10;
                            if (this$0.isVisible()) {
                                this$0.O();
                                return;
                            }
                            return;
                        }
                        ActivityC1347l activity = this$0.getActivity();
                        kotlin.jvm.internal.i.b(activity);
                        P.a(activity, activity.getString(R.string.common_something_went_wrong));
                        this$0.q().getSupportFragmentManager().R();
                    }
                }
            });
        } else {
            O();
        }
        if (q().E()) {
            VehicleBaseFragment vehicleBaseFragment = (VehicleBaseFragment) Application.f29634b.e(p279w9.a.f47809f);
            if (vehicleBaseFragment != null && vehicleBaseFragment.isVisible()) {
                vehicleBaseFragment.P().f33379C.j(Boolean.FALSE);
                vehicleBaseFragment.P().f33381E.j(Boolean.TRUE);
            }
            viewGroup2.setPadding(0, 0, 0, 0);
        }
        P(this.f33481p, null);
        P(this.f33482q, viewFindViewById);
        P(this.f33483r, viewFindViewById2);
        P(this.f33484s, viewFindViewById3);
        P(this.f33490y, null);
        P(this.f33491z, viewFindViewById4);
        P(this.f33458A, this.f33465H);
        P(this.f33459B, this.f33466I);
        P(this.f33460C, this.f33467J);
        SwipeRefreshLayout swipeRefreshLayoutB = p220r9.Q.b(viewInflate);
        this.f33471N = swipeRefreshLayoutB;
        return swipeRefreshLayoutB;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, xa.g] */
    public final void O() {
        E e10 = this.f33470M;
        kotlin.jvm.internal.i.b(e10);
        String strF = e10.f();
        if (n.S(strF)) {
            strF = "http://";
        }
        ImageView imageView = this.f33477l;
        kotlin.jvm.internal.i.b(imageView);
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(imageView).m(strF);
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        com.bumptech.glide.d<Drawable> dVarA = dVarM.a(dVarJ);
        ImageView imageView2 = this.f33477l;
        kotlin.jvm.internal.i.b(imageView2);
        dVarA.x(imageView2);
        E e11 = this.f33470M;
        kotlin.jvm.internal.i.b(e11);
        String strD = e11.d();
        kotlin.jvm.internal.i.d(strD, "getMake(...)");
        E e12 = this.f33470M;
        kotlin.jvm.internal.i.b(e12);
        String strE = e12.e();
        kotlin.jvm.internal.i.d(strE, "getModel(...)");
        if (strE.length() != 0) {
            strD = O.a.f(strD, " ", strE);
        }
        TextView textView = this.f33479n;
        kotlin.jvm.internal.i.b(textView);
        textView.setText(strD);
        E e13 = this.f33470M;
        kotlin.jvm.internal.i.b(e13);
        String strK = e13.k();
        LinearLayout linearLayout = this.f33481p;
        kotlin.jvm.internal.i.b(linearLayout);
        View childAt = linearLayout.getChildAt(1);
        kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt).setText(strK);
        E e14 = this.f33470M;
        kotlin.jvm.internal.i.b(e14);
        String string = e14.getString("year");
        LinearLayout linearLayout2 = this.f33482q;
        kotlin.jvm.internal.i.b(linearLayout2);
        View childAt2 = linearLayout2.getChildAt(1);
        kotlin.jvm.internal.i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt2).setText(string);
        E e15 = this.f33470M;
        kotlin.jvm.internal.i.b(e15);
        F fJ = e15.j();
        if (fJ != null) {
            LinearLayout linearLayout3 = this.f33483r;
            kotlin.jvm.internal.i.b(linearLayout3);
            View childAt3 = linearLayout3.getChildAt(1);
            kotlin.jvm.internal.i.c(childAt3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt3).setText(BodyType.a(fJ.getInt("body")).c(getContext()));
        }
        E e16 = this.f33470M;
        kotlin.jvm.internal.i.b(e16);
        int i10 = e16.getInt("mileage");
        if (i10 != 0) {
            LinearLayout linearLayout4 = this.f33484s;
            kotlin.jvm.internal.i.b(linearLayout4);
            View childAt4 = linearLayout4.getChildAt(1);
            kotlin.jvm.internal.i.c(childAt4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) childAt4;
            VehicleInfoViewModel vehicleInfoViewModel = (VehicleInfoViewModel) this.f33476S.getValue();
            vehicleInfoViewModel.getClass();
            T1 t8 = new T1(null, String.valueOf(i10), "km");
            if (!vehicleInfoViewModel.f33493p.w()) {
                t8 = C1787c0.k(t8);
            }
            textView2.setText(t8.toString());
        }
        E e17 = this.f33470M;
        kotlin.jvm.internal.i.b(e17);
        R(e17.c());
        E e18 = this.f33470M;
        kotlin.jvm.internal.i.b(e18);
        S(e18.getList("equipment"));
    }

    public final void R(C2802e c2802e) {
        if (c2802e == null) {
            LinearLayout linearLayout = this.f33486u;
            kotlin.jvm.internal.i.b(linearLayout);
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.f33489x;
            kotlin.jvm.internal.i.b(linearLayout2);
            linearLayout2.setVisibility(8);
            TextView textView = this.f33485t;
            kotlin.jvm.internal.i.b(textView);
            textView.setEnabled(false);
            TextView textView2 = this.f33485t;
            kotlin.jvm.internal.i.b(textView2);
            textView2.setCompoundDrawables(null, null, null, null);
            return;
        }
        String strA = c2802e.a();
        String string = c2802e.getString("kw");
        if (string == null) {
            string = "";
        }
        String string2 = c2802e.getString("hp");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = c2802e.getString("ltr");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = c2802e.getString("cyl");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = c2802e.getString("remark");
        String str = string5 != null ? string5 : "";
        LinearLayout linearLayout3 = this.f33490y;
        kotlin.jvm.internal.i.b(linearLayout3);
        View childAt = linearLayout3.getChildAt(1);
        kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt).setText(strA);
        LinearLayout linearLayout4 = this.f33491z;
        kotlin.jvm.internal.i.b(linearLayout4);
        View childAt2 = linearLayout4.getChildAt(1);
        kotlin.jvm.internal.i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) childAt2).setText(String.format("%s kW (%s HP)", Arrays.copyOf(new Object[]{string, string2}, 2)));
        Q(this.f33458A, this.f33465H, string3);
        Q(this.f33459B, this.f33466I, string4);
        Q(this.f33460C, this.f33467J, str);
        LinearLayout linearLayout5 = this.f33486u;
        kotlin.jvm.internal.i.b(linearLayout5);
        linearLayout5.setVisibility(8);
        LinearLayout linearLayout6 = this.f33489x;
        kotlin.jvm.internal.i.b(linearLayout6);
        linearLayout6.setVisibility(0);
        TextView textView3 = this.f33485t;
        kotlin.jvm.internal.i.b(textView3);
        textView3.setEnabled(true);
        TextView textView4 = this.f33485t;
        kotlin.jvm.internal.i.b(textView4);
        textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231150, 0);
    }

    public final void S(List<? extends C2803f> list) {
        LinearLayout linearLayout = this.f33464G;
        kotlin.jvm.internal.i.b(linearLayout);
        linearLayout.removeAllViews();
        if (list == null || list.isEmpty()) {
            TextView textView = this.f33461D;
            kotlin.jvm.internal.i.b(textView);
            textView.setEnabled(false);
            TextView textView2 = this.f33461D;
            kotlin.jvm.internal.i.b(textView2);
            textView2.setCompoundDrawables(null, null, null, null);
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2803f c2803f = list.get(i10);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_labeled_button, (ViewGroup) this.f33464G, false);
            kotlin.jvm.internal.i.c(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_button_divider, (ViewGroup) this.f33464G, false);
            linearLayout2.setOnLongClickListener(this);
            View childAt = linearLayout2.getChildAt(0);
            kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
            View childAt2 = linearLayout2.getChildAt(1);
            kotlin.jvm.internal.i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setText(c2803f.getString("code"));
            ((TextView) childAt2).setText(c2803f.getString("description"));
            LinearLayout linearLayout3 = this.f33464G;
            kotlin.jvm.internal.i.b(linearLayout3);
            linearLayout3.addView(linearLayout2);
            if (i10 != list.size() - 1) {
                LinearLayout linearLayout4 = this.f33464G;
                kotlin.jvm.internal.i.b(linearLayout4);
                linearLayout4.addView(viewInflate2);
            } else {
                linearLayout2.setBackground(getResources().getDrawable(R.drawable.content_button_bottom_selector));
            }
        }
        TextView textView3 = this.f33461D;
        kotlin.jvm.internal.i.b(textView3);
        textView3.setEnabled(true);
        TextView textView4 = this.f33461D;
        kotlin.jvm.internal.i.b(textView4);
        textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231150, 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        boolean z10;
        E e10;
        kotlin.jvm.internal.i.e(dialogId, "dialogId");
        kotlin.jvm.internal.i.e(data, "data");
        if (!dialogId.equals("editCarNameDialog")) {
            if (dialogId.equals("ItemListMultiChoiceDialog") && callbackType == DialogCallback.CallbackType.f31102c) {
                E e11 = this.f33470M;
                kotlin.jvm.internal.i.b(e11);
                List<? extends C2803f> list = e11.getList("equipment");
                ArrayList<Integer> integerArrayList = data.getIntegerArrayList("key_which_selections");
                if (integerArrayList == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Integer num : integerArrayList) {
                    kotlin.jvm.internal.i.b(num);
                    Object obj = list.get(num.intValue());
                    kotlin.jvm.internal.i.d(obj, "get(...)");
                    arrayList.add(obj);
                }
                list.removeAll(arrayList);
                E e12 = this.f33470M;
                kotlin.jvm.internal.i.b(e12);
                e12.put("equipment", list);
                E e13 = this.f33470M;
                kotlin.jvm.internal.i.b(e13);
                e13.saveEventually();
                S(list);
                Q q10 = this.f33474Q;
                kotlin.jvm.internal.i.b(q10);
                q10.y();
                this.f33474Q = null;
                return;
            }
            return;
        }
        if (callbackType != DialogCallback.CallbackType.f31102c) {
            C2161o c2161o = this.f33473P;
            kotlin.jvm.internal.i.b(c2161o);
            c2161o.y();
            this.f33473P = null;
            return;
        }
        String string = data.getString("key_model");
        String string2 = data.getString("key_make");
        kotlin.jvm.internal.i.b(string);
        if (string.length() != 0) {
            E e14 = this.f33470M;
            kotlin.jvm.internal.i.b(e14);
            if (kotlin.jvm.internal.i.a(e14.e(), string)) {
                z10 = false;
            } else {
                E e15 = this.f33470M;
                kotlin.jvm.internal.i.b(e15);
                e15.put("model", string);
            }
            kotlin.jvm.internal.i.b(string2);
            if (string2.length() == 0) {
                e10 = this.f33470M;
                kotlin.jvm.internal.i.b(e10);
                if (!kotlin.jvm.internal.i.a(e10.d(), string2)) {
                    E e16 = this.f33470M;
                    kotlin.jvm.internal.i.b(e16);
                    e16.put("make", string2);
                }
                if (z10) {
                    E e17 = this.f33470M;
                    kotlin.jvm.internal.i.b(e17);
                    e17.saveEventually();
                    E e18 = this.f33470M;
                    kotlin.jvm.internal.i.b(e18);
                    String strD = e18.d();
                    kotlin.jvm.internal.i.d(strD, "getMake(...)");
                    E e19 = this.f33470M;
                    kotlin.jvm.internal.i.b(e19);
                    String strE = e19.e();
                    kotlin.jvm.internal.i.d(strE, "getModel(...)");
                    TextView textView = this.f33479n;
                    kotlin.jvm.internal.i.b(textView);
                    textView.setText(String.format("%s %s", Arrays.copyOf(new Object[]{strD, strE}, 2)));
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34254O, 1);
                    VehicleInfoViewModel vehicleInfoViewModel = (VehicleInfoViewModel) this.f33476S.getValue();
                    E e20 = this.f33470M;
                    kotlin.jvm.internal.i.b(e20);
                    vehicleInfoViewModel.b(e20);
                }
                Application.f29634b.d();
                C2161o c2161o2 = this.f33473P;
                kotlin.jvm.internal.i.b(c2161o2);
                c2161o2.y();
                this.f33473P = null;
            }
            E e21 = this.f33470M;
            kotlin.jvm.internal.i.b(e21);
            e21.remove("make");
            z10 = true;
            if (z10) {
                E e110 = this.f33470M;
                kotlin.jvm.internal.i.b(e110);
                e110.saveEventually();
                E e111 = this.f33470M;
                kotlin.jvm.internal.i.b(e111);
                String strD2 = e111.d();
                kotlin.jvm.internal.i.d(strD2, "getMake(...)");
                E e112 = this.f33470M;
                kotlin.jvm.internal.i.b(e112);
                String strE2 = e112.e();
                kotlin.jvm.internal.i.d(strE2, "getModel(...)");
                TextView textView2 = this.f33479n;
                kotlin.jvm.internal.i.b(textView2);
                textView2.setText(String.format("%s %s", Arrays.copyOf(new Object[]{strD2, strE2}, 2)));
                UserTrackingUtils.c(UserTrackingUtils.Key.f34254O, 1);
                VehicleInfoViewModel vehicleInfoViewModel2 = (VehicleInfoViewModel) this.f33476S.getValue();
                E e22 = this.f33470M;
                kotlin.jvm.internal.i.b(e22);
                vehicleInfoViewModel2.b(e22);
            }
            Application.f29634b.d();
            C2161o c2161o3 = this.f33473P;
            kotlin.jvm.internal.i.b(c2161o3);
            c2161o3.y();
            this.f33473P = null;
        }
        E e23 = this.f33470M;
        kotlin.jvm.internal.i.b(e23);
        e23.remove("model");
        z10 = true;
        kotlin.jvm.internal.i.b(string2);
        if (string2.length() == 0) {
            e10 = this.f33470M;
            kotlin.jvm.internal.i.b(e10);
            if (!kotlin.jvm.internal.i.a(e10.d(), string2)) {
                E e113 = this.f33470M;
                kotlin.jvm.internal.i.b(e113);
                e113.put("make", string2);
            }
            if (z10) {
                E e114 = this.f33470M;
                kotlin.jvm.internal.i.b(e114);
                e114.saveEventually();
                E e115 = this.f33470M;
                kotlin.jvm.internal.i.b(e115);
                String strD3 = e115.d();
                kotlin.jvm.internal.i.d(strD3, "getMake(...)");
                E e116 = this.f33470M;
                kotlin.jvm.internal.i.b(e116);
                String strE3 = e116.e();
                kotlin.jvm.internal.i.d(strE3, "getModel(...)");
                TextView textView3 = this.f33479n;
                kotlin.jvm.internal.i.b(textView3);
                textView3.setText(String.format("%s %s", Arrays.copyOf(new Object[]{strD3, strE3}, 2)));
                UserTrackingUtils.c(UserTrackingUtils.Key.f34254O, 1);
                VehicleInfoViewModel vehicleInfoViewModel3 = (VehicleInfoViewModel) this.f33476S.getValue();
                E e24 = this.f33470M;
                kotlin.jvm.internal.i.b(e24);
                vehicleInfoViewModel3.b(e24);
            }
            Application.f29634b.d();
            C2161o c2161o4 = this.f33473P;
            kotlin.jvm.internal.i.b(c2161o4);
            c2161o4.y();
            this.f33473P = null;
        }
        E e25 = this.f33470M;
        kotlin.jvm.internal.i.b(e25);
        e25.remove("make");
        z10 = true;
        if (z10) {
            E e117 = this.f33470M;
            kotlin.jvm.internal.i.b(e117);
            e117.saveEventually();
            E e118 = this.f33470M;
            kotlin.jvm.internal.i.b(e118);
            String strD4 = e118.d();
            kotlin.jvm.internal.i.d(strD4, "getMake(...)");
            E e119 = this.f33470M;
            kotlin.jvm.internal.i.b(e119);
            String strE4 = e119.e();
            kotlin.jvm.internal.i.d(strE4, "getModel(...)");
            TextView textView4 = this.f33479n;
            kotlin.jvm.internal.i.b(textView4);
            textView4.setText(String.format("%s %s", Arrays.copyOf(new Object[]{strD4, strE4}, 2)));
            UserTrackingUtils.c(UserTrackingUtils.Key.f34254O, 1);
            VehicleInfoViewModel vehicleInfoViewModel4 = (VehicleInfoViewModel) this.f33476S.getValue();
            E e26 = this.f33470M;
            kotlin.jvm.internal.i.b(e26);
            vehicleInfoViewModel4.b(e26);
        }
        Application.f29634b.d();
        C2161o c2161o5 = this.f33473P;
        kotlin.jvm.internal.i.b(c2161o5);
        c2161o5.y();
        this.f33473P = null;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "VehicleInfoFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        y yVar = this.f33468K;
        kotlin.jvm.internal.i.b(yVar);
        if (yVar.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        SwipeRefreshLayout swipeRefreshLayout;
        kotlin.jvm.internal.i.e(v10, "v");
        switch (v10.getId()) {
            case R.id.vehicleInfoFragment_changeImage /* 2131363412 */:
                MainActivity mainActivityQ = q();
                y yVar = this.f33468K;
                kotlin.jvm.internal.i.b(yVar);
                ImageView imageView = this.f33477l;
                kotlin.jvm.internal.i.b(imageView);
                ImageView imageView2 = this.f33478m;
                kotlin.jvm.internal.i.b(imageView2);
                E e10 = this.f33470M;
                kotlin.jvm.internal.i.b(e10);
                Ia.a<r> aVar = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment.onClick.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
                    @Override // Ia.a
                    public final r invoke() {
                        VehicleInfoViewModel vehicleInfoViewModel = (VehicleInfoViewModel) VehicleInfoFragment.this.f33476S.getValue();
                        E e11 = VehicleInfoFragment.this.f33470M;
                        kotlin.jvm.internal.i.b(e11);
                        vehicleInfoViewModel.b(e11);
                        return r.f47939a;
                    }
                };
                PopupMenu popupMenu = new PopupMenu(yVar.f46504a, imageView2);
                popupMenu.inflate(R.menu.change_restore);
                popupMenu.setOnMenuItemClickListener(new f(yVar, e10, imageView, mainActivityQ, aVar));
                popupMenu.show();
                break;
            case R.id.vehicleInfoFragment_engine /* 2131363415 */:
                LinearLayout linearLayout = this.f33486u;
                kotlin.jvm.internal.i.b(linearLayout);
                linearLayout.setVisibility(0);
                break;
            case R.id.vehicleInfoFragment_engineSearch /* 2131363425 */:
                TextInputLayout textInputLayout = this.f33487v;
                kotlin.jvm.internal.i.b(textInputLayout);
                textInputLayout.setError("");
                EditText editText = this.f33488w;
                kotlin.jvm.internal.i.b(editText);
                String upperCase = editText.getText().toString().toUpperCase();
                kotlin.jvm.internal.i.d(upperCase, "toUpperCase(...)");
                if (upperCase.length() < 2) {
                    TextInputLayout textInputLayout2 = this.f33487v;
                    kotlin.jvm.internal.i.b(textInputLayout2);
                    textInputLayout2.setError(getString(R.string.view_engine_lookup_code_length));
                } else {
                    SwipeRefreshLayout swipeRefreshLayout2 = this.f33471N;
                    kotlin.jvm.internal.i.b(swipeRefreshLayout2);
                    swipeRefreshLayout2.setRefreshing(true);
                    ParseQuery query = ParseQuery.getQuery(C2802e.class);
                    query.whereEqualTo("engine", upperCase);
                    query.getFirstInBackground(new GetCallback() { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.d
                        @Override // com.parse.ParseCallback2
                        public final void done(Object obj, Throwable th) {
                            ParseException parseException = (ParseException) th;
                            C2802e c2802e = (C2802e) ((ParseObject) obj);
                            VehicleInfoFragment this$0 = this.f33497a;
                            kotlin.jvm.internal.i.e(this$0, "this$0");
                            if (this$0.isVisible()) {
                                if (parseException == null) {
                                    this$0.R(c2802e);
                                    E e11 = this$0.f33470M;
                                    kotlin.jvm.internal.i.b(e11);
                                    e11.put("engine", c2802e);
                                    E e12 = this$0.f33470M;
                                    kotlin.jvm.internal.i.b(e12);
                                    e12.saveEventually();
                                    UserTrackingUtils.c(UserTrackingUtils.Key.f34252M, 1);
                                    Application.f29634b.d();
                                } else if (parseException.getCode() == 100) {
                                    TextInputLayout textInputLayout3 = this$0.f33487v;
                                    kotlin.jvm.internal.i.b(textInputLayout3);
                                    textInputLayout3.setError(this$0.getString(R.string.common_check_network_connection));
                                } else if (parseException.getCode() == 101) {
                                    TextInputLayout textInputLayout4 = this$0.f33487v;
                                    kotlin.jvm.internal.i.b(textInputLayout4);
                                    textInputLayout4.setError(this$0.getString(R.string.view_vehicle_info_engine_code_not_found));
                                } else {
                                    TextInputLayout textInputLayout5 = this$0.f33487v;
                                    kotlin.jvm.internal.i.b(textInputLayout5);
                                    textInputLayout5.setError(this$0.getString(R.string.common_something_went_wrong));
                                }
                                SwipeRefreshLayout swipeRefreshLayout3 = this$0.f33471N;
                                kotlin.jvm.internal.i.b(swipeRefreshLayout3);
                                swipeRefreshLayout3.setRefreshing(false);
                            }
                        }
                    });
                }
                o.m(this.f33488w);
                break;
            case R.id.vehicleInfoFragment_equipment /* 2131363430 */:
                E e11 = this.f33470M;
                kotlin.jvm.internal.i.b(e11);
                List list = e11.getList("equipment");
                String[] strArr = new String[list.size()];
                for (int i10 = 0; i10 < list.size(); i10++) {
                    C2803f c2803f = (C2803f) list.get(i10);
                    strArr[i10] = O.a.f(c2803f.getString("code"), " - ", c2803f.getString("description"));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("key_title", R.string.common_select_to_delete);
                bundle.putInt("key_positive_text", R.string.common_delete);
                bundle.putInt("key_negative_text", R.string.common_cancel);
                bundle.putInt("key_neutral_text", R.string.common_select_all);
                bundle.putStringArray("item_array", strArr);
                Q q10 = new Q();
                q10.setArguments(bundle);
                q10.f32261r = getFragmentManager();
                q10.setTargetFragment(this, 0);
                this.f33474Q = q10;
                q10.A();
                break;
            case R.id.vehicleInfoFragment_equipmentSearch /* 2131363433 */:
                TextInputLayout textInputLayout3 = this.f33462E;
                if (textInputLayout3 != null) {
                    textInputLayout3.setError("");
                }
                EditText editText2 = this.f33463F;
                String upperCase2 = String.valueOf(editText2 != null ? editText2.getText() : null).toUpperCase();
                kotlin.jvm.internal.i.d(upperCase2, "toUpperCase(...)");
                if (upperCase2.length() != 3) {
                    TextInputLayout textInputLayout4 = this.f33462E;
                    if (textInputLayout4 != null) {
                        textInputLayout4.setError(getString(R.string.view_lookup_code_length_3));
                    }
                } else {
                    E e12 = this.f33470M;
                    kotlin.jvm.internal.i.b(e12);
                    List list2 = e12.getList("equipment");
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.i.a(((C2803f) it.next()).getString("code"), upperCase2)) {
                                TextInputLayout textInputLayout5 = this.f33462E;
                                kotlin.jvm.internal.i.b(textInputLayout5);
                                textInputLayout5.setError(getString(R.string.view_lookup_code_already_exist));
                            }
                        }
                        swipeRefreshLayout = this.f33471N;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        ParseQuery query2 = ParseQuery.getQuery(C2803f.class);
                        query2.whereEqualTo("code", upperCase2);
                        query2.getFirstInBackground(new GetCallback() { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.e
                            @Override // com.parse.ParseCallback2
                            public final void done(Object obj, Throwable th) {
                                ParseException parseException = (ParseException) th;
                                C2803f c2803f2 = (C2803f) ((ParseObject) obj);
                                VehicleInfoFragment this$0 = this.f33498a;
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                if (this$0.isVisible()) {
                                    SwipeRefreshLayout swipeRefreshLayout3 = this$0.f33471N;
                                    if (swipeRefreshLayout3 != null) {
                                        swipeRefreshLayout3.setRefreshing(false);
                                    }
                                    if (parseException != null) {
                                        if (parseException.getCode() == 100) {
                                            TextInputLayout textInputLayout6 = this$0.f33462E;
                                            kotlin.jvm.internal.i.b(textInputLayout6);
                                            textInputLayout6.setError(this$0.getString(R.string.common_check_network_connection));
                                            return;
                                        } else if (parseException.getCode() == 101) {
                                            TextInputLayout textInputLayout7 = this$0.f33462E;
                                            kotlin.jvm.internal.i.b(textInputLayout7);
                                            textInputLayout7.setError(this$0.getString(R.string.view_lookup_equipment_code_not_found));
                                            return;
                                        } else {
                                            TextInputLayout textInputLayout8 = this$0.f33462E;
                                            kotlin.jvm.internal.i.b(textInputLayout8);
                                            textInputLayout8.setError(this$0.getString(R.string.common_something_went_wrong));
                                            return;
                                        }
                                    }
                                    E e13 = this$0.f33470M;
                                    List<? extends C2803f> list3 = e13 != null ? e13.getList("equipment") : null;
                                    if (list3 == null) {
                                        list3 = new ArrayList<>();
                                    }
                                    list3.add(c2803f2);
                                    E e14 = this$0.f33470M;
                                    if (e14 != null) {
                                        e14.put("equipment", list3);
                                    }
                                    E e15 = this$0.f33470M;
                                    if (e15 != null) {
                                        e15.saveEventually();
                                    }
                                    this$0.S(list3);
                                    UserTrackingUtils.c(UserTrackingUtils.Key.f34273r, 1);
                                    Application.f29634b.d();
                                }
                            }
                        });
                    } else {
                        swipeRefreshLayout = this.f33471N;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        ParseQuery query3 = ParseQuery.getQuery(C2803f.class);
                        query3.whereEqualTo("code", upperCase2);
                        query3.getFirstInBackground(new GetCallback() { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.e
                            @Override // com.parse.ParseCallback2
                            public final void done(Object obj, Throwable th) {
                                ParseException parseException = (ParseException) th;
                                C2803f c2803f2 = (C2803f) ((ParseObject) obj);
                                VehicleInfoFragment this$0 = this.f33498a;
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                if (this$0.isVisible()) {
                                    SwipeRefreshLayout swipeRefreshLayout3 = this$0.f33471N;
                                    if (swipeRefreshLayout3 != null) {
                                        swipeRefreshLayout3.setRefreshing(false);
                                    }
                                    if (parseException != null) {
                                        if (parseException.getCode() == 100) {
                                            TextInputLayout textInputLayout6 = this$0.f33462E;
                                            kotlin.jvm.internal.i.b(textInputLayout6);
                                            textInputLayout6.setError(this$0.getString(R.string.common_check_network_connection));
                                            return;
                                        } else if (parseException.getCode() == 101) {
                                            TextInputLayout textInputLayout7 = this$0.f33462E;
                                            kotlin.jvm.internal.i.b(textInputLayout7);
                                            textInputLayout7.setError(this$0.getString(R.string.view_lookup_equipment_code_not_found));
                                            return;
                                        } else {
                                            TextInputLayout textInputLayout8 = this$0.f33462E;
                                            kotlin.jvm.internal.i.b(textInputLayout8);
                                            textInputLayout8.setError(this$0.getString(R.string.common_something_went_wrong));
                                            return;
                                        }
                                    }
                                    E e13 = this$0.f33470M;
                                    List<? extends C2803f> list3 = e13 != null ? e13.getList("equipment") : null;
                                    if (list3 == null) {
                                        list3 = new ArrayList<>();
                                    }
                                    list3.add(c2803f2);
                                    E e14 = this$0.f33470M;
                                    if (e14 != null) {
                                        e14.put("equipment", list3);
                                    }
                                    E e15 = this$0.f33470M;
                                    if (e15 != null) {
                                        e15.saveEventually();
                                    }
                                    this$0.S(list3);
                                    UserTrackingUtils.c(UserTrackingUtils.Key.f34273r, 1);
                                    Application.f29634b.d();
                                }
                            }
                        });
                    }
                }
                o.m(this.f33463F);
                break;
            case R.id.vehicleInfoFragment_name /* 2131363438 */:
                PopupMenu popupMenu2 = new PopupMenu(getContext(), this.f33480o);
                popupMenu2.inflate(R.menu.rename_modify);
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.a
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem item) {
                        VehicleInfoFragment this$0 = this.f33494a;
                        kotlin.jvm.internal.i.e(this$0, "this$0");
                        kotlin.jvm.internal.i.e(item, "item");
                        int itemId = item.getItemId();
                        if (itemId == R.id.modify) {
                            C2134a0.b(this$0.q(), R.string.common_loading);
                            E e13 = this$0.f33470M;
                            kotlin.jvm.internal.i.b(e13);
                            D dI = e13.i();
                            kotlin.jvm.internal.i.b(dI);
                            int i11 = F.f47460b;
                            ParseQuery query4 = ParseQuery.getQuery(F.class);
                            query4.include("vehicleBase");
                            query4.whereEqualTo("vehicleBase", dI);
                            query4.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
                            E e14 = this$0.f33470M;
                            kotlin.jvm.internal.i.b(e14);
                            Task taskA = p279w9.d.a(query4, new p279w9.a(B7.b.c("VEHICLE_MODIFICATIONS", e14.getObjectId()), 3600000L), null);
                            com.parse.b bVar = new com.parse.b(2, this$0);
                            Executor executor = Task.UI_THREAD_EXECUTOR;
                            taskA.continueWithTask(bVar, executor).continueWith(new x(3, this$0), executor);
                        } else {
                            if (itemId != R.id.rename) {
                                return false;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("key_vehicle_db", this$0.f33470M);
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("key_title", R.string.common_edit_car);
                            bundle3.putInt("key_positive_text", R.string.common_ok);
                            bundle3.putInt("key_negative_text", R.string.common_cancel);
                            bundle3.putBundle("key_bundle", bundle2);
                            C2161o c2161o = new C2161o();
                            c2161o.setArguments(bundle3);
                            c2161o.f32261r = this$0.getFragmentManager();
                            c2161o.setTargetFragment(this$0, 0);
                            this$0.f33473P = c2161o;
                            c2161o.A();
                        }
                        return true;
                    }
                });
                popupMenu2.show();
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        this.f33468K = new y(this);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.i.e(menu, "menu");
        kotlin.jvm.internal.i.e(inflater, "inflater");
        MenuItem menuItemAdd = menu.add(R.string.common_share);
        this.f33472O = menuItemAdd;
        if (menuItemAdd != null) {
            menuItemAdd.setIcon(2131231719);
        }
        MenuItem menuItem = this.f33472O;
        if (menuItem != null) {
            menuItem.setShowAsAction(2);
        }
        MenuItem menuItem2 = this.f33472O;
        if (menuItem2 != null) {
            menuItem2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.voltasit.obdeleven.presentation.vehicleInfo.c
                /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xa.g] */
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem it) {
                    VehicleInfoFragment this$0 = this.f33496a;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    kotlin.jvm.internal.i.e(it, "it");
                    ActivityC1347l activity = this$0.getActivity();
                    E e10 = this$0.f33470M;
                    Object obj = B.f46402a;
                    StringBuilder sb2 = new StringBuilder();
                    B.c(activity, e10, sb2, activity.getString(R.string.common_vehicle_info));
                    List<C2803f> list = e10.getList("equipment");
                    if (list != null && !list.isEmpty()) {
                        sb2.append("    ");
                        sb2.append(activity.getString(R.string.common_equipment));
                        sb2.append(':');
                        sb2.append("\r\n");
                        for (C2803f c2803f : list) {
                            sb2.append("        ");
                            sb2.append(c2803f.getString("code"));
                            sb2.append(" - ");
                            sb2.append(c2803f.getString("description"));
                            sb2.append("\r\n");
                        }
                    }
                    String string = sb2.toString();
                    String strH0 = ((VehicleInfoViewModel) this$0.f33476S.getValue()).f33493p.h0();
                    z zVar = new z(this$0.requireContext());
                    zVar.c(R.string.common_share_vehicle_info);
                    E e11 = this$0.f33470M;
                    kotlin.jvm.internal.i.b(e11);
                    zVar.f46515h = e11.k();
                    E e12 = this$0.f33470M;
                    kotlin.jvm.internal.i.b(e12);
                    zVar.f46513f = e12.e();
                    E e13 = this$0.f33470M;
                    kotlin.jvm.internal.i.b(e13);
                    zVar.f46514g = e13.e();
                    zVar.f46510c = strH0;
                    zVar.b(string);
                    this$0.startActivity(zVar.a());
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34249J, 1);
                    return true;
                }
            });
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MenuItem menuItem = this.f33472O;
        if (menuItem != null) {
            kotlin.jvm.internal.i.b(menuItem);
            menuItem.setOnMenuItemClickListener(null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View v10) {
        kotlin.jvm.internal.i.e(v10, "v");
        if (getActivity() == null) {
            return false;
        }
        LinearLayout linearLayout = (LinearLayout) v10;
        View childAt = linearLayout.getChildAt(0);
        kotlin.jvm.internal.i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) childAt;
        View childAt2 = linearLayout.getChildAt(1);
        kotlin.jvm.internal.i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
        ActivityC1347l activity = getActivity();
        kotlin.jvm.internal.i.b(activity);
        Object systemService = activity.getSystemService("clipboard");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(textView.getText(), ((TextView) childAt2).getText()));
        P.e(q(), String.format(Locale.US, "%s %s", Arrays.copyOf(new Object[]{textView.getText(), getString(R.string.common_copied)}, 2)));
        v10.setPressed(false);
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        VehicleBaseFragment vehicleBaseFragment = (VehicleBaseFragment) Application.f29634b.e(p279w9.a.f47809f);
        if (vehicleBaseFragment == null || !vehicleBaseFragment.isVisible()) {
            return;
        }
        vehicleBaseFragment.P().f33379C.j(Boolean.TRUE);
        vehicleBaseFragment.P().f33381E.j(Boolean.FALSE);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        VehicleBaseFragment vehicleBaseFragment = (VehicleBaseFragment) Application.f29634b.e(p279w9.a.f47809f);
        if (vehicleBaseFragment == null || !vehicleBaseFragment.isVisible()) {
            return;
        }
        vehicleBaseFragment.P().f33379C.j(Boolean.FALSE);
        vehicleBaseFragment.P().f33381E.j(Boolean.TRUE);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("vehicle", this.f33469L);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f33475R;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_info);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
