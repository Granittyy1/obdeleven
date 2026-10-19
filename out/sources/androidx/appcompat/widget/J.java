package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.braze.support.BrazeLogger;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class J implements p150m.f {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Method f8719B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Method f8720C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0862o f8721A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListAdapter f8723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f8724d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8728h;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8731l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f8734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f8735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemClickListener f8736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f8737r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f8742w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Rect f8744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8745z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8725e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8726f = -2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8729i = 1002;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8732m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8733n = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f8738s = new g();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f8739t = new f();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f8740u = new e();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f8741v = new c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f8743x = new Rect();

    /* JADX INFO: compiled from: ListPopupWindow.java */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            E e10 = J.this.f8724d;
            if (e10 != null) {
                e10.setListSelectionHidden(true);
                e10.requestLayout();
            }
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            J j = J.this;
            if (j.f8721A.isShowing()) {
                j.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            J.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C0862o c0862o;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            J j = J.this;
            if (action == 0 && (c0862o = j.f8721A) != null && c0862o.isShowing() && x10 >= 0 && x10 < j.f8721A.getWidth() && y10 >= 0 && y10 < j.f8721A.getHeight()) {
                j.f8742w.postDelayed(j.f8738s, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            j.f8742w.removeCallbacks(j.f8738s);
            return false;
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            J j = J.this;
            E e10 = j.f8724d;
            if (e10 == null || !e10.isAttachedToWindow() || j.f8724d.getCount() <= j.f8724d.getChildCount() || j.f8724d.getChildCount() > j.f8733n) {
                return;
            }
            j.f8721A.setInputMethodMode(2);
            j.a();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8719B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f8720C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public J(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        this.f8722b = context;
        this.f8742w = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p088h.a.f35703p, i10, 0);
        this.f8727g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8728h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0862o c0862o = new C0862o(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p088h.a.f35707t, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            H0.g.c(c0862o, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0862o.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : com.voltasit.obdeleven.domain.usecases.device.v.e(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f8721A = c0862o;
        c0862o.setInputMethodMode(1);
    }

    @Override // p150m.f
    public final void a() {
        int i10;
        int iMakeMeasureSpec;
        int paddingBottom;
        E e10;
        E e11 = this.f8724d;
        C0862o c0862o = this.f8721A;
        Context context = this.f8722b;
        if (e11 == null) {
            E eQ = q(context, !this.f8745z);
            this.f8724d = eQ;
            eQ.setAdapter(this.f8723c);
            this.f8724d.setOnItemClickListener(this.f8736q);
            this.f8724d.setFocusable(true);
            this.f8724d.setFocusableInTouchMode(true);
            this.f8724d.setOnItemSelectedListener(new I(this));
            this.f8724d.setOnScrollListener(this.f8740u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8737r;
            if (onItemSelectedListener != null) {
                this.f8724d.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0862o.setContentView(this.f8724d);
        }
        Drawable background = c0862o.getBackground();
        Rect rect = this.f8743x;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.j) {
                this.f8728h = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = a.a(c0862o, this.f8735p, this.f8728h, c0862o.getInputMethodMode() == 2);
        int i12 = this.f8725e;
        if (i12 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i13 = this.f8726f;
            if (i13 != -2) {
                iMakeMeasureSpec = i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f8724d.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f8724d.getPaddingBottom() + this.f8724d.getPaddingTop() + i10 : 0);
        }
        boolean z10 = this.f8721A.getInputMethodMode() == 2;
        H0.g.d(c0862o, this.f8729i);
        if (c0862o.isShowing()) {
            if (this.f8735p.isAttachedToWindow()) {
                int width = this.f8726f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f8735p.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
                        c0862o.setWidth(this.f8726f == -1 ? -1 : 0);
                        c0862o.setHeight(0);
                    } else {
                        c0862o.setWidth(this.f8726f == -1 ? -1 : 0);
                        c0862o.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                c0862o.setOutsideTouchable(true);
                View view = this.f8735p;
                int i14 = this.f8727g;
                int i15 = this.f8728h;
                if (width < 0) {
                    width = -1;
                }
                c0862o.update(view, i14, i15, width, i12 < 0 ? -1 : i12);
                return;
            }
            return;
        }
        int width2 = this.f8726f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f8735p.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        c0862o.setWidth(width2);
        c0862o.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f8719B;
            if (method != null) {
                try {
                    method.invoke(c0862o, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            b.b(c0862o, true);
        }
        c0862o.setOutsideTouchable(true);
        c0862o.setTouchInterceptor(this.f8739t);
        if (this.f8731l) {
            H0.g.c(c0862o, this.f8730k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f8720C;
            if (method2 != null) {
                try {
                    method2.invoke(c0862o, this.f8744y);
                } catch (Exception e12) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e12);
                }
            }
        } else {
            b.a(c0862o, this.f8744y);
        }
        c0862o.showAsDropDown(this.f8735p, this.f8727g, this.f8728h, this.f8732m);
        this.f8724d.setSelection(-1);
        if ((!this.f8745z || this.f8724d.isInTouchMode()) && (e10 = this.f8724d) != null) {
            e10.setListSelectionHidden(true);
            e10.requestLayout();
        }
        if (this.f8745z) {
            return;
        }
        this.f8742w.post(this.f8741v);
    }

    @Override // p150m.f
    public final boolean b() {
        return this.f8721A.isShowing();
    }

    public final int c() {
        return this.f8727g;
    }

    @Override // p150m.f
    public final void dismiss() {
        C0862o c0862o = this.f8721A;
        c0862o.dismiss();
        c0862o.setContentView(null);
        this.f8724d = null;
        this.f8742w.removeCallbacks(this.f8738s);
    }

    public final void e(int i10) {
        this.f8727g = i10;
    }

    public final Drawable g() {
        return this.f8721A.getBackground();
    }

    public final void i(Drawable drawable) {
        this.f8721A.setBackgroundDrawable(drawable);
    }

    @Override // p150m.f
    public final E j() {
        return this.f8724d;
    }

    public final void k(int i10) {
        this.f8728h = i10;
        this.j = true;
    }

    public final int n() {
        if (this.j) {
            return this.f8728h;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.f8734o;
        if (dVar == null) {
            this.f8734o = new d();
        } else {
            ListAdapter listAdapter2 = this.f8723c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f8723c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8734o);
        }
        E e10 = this.f8724d;
        if (e10 != null) {
            e10.setAdapter(this.f8723c);
        }
    }

    public E q(Context context, boolean z10) {
        return new E(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.f8721A.getBackground();
        if (background == null) {
            this.f8726f = i10;
            return;
        }
        Rect rect = this.f8743x;
        background.getPadding(rect);
        this.f8726f = rect.left + rect.right + i10;
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1) {
                J j = J.this;
                if (j.f8721A.getInputMethodMode() == 2 || j.f8721A.getContentView() == null) {
                    return;
                }
                Handler handler = j.f8742w;
                g gVar = j.f8738s;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
