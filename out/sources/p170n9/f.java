package p170n9;

import W7.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.List;
import p110i9.y;
import p194p8.m;
import p208q9.a;

/* JADX INFO: compiled from: ControlUnitReadnessFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends BaseFragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f45002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ProgressBar f45003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OBDIICu f45004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y f45005o;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_readness, viewGroup, false);
        if (this.f45004n == null) {
            return viewInflate;
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.fragmentControlUnitReadness_title);
        this.f45002l = (RecyclerView) viewInflate.findViewById(R.id.fragmentControlUnitReadness_list);
        this.f45003m = (ProgressBar) viewInflate.findViewById(R.id.fragmentControlUnitReadness_progress);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        a aVar = new a(getContext(), linearLayoutManager.f19521p);
        aVar.f46180a = getResources().getDrawable(R.drawable.divider_content);
        aVar.f46181b = dimensionPixelSize;
        aVar.f46182c = dimensionPixelSize;
        this.f45002l.setLayoutManager(linearLayoutManager);
        this.f45002l.i(aVar);
        this.f45002l.setHasFixedSize(true);
        this.f45002l.setAdapter(this.f45005o);
        if (c.e()) {
            String strC = Texttabe.c("IDE00601");
            if (strC == null || strC.isEmpty()) {
                strC = "Monitoring status since erasing DTC memory";
            }
            textView.setText(strC);
        } else {
            r().o(false);
        }
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ControlUnitReadnessFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        this.f45005o = new y(getContext());
        UserTrackingUtils.c(UserTrackingUtils.Key.f34272q, 1);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        OBDIICu oBDIICu = this.f45004n;
        if (oBDIICu != null) {
            oBDIICu.f29320b.saveInBackgroundWithLogging();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f45003m.setVisibility(0);
        this.f45002l.setVisibility(8);
        MainActivity mainActivityQ = q();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        new m(this.f45004n, 1).b(com.voltasit.obdeleven.a.C0320a.a(mainActivityQ).i()).continueWithTask(new p009a8.c(8, this), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_readiness);
    }
}
