package com.voltasit.obdeleven.presentation.deviceupdate;

import B8.M;
import Ia.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.dialogs.e;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: UpdateDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UpdateDialog extends e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MainActivity f32150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final IDevice f32151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f32152u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f32153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f32154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public M f32155x;

    /* JADX INFO: compiled from: UpdateDialog.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32156b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f32156b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f32156b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32156b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f32156b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f32156b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.voltasit.obdeleven.presentation.deviceupdate.UpdateDialog$special$$inlined$viewModel$default$1] */
    public UpdateDialog(MainActivity activity, IDevice device, int i10) {
        i.e(activity, "activity");
        i.e(device, "device");
        this.f32150s = activity;
        this.f32151t = device;
        this.f32152u = i10;
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.deviceupdate.UpdateDialog$special$$inlined$viewModel$default$1
            final /* synthetic */ Fragment $this_viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_viewModel;
            }
        };
        this.f32153v = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<DeviceUpdateViewModel>(this) { // from class: com.voltasit.obdeleven.presentation.deviceupdate.UpdateDialog$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.deviceupdate.DeviceUpdateViewModel] */
            @Override // Ia.a
            public final DeviceUpdateViewModel invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(DeviceUpdateViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
        this.f32154w = new TaskCompletionSource<>();
    }

    public final void B() {
        M m7 = this.f32155x;
        if (m7 == null) {
            i.m("binding");
            throw null;
        }
        m7.f1752v.setVisibility(8);
        M m10 = this.f32155x;
        if (m10 == null) {
            i.m("binding");
            throw null;
        }
        m10.f1748r.setVisibility(0);
        M m11 = this.f32155x;
        if (m11 == null) {
            i.m("binding");
            throw null;
        }
        m11.f1749s.setEnabled(true);
        s(true);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, xa.g] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        int i10 = M.f1747w;
        M m7 = (M) M0.e.a(inflater, R.layout.dialog_update, null, false, null);
        i.d(m7, "inflate(...)");
        this.f32155x = m7;
        m7.f1752v.getIndeterminateDrawable().setColorFilter(-14575885, PorterDuff.Mode.SRC_IN);
        Dialog dialog = this.f17606m;
        if (dialog != null) {
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.voltasit.obdeleven.presentation.deviceupdate.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    UpdateDialog this$0 = this.f32159b;
                    i.e(this$0, "this$0");
                    this$0.f32154w.setResult(Boolean.FALSE);
                }
            });
        }
        M m10 = this.f32155x;
        if (m10 == null) {
            i.m("binding");
            throw null;
        }
        m10.f1749s.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.deviceupdate.b
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateDialog this$0 = this.f32160b;
                i.e(this$0, "this$0");
                DeviceUpdateViewModel deviceUpdateViewModel = (DeviceUpdateViewModel) this$0.f32153v.getValue();
                deviceUpdateViewModel.getClass();
                IDevice device = this$0.f32151t;
                i.e(device, "device");
                DeviceUpdateViewModel.State state = (DeviceUpdateViewModel.State) deviceUpdateViewModel.f32140t.d();
                if (state == null) {
                    return;
                }
                int iOrdinal = state.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        r rVar = r.f47939a;
                    } else if (iOrdinal == 2) {
                        C2680e.c(Z.a(deviceUpdateViewModel), null, null, new DeviceUpdateViewModel$forceFwUpdate$1(deviceUpdateViewModel, null), 3);
                        r rVar2 = r.f47939a;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C2680e.c(Z.a(deviceUpdateViewModel), N.f43198a, null, new DeviceUpdateViewModel$runUpdates$1(deviceUpdateViewModel, this$0.f32152u, device, null), 2);
                        r rVar3 = r.f47939a;
                    } else {
                        deviceUpdateViewModel.f32141u.j(Boolean.valueOf(deviceUpdateViewModel.f32139s.d() == DeviceUpdateViewModel.State.f32147e));
                        r rVar4 = r.f47939a;
                    }
                } else {
                    C2680e.c(Z.a(deviceUpdateViewModel), N.f43198a, null, new DeviceUpdateViewModel$runUpdates$1(deviceUpdateViewModel, this$0.f32152u, device, null), 2);
                    r rVar5 = r.f47939a;
                }
                Na.i iVar = E8.a.f3126a;
            }
        });
        ?? r10 = this.f32153v;
        U7.a<Boolean> aVar = ((DeviceUpdateViewModel) r10.getValue()).f32142v;
        InterfaceC1376t viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVar.e(viewLifecycleOwner, new a(new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.deviceupdate.UpdateDialog$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                this.this$0.f32154w.setResult(bool2);
                this.this$0.y();
                return r.f47939a;
            }
        }));
        ((DeviceUpdateViewModel) r10.getValue()).f32140t.e(getViewLifecycleOwner(), new a(new l<DeviceUpdateViewModel.State, r>() { // from class: com.voltasit.obdeleven.presentation.deviceupdate.UpdateDialog$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(DeviceUpdateViewModel.State state) {
                DeviceUpdateViewModel.State state2 = state;
                if (state2 != null) {
                    int iOrdinal = state2.ordinal();
                    if (iOrdinal == 0) {
                        this.this$0.getClass();
                        r rVar = r.f47939a;
                    } else if (iOrdinal == 1) {
                        UpdateDialog updateDialog = this.this$0;
                        M m11 = updateDialog.f32155x;
                        if (m11 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m11.f1748r.setVisibility(8);
                        M m12 = updateDialog.f32155x;
                        if (m12 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m12.f1752v.setVisibility(0);
                        M m13 = updateDialog.f32155x;
                        if (m13 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m13.f1750t.setText(R.string.dialog_device_update_requirements);
                        M m14 = updateDialog.f32155x;
                        if (m14 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m14.f1749s.setText(R.string.common_updating);
                        M m15 = updateDialog.f32155x;
                        if (m15 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m15.f1749s.setEnabled(false);
                        updateDialog.s(false);
                        r rVar2 = r.f47939a;
                    } else if (iOrdinal == 2) {
                        UpdateDialog updateDialog2 = this.this$0;
                        updateDialog2.B();
                        M m16 = updateDialog2.f32155x;
                        if (m16 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m16.f1750t.setText(R.string.view_device_update_force_firmware_update);
                        M m17 = updateDialog2.f32155x;
                        if (m17 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m17.f1749s.setText(R.string.try_again);
                        r rVar3 = r.f47939a;
                    } else if (iOrdinal == 3) {
                        UpdateDialog updateDialog3 = this.this$0;
                        updateDialog3.B();
                        M m18 = updateDialog3.f32155x;
                        if (m18 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m18.f1750t.setText(R.string.success);
                        M m19 = updateDialog3.f32155x;
                        if (m19 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m19.f1749s.setText(R.string.common_ok);
                        r rVar4 = r.f47939a;
                    } else {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        UpdateDialog updateDialog4 = this.this$0;
                        updateDialog4.B();
                        M m20 = updateDialog4.f32155x;
                        if (m20 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m20.f1750t.setText(R.string.common_network_connection_required);
                        M m21 = updateDialog4.f32155x;
                        if (m21 == null) {
                            i.m("binding");
                            throw null;
                        }
                        m21.f1749s.setText(R.string.common_try_again);
                        r rVar5 = r.f47939a;
                    }
                    Na.i iVar = E8.a.f3126a;
                }
                return r.f47939a;
            }
        }));
        M m11 = this.f32155x;
        if (m11 == null) {
            i.m("binding");
            throw null;
        }
        View view = m11.f4488d;
        i.d(view, "getRoot(...)");
        return view;
    }
}
