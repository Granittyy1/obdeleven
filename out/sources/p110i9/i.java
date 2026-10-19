package p110i9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC1347l;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;

/* JADX INFO: compiled from: LanguageSpinnerAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityC1347l f36800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DatabaseLanguage[] f36801c;

    /* JADX INFO: compiled from: LanguageSpinnerAdapter.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f36802a;
    }

    public i(ActivityC1347l activityC1347l, DatabaseLanguage[] databaseLanguageArr) {
        this.f36800b = activityC1347l;
        this.f36801c = databaseLanguageArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36801c.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.f36801c[i10];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        LayoutInflater layoutInflater = (LayoutInflater) this.f36800b.getSystemService("layout_inflater");
        if (view != null) {
            aVar = (a) view.getTag();
        } else {
            view = layoutInflater.inflate(R.layout.list_flag_item, viewGroup, false);
            aVar = new a();
            aVar.f36802a = (ImageView) view.findViewById(R.id.languageSpinnerAdapter_flag);
            view.setTag(aVar);
        }
        aVar.f36802a.setImageResource(this.f36801c[i10].c());
        return view;
    }
}
