package com.voltasit.obdeleven.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSpinner;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.List;
import p110i9.u;

/* JADX INFO: loaded from: classes3.dex */
public class AppSpinnerDropDown extends AppCompatSpinner {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f34141l;

    public AppSpinnerDropDown(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34140k = getContext().getString(R.string.common_select_value) + ":";
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public int getCount() {
        u uVar = this.f34141l;
        if (uVar == null) {
            return 0;
        }
        return uVar.getCount();
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCount() == 1) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setItems(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.size() > 1) {
            arrayList.add(this.f34140k);
            setEnabled(true);
            setClickable(true);
        } else {
            setEnabled(false);
            setClickable(false);
        }
        this.f34141l.clear();
        this.f34141l.addAll(arrayList);
    }

    public void setTitle(String str) {
        this.f34140k = str;
    }
}
