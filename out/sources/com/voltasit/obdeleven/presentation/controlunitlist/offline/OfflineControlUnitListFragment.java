package com.voltasit.obdeleven.presentation.controlunitlist.offline;

import B8.AbstractC0613a0;
import I.e;
import X8.f;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment;
import com.voltasit.obdeleven.presentation.controlunitlist.h;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.C2680e;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import p293xa.r;

/* JADX INFO: compiled from: OfflineControlUnitListFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OfflineControlUnitListFragment extends ControlUnitListFragment {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f32043r;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment$special$$inlined$stateViewModel$default$1] */
    public OfflineControlUnitListFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment$viewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return e.j(this.this$0.requireArguments().getString("vehicleId", ""));
            }
        };
        final Ia.a<Bundle> aVarA = ScopeExtKt.a();
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment$special$$inlined$stateViewModel$default$1
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_stateViewModel;
            }
        };
        this.f32043r = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<a>(this) { // from class: com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment$special$$inlined$stateViewModel$default$2
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Fragment $this_stateViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_stateViewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlunitlist.offline.a] */
            @Override // Ia.a
            public final a invoke() {
                Fragment fragment = this.$this_stateViewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = aVarA;
                Ia.a aVar4 = r10;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar4.invoke()).getViewModelStore();
                p014b1.a aVarA2 = Hb.a.a((Bundle) aVar3.invoke(), fragment);
                if (aVarA2 == null) {
                    aVarA2 = fragment.getDefaultViewModelCreationExtras();
                    i.d(aVarA2, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(l.a(a.class), viewModelStore, null, aVarA2, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment
    public final h V() {
        return (a) this.f32043r.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.presentation.controlunitlist.ControlUnitListFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: X */
    public final void C(AbstractC0613a0 abstractC0613a0) {
        super.C(abstractC0613a0);
        abstractC0613a0.f1856t.setEnabled(false);
        ?? r10 = this.f32043r;
        ((a) r10.getValue()).f32055z.e(getViewLifecycleOwner(), new f(this, 3));
        ((a) r10.getValue()).f32053x.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.f(this, 1));
        ((a) r10.getValue()).f32045B.e(getViewLifecycleOwner(), new X8.h(this, 2));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        if (dialogId.equals("TryAgainDialog")) {
            a aVar = (a) this.f32043r.getValue();
            aVar.getClass();
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                C2680e.c(Z.a(aVar), aVar.f32112a, null, new OfflineControlUnitListViewModel$requestControlUnits$1(aVar, null), 2);
            } else if (callbackType == DialogCallback.CallbackType.f31101b) {
                aVar.f32052w.j(r.f47939a);
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        i.e(menu, "menu");
        i.e(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.offline_sort_control_units, menu);
    }
}
