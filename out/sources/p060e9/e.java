package p060e9;

import W7.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.ViewOnClickListenerC2143f;
import p073f9.g;

/* JADX INFO: compiled from: ControlUnitChartListFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends g {
    @Override // p073f9.g, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewB = super.B(layoutInflater, viewGroup, bundle);
        FloatingActionButton floatingActionButton = (FloatingActionButton) viewB.findViewById(R.id.charts_fab);
        if (c.e()) {
            floatingActionButton.n();
            floatingActionButton.setOnClickListener(new ViewOnClickListenerC2143f(1, this));
        }
        return viewB;
    }
}
