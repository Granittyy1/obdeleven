package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: ListMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f8443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f8444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f8445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExpandedMenuView f8446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j.a f8447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f8448g;

    /* JADX INFO: compiled from: ListMenuPresenter.java */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8449b = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f8445d;
            h hVar = fVar.f8478v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == hVar) {
                        this.f8449b = i10;
                        return;
                    }
                }
            }
            this.f8449b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i10) {
            d dVar = d.this;
            f fVar = dVar.f8445d;
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            dVar.getClass();
            int i11 = this.f8449b;
            if (i11 >= 0 && i10 >= i11) {
                i10++;
            }
            return arrayList.get(i10);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f8445d;
            fVar.i();
            int size = fVar.j.size();
            dVar.getClass();
            return this.f8449b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f8444c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).d(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f8443b = context;
        this.f8444c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        j.a aVar = this.f8447f;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(j.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean f(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g(Context context, f fVar) {
        if (this.f8443b != null) {
            this.f8443b = context;
            if (this.f8444c == null) {
                this.f8444c = LayoutInflater.from(context);
            }
        }
        this.f8445d = fVar;
        a aVar = this.f8448g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f8446e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i() {
        a aVar = this.f8448g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g();
        gVar.f8481b = mVar;
        Context context = mVar.f8458a;
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
        d dVar = new d(aVar.getContext());
        gVar.f8483d = dVar;
        dVar.f8447f = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f8483d;
        if (dVar2.f8448g == null) {
            dVar2.f8448g = dVar2.new a();
        }
        aVar.setAdapter(dVar2.f8448g, gVar);
        View view = mVar.f8471o;
        if (view != null) {
            aVar.setCustomTitle(view);
        } else {
            aVar.setIcon(mVar.f8470n).setTitle(mVar.f8469m);
        }
        aVar.setOnKeyListener(gVar);
        androidx.appcompat.app.e eVarCreate = aVar.create();
        gVar.f8482c = eVarCreate;
        eVarCreate.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f8482c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f8482c.show();
        j.a aVar2 = this.f8447f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.d(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        if (this.f8446e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f8446e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        this.f8445d.q(this.f8448g.getItem(i10), this, 0);
    }
}
