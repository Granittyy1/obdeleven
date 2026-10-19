package com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet;

import B8.AbstractC0621d;
import Ia.l;
import M0.h;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.C1452q;
import com.google.android.material.bottomsheet.b;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2157m;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import p110i9.o;
import p220r9.A;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: DeviceSelectionSheet.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceSelectionSheet extends C2157m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0621d f33916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f33917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f33918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f33919v;

    /* JADX INFO: compiled from: DeviceSelectionSheet.kt */
    public interface a {
        void a(Q8.b bVar);

        void onCancel();
    }

    /* JADX INFO: compiled from: DeviceSelectionSheet.kt */
    public static final class b implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f33920b;

        public b(l lVar) {
            this.f33920b = lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33920b;
        }

        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33920b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33920b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33920b.hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet$special$$inlined$viewModel$default$1] */
    public DeviceSelectionSheet() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet$special$$inlined$viewModel$default$1
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
        this.f33919v = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<DeviceSelectionViewModel>(this) { // from class: com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionViewModel] */
            @Override // Ia.a
            public final DeviceSelectionViewModel invoke() {
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
                return Gb.a.a(kotlin.jvm.internal.l.a(DeviceSelectionViewModel.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        i.e(dialog, "dialog");
        x().b();
        a aVar = this.f33918u;
        if (aVar != null) {
            i.b(aVar);
            aVar.onCancel();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(inflater, "inflater");
        h hVarA = M0.e.a(inflater, R.layout.bottom_sheet_device_selection, viewGroup, false, null);
        i.d(hVarA, "inflate(...)");
        this.f33916s = (AbstractC0621d) hVarA;
        x().f33925s.e(getViewLifecycleOwner(), new b(new l<List<? extends Q8.b>, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet.onCreateView.1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(List<? extends Q8.b> list) {
                o oVar = DeviceSelectionSheet.this.f33917t;
                i.b(oVar);
                oVar.f36779a = list;
                oVar.notifyDataSetChanged();
                return r.f47939a;
            }
        }));
        DeviceSelectionViewModel deviceSelectionViewModelX = x();
        deviceSelectionViewModelX.f33922p.f("DeviceSelectionViewModel", "startScan()");
        deviceSelectionViewModelX.f33921o.f();
        o oVar = new o(requireContext());
        this.f33917t = oVar;
        AbstractC0621d abstractC0621d = this.f33916s;
        if (abstractC0621d == null) {
            i.m("binding");
            throw null;
        }
        abstractC0621d.f1886r.setAdapter(oVar);
        AbstractC0621d abstractC0621d2 = this.f33916s;
        if (abstractC0621d2 == null) {
            i.m("binding");
            throw null;
        }
        A.b(abstractC0621d2.f1886r);
        AbstractC0621d abstractC0621d3 = this.f33916s;
        if (abstractC0621d3 == null) {
            i.m("binding");
            throw null;
        }
        abstractC0621d3.f1886r.i(new C1452q(getContext(), 1));
        o oVar2 = this.f33917t;
        i.b(oVar2);
        oVar2.f36781c = new androidx.compose.ui.graphics.colorspace.r(this);
        Dialog dialog = this.f17606m;
        i.b(dialog);
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialog2) {
                DeviceSelectionSheet this$0 = this.f33928b;
                i.e(this$0, "this$0");
                i.e(dialog2, "dialog");
                b bVar = (b) dialog2;
                if (bVar.getWindow() == null) {
                    return;
                }
                Window window = bVar.getWindow();
                i.b(window);
                View decorView = window.getDecorView();
                i.d(decorView, "getDecorView(...)");
                ObjectAnimator.ofFloat(decorView, "translationY", decorView.getHeight(), 0.0f).start();
            }
        });
        AbstractC0621d abstractC0621d4 = this.f33916s;
        if (abstractC0621d4 == null) {
            i.m("binding");
            throw null;
        }
        View view = abstractC0621d4.f4488d;
        i.d(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        o oVar = this.f33917t;
        if (oVar != null) {
            i.b(oVar);
            oVar.f36781c = null;
        }
        AbstractC0621d abstractC0621d = this.f33916s;
        if (abstractC0621d == null) {
            i.m("binding");
            throw null;
        }
        abstractC0621d.f1886r.setAdapter(null);
        x().b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final DeviceSelectionViewModel x() {
        return (DeviceSelectionViewModel) this.f33919v.getValue();
    }
}
