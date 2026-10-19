package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: MenuAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8452c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f8455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8456g;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f8454e = z10;
        this.f8455f = layoutInflater;
        this.f8451b = fVar;
        this.f8456g = i10;
        b();
    }

    public final void b() {
        f fVar = this.f8451b;
        h hVar = fVar.f8478v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == hVar) {
                    this.f8452c = i10;
                    return;
                }
            }
        }
        this.f8452c = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h getItem(int i10) {
        ArrayList<h> arrayListL;
        f fVar = this.f8451b;
        if (this.f8454e) {
            fVar.i();
            arrayListL = fVar.j;
        } else {
            arrayListL = fVar.l();
        }
        int i11 = this.f8452c;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> arrayListL;
        f fVar = this.f8451b;
        if (this.f8454e) {
            fVar.i();
            arrayListL = fVar.j;
        } else {
            arrayListL = fVar.l();
        }
        return this.f8452c < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f8455f.inflate(this.f8456g, viewGroup, false);
        }
        int i11 = getItem(i10).f8488b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f8488b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f8451b.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f8453d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
