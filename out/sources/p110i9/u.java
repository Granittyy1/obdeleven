package p110i9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: SpinnerHintAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends ArrayAdapter<String> {
    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (i10 != getCount() - 1) {
            return super.getDropDownView(i10, null, viewGroup);
        }
        TextView textView = new TextView(getContext());
        textView.setVisibility(8);
        textView.setHeight(0);
        return textView;
    }
}
