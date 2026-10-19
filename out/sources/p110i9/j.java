package p110i9;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: ListAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j<T> extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f36803b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f36804c;

    public j(Context context) {
        this.f36804c = context;
    }

    public abstract View b(T t8, View view, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36803b.size();
    }

    @Override // android.widget.Adapter
    public final T getItem(int i10) {
        return (T) this.f36803b.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        return b(this.f36803b.get(i10), view, viewGroup);
    }
}
