package p147l9;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.presentation.history.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: FilterTypeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f44469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f44470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<HistoryTypeFilter> f44471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<HistoryTypeFilter> f44472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f44473f;

    public final ArrayList<HistoryTypeFilter> b() {
        ArrayList<HistoryTypeFilter> arrayList = this.f44471d;
        arrayList.clear();
        for (HistoryTypeFilter historyTypeFilter : this.f44469b) {
            if (historyTypeFilter.h()) {
                arrayList.add(historyTypeFilter);
            }
        }
        return arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f44469b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.f44469b.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        final HistoryTypeFilter historyTypeFilter = (HistoryTypeFilter) this.f44469b.get(i10);
        Activity activity = this.f44470c;
        if (view == null) {
            view = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(historyTypeFilter.h() ? R.layout.list_checked_textview : R.layout.list_unchecked_textview, viewGroup, false);
        }
        ((ListView) viewGroup).setItemChecked(i10, historyTypeFilter.h());
        final AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) view;
        appCompatCheckedTextView.setText(activity.getString(historyTypeFilter.e()));
        appCompatCheckedTextView.setOnClickListener(new View.OnClickListener() { // from class: l9.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b bVar = this.f44466b;
                bVar.getClass();
                HistoryTypeFilter historyTypeFilter2 = historyTypeFilter;
                historyTypeFilter2.i(!historyTypeFilter2.h());
                appCompatCheckedTextView.setChecked(historyTypeFilter2.h());
                c cVar = bVar.f44473f;
                cVar.f32420b.setText(cVar.f32419a.f32394h.b().size() == 0 ? cVar.f32421c : cVar.f32422d);
            }
        });
        return appCompatCheckedTextView;
    }
}
