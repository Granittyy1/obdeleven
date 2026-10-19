package K5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.recyclerview.widget.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: NavigationMenuPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements androidx.appcompat.view.menu.j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4295A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4296B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NavigationMenuView f4299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f4300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.view.menu.f f4301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f4303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LayoutInflater f4304g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ColorStateList f4306i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f4308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f4309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f4310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f4311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4317u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4320x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4322z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4305h = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4307k = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4321y = true;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4297C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final a f4298D = new a();

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            g gVar = g.this;
            c cVar = gVar.f4303f;
            boolean z10 = true;
            if (cVar != null) {
                cVar.f4326c = true;
            }
            androidx.appcompat.view.menu.h itemData = navigationMenuItemView.getItemData();
            boolean zQ = gVar.f4301d.q(itemData, gVar, 0);
            if (itemData != null && itemData.isCheckable() && zQ) {
                gVar.f4303f.b(itemData);
            } else {
                z10 = false;
            }
            c cVar2 = gVar.f4303f;
            if (cVar2 != null) {
                cVar2.f4326c = false;
            }
            if (z10) {
                gVar.i();
            }
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class b extends l {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class c extends RecyclerView.Adapter<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<e> f4324a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f4325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4326c;

        public c() {
            a();
        }

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
        public final void a() {
            boolean z10;
            if (this.f4326c) {
                return;
            }
            this.f4326c = true;
            ArrayList<e> arrayList = this.f4324a;
            arrayList.clear();
            arrayList.add(new d());
            g gVar = g.this;
            int size = gVar.f4301d.l().size();
            boolean z11 = false;
            int i10 = -1;
            int i11 = 0;
            boolean z12 = false;
            int size2 = 0;
            while (i11 < size) {
                androidx.appcompat.view.menu.h hVar = gVar.f4301d.l().get(i11);
                if (hVar.isChecked()) {
                    b(hVar);
                }
                if (hVar.isCheckable()) {
                    hVar.g(z11);
                }
                if (hVar.hasSubMenu()) {
                    androidx.appcompat.view.menu.m mVar = hVar.f8500o;
                    if (mVar.hasVisibleItems()) {
                        if (i11 != 0) {
                            arrayList.add(new f(gVar.f4296B, z11 ? 1 : 0));
                        }
                        arrayList.add(new C0061g(hVar));
                        int size3 = mVar.f8463f.size();
                        int i12 = z11 ? 1 : 0;
                        int i13 = i12;
                        while (i12 < size3) {
                            androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) mVar.getItem(i12);
                            if (hVar2.isVisible()) {
                                if (i13 == 0 && hVar2.getIcon() != null) {
                                    i13 = 1;
                                }
                                if (hVar2.isCheckable()) {
                                    hVar2.g(z11);
                                }
                                if (hVar.isChecked()) {
                                    b(hVar);
                                }
                                arrayList.add(new C0061g(hVar2));
                            }
                            i12++;
                            z11 = false;
                        }
                        if (i13 != 0) {
                            int size4 = arrayList.size();
                            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                                ((C0061g) arrayList.get(size5)).f4331b = true;
                            }
                        }
                    }
                    z10 = true;
                } else {
                    int i14 = hVar.f8488b;
                    if (i14 != i10) {
                        size2 = arrayList.size();
                        z12 = hVar.getIcon() != null;
                        if (i11 != 0) {
                            size2++;
                            int i15 = gVar.f4296B;
                            arrayList.add(new f(i15, i15));
                        }
                    } else {
                        if (!z12 && hVar.getIcon() != null) {
                            int size6 = arrayList.size();
                            for (int i16 = size2; i16 < size6; i16++) {
                                ((C0061g) arrayList.get(i16)).f4331b = true;
                            }
                            z10 = true;
                            z12 = true;
                        }
                        C0061g c0061g = new C0061g(hVar);
                        c0061g.f4331b = z12;
                        arrayList.add(c0061g);
                        i10 = i14;
                    }
                    z10 = true;
                    C0061g c0061g2 = new C0061g(hVar);
                    c0061g2.f4331b = z12;
                    arrayList.add(c0061g2);
                    i10 = i14;
                }
                i11++;
                z11 = false;
            }
            this.f4326c = z11 ? 1 : 0;
        }

        public final void b(androidx.appcompat.view.menu.h hVar) {
            if (this.f4325b == hVar || !hVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.h hVar2 = this.f4325b;
            if (hVar2 != null) {
                hVar2.setChecked(false);
            }
            this.f4325b = hVar;
            hVar.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f4324a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i10) {
            e eVar = this.f4324a.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof C0061g) {
                return ((C0061g) eVar).f4330a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.B b10, int i10) {
            l lVar = (l) b10;
            int itemViewType = getItemViewType(i10);
            ArrayList<e> arrayList = this.f4324a;
            g gVar = g.this;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) arrayList.get(i10);
                    lVar.itemView.setPadding(gVar.f4316t, fVar.f4328a, gVar.f4317u, fVar.f4329b);
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((C0061g) arrayList.get(i10)).f4330a.f8491e);
                textView.setTextAppearance(gVar.f4305h);
                textView.setPadding(gVar.f4318v, textView.getPaddingTop(), gVar.f4319w, textView.getPaddingBottom());
                ColorStateList colorStateList = gVar.f4306i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                O.n(textView, new K5.h(this, i10, true));
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(gVar.f4309m);
            navigationMenuItemView.setTextAppearance(gVar.j);
            ColorStateList colorStateList2 = gVar.f4308l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = gVar.f4310n;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            navigationMenuItemView.setBackground(drawableNewDrawable);
            RippleDrawable rippleDrawable = gVar.f4311o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            C0061g c0061g = (C0061g) arrayList.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(c0061g.f4331b);
            int i11 = gVar.f4312p;
            int i12 = gVar.f4313q;
            navigationMenuItemView.setPadding(i11, i12, i11, i12);
            navigationMenuItemView.setIconPadding(gVar.f4314r);
            if (gVar.f4320x) {
                navigationMenuItemView.setIconSize(gVar.f4315s);
            }
            navigationMenuItemView.setMaxLines(gVar.f4322z);
            navigationMenuItemView.f27252z = gVar.f4307k;
            navigationMenuItemView.d(c0061g.f4330a);
            O.n(navigationMenuItemView, new K5.h(this, i10, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
            RecyclerView.B iVar;
            g gVar = g.this;
            if (i10 == 0) {
                LayoutInflater layoutInflater = gVar.f4304g;
                a aVar = gVar.f4298D;
                iVar = new i(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
                iVar.itemView.setOnClickListener(aVar);
            } else if (i10 == 1) {
                iVar = new k(gVar.f4304g.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return new b(gVar.f4300c);
                }
                iVar = new j(gVar.f4304g.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
            }
            return iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.B b10) {
            l lVar = (l) b10;
            if (lVar instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f27243B;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f27242A.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class d implements e {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public interface e {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4329b;

        public f(int i10, int i11) {
            this.f4328a = i10;
            this.f4329b = i11;
        }
    }

    /* JADX INFO: renamed from: K5.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class C0061g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f4330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4331b;

        public C0061g(androidx.appcompat.view.menu.h hVar) {
            this.f4330a = hVar;
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public class h extends K {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.K, androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, B0.s sVar) {
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            c cVar = g.this.f4303f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                g gVar = g.this;
                if (i10 >= gVar.f4303f.f4324a.size()) {
                    AccessibilityNodeInfo.CollectionInfo collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(i11, 1, false);
                    sVar.getClass();
                    sVar.f1411a.setCollectionInfo(collectionInfoObtain);
                    return;
                } else {
                    int itemViewType = gVar.f4303f.getItemViewType(i10);
                    if (itemViewType == 0 || itemViewType == 1) {
                        i11++;
                    }
                    i10++;
                }
            }
        }
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class i extends l {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class j extends l {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static class k extends l {
    }

    /* JADX INFO: compiled from: NavigationMenuPresenter.java */
    public static abstract class l extends RecyclerView.B {
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean f(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f4304g = LayoutInflater.from(context);
        this.f4301d = fVar;
        this.f4296B = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f4302e;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        View actionView;
        K5.j jVar;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f4299b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f4303f;
                cVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                ArrayList<e> arrayList = cVar.f4324a;
                if (i10 != 0) {
                    cVar.f4326c = true;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        e eVar = arrayList.get(i11);
                        if (eVar instanceof C0061g) {
                            androidx.appcompat.view.menu.h hVar2 = ((C0061g) eVar).f4330a;
                            if (hVar2.f8487a == i10) {
                                cVar.b(hVar2);
                                break;
                            }
                        }
                    }
                    cVar.f4326c = false;
                    cVar.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        e eVar2 = arrayList.get(i12);
                        if ((eVar2 instanceof C0061g) && (actionView = (hVar = ((C0061g) eVar2).f4330a).getActionView()) != null && (jVar = (K5.j) sparseParcelableArray2.get(hVar.f8487a)) != null) {
                            actionView.restoreHierarchyState(jVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f4300c.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i() {
        c cVar = this.f4303f;
        if (cVar != null) {
            cVar.a();
            cVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        Bundle bundle = new Bundle();
        if (this.f4299b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f4299b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f4303f;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.h hVar = cVar.f4325b;
            if (hVar != null) {
                bundle2.putInt("android:menu:checked", hVar.f8487a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList<e> arrayList = cVar.f4324a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof C0061g) {
                    androidx.appcompat.view.menu.h hVar2 = ((C0061g) eVar).f4330a;
                    View actionView = hVar2 != null ? hVar2.getActionView() : null;
                    if (actionView != null) {
                        K5.j jVar = new K5.j();
                        actionView.saveHierarchyState(jVar);
                        sparseArray2.put(hVar2.f8487a, jVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f4300c != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f4300c.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
    }
}
