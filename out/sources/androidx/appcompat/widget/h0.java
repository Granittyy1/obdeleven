package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f8963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f8965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f8966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f8967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f8968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f8970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f8971i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f8972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0850c f8974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f8976o;

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    public class a extends O3.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8977e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f8978f;

        public a(int i10) {
            this.f8978f = i10;
        }

        @Override // O3.d, androidx.core.view.a0
        public final void a() {
            this.f8977e = true;
        }

        @Override // O3.d, androidx.core.view.a0
        public final void c() {
            h0.this.f8963a.setVisibility(0);
        }

        @Override // androidx.core.view.a0
        public final void d() {
            if (this.f8977e) {
                return;
            }
            h0.this.f8963a.setVisibility(this.f8978f);
        }
    }

    public h0(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f8975n = 0;
        this.f8963a = toolbar;
        this.f8970h = toolbar.getTitle();
        this.f8971i = toolbar.getSubtitle();
        this.f8969g = this.f8970h != null;
        this.f8968f = toolbar.getNavigationIcon();
        c0 c0VarF = c0.f(toolbar.getContext(), null, p088h.a.f35689a, R.attr.actionBarStyle, 0);
        int i10 = 15;
        this.f8976o = c0VarF.b(15);
        if (z10) {
            TypedArray typedArray = c0VarF.f8929b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f8971i = text2;
                if ((this.f8964b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = c0VarF.b(20);
            if (drawableB != null) {
                this.f8967e = drawableB;
                s();
            }
            Drawable drawableB2 = c0VarF.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f8968f == null && (drawable = this.f8976o) != null) {
                p(drawable);
            }
            j(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f8965c;
                if (view != null && (this.f8964b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f8965c = viewInflate;
                if (viewInflate != null && (this.f8964b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                j(this.f8964b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f8976o = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f8964b = i10;
        }
        c0VarF.g();
        if (R.string.abc_action_bar_up_description != this.f8975n) {
            this.f8975n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                o(this.f8975n);
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new g0(this));
    }

    @Override // androidx.appcompat.widget.C
    public final boolean a() {
        return this.f8963a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.C
    public final void b() {
        this.f8973l = true;
    }

    @Override // androidx.appcompat.widget.C
    public final boolean c() {
        return this.f8963a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.C
    public final void collapseActionView() {
        this.f8963a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.C
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.j.a aVar) {
        C0850c c0850c = this.f8974m;
        Toolbar toolbar = this.f8963a;
        if (c0850c == null) {
            C0850c c0850c2 = new C0850c(toolbar.getContext());
            this.f8974m = c0850c2;
            c0850c2.j = R.id.action_menu_presenter;
        }
        C0850c c0850c3 = this.f8974m;
        c0850c3.f8405f = aVar;
        toolbar.setMenu(fVar, c0850c3);
    }

    @Override // androidx.appcompat.widget.C
    public final boolean e() {
        return this.f8963a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.C
    public final boolean f() {
        return this.f8963a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.C
    public final boolean g() {
        return this.f8963a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.C
    public final Context getContext() {
        return this.f8963a.getContext();
    }

    @Override // androidx.appcompat.widget.C
    public final CharSequence getTitle() {
        return this.f8963a.getTitle();
    }

    @Override // androidx.appcompat.widget.C
    public final void h() {
        this.f8963a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.C
    public final boolean i() {
        return this.f8963a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.C
    public final void j(int i10) {
        View view;
        int i11 = this.f8964b ^ i10;
        this.f8964b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    r();
                }
                int i12 = this.f8964b & 4;
                Toolbar toolbar = this.f8963a;
                if (i12 != 0) {
                    Drawable drawable = this.f8968f;
                    if (drawable == null) {
                        drawable = this.f8976o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                s();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.f8963a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f8970h);
                    toolbar2.setSubtitle(this.f8971i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f8965c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.C
    public final void l(int i10) {
        this.f8967e = i10 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(this.f8963a.getContext(), i10) : null;
        s();
    }

    @Override // androidx.appcompat.widget.C
    public final androidx.core.view.Z m(int i10, long j) {
        androidx.core.view.Z zA = androidx.core.view.O.a(this.f8963a);
        zA.a(i10 == 0 ? 1.0f : 0.0f);
        zA.c(j);
        zA.d(new a(i10));
        return zA;
    }

    @Override // androidx.appcompat.widget.C
    public final int n() {
        return this.f8964b;
    }

    @Override // androidx.appcompat.widget.C
    public final void o(int i10) {
        this.j = i10 == 0 ? null : this.f8963a.getContext().getString(i10);
        r();
    }

    @Override // androidx.appcompat.widget.C
    public final void p(Drawable drawable) {
        this.f8968f = drawable;
        int i10 = this.f8964b & 4;
        Toolbar toolbar = this.f8963a;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.f8976o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.C
    public final void q(boolean z10) {
        this.f8963a.setCollapsible(z10);
    }

    public final void r() {
        if ((this.f8964b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f8963a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f8975n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void s() {
        Drawable drawable;
        int i10 = this.f8964b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f8967e) == null) {
            drawable = this.f8966d;
        }
        this.f8963a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.C
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(this.f8963a.getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.C
    public final void setTitle(CharSequence charSequence) {
        this.f8969g = true;
        this.f8970h = charSequence;
        if ((this.f8964b & 8) != 0) {
            Toolbar toolbar = this.f8963a;
            toolbar.setTitle(charSequence);
            if (this.f8969g) {
                androidx.core.view.O.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.C
    public final void setVisibility(int i10) {
        this.f8963a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.C
    public final void setWindowCallback(Window.Callback callback) {
        this.f8972k = callback;
    }

    @Override // androidx.appcompat.widget.C
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f8969g) {
            return;
        }
        this.f8970h = charSequence;
        if ((this.f8964b & 8) != 0) {
            Toolbar toolbar = this.f8963a;
            toolbar.setTitle(charSequence);
            if (this.f8969g) {
                androidx.core.view.O.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.C
    public final void setIcon(Drawable drawable) {
        this.f8966d = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.C
    public final void k() {
    }
}
