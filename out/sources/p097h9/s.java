package p097h9;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import java.util.ArrayList;

/* JADX INFO: compiled from: ManualEditorLanguageAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends ArrayAdapter<ApplicationLanguage> implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f36238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<ApplicationLanguage> f36239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ApplicationLanguage f36240d;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ApplicationLanguage getItem(int i10) {
        return this.f36239c.get(i10 == 0 ? 0 : i10 - 1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f36239c.size() + 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) LayoutInflater.from(this.f36238b).inflate(R.layout.simple_spinner_dropdown_item, viewGroup, false);
        if (i10 != 0 || textView.getLayoutParams() == null) {
            textView.setVisibility(0);
            textView.setText(getItem(i10).g());
        } else {
            textView.setPadding(0, 0, 0, 0);
            textView.setHeight(0);
            textView.getLayoutParams().height = 0;
        }
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f36238b).inflate(com.voltasit.obdeleven.R.layout.manual_editor_spinner, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(com.voltasit.obdeleven.R.id.manualEditorSpinner_text);
        if (i10 == 0) {
            textView.setText(com.voltasit.obdeleven.R.string.view_manual_editor_select_language);
        } else {
            textView.setText(getItem(i10).g());
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
        if (i10 == 0) {
            return;
        }
        this.f36240d = getItem(i10);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
