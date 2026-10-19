package p110i9;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.util.List;

/* JADX INFO: compiled from: ChartDialogAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainActivity f36788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ILineDataSet> f36789c;

    public f(MainActivity mainActivity, List list) {
        this.f36788b = mainActivity;
        this.f36789c = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f36789c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.f36789c.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        final FloatingEditText floatingEditText;
        LayoutInflater layoutInflater = (LayoutInflater) this.f36788b.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            throw new IllegalStateException("Unable to get layout inflate");
        }
        if (view != null) {
            floatingEditText = (FloatingEditText) view.getTag();
        } else {
            view = layoutInflater.inflate(R.layout.item_chart_label, viewGroup, false);
            floatingEditText = (FloatingEditText) view.findViewById(R.id.itemChartLabel_label);
            view.setTag(floatingEditText);
        }
        ILineDataSet iLineDataSet = this.f36789c.get(i10);
        String label = iLineDataSet.getLabel();
        int color = iLineDataSet.getColor();
        final a aVar = new a(iLineDataSet);
        floatingEditText.setText(label);
        floatingEditText.setSelection(label.length());
        floatingEditText.setTextColor(color);
        floatingEditText.setNormalColor(color);
        floatingEditText.setHighlightedColor(color);
        floatingEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: i9.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                FloatingEditText floatingEditText2 = floatingEditText;
                f.a aVar2 = aVar;
                if (z10) {
                    floatingEditText2.addTextChangedListener(aVar2);
                } else {
                    floatingEditText2.removeTextChangedListener(aVar2);
                }
            }
        });
        return view;
    }

    /* JADX INFO: compiled from: ChartDialogAdapter.java */
    public class a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ILineDataSet f36790b;

        public a(ILineDataSet iLineDataSet) {
            this.f36790b = iLineDataSet;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f36790b.setLabel(String.valueOf(charSequence));
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
