package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import B8.AbstractC0613a0;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel;
import com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog;
import com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.parse.model.HistoryDB;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31814c;

    public /* synthetic */ i(BaseFragment baseFragment, int i10) {
        this.f31813b = i10;
        this.f31814c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31813b) {
            case 0:
                ((q) this.f31814c).Y();
                break;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f31814c;
                hVar.getClass();
                new SfdAutoUnlockDialog().v(hVar.getChildFragmentManager(), "SfdAutoUnlockDialog");
                break;
            case 2:
                OnlineControlUnitListViewModel.a aVar = (OnlineControlUnitListViewModel.a) obj;
                OnlineControlUnitListFragment this$0 = (OnlineControlUnitListFragment) this.f31814c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                AbstractC0613a0 abstractC0613a0U = this$0.U();
                RecyclerView.B bJ = abstractC0613a0U.f1855s.J(aVar.f32104b);
                if (bJ != null) {
                    View itemView = bJ.itemView;
                    kotlin.jvm.internal.i.d(itemView, "itemView");
                    OnlineControlUnitFragment onlineControlUnitFragment = new OnlineControlUnitFragment();
                    Bundle bundle = new Bundle();
                    onlineControlUnitFragment.f31429o = aVar.f32103a;
                    onlineControlUnitFragment.setArguments(bundle);
                    this$0.W(itemView, onlineControlUnitFragment);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                VehicleHistoryChildrenFragment this$1 = (VehicleHistoryChildrenFragment) this.f31814c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                Collections.sort(list, new HistoryDB.a());
                com.voltasit.obdeleven.presentation.history.k kVar = this$1.f32423l;
                kotlin.jvm.internal.i.b(kVar);
                kVar.b(list);
                break;
        }
    }
}
