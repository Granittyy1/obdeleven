package p073f9;

import B8.AbstractC0660x;
import X5.z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.braze.ui.inappmessage.factories.b;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.dialogs.e;
import p110i9.f;

/* JADX INFO: compiled from: ChartSaveDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class h extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0660x f35049s;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC0660x abstractC0660x = (AbstractC0660x) M0.e.a(layoutInflater, R.layout.dialog_chart_save, null, false, null);
        this.f35049s = abstractC0660x;
        abstractC0660x.f2184u.setText(R.string.common_save);
        this.f35049s.f2183t.setText(R.string.common_cancel);
        b bVar = (b) getTargetFragment();
        this.f35049s.f2182s.setAdapter((ListAdapter) new f(z(), bVar.f35005l.getLineData().getDataSets()));
        if (bVar.f35007n.getAdapter() != null) {
            bVar.f35007n.getAdapter().notifyDataSetChanged();
        }
        this.f35049s.f2184u.setOnClickListener(new z(2, this));
        this.f35049s.f2183t.setOnClickListener(new b(2, this));
        return this.f35049s.f4488d;
    }
}
