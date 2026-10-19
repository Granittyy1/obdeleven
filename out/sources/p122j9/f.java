package p122j9;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LabelLanguageAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41184b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f41185c;

    /* JADX INFO: compiled from: LabelLanguageAdapter.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f41186a;
    }

    public f(Context context) {
        this.f41185c = context;
    }

    public final void b(List list) {
        this.f41184b.addAll(list);
        notifyDataSetChanged();
    }

    public final void c() {
        this.f41184b.clear();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final DatabaseLanguage getItem(int i10) {
        return (DatabaseLanguage) this.f41184b.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f41184b.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        LayoutInflater layoutInflater = (LayoutInflater) this.f41185c.getSystemService("layout_inflater");
        if (view != null) {
            aVar = (a) view.getTag();
        } else {
            view = layoutInflater.inflate(R.layout.simple_spinner_dropdown_item, viewGroup, false);
            aVar = new a();
            aVar.f41186a = (TextView) view;
            view.setTag(aVar);
        }
        aVar.f41186a.setText(getItem(i10).d());
        return view;
    }
}
