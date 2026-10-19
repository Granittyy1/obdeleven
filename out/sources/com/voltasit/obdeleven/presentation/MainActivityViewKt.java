package com.voltasit.obdeleven.presentation;

import Ia.p;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.X;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice.BadBluetoothDeviceSelectedDialogKt;
import com.voltasit.obdeleven.presentation.dialogs.checkIgnition.CheckIgnitionDialogKt;
import com.voltasit.obdeleven.ui.activity.MainActivityViewModel;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: MainActivityView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MainActivityViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final MainActivityViewModel viewModel, InterfaceC1084f interfaceC1084f, final int i10) {
        i.e(viewModel, "viewModel");
        C1086g c1086gP = interfaceC1084f.p(391463777);
        Boolean bool = Boolean.FALSE;
        X xA = androidx.compose.runtime.livedata.b.a(viewModel.f33658w0, bool, c1086gP);
        c1086gP.L(1060033785);
        if (((Boolean) xA.getValue()).booleanValue()) {
            CheckIgnitionDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.MainActivityViewKt$MainActivityView$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    viewModel.h(DialogCallback.CallbackType.f31102c);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.MainActivityViewKt$MainActivityView$2
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    viewModel.h(DialogCallback.CallbackType.f31103d);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.MainActivityViewKt$MainActivityView$3
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    viewModel.h(DialogCallback.CallbackType.f31104e);
                    return r.f47939a;
                }
            }, c1086gP, 0);
        }
        c1086gP.T(false);
        if (((Boolean) androidx.compose.runtime.livedata.b.a(viewModel.f33593I0, bool, c1086gP).getValue()).booleanValue()) {
            BadBluetoothDeviceSelectedDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.MainActivityViewKt$MainActivityView$4
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    MainActivityViewModel mainActivityViewModel = viewModel;
                    mainActivityViewModel.f33591H0.j(Boolean.FALSE);
                    W7.c.g(0);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.MainActivityViewKt$MainActivityView$5
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    MainActivityViewModel mainActivityViewModel = viewModel;
                    mainActivityViewModel.f33591H0.j(Boolean.FALSE);
                    W7.c.g(0);
                    return r.f47939a;
                }
            }, c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.MainActivityViewKt$MainActivityView$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    MainActivityViewKt.a(viewModel, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
