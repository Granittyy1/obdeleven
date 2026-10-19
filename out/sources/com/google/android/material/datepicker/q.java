package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.b0;
import androidx.core.view.v0;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.google.android.material.internal.CheckableImageButton;
import com.voltasit.obdeleven.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: MaterialDatePicker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q<S> extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MaterialCalendar<S> f27075A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f27076B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f27077C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f27078D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f27079E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f27080F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f27081G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f27082H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f27083I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f27084J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence f27085K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f27086L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CharSequence f27087M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public TextView f27088N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public TextView f27089O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CheckableImageButton f27090P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public S5.f f27091Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Button f27092R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f27093S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CharSequence f27094T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CharSequence f27095U;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet<s<? super S>> f27096r = new LinkedHashSet<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f27097s = new LinkedHashSet<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f27098t = new LinkedHashSet<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f27099u = new LinkedHashSet<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f27100v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC2030d<S> f27101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z<S> f27102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C2027a f27103y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC2032f f27104z;

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q qVar = q.this;
            for (s<? super S> sVar : qVar.f27096r) {
                qVar.w().M();
                sVar.a();
            }
            qVar.p(false, false);
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q qVar = q.this;
            Iterator<View.OnClickListener> it = qVar.f27097s.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            qVar.p(false, false);
        }
    }

    /* JADX INFO: compiled from: MaterialDatePicker.java */
    public class c extends y<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s10) {
            q qVar = q.this;
            InterfaceC2030d<S> interfaceC2030dW = qVar.w();
            qVar.getContext();
            String strQ = interfaceC2030dW.q();
            TextView textView = qVar.f27089O;
            InterfaceC2030d<S> interfaceC2030dW2 = qVar.w();
            qVar.requireContext();
            textView.setContentDescription(interfaceC2030dW2.K());
            qVar.f27089O.setText(strQ);
            qVar.f27092R.setEnabled(qVar.w().J());
        }
    }

    public static int x(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarD = D.d();
        calendarD.set(5, 1);
        Calendar calendarC = D.c(calendarD);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean y(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(P5.b.c(context, MaterialCalendar.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public final void A(CheckableImageButton checkableImageButton) {
        this.f27090P.setContentDescription(this.f27079E == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f27098t.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27100v = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f27101w = (InterfaceC2030d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f27103y = (C2027a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f27104z = (AbstractC2032f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f27076B = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f27077C = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f27079E = bundle.getInt("INPUT_MODE_KEY");
        this.f27080F = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27081G = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f27082H = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f27083I = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f27084J = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27085K = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f27086L = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f27087M = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f27077C;
        if (text == null) {
            text = requireContext().getResources().getText(this.f27076B);
        }
        this.f27094T = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f27095U = text;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 0;
        View viewInflate = layoutInflater.inflate(this.f27078D ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f27078D) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(x(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(x(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f27089O = textView;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        textView.setAccessibilityLiveRegion(1);
        this.f27090P = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f27088N = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f27090P.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f27090P;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, com.voltasit.obdeleven.domain.usecases.device.v.e(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], com.voltasit.obdeleven.domain.usecases.device.v.e(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f27090P.setChecked(this.f27079E != 0);
        O.n(this.f27090P, null);
        A(this.f27090P);
        this.f27090P.setOnClickListener(new p(this, i10));
        this.f27092R = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (w().J()) {
            this.f27092R.setEnabled(true);
        } else {
            this.f27092R.setEnabled(false);
        }
        this.f27092R.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f27081G;
        if (charSequence != null) {
            this.f27092R.setText(charSequence);
        } else {
            int i11 = this.f27080F;
            if (i11 != 0) {
                this.f27092R.setText(i11);
            }
        }
        CharSequence charSequence2 = this.f27083I;
        if (charSequence2 != null) {
            this.f27092R.setContentDescription(charSequence2);
        } else if (this.f27082H != 0) {
            this.f27092R.setContentDescription(getContext().getResources().getText(this.f27082H));
        }
        this.f27092R.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f27085K;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i12 = this.f27084J;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        CharSequence charSequence4 = this.f27087M;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f27086L != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f27086L));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f27099u.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f27100v);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f27101w);
        C2027a c2027a = this.f27103y;
        C2027a.b bVar = new C2027a.b();
        int i10 = C2027a.b.f27039c;
        int i11 = C2027a.b.f27039c;
        new C2031e(Long.MIN_VALUE);
        long j = c2027a.f27032b.f27120g;
        long j10 = c2027a.f27033c.f27120g;
        bVar.f27040a = Long.valueOf(c2027a.f27035e.f27120g);
        C2027a.c cVar = c2027a.f27034d;
        bVar.f27041b = cVar;
        MaterialCalendar<S> materialCalendar = this.f27075A;
        u uVar = materialCalendar == null ? null : materialCalendar.f27016g;
        if (uVar != null) {
            bVar.f27040a = Long.valueOf(uVar.f27120g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        u uVarB = u.b(j);
        u uVarB2 = u.b(j10);
        C2027a.c cVar2 = (C2027a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f27040a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C2027a(uVarB, uVarB2, cVar2, l10 != null ? u.b(l10.longValue()) : null, c2027a.f27036f));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f27104z);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f27076B);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f27077C);
        bundle.putInt("INPUT_MODE_KEY", this.f27079E);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f27080F);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f27081G);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f27082H);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f27083I);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f27084J);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f27085K);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f27086L);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f27087M);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStart() {
        v0.e cVar;
        v0.e cVar2;
        super.onStart();
        Dialog dialog = this.f17606m;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f27078D) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f27091Q);
            if (!this.f27093S) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = G5.c.a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                int i10 = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = numValueOf == null || numValueOf.intValue() == 0;
                int iX = A8.p.x(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z11) {
                    numValueOf = Integer.valueOf(iX);
                }
                b0.a(window, false);
                window.getContext();
                int iH = i10 < 27 ? p222s0.a.h(A8.p.x(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iH);
                boolean z12 = A8.p.A(0) || A8.p.A(numValueOf.intValue());
                androidx.core.view.D d10 = new androidx.core.view.D(window.getDecorView());
                if (i10 >= 30) {
                    v0.d dVar = new v0.d(window.getInsetsController(), d10);
                    dVar.f16996b = window;
                    cVar = dVar;
                } else {
                    cVar = new v0.c(window, d10);
                }
                cVar.c(z12);
                boolean zA = A8.p.A(iX);
                if (A8.p.A(iH) || (iH == 0 && zA)) {
                    z10 = true;
                }
                androidx.core.view.D d11 = new androidx.core.view.D(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    v0.d dVar2 = new v0.d(window.getInsetsController(), d11);
                    dVar2.f16996b = window;
                    cVar2 = dVar2;
                } else {
                    cVar2 = new v0.c(window, d11);
                }
                cVar2.b(z10);
                r rVar = new r(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                O.d.u(viewFindViewById, rVar);
                this.f27093S = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f27091Q, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f17606m;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new F5.a(dialog2, rect));
        }
        z();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f27102x.f27139b.clear();
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int iG = this.f27100v;
        if (iG == 0) {
            iG = w().G();
        }
        Dialog dialog = new Dialog(contextRequireContext, iG);
        Context context = dialog.getContext();
        this.f27078D = y(context, android.R.attr.windowFullscreen);
        this.f27091Q = new S5.f(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p204q5.a.f46123q, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f27091Q.i(context);
        this.f27091Q.k(ColorStateList.valueOf(color));
        S5.f fVar = this.f27091Q;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        fVar.j(O.d.i(decorView));
        return dialog;
    }

    public final InterfaceC2030d<S> w() {
        if (this.f27101w == null) {
            this.f27101w = (InterfaceC2030d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f27101w;
    }

    public final void z() {
        requireContext();
        int iG = this.f27100v;
        if (iG == 0) {
            iG = w().G();
        }
        InterfaceC2030d<S> interfaceC2030dW = w();
        C2027a c2027a = this.f27103y;
        AbstractC2032f abstractC2032f = this.f27104z;
        t materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iG);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC2030dW);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2027a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", abstractC2032f);
        bundle.putParcelable("CURRENT_MONTH_KEY", c2027a.f27035e);
        materialCalendar.setArguments(bundle);
        this.f27075A = materialCalendar;
        if (this.f27079E == 1) {
            InterfaceC2030d<S> interfaceC2030dW2 = w();
            C2027a c2027a2 = this.f27103y;
            t tVar = new t();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iG);
            bundle2.putParcelable("DATE_SELECTOR_KEY", interfaceC2030dW2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2027a2);
            tVar.setArguments(bundle2);
            materialCalendar = tVar;
        }
        this.f27102x = materialCalendar;
        this.f27088N.setText((this.f27079E == 1 && getResources().getConfiguration().orientation == 2) ? this.f27095U : this.f27094T);
        InterfaceC2030d<S> interfaceC2030dW3 = w();
        getContext();
        String strQ = interfaceC2030dW3.q();
        TextView textView = this.f27089O;
        InterfaceC2030d<S> interfaceC2030dW4 = w();
        requireContext();
        textView.setContentDescription(interfaceC2030dW4.K());
        this.f27089O.setText(strQ);
        androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1336a c1336a = new C1336a(childFragmentManager);
        c1336a.e(R.id.mtrl_calendar_frame, this.f27102x, null);
        if (c1336a.f17490g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c1336a.f17491h = false;
        c1336a.f17569r.A(c1336a, false);
        this.f27102x.o(new c());
    }
}
