package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.core.view.AbstractC1287b;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActionMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0850c extends androidx.appcompat.view.menu.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f8903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f8904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f8912t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e f8913u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f8914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RunnableC0117c f8915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f8916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f8917y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8918z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, mVar, false);
            if (!mVar.f8544A.f()) {
                View view2 = C0850c.this.f8903k;
                this.f8517e = view2 == null ? (View) C0850c.this.f8408i : view2;
            }
            f fVar = C0850c.this.f8917y;
            this.f8520h = fVar;
            p150m.d dVar = this.f8521i;
            if (dVar != null) {
                dVar.e(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            C0850c c0850c = C0850c.this;
            c0850c.f8914v = null;
            c0850c.f8918z = 0;
            super.c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class RunnableC0117c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f8921b;

        public RunnableC0117c(e eVar) {
            this.f8921b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.f.a aVar;
            C0850c c0850c = C0850c.this;
            androidx.appcompat.view.menu.f fVar = c0850c.f8403d;
            if (fVar != null && (aVar = fVar.f8462e) != null) {
                aVar.b(fVar);
            }
            View view = (View) c0850c.f8408i;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f8921b;
                if (eVar.b()) {
                    c0850c.f8913u = eVar;
                } else if (eVar.f8517e != null) {
                    eVar.d(0, 0, false, false);
                    c0850c.f8913u = eVar;
                }
            }
            c0850c.f8915w = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$d$a */
        /* JADX INFO: compiled from: ActionMenuPresenter.java */
        public class a extends G {
            public a(d dVar) {
                super(dVar);
            }

            @Override // androidx.appcompat.widget.G
            public final p150m.f b() {
                e eVar = C0850c.this.f8913u;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.G
            public final boolean c() {
                C0850c.this.n();
                return true;
            }

            @Override // androidx.appcompat.widget.G
            public final boolean d() {
                C0850c c0850c = C0850c.this;
                if (c0850c.f8915w != null) {
                    return false;
                }
                c0850c.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            i0.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0850c.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                p234t0.a.C0532a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$e */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, fVar, true);
            this.f8518f = 8388613;
            f fVar2 = C0850c.this.f8917y;
            this.f8520h = fVar2;
            p150m.d dVar = this.f8521i;
            if (dVar != null) {
                dVar.e(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            C0850c c0850c = C0850c.this;
            androidx.appcompat.view.menu.f fVar = c0850c.f8403d;
            if (fVar != null) {
                fVar.c(true);
            }
            c0850c.f8913u = null;
            super.c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$f */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public class f implements androidx.appcompat.view.menu.j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof androidx.appcompat.view.menu.m) {
                ((androidx.appcompat.view.menu.m) fVar).f8545z.k().c(false);
            }
            androidx.appcompat.view.menu.j.a aVar = C0850c.this.f8405f;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            C0850c c0850c = C0850c.this;
            if (fVar == c0850c.f8403d) {
                return false;
            }
            c0850c.f8918z = ((androidx.appcompat.view.menu.m) fVar).f8544A.f8487a;
            androidx.appcompat.view.menu.j.a aVar = c0850c.f8405f;
            if (aVar != null) {
                return aVar.d(fVar);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$g */
    /* JADX INFO: compiled from: ActionMenuPresenter.java */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8927b;

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$g$a */
        /* JADX INFO: compiled from: ActionMenuPresenter.java */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                g gVar = new g();
                gVar.f8927b = parcel.readInt();
                return gVar;
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f8927b);
        }
    }

    public C0850c(Context context) {
        this.f8401b = context;
        this.f8404e = LayoutInflater.from(context);
        this.f8406g = R.layout.abc_action_menu_layout;
        this.f8407h = R.layout.abc_action_menu_item_layout;
        this.f8912t = new SparseBooleanArray();
        this.f8917y = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(androidx.appcompat.view.menu.h hVar, View view, ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k.a aVar;
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            if (view instanceof androidx.appcompat.view.menu.k.a) {
                aVar = (androidx.appcompat.view.menu.k.a) view;
            } else {
                aVar = (androidx.appcompat.view.menu.k.a) this.f8404e.inflate(this.f8407h, viewGroup, false);
            }
            aVar.d(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f8408i);
            if (this.f8916x == null) {
                this.f8916x = new b();
            }
            actionMenuItemView.setPopupCallback(this.f8916x);
            actionView = (View) aVar;
        }
        actionView.setVisibility(hVar.f8486C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        RunnableC0117c runnableC0117c = this.f8915w;
        if (runnableC0117c != null && (obj = this.f8408i) != null) {
            ((View) obj).removeCallbacks(runnableC0117c);
            this.f8915w = null;
            return true;
        }
        e eVar = this.f8913u;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f8521i.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        b();
        a aVar = this.f8914v;
        if (aVar != null && aVar.b()) {
            aVar.f8521i.dismiss();
        }
        androidx.appcompat.view.menu.j.a aVar2 = this.f8405f;
        if (aVar2 != null) {
            aVar2.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
        int size;
        ArrayList<androidx.appcompat.view.menu.h> arrayListL;
        int i10;
        boolean z10;
        androidx.appcompat.view.menu.f fVar = this.f8403d;
        if (fVar != null) {
            arrayListL = fVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i11 = this.f8910r;
        int i12 = this.f8909q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f8408i;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            androidx.appcompat.view.menu.h hVar = arrayListL.get(i13);
            int i16 = hVar.f8510y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (this.f8911s && hVar.f8486C) {
                i11 = 0;
            }
            i13++;
        }
        if (this.f8906n && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.f8912t;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            androidx.appcompat.view.menu.h hVar2 = arrayListL.get(i18);
            int i20 = hVar2.f8510y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = hVar2.f8488b;
            if (z12) {
                View viewA = a(hVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                hVar2.h(z10);
            } else {
                if ((i20 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View viewA2 = a(hVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            androidx.appcompat.view.menu.h hVar3 = arrayListL.get(i22);
                            if (hVar3.f8488b == i21) {
                                if (hVar3.f()) {
                                    i17++;
                                }
                                hVar3.h(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    hVar2.h(z14);
                } else {
                    hVar2.h(false);
                }
                i18++;
                i10 = 2;
                z10 = true;
            }
            i18++;
            i10 = 2;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f8402c = context;
        LayoutInflater.from(context);
        this.f8403d = fVar;
        Resources resources = context.getResources();
        if (!this.f8907o) {
            this.f8906n = true;
        }
        int i10 = 2;
        this.f8908p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f8910r = i10;
        int measuredWidth = this.f8908p;
        if (this.f8906n) {
            if (this.f8903k == null) {
                d dVar = new d(this.f8401b);
                this.f8903k = dVar;
                if (this.f8905m) {
                    dVar.setImageDrawable(this.f8904l);
                    this.f8904l = null;
                    this.f8905m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8903k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8903k.getMeasuredWidth();
        } else {
            this.f8903k = null;
        }
        this.f8909q = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f8927b) > 0 && (menuItemFindItem = this.f8403d.findItem(i10)) != null) {
            k((androidx.appcompat.view.menu.m) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void i() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f8408i;
        ArrayList<androidx.appcompat.view.menu.h> arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f8403d;
            if (fVar != null) {
                fVar.i();
                ArrayList<androidx.appcompat.view.menu.h> arrayListL = this.f8403d.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.appcompat.view.menu.h hVar = arrayListL.get(i11);
                    if (hVar.f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        androidx.appcompat.view.menu.h itemData = childAt instanceof androidx.appcompat.view.menu.k.a ? ((androidx.appcompat.view.menu.k.a) childAt).getItemData() : null;
                        View viewA = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f8408i).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f8903k) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f8408i).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f8403d;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<androidx.appcompat.view.menu.h> arrayList2 = fVar2.f8466i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC1287b abstractC1287b = arrayList2.get(i12).f8484A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f8403d;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.j;
        }
        if (this.f8906n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !arrayList.get(0).f8486C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f8903k == null) {
                this.f8903k = new d(this.f8401b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f8903k.getParent();
            if (viewGroup3 != this.f8408i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f8903k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f8408i;
                d dVar = this.f8903k;
                actionMenuView.getClass();
                ActionMenuView.c cVarL = ActionMenuView.l();
                cVarL.f8615a = true;
                actionMenuView.addView(dVar, cVarL);
            }
        } else {
            d dVar2 = this.f8903k;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.f8408i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8903k);
                }
            }
        }
        ((ActionMenuView) this.f8408i).setOverflowReserved(this.f8906n);
    }

    public final boolean j() {
        e eVar = this.f8913u;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z10;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (true) {
            androidx.appcompat.view.menu.f fVar = mVar2.f8545z;
            if (fVar == this.f8403d) {
                break;
            }
            mVar2 = (androidx.appcompat.view.menu.m) fVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f8408i;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof androidx.appcompat.view.menu.k.a) && ((androidx.appcompat.view.menu.k.a) childAt).getItemData() == mVar2.f8544A) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.f8918z = mVar.f8544A.f8487a;
        int size = mVar.f8463f.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z10 = false;
                break;
            }
            MenuItem item = mVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i11++;
        }
        a aVar = new a(this.f8402c, mVar, view);
        this.f8914v = aVar;
        aVar.f8519g = z10;
        p150m.d dVar = aVar.f8521i;
        if (dVar != null) {
            dVar.q(z10);
        }
        a aVar2 = this.f8914v;
        if (!aVar2.b()) {
            if (aVar2.f8517e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            aVar2.d(0, 0, false, false);
        }
        androidx.appcompat.view.menu.j.a aVar3 = this.f8405f;
        if (aVar3 != null) {
            aVar3.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        g gVar = new g();
        gVar.f8927b = this.f8918z;
        return gVar;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f8906n || j() || (fVar = this.f8403d) == null || this.f8408i == null || this.f8915w != null) {
            return false;
        }
        fVar.i();
        if (fVar.j.isEmpty()) {
            return false;
        }
        RunnableC0117c runnableC0117c = new RunnableC0117c(new e(this.f8402c, this.f8403d, this.f8903k));
        this.f8915w = runnableC0117c;
        ((View) this.f8408i).post(runnableC0117c);
        return true;
    }
}
