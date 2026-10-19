package androidx.appcompat.view.menu;

import Z3.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0862o;
import androidx.appcompat.widget.E;
import androidx.appcompat.widget.K;
import androidx.appcompat.widget.L;
import com.voltasit.obdeleven.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: CascadingMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p150m.d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8409A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f8414g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f8421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f8422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8426t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8427u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j.a f8430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f8431y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i.a f8432z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f8415h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f8416i = new ArrayList();
    public final a j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0115b f8417k = new ViewOnAttachStateChangeListenerC0115b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f8418l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8419m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8420n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8428v = false;

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.b()) {
                ArrayList arrayList = bVar.f8416i;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f8436a.f8745z) {
                    return;
                }
                View view = bVar.f8422p;
                if (view == null || !view.isShown()) {
                    bVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f8436a.a();
                }
            }
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class c implements K {
        public c() {
        }

        @Override // androidx.appcompat.widget.K
        public final void d(f fVar, h hVar) {
            b bVar = b.this;
            bVar.f8414g.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.f8416i;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i10)).f8437b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            bVar.f8414g.postAtTime(new androidx.appcompat.view.menu.c(this, i11 < arrayList.size() ? (d) arrayList.get(i11) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.K
        public final void o(f fVar, h hVar) {
            b.this.f8414g.removeCallbacksAndMessages(fVar);
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L f8436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f8437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8438c;

        public d(L l10, f fVar, int i10) {
            this.f8436a = l10;
            this.f8437b = fVar;
            this.f8438c = i10;
        }
    }

    public b(Context context, View view, int i10, boolean z10) {
        this.f8410c = context;
        this.f8421o = view;
        this.f8412e = i10;
        this.f8413f = z10;
        this.f8423q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f8411d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8414g = new Handler();
    }

    @Override // p150m.f
    public final void a() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f8415h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((f) it.next());
        }
        arrayList.clear();
        View view = this.f8421o;
        this.f8422p = view;
        if (view != null) {
            boolean z10 = this.f8431y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f8431y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.f8422p.addOnAttachStateChangeListener(this.f8417k);
        }
    }

    @Override // p150m.f
    public final boolean b() {
        ArrayList arrayList = this.f8416i;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f8436a.f8721A.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        ArrayList arrayList = this.f8416i;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i10)).f8437b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f8437b.c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        dVar.f8437b.r(this);
        boolean z11 = this.f8409A;
        L l10 = dVar.f8436a;
        if (z11) {
            L.a.b(l10.f8721A, null);
            l10.f8721A.setAnimationStyle(0);
        }
        l10.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f8423q = ((d) arrayList.get(size2 - 1)).f8438c;
        } else {
            this.f8423q = this.f8421o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f8437b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f8430x;
        if (aVar != null) {
            aVar.c(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f8431y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f8431y.removeGlobalOnLayoutListener(this.j);
            }
            this.f8431y = null;
        }
        this.f8422p.removeOnAttachStateChangeListener(this.f8417k);
        this.f8432z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
        return false;
    }

    @Override // p150m.f
    public final void dismiss() {
        ArrayList arrayList = this.f8416i;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f8436a.f8721A.isShowing()) {
                    dVar.f8436a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(j.a aVar) {
        this.f8430x = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i() {
        Iterator it = this.f8416i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f8436a.f8724d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // p150m.f
    public final E j() {
        ArrayList arrayList = this.f8416i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) n.f(1, arrayList)).f8436a.f8724d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        for (d dVar : this.f8416i) {
            if (mVar == dVar.f8437b) {
                dVar.f8436a.f8724d.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        n(mVar);
        j.a aVar = this.f8430x;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // p150m.d
    public final void n(f fVar) {
        fVar.b(this, this.f8410c);
        if (b()) {
            x(fVar);
        } else {
            this.f8415h.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f8416i;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f8436a.f8721A.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f8437b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p150m.d
    public final void p(View view) {
        if (this.f8421o != view) {
            this.f8421o = view;
            this.f8420n = Gravity.getAbsoluteGravity(this.f8419m, view.getLayoutDirection());
        }
    }

    @Override // p150m.d
    public final void q(boolean z10) {
        this.f8428v = z10;
    }

    @Override // p150m.d
    public final void r(int i10) {
        if (this.f8419m != i10) {
            this.f8419m = i10;
            this.f8420n = Gravity.getAbsoluteGravity(i10, this.f8421o.getLayoutDirection());
        }
    }

    @Override // p150m.d
    public final void s(int i10) {
        this.f8424r = true;
        this.f8426t = i10;
    }

    @Override // p150m.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f8432z = (i.a) onDismissListener;
    }

    @Override // p150m.d
    public final void u(boolean z10) {
        this.f8429w = z10;
    }

    @Override // p150m.d
    public final void v(int i10) {
        this.f8425s = true;
        this.f8427u = i10;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0152  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x016d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void x(f fVar) {
        d dVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i10;
        C0862o c0862o;
        E e10;
        int[] iArr;
        Rect rect3;
        int i11;
        int i12;
        boolean z10;
        Method method;
        MenuItem item;
        e eVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f8410c;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e eVar2 = new e(fVar, layoutInflaterFrom, this.f8413f, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f8428v) {
            eVar2.f8453d = true;
        } else if (b()) {
            eVar2.f8453d = p150m.d.w(fVar);
        }
        int iO = p150m.d.o(eVar2, context, this.f8411d);
        L l10 = new L(context, null, this.f8412e);
        l10.f8752D = this.f8418l;
        l10.f8736q = this;
        l10.f8721A.setOnDismissListener(this);
        l10.f8735p = this.f8421o;
        l10.f8732m = this.f8420n;
        l10.f8745z = true;
        l10.f8721A.setFocusable(true);
        l10.f8721A.setInputMethodMode(2);
        l10.p(eVar2);
        l10.r(iO);
        l10.f8732m = this.f8420n;
        ArrayList arrayList = this.f8416i;
        if (arrayList.size() > 0) {
            dVar = (d) n.f(1, arrayList);
            f fVar2 = dVar.f8437b;
            int size = fVar2.f8463f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    item = null;
                    break;
                }
                item = fVar2.getItem(i13);
                if (item.hasSubMenu() && fVar == item.getSubMenu()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                E e11 = dVar.f8436a.f8724d;
                ListAdapter adapter = e11.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    headersCount = 0;
                }
                int count = eVar.getCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= count) {
                        i14 = -1;
                        break;
                    } else if (item == eVar.getItem(i14)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + headersCount) - e11.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < e11.getChildCount()) {
                    childAt = e11.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i10 = Build.VERSION.SDK_INT;
                c0862o = l10.f8721A;
                if (i10 <= 28) {
                    method = L.f8751E;
                    if (method != null) {
                        try {
                            method.invoke(c0862o, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    L.b.a(c0862o, false);
                }
                L.a.a(l10.f8721A, null);
                e10 = ((d) arrayList.get(arrayList.size() - 1)).f8436a.f8724d;
                iArr = new int[2];
                e10.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f8422p.getWindowVisibleDisplayFrame(rect3);
                if (this.f8423q == 1) {
                    if (e10.getWidth() + iArr[0] + iO > rect3.right) {
                        i12 = 0;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        i12 = 1;
                    }
                } else if (iArr[0] - iO < 0) {
                    i11 = 1;
                    i12 = 1;
                } else {
                    i12 = 0;
                    i11 = 1;
                }
                if (i12 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f8423q = i12;
                l10.f8735p = childAt;
                if ((this.f8420n & 5) == 5) {
                    if (!z10) {
                        iO = 0 - childAt.getWidth();
                    }
                } else if (z10) {
                    iO = childAt.getWidth();
                } else {
                    iO = 0 - iO;
                }
                l10.f8727g = iO;
                l10.f8731l = true;
                l10.f8730k = true;
                l10.k(0);
            } else {
                if (this.f8424r) {
                    l10.f8727g = this.f8426t;
                }
                if (this.f8425s) {
                    l10.k(this.f8427u);
                }
                rect = this.f44547b;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                l10.f8744y = rect2;
            }
            arrayList.add(new d(l10, fVar, this.f8423q));
            l10.a();
            E e12 = l10.f8724d;
            e12.setOnKeyListener(this);
            if (dVar == null || !this.f8429w || fVar.f8469m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) e12, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fVar.f8469m);
            e12.addHeaderView(frameLayout, null, false);
            l10.a();
            return;
        }
        dVar = null;
        childAt = null;
        if (childAt != null) {
            i10 = Build.VERSION.SDK_INT;
            c0862o = l10.f8721A;
            if (i10 <= 28) {
                method = L.f8751E;
                if (method != null) {
                    method.invoke(c0862o, Boolean.FALSE);
                }
            } else {
                L.b.a(c0862o, false);
            }
            L.a.a(l10.f8721A, null);
            e10 = ((d) arrayList.get(arrayList.size() - 1)).f8436a.f8724d;
            iArr = new int[2];
            e10.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f8422p.getWindowVisibleDisplayFrame(rect3);
            if (this.f8423q == 1) {
                if (e10.getWidth() + iArr[0] + iO > rect3.right) {
                    i12 = 0;
                    i11 = 1;
                } else {
                    i11 = 1;
                    i12 = 1;
                }
            } else if (iArr[0] - iO < 0) {
                i11 = 1;
                i12 = 1;
            } else {
                i12 = 0;
                i11 = 1;
            }
            if (i12 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f8423q = i12;
            l10.f8735p = childAt;
            if ((this.f8420n & 5) == 5) {
                if (!z10) {
                    iO = 0 - childAt.getWidth();
                }
            } else if (z10) {
                iO = childAt.getWidth();
            } else {
                iO = 0 - iO;
            }
            l10.f8727g = iO;
            l10.f8731l = true;
            l10.f8730k = true;
            l10.k(0);
        } else {
            if (this.f8424r) {
                l10.f8727g = this.f8426t;
            }
            if (this.f8425s) {
                l10.k(this.f8427u);
            }
            rect = this.f44547b;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            l10.f8744y = rect2;
        }
        arrayList.add(new d(l10, fVar, this.f8423q));
        l10.a();
        E e13 = l10.f8724d;
        e13.setOnKeyListener(this);
        if (dVar == null) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class ViewOnAttachStateChangeListenerC0115b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0115b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.f8431y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.f8431y = view.getViewTreeObserver();
                }
                bVar.f8431y.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Parcelable parcelable) {
    }
}
