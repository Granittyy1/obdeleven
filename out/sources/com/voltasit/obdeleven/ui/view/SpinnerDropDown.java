package com.voltasit.obdeleven.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.List;
import p110i9.u;

/* JADX INFO: loaded from: classes3.dex */
public class SpinnerDropDown extends AppCompatSpinner {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f34209l;

    public SpinnerDropDown(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34208k = getContext().getString(R.string.common_select_value) + ":";
    }

    private void setupAdapter(List<String> list) {
        u uVar = new u(getContext(), android.R.layout.simple_spinner_dropdown_item, list);
        this.f34209l = uVar;
        uVar.setDropDownViewResource(R.layout.item_dropdown);
        setAdapter((SpinnerAdapter) this.f34209l);
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public int getCount() {
        u uVar = this.f34209l;
        if (uVar == null) {
            return 0;
        }
        return uVar.getCount();
    }

    public void setItems(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.size() > 1) {
            arrayList.add(this.f34208k);
            setEnabled(true);
            setClickable(true);
        } else {
            setEnabled(false);
            setClickable(false);
        }
        setupAdapter(arrayList);
    }

    public void setTitle(String str) {
        this.f34208k = str;
    }
}
