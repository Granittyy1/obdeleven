package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.voltasit.obdeleven.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: DropDownListView.java */
/* JADX INFO: loaded from: classes.dex */
public class E extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f8676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f8682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8683i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public H0.f f8685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f8686m;

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f8687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f8688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f8689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final boolean f8690d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f8687a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f8688b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f8689c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f8690d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class d extends p125k.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8691c;

        @Override // p125k.a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f8691c) {
                super.draw(canvas);
            }
        }

        @Override // p125k.a, android.graphics.drawable.Drawable
        public final void setHotspot(float f10, float f11) {
            if (this.f8691c) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p125k.a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f8691c) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f8691c) {
                return this.f41214b.setState(iArr);
            }
            return false;
        }

        @Override // p125k.a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f8691c) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f8692a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f8692a = declaredField;
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            E e10 = E.this;
            e10.f8686m = null;
            e10.drawableStateChanged();
        }
    }

    public E(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f8676b = new Rect();
        this.f8677c = 0;
        this.f8678d = 0;
        this.f8679e = 0;
        this.f8680f = 0;
        this.j = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f8682h;
        if (dVar != null) {
            dVar.f8691c = z10;
        }
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x015d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:91:0x017b  */
    /* JADX WARN: Code duplicated, block: B:93:0x017f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean zA;
        View childAt;
        View childAt2;
        H0.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z11) {
                this.f8684k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f8681g - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.f8685l == null) {
                    this.f8685l = new H0.f(this);
                }
                H0.f fVar2 = this.f8685l;
                boolean z12 = fVar2.f3606q;
                fVar2.f3606q = true;
                fVar2.onTouch(this, motionEvent);
            } else {
                fVar = this.f8685l;
                if (fVar != null) {
                    if (fVar.f3606q) {
                        fVar.d();
                    }
                    fVar.f3606q = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.f8684k = true;
                int i11 = Build.VERSION.SDK_INT;
                a.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f8681g;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f8681g = iPointToPosition;
                a.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f8676b;
                rect.set(left, top, right, bottom);
                rect.left -= this.f8677c;
                rect.top -= this.f8678d;
                rect.right += this.f8679e;
                rect.bottom += this.f8680f;
                if (i11 >= 33) {
                    zA = c.a(this);
                } else {
                    Field field = e.f8692a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c.b(this, z14);
                    } else {
                        Field field2 = e.f8692a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    p234t0.a.C0532a.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    p234t0.a.C0532a.e(selector2, f10, f11);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            this.f8684k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f8681g - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f8684k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f8681g - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.f8685l == null) {
                this.f8685l = new H0.f(this);
            }
            H0.f fVar3 = this.f8685l;
            boolean z15 = fVar3.f3606q;
            fVar3.f3606q = true;
            fVar3.onTouch(this, motionEvent);
        } else {
            fVar = this.f8685l;
            if (fVar != null) {
                if (fVar.f3606q) {
                    fVar.d();
                }
                fVar.f3606q = false;
            }
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f8676b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f8686m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f8684k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.j && this.f8683i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f8686m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8686m == null) {
            f fVar = new f();
            this.f8686m = fVar;
            post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f8690d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f8687a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f8688b.invoke(this, Integer.valueOf(iPointToPosition));
                            b.f8689c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f8684k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8681g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f8686m;
        if (fVar != null) {
            E e10 = E.this;
            e10.f8686m = null;
            e10.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f8683i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
            dVar.f8691c = true;
        } else {
            dVar = null;
        }
        this.f8682h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8677c = rect.left;
        this.f8678d = rect.top;
        this.f8679e = rect.right;
        this.f8680f = rect.bottom;
    }
}
