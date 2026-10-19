package com.afollestad.materialdialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Handler;
import android.os.IBinder;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.voltasit.obdeleven.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialDialog extends p042d3.a implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f23192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f23193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f23194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f23195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EditText f23196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RecyclerView f23197i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ProgressBar f23198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f23199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f23200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f23201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CheckBox f23202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MDButton f23203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MDButton f23204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MDButton f23205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ListType f23206s;

    public static class DialogException extends WindowManager.BadTokenException {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ListType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ListType f23207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ListType f23208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ListType f23209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ListType[] f23210e;

        static {
            ListType listType = new ListType("REGULAR", 0);
            f23207b = listType;
            ListType listType2 = new ListType("SINGLE", 1);
            f23208c = listType2;
            ListType listType3 = new ListType("MULTI", 2);
            f23209d = listType3;
            f23210e = new ListType[]{listType, listType2, listType3};
        }

        public ListType() {
            throw null;
        }

        public static ListType valueOf(String str) {
            return (ListType) Enum.valueOf(ListType.class, str);
        }

        public static ListType[] values() {
            return (ListType[]) f23210e.clone();
        }
    }

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public d f23211A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public Theme f23212B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public boolean f23213C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public boolean f23214D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f23215E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public Integer[] f23216F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f23217G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public Typeface f23218H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public Typeface f23219I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public com.afollestad.materialdialogs.a f23220J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public LinearLayoutManager f23221K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public DialogInterface.OnCancelListener f23222L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public DialogInterface.OnShowListener f23223M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f23224N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f23225O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public boolean f23226P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f23227Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public final NumberFormat f23228R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public boolean f23229S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f23230T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f23231U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f23232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f23233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GravityEnum f23234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final GravityEnum f23235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final GravityEnum f23236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final GravityEnum f23237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final GravityEnum f23238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f23239h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f23240i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f23241k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ArrayList<CharSequence> f23242l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public CharSequence f23243m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f23244n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f23245o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public View f23246p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f23247q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ColorStateList f23248r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public ColorStateList f23249s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ColorStateList f23250t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final ColorStateList f23251u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public b f23252v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public e f23253w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public e f23254x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public e f23255y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public c f23256z;

        public a(Context context) {
            GravityEnum gravityEnum = GravityEnum.f23188b;
            this.f23234c = gravityEnum;
            this.f23235d = gravityEnum;
            GravityEnum gravityEnum2 = GravityEnum.f23190d;
            this.f23236e = gravityEnum2;
            this.f23237f = gravityEnum;
            this.f23238g = gravityEnum;
            this.f23239h = 0;
            this.f23240i = -1;
            this.j = -1;
            Theme theme = Theme.f23261b;
            this.f23212B = theme;
            this.f23213C = true;
            this.f23214D = true;
            this.f23215E = -1;
            this.f23216F = null;
            this.f23217G = true;
            this.f23227Q = -2;
            this.f23229S = false;
            this.f23230T = false;
            this.f23231U = false;
            this.f23232a = context;
            int iF = p067f3.b.f(context, R.attr.colorAccent, p0.a.b.a(context, R.color.md_material_blue_600));
            this.f23247q = iF;
            int iF2 = p067f3.b.f(context, android.R.attr.colorAccent, iF);
            this.f23247q = iF2;
            this.f23248r = p067f3.b.b(context, iF2);
            this.f23249s = p067f3.b.b(context, this.f23247q);
            this.f23250t = p067f3.b.b(context, this.f23247q);
            this.f23251u = p067f3.b.b(context, p067f3.b.f(context, R.attr.md_link_color, this.f23247q));
            this.f23239h = p067f3.b.f(context, R.attr.md_btn_ripple_color, p067f3.b.f(context, R.attr.colorControlHighlight, p067f3.b.f(context, android.R.attr.colorControlHighlight, 0)));
            this.f23228R = NumberFormat.getPercentInstance();
            this.f23212B = p067f3.b.c(p067f3.b.f(context, android.R.attr.textColorPrimary, 0)) ? theme : Theme.f23262c;
            if (I2.e.h(false) != null) {
                I2.e.h(true).getClass();
                this.f23234c = gravityEnum;
                this.f23235d = gravityEnum;
                this.f23236e = gravityEnum2;
                this.f23237f = gravityEnum;
                this.f23238g = gravityEnum;
            }
            this.f23234c = p067f3.b.h(context, R.attr.md_title_gravity, this.f23234c);
            this.f23235d = p067f3.b.h(context, R.attr.md_content_gravity, this.f23235d);
            this.f23236e = p067f3.b.h(context, R.attr.md_btnstacked_gravity, this.f23236e);
            this.f23237f = p067f3.b.h(context, R.attr.md_items_gravity, this.f23237f);
            this.f23238g = p067f3.b.h(context, R.attr.md_buttons_gravity, this.f23238g);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.md_medium_font, typedValue, true);
            String str = (String) typedValue.string;
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.md_regular_font, typedValue2, true);
            try {
                h(str, (String) typedValue2.string);
            } catch (Throwable unused) {
            }
            if (this.f23219I == null) {
                try {
                    this.f23219I = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.f23219I = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f23218H == null) {
                try {
                    this.f23218H = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f23218H = typeface;
                    if (typeface == null) {
                        this.f23218H = Typeface.DEFAULT;
                    }
                }
            }
        }

        public final void a(int i10) {
            b(LayoutInflater.from(this.f23232a).inflate(i10, (ViewGroup) null));
        }

        public final void b(View view) {
            if (this.f23241k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            }
            if (this.f23242l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            if (this.f23227Q > -2 || this.f23226P) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            }
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f23246p = view;
        }

        public final void c(CharSequence... charSequenceArr) {
            if (this.f23246p != null) {
                throw new IllegalStateException("You cannot set items() when you're using a custom view.");
            }
            ArrayList<CharSequence> arrayList = new ArrayList<>();
            this.f23242l = arrayList;
            Collections.addAll(arrayList, charSequenceArr);
        }

        public final void d() {
            this.f23245o = this.f23232a.getText(R.string.common_cancel);
        }

        public final void e(int i10) {
            if (i10 == 0) {
                return;
            }
            this.f23243m = this.f23232a.getText(i10);
        }

        public final MaterialDialog f() {
            MaterialDialog materialDialog = new MaterialDialog(this);
            materialDialog.show();
            return materialDialog;
        }

        public final void g(int i10) {
            this.f23233b = this.f23232a.getText(i10);
        }

        public final void h(String str, String str2) {
            Context context = this.f23232a;
            if (str != null && !str.trim().isEmpty()) {
                Typeface typefaceA = p067f3.c.a(context, str);
                this.f23219I = typefaceA;
                if (typefaceA == null) {
                    throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("No font asset found for \"", str, "\""));
                }
            }
            if (str2 == null || str2.trim().isEmpty()) {
                return;
            }
            Typeface typefaceA2 = p067f3.c.a(context, str2);
            this.f23218H = typefaceA2;
            if (typefaceA2 == null) {
                throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("No font asset found for \"", str2, "\""));
            }
        }
    }

    public interface c {
        void b(MaterialDialog materialDialog, int i10);
    }

    public interface d {
        void b(MaterialDialog materialDialog, int i10);
    }

    public interface e {
        void c(MaterialDialog materialDialog);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDialog(a aVar) {
        int i10;
        ArrayList<CharSequence> arrayList;
        int i11;
        int i12;
        int i13;
        Context context = aVar.f23232a;
        Theme theme = aVar.f23212B;
        Theme theme2 = Theme.f23262c;
        boolean zE = p067f3.b.e(context, R.attr.md_dark_theme, theme == theme2);
        aVar.f23212B = zE ? theme2 : Theme.f23261b;
        super(context, zE ? R.style.MD_Dark : R.style.MD_Light);
        new Handler();
        this.f23192d = aVar;
        Context context2 = aVar.f23232a;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        if (aVar.f23246p != null) {
            i10 = R.layout.md_dialog_custom;
        } else if (aVar.f23242l != null || aVar.f23220J != null) {
            i10 = R.layout.md_dialog_list;
        } else if (aVar.f23227Q > -2) {
            i10 = R.layout.md_dialog_progress;
        } else {
            i10 = aVar.f23226P ? R.layout.md_dialog_progress_indeterminate : R.layout.md_dialog_basic;
        }
        this.f34552b = (MDRootLayout) layoutInflaterFrom.inflate(i10, (ViewGroup) null);
        setCancelable(aVar.f23213C);
        setCanceledOnTouchOutside(aVar.f23214D);
        if (aVar.f23224N == 0) {
            aVar.f23224N = p067f3.b.f(context2, R.attr.md_background_color, p067f3.b.f(getContext(), R.attr.colorBackgroundFloating, 0));
        }
        if (aVar.f23224N != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(context2.getResources().getDimension(R.dimen.md_bg_corner_radius));
            gradientDrawable.setColor(aVar.f23224N);
            getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!aVar.f23229S) {
            aVar.f23248r = p067f3.b.d(context2, R.attr.md_positive_color, aVar.f23248r);
        }
        if (!aVar.f23230T) {
            aVar.f23250t = p067f3.b.d(context2, R.attr.md_neutral_color, aVar.f23250t);
        }
        if (!aVar.f23231U) {
            aVar.f23249s = p067f3.b.d(context2, R.attr.md_negative_color, aVar.f23249s);
        }
        aVar.f23247q = p067f3.b.f(context2, R.attr.md_widget_color, aVar.f23247q);
        aVar.f23240i = p067f3.b.f(context2, R.attr.md_title_color, p067f3.b.f(getContext(), android.R.attr.textColorPrimary, 0));
        int iF = p067f3.b.f(context2, R.attr.md_content_color, p067f3.b.f(getContext(), android.R.attr.textColorSecondary, 0));
        aVar.j = iF;
        aVar.f23225O = p067f3.b.f(context2, R.attr.md_item_color, iF);
        this.f23194f = (TextView) this.f34552b.findViewById(R.id.md_title);
        this.f23193e = (ImageView) this.f34552b.findViewById(R.id.md_icon);
        this.j = this.f34552b.findViewById(R.id.md_titleFrame);
        this.f23195g = (TextView) this.f34552b.findViewById(R.id.md_content);
        this.f23197i = (RecyclerView) this.f34552b.findViewById(R.id.md_contentRecyclerView);
        this.f23202o = (CheckBox) this.f34552b.findViewById(R.id.md_promptCheckbox);
        this.f23203p = (MDButton) this.f34552b.findViewById(R.id.md_buttonDefaultPositive);
        this.f23204q = (MDButton) this.f34552b.findViewById(R.id.md_buttonDefaultNeutral);
        this.f23205r = (MDButton) this.f34552b.findViewById(R.id.md_buttonDefaultNegative);
        this.f23203p.setVisibility(aVar.f23243m != null ? 0 : 8);
        this.f23204q.setVisibility(aVar.f23244n != null ? 0 : 8);
        this.f23205r.setVisibility(aVar.f23245o != null ? 0 : 8);
        this.f23203p.setFocusable(true);
        this.f23204q.setFocusable(true);
        this.f23205r.setFocusable(true);
        Drawable drawableG = p067f3.b.g(context2, R.attr.md_icon);
        if (drawableG != null) {
            this.f23193e.setVisibility(0);
            this.f23193e.setImageDrawable(drawableG);
        } else {
            this.f23193e.setVisibility(8);
        }
        TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.md_icon_max_size});
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            dimensionPixelSize = p067f3.b.e(context2, R.attr.md_icon_limit_icon_to_default_size, false) ? context2.getResources().getDimensionPixelSize(R.dimen.md_icon_max_size) : dimensionPixelSize;
            if (dimensionPixelSize > -1) {
                this.f23193e.setAdjustViewBounds(true);
                this.f23193e.setMaxHeight(dimensionPixelSize);
                this.f23193e.setMaxWidth(dimensionPixelSize);
                this.f23193e.requestLayout();
            }
            this.f34552b.setDividerColor(p067f3.b.f(context2, R.attr.md_divider_color, p067f3.b.f(getContext(), R.attr.md_divider, 0)));
            TextView textView = this.f23194f;
            if (textView != null) {
                g(textView, aVar.f23219I);
                this.f23194f.setTextColor(aVar.f23240i);
                this.f23194f.setGravity(aVar.f23234c.a());
                TextView textView2 = this.f23194f;
                int iOrdinal = aVar.f23234c.ordinal();
                if (iOrdinal != 1) {
                    i13 = iOrdinal != 2 ? 5 : 6;
                } else {
                    i13 = 4;
                }
                textView2.setTextAlignment(i13);
                CharSequence charSequence = aVar.f23233b;
                if (charSequence == null) {
                    this.j.setVisibility(8);
                } else {
                    this.f23194f.setText(charSequence);
                    this.j.setVisibility(0);
                }
            }
            TextView textView3 = this.f23195g;
            if (textView3 != null) {
                textView3.setMovementMethod(new LinkMovementMethod());
                g(this.f23195g, aVar.f23218H);
                this.f23195g.setLineSpacing(0.0f, 1.2f);
                ColorStateList colorStateList = aVar.f23251u;
                if (colorStateList == null) {
                    this.f23195g.setLinkTextColor(p067f3.b.f(getContext(), android.R.attr.textColorPrimary, 0));
                } else {
                    this.f23195g.setLinkTextColor(colorStateList);
                }
                this.f23195g.setTextColor(aVar.j);
                this.f23195g.setGravity(aVar.f23235d.a());
                TextView textView4 = this.f23195g;
                int iOrdinal2 = aVar.f23235d.ordinal();
                if (iOrdinal2 != 1) {
                    i12 = iOrdinal2 != 2 ? 5 : 6;
                } else {
                    i12 = 4;
                }
                textView4.setTextAlignment(i12);
                String str = aVar.f23241k;
                if (str != null) {
                    this.f23195g.setText(str);
                    this.f23195g.setVisibility(0);
                } else {
                    this.f23195g.setVisibility(8);
                }
            }
            CheckBox checkBox = this.f23202o;
            if (checkBox != null) {
                checkBox.setText((CharSequence) null);
                this.f23202o.setChecked(false);
                this.f23202o.setOnCheckedChangeListener(null);
                g(this.f23202o, aVar.f23218H);
                this.f23202o.setTextColor(aVar.j);
                CheckBox checkBox2 = this.f23202o;
                int i14 = aVar.f23247q;
                int iA = p067f3.b.a(0.3f, p067f3.b.c(p067f3.b.f(checkBox2.getContext(), android.R.attr.textColorPrimary, 0)) ? -16777216 : -1);
                checkBox2.setButtonTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled, -16842912}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, android.R.attr.state_checked}}, new int[]{p067f3.b.f(checkBox2.getContext(), R.attr.colorControlNormal, 0), i14, iA, iA}));
            }
            this.f34552b.setButtonGravity(aVar.f23238g);
            this.f34552b.setButtonStackedGravity(aVar.f23236e);
            this.f34552b.setStackingBehavior(null);
            boolean zE2 = p067f3.b.e(context2, android.R.attr.textAllCaps, true);
            zE2 = zE2 ? p067f3.b.e(context2, R.attr.textAllCaps, true) : zE2;
            MDButton mDButton = this.f23203p;
            g(mDButton, aVar.f23219I);
            mDButton.setAllCapsCompat(zE2);
            mDButton.setText(aVar.f23243m);
            mDButton.setTextColor(aVar.f23248r);
            MDButton mDButton2 = this.f23203p;
            DialogAction dialogAction = DialogAction.f23184b;
            mDButton2.setStackedSelector(d(dialogAction, true));
            this.f23203p.setDefaultSelector(d(dialogAction, false));
            this.f23203p.setTag(dialogAction);
            this.f23203p.setOnClickListener(this);
            MDButton mDButton3 = this.f23205r;
            g(mDButton3, aVar.f23219I);
            mDButton3.setAllCapsCompat(zE2);
            mDButton3.setText(aVar.f23245o);
            mDButton3.setTextColor(aVar.f23249s);
            MDButton mDButton4 = this.f23205r;
            DialogAction dialogAction2 = DialogAction.f23186d;
            mDButton4.setStackedSelector(d(dialogAction2, true));
            this.f23205r.setDefaultSelector(d(dialogAction2, false));
            this.f23205r.setTag(dialogAction2);
            this.f23205r.setOnClickListener(this);
            MDButton mDButton5 = this.f23204q;
            g(mDButton5, aVar.f23219I);
            mDButton5.setAllCapsCompat(zE2);
            mDButton5.setText(aVar.f23244n);
            mDButton5.setTextColor(aVar.f23250t);
            MDButton mDButton6 = this.f23204q;
            DialogAction dialogAction3 = DialogAction.f23185c;
            mDButton6.setStackedSelector(d(dialogAction3, true));
            this.f23204q.setDefaultSelector(d(dialogAction3, false));
            this.f23204q.setTag(dialogAction3);
            this.f23204q.setOnClickListener(this);
            if (this.f23197i != null) {
                Object obj = aVar.f23220J;
                if (obj == null) {
                    if (aVar.f23211A != null) {
                        this.f23206s = ListType.f23208c;
                    } else {
                        this.f23206s = ListType.f23207b;
                    }
                    int iOrdinal3 = this.f23206s.ordinal();
                    if (iOrdinal3 == 0) {
                        i11 = R.layout.md_listitem;
                    } else if (iOrdinal3 == 1) {
                        i11 = R.layout.md_listitem_singlechoice;
                    } else {
                        if (iOrdinal3 != 2) {
                            throw new IllegalArgumentException("Not a valid list type");
                        }
                        i11 = R.layout.md_listitem_multichoice;
                    }
                    aVar.f23220J = new com.afollestad.materialdialogs.a(this, i11);
                } else if (obj instanceof p055e3.a) {
                    ((p055e3.a) obj).a();
                }
            }
            if (aVar.f23226P || aVar.f23227Q > -2) {
                ProgressBar progressBar = (ProgressBar) this.f34552b.findViewById(android.R.id.progress);
                this.f23198k = progressBar;
                if (progressBar != null) {
                    if (aVar.f23226P) {
                        IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(context2);
                        indeterminateCircularProgressDrawable.setTint(aVar.f23247q);
                        this.f23198k.setProgressDrawable(indeterminateCircularProgressDrawable);
                        this.f23198k.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
                    } else {
                        HorizontalProgressDrawable horizontalProgressDrawable = new HorizontalProgressDrawable(context2);
                        horizontalProgressDrawable.setTint(aVar.f23247q);
                        this.f23198k.setProgressDrawable(horizontalProgressDrawable);
                        this.f23198k.setIndeterminateDrawable(horizontalProgressDrawable);
                    }
                    if (!aVar.f23226P) {
                        this.f23198k.setIndeterminate(false);
                        this.f23198k.setProgress(0);
                        this.f23198k.setMax(0);
                        TextView textView5 = (TextView) this.f34552b.findViewById(R.id.md_label);
                        this.f23199l = textView5;
                        if (textView5 != null) {
                            textView5.setTextColor(aVar.j);
                            g(this.f23199l, aVar.f23219I);
                            this.f23199l.setText(aVar.f23228R.format(0L));
                        }
                        TextView textView6 = (TextView) this.f34552b.findViewById(R.id.md_minMax);
                        this.f23200m = textView6;
                        if (textView6 != null) {
                            textView6.setTextColor(aVar.j);
                            g(this.f23200m, aVar.f23218H);
                            this.f23200m.setVisibility(8);
                        }
                    }
                }
            }
            EditText editText = (EditText) this.f34552b.findViewById(android.R.id.input);
            this.f23196h = editText;
            if (editText != null) {
                g(editText, aVar.f23218H);
                EditText editText2 = this.f23196h;
                if (editText2 != null) {
                    editText2.addTextChangedListener(new com.afollestad.materialdialogs.c(this));
                }
                this.f23196h.setHint((CharSequence) null);
                this.f23196h.setSingleLine();
                this.f23196h.setTextColor(aVar.j);
                this.f23196h.setHintTextColor(p067f3.b.a(0.3f, aVar.j));
                p055e3.e.a(this.f23196h, aVar.f23247q);
                TextView textView7 = (TextView) this.f34552b.findViewById(R.id.md_minMax);
                this.f23201n = textView7;
                textView7.setVisibility(8);
                this.f23201n = null;
            }
            if (aVar.f23246p != null) {
                ((MDRootLayout) this.f34552b.findViewById(R.id.md_root)).f23290l = true;
                FrameLayout frameLayout = (FrameLayout) this.f34552b.findViewById(R.id.md_customViewFrame);
                View view = aVar.f23246p;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
            }
            DialogInterface.OnShowListener onShowListener = aVar.f23223M;
            if (onShowListener != null) {
                this.f34553c = onShowListener;
            }
            DialogInterface.OnCancelListener onCancelListener = aVar.f23222L;
            if (onCancelListener != null) {
                setOnCancelListener(onCancelListener);
            }
            a();
            if (this.f23197i != null && (((arrayList = aVar.f23242l) != null && arrayList.size() != 0) || aVar.f23220J != null)) {
                if (aVar.f23221K == null) {
                    getContext();
                    aVar.f23221K = new LinearLayoutManager(1);
                }
                if (this.f23197i.getLayoutManager() == null) {
                    this.f23197i.setLayoutManager(aVar.f23221K);
                }
                this.f23197i.setAdapter(aVar.f23220J);
                if (this.f23206s != null) {
                    aVar.f23220J.f23267d = this;
                }
            }
            b(this.f34552b);
            RecyclerView recyclerView = this.f23197i;
            if (recyclerView != null) {
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new com.afollestad.materialdialogs.b(this));
            }
            Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i15 = point.x;
            int i16 = point.y;
            int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_vertical_margin);
            int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin);
            this.f34552b.setMaxHeight(i16 - (dimensionPixelSize2 * 2));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(getWindow().getAttributes());
            layoutParams.width = Math.min(context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_max_width), i15 - (dimensionPixelSize3 * 2));
            getWindow().setAttributes(layoutParams);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void g(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    public final MDButton c(DialogAction dialogAction) {
        int iOrdinal = dialogAction.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? this.f23203p : this.f23205r;
        }
        return this.f23204q;
    }

    public final Drawable d(DialogAction dialogAction, boolean z10) {
        a aVar = this.f23192d;
        if (z10) {
            aVar.getClass();
            Drawable drawableG = p067f3.b.g(aVar.f23232a, R.attr.md_btn_stacked_selector);
            return drawableG != null ? drawableG : p067f3.b.g(getContext(), R.attr.md_btn_stacked_selector);
        }
        int iOrdinal = dialogAction.ordinal();
        if (iOrdinal == 1) {
            aVar.getClass();
            Drawable drawableG2 = p067f3.b.g(aVar.f23232a, R.attr.md_btn_neutral_selector);
            if (drawableG2 != null) {
                return drawableG2;
            }
            Drawable drawableG3 = p067f3.b.g(getContext(), R.attr.md_btn_neutral_selector);
            int i10 = aVar.f23239h;
            if (drawableG3 instanceof RippleDrawable) {
                ((RippleDrawable) drawableG3).setColor(ColorStateList.valueOf(i10));
            }
            return drawableG3;
        }
        if (iOrdinal != 2) {
            aVar.getClass();
            Drawable drawableG4 = p067f3.b.g(aVar.f23232a, R.attr.md_btn_positive_selector);
            if (drawableG4 != null) {
                return drawableG4;
            }
            Drawable drawableG5 = p067f3.b.g(getContext(), R.attr.md_btn_positive_selector);
            int i11 = aVar.f23239h;
            if (drawableG5 instanceof RippleDrawable) {
                ((RippleDrawable) drawableG5).setColor(ColorStateList.valueOf(i11));
            }
            return drawableG5;
        }
        aVar.getClass();
        Drawable drawableG6 = p067f3.b.g(aVar.f23232a, R.attr.md_btn_negative_selector);
        if (drawableG6 != null) {
            return drawableG6;
        }
        Drawable drawableG7 = p067f3.b.g(getContext(), R.attr.md_btn_negative_selector);
        int i12 = aVar.f23239h;
        if (drawableG7 instanceof RippleDrawable) {
            ((RippleDrawable) drawableG7).setColor(ColorStateList.valueOf(i12));
        }
        return drawableG7;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        EditText editText = this.f23196h;
        if (editText != null && editText != null && (inputMethodManager = (InputMethodManager) this.f23192d.f23232a.getSystemService("input_method")) != null) {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                windowToken = currentFocus.getWindowToken();
            } else {
                MDRootLayout mDRootLayout = this.f34552b;
                windowToken = mDRootLayout != null ? mDRootLayout.getWindowToken() : null;
            }
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        super.dismiss();
    }

    public final boolean e(View view, int i10, boolean z10) {
        c cVar;
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.f23206s;
        a aVar = this.f23192d;
        if (listType == null || listType == ListType.f23207b) {
            if (aVar.f23217G) {
                dismiss();
            }
            if (!z10 && (cVar = aVar.f23256z) != null) {
                aVar.f23242l.get(i10);
                cVar.b(this, i10);
            }
        } else {
            if (listType == ListType.f23209d) {
                if (((CheckBox) view.findViewById(R.id.md_control)).isEnabled()) {
                    throw null;
                }
                return false;
            }
            if (listType == ListType.f23208c) {
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.md_control);
                if (!radioButton.isEnabled()) {
                    return false;
                }
                int i11 = aVar.f23215E;
                if (aVar.f23217G && aVar.f23243m == null) {
                    dismiss();
                    aVar.f23215E = i10;
                    f(view);
                } else {
                    aVar.f23215E = i10;
                    radioButton.setChecked(true);
                    aVar.f23220J.notifyItemChanged(i11);
                    aVar.f23220J.notifyItemChanged(i10);
                }
            }
        }
        return true;
    }

    public final void f(View view) {
        a aVar = this.f23192d;
        if (aVar.f23211A == null) {
            return;
        }
        int i10 = aVar.f23215E;
        if (i10 >= 0 && i10 < aVar.f23242l.size()) {
            aVar.f23242l.get(aVar.f23215E);
        }
        aVar.f23211A.b(this, aVar.f23215E);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iOrdinal = ((DialogAction) view.getTag()).ordinal();
        a aVar = this.f23192d;
        if (iOrdinal == 0) {
            b bVar = aVar.f23252v;
            if (bVar != null) {
                bVar.c(this);
            }
            e eVar = aVar.f23253w;
            if (eVar != null) {
                eVar.c(this);
            }
            f(view);
            aVar.getClass();
            if (aVar.f23217G) {
                dismiss();
            }
        } else if (iOrdinal == 1) {
            b bVar2 = aVar.f23252v;
            if (bVar2 != null) {
                bVar2.b(this);
            }
            e eVar2 = aVar.f23255y;
            if (eVar2 != null) {
                eVar2.c(this);
            }
            if (aVar.f23217G) {
                dismiss();
            }
        } else if (iOrdinal == 2) {
            b bVar3 = aVar.f23252v;
            if (bVar3 != null) {
                bVar3.a(this);
            }
            e eVar3 = aVar.f23254x;
            if (eVar3 != null) {
                eVar3.c(this);
            }
            if (aVar.f23217G) {
                cancel();
            }
        }
        aVar.getClass();
    }

    @Override // p042d3.a, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        EditText editText = this.f23196h;
        if (editText != null) {
            if (editText != null) {
                editText.post(new p067f3.a(this, this.f23192d));
            }
            if (this.f23196h.getText().length() > 0) {
                EditText editText2 = this.f23196h;
                editText2.setSelection(editText2.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f23194f.setText(charSequence);
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        setTitle(this.f23192d.f23232a.getString(i10));
    }

    @Deprecated
    public static abstract class b {
        @Deprecated
        public abstract void a(MaterialDialog materialDialog);

        @Deprecated
        public abstract void c(MaterialDialog materialDialog);

        public final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public final void finalize() throws Throwable {
            super.finalize();
        }

        @Deprecated
        public void b(MaterialDialog materialDialog) {
        }
    }
}
