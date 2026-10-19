package p110i9;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.B;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseRecycleAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T, VH extends RecyclerView.B> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<T> f36779a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f36780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a<T> f36781c;

    /* JADX INFO: compiled from: BaseRecycleAdapter.java */
    public interface a<T> {
        void d(Object obj);
    }

    public c(Context context) {
        this.f36780b = context;
    }

    public final void a(T t8) {
        this.f36779a.add(t8);
        notifyItemChanged(this.f36779a.indexOf(t8));
    }

    public abstract void b(VH vh, T t8);

    public final void c(T t8) {
        int iIndexOf = this.f36779a.indexOf(t8);
        this.f36779a.remove(t8);
        notifyItemRemoved(iIndexOf);
        notifyItemRangeChanged(iIndexOf, this.f36779a.size());
    }

    public void d(List<T> list) {
        this.f36779a.clear();
        this.f36779a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f36779a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(final VH vh, int i10) {
        if (this.f36781c != null) {
            final T t8 = this.f36779a.get(i10);
            vh.itemView.setOnClickListener(new View.OnClickListener() { // from class: i9.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a<T> aVar = this.f36776b.f36781c;
                    View view2 = vh.itemView;
                    aVar.d(t8);
                }
            });
        }
        b(vh, this.f36779a.get(i10));
    }
}
