package p110i9;

import Q6.d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.B;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: HeaderFooterAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h<T, VH extends RecyclerView.B> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<T> f36795b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f36796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f36797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f36799f;

    /* JADX INFO: compiled from: HeaderFooterAdapter.java */
    public static class a extends RecyclerView.B {
    }

    /* JADX INFO: compiled from: HeaderFooterAdapter.java */
    public static class b extends RecyclerView.B {
    }

    public h(Context context) {
        this.f36794a = context;
    }

    public final void a(T t8) {
        this.f36795b.add(t8);
        notifyDataSetChanged();
    }

    public void b(List<T> list) {
        if (this.f36795b.isEmpty()) {
            this.f36795b = new ArrayList(list);
            notifyDataSetChanged();
        } else {
            int size = this.f36795b.size() + 1;
            this.f36795b.addAll(list);
            notifyItemRangeInserted(size, list.size());
        }
    }

    public abstract void c(VH vh, int i10);

    public final void d() {
        notifyItemRangeRemoved(1, this.f36795b.size() + 2);
        this.f36795b = new ArrayList();
    }

    public abstract VH e(ViewGroup viewGroup, LayoutInflater layoutInflater);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f36795b.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        if (i10 == 0) {
            return 3;
        }
        return (i10 >= this.f36795b.size() + 1 || this.f36795b.isEmpty()) ? 2 : 1;
    }

    public final void h(View view) {
        this.f36797d = view;
        notifyItemChanged(this.f36795b.size() + 1);
    }

    public final void i(View view) {
        this.f36796c = view;
        this.f36798e = view != null;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(VH vh, int i10) {
        if (!(vh instanceof a)) {
            if (vh instanceof b) {
                j(this.f36796c);
                return;
            }
            int i11 = i10 - (this.f36798e ? 1 : 0);
            if (i11 >= this.f36795b.size()) {
                return;
            }
            if (this.f36799f != null) {
                vh.itemView.setOnClickListener(new e(i11, 1, this));
            }
            c(vh, i11);
            return;
        }
        if (i10 >= this.f36795b.size() + 1 || this.f36795b.isEmpty()) {
            View view = this.f36797d;
            if (view == null || view.getParent() != vh.itemView) {
                ((LinearLayout) vh.itemView).removeAllViews();
                View view2 = this.f36797d;
                if (view2 == null) {
                    return;
                }
                if (view2.getParent() != null) {
                    ((ViewGroup) this.f36797d.getParent()).removeView(this.f36797d);
                }
                ((LinearLayout) vh.itemView).addView(this.f36797d);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final VH onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.f36794a;
        if (i10 == 3) {
            View view2 = this.f36796c;
            if (view2 != null) {
                if (view2.getParent() != null) {
                    ((ViewGroup) this.f36796c.getParent()).removeView(this.f36796c);
                }
                view = this.f36796c;
            } else {
                view = new View(context);
            }
            this.f36798e = true;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            }
            return new b(view);
        }
        if (i10 != 2) {
            return (VH) e(viewGroup, LayoutInflater.from(context));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View view3 = this.f36797d;
        if (view3 != null) {
            if (view3.getParent() != null) {
                ((ViewGroup) this.f36797d.getParent()).removeView(this.f36797d);
            }
            linearLayout.addView(this.f36797d, -1, -2);
        }
        return new a(linearLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        if ((b10 instanceof b) || (b10 instanceof a)) {
            return;
        }
        f(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        if ((b10 instanceof b) || (b10 instanceof a)) {
            return;
        }
        g(b10);
    }

    public void f(VH vh) {
    }

    public void g(VH vh) {
    }

    public void j(View view) {
    }
}
