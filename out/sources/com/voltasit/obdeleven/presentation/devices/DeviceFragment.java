package com.voltasit.obdeleven.presentation.devices;

import B8.AbstractC0637l;
import J8.c;
import J8.o;
import M0.h;
import Q8.b;
import X5.p;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.media3.exoplayer.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p110i9.d;
import p220r9.A;
import p220r9.O;
import p220r9.P;
import p293xa.r;

/* JADX INFO: compiled from: DeviceFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceFragment extends BaseFragment<AbstractC0637l> implements DialogCallback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC0637l f32127m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f32129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f32130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f32131q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f32126l = "DeviceFragment";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f32128n = R.layout.device_fragment;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.voltasit.obdeleven.presentation.devices.DeviceFragment$special$$inlined$viewModel$default$1] */
    public DeviceFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42971b;
        this.f32129o = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<o>(this) { // from class: com.voltasit.obdeleven.presentation.devices.DeviceFragment$special$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [J8.o, java.lang.Object] */
            @Override // Ia.a
            public final o invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, l.a(o.class));
            }
        });
        this.f32130p = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<c>(this) { // from class: com.voltasit.obdeleven.presentation.devices.DeviceFragment$special$$inlined$inject$default$2
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [J8.c, java.lang.Object] */
            @Override // Ia.a
            public final c invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, l.a(c.class));
            }
        });
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.devices.DeviceFragment$special$$inlined$viewModel$default$1
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
        this.f32131q = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<a>(this) { // from class: com.voltasit.obdeleven.presentation.devices.DeviceFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.devices.a] */
            @Override // Ia.a
            public final a invoke() {
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
                return Gb.a.a(l.a(a.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(h hVar) {
        AbstractC0637l abstractC0637l = (AbstractC0637l) hVar;
        this.f32127m = abstractC0637l;
        abstractC0637l.v(this);
        d dVar = new d(q(), new p(this), new C(this));
        MainActivity mainActivityQ = q();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        ArrayList arrayListA = b.a.a(com.voltasit.obdeleven.a.C0320a.a(mainActivityQ).a("device_list", ""));
        if (arrayListA.isEmpty()) {
            MainActivity mainActivityQ2 = q();
            P.a(mainActivityQ2, mainActivityQ2.getString(R.string.view_device_no_devices_added));
        }
        kotlin.collections.p.F(arrayListA);
        dVar.d(arrayListA);
        t tVar = new t(new O(dVar));
        RecyclerView recyclerView = abstractC0637l.f1997s;
        tVar.e(recyclerView);
        abstractC0637l.t(dVar);
        abstractC0637l.u(com.voltasit.obdeleven.a.C0320a.a(q()));
        A.b(recyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xa.g] */
    public final void O() throws Exception {
        if (((o) this.f32129o.getValue()).a()) {
            new com.voltasit.obdeleven.presentation.main.d(0).J(this);
            return;
        }
        ?? r10 = this.f32130p;
        if (!((c) r10.getValue()).d()) {
            MainActivity mainActivityQ = q();
            P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_bluetooth_not_available));
            return;
        }
        ?? r11 = this.f32131q;
        a aVar = (a) r11.getValue();
        MainActivity mainActivityQ2 = q();
        aVar.getClass();
        aVar.f32132a.getClass();
        if (!com.voltasit.obdeleven.domain.usecases.permissions.c.a(mainActivityQ2)) {
            a aVar2 = (a) r11.getValue();
            MainActivity mainActivityQ3 = q();
            Ia.l<Boolean, r> lVar = new Ia.l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.devices.DeviceFragment$addDevice$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Boolean bool) throws Exception {
                    boolean zBooleanValue = bool.booleanValue();
                    DeviceFragment deviceFragment = this.this$0;
                    if (zBooleanValue) {
                        deviceFragment.O();
                    } else {
                        MainActivity mainActivityQ4 = deviceFragment.q();
                        P.a(mainActivityQ4, mainActivityQ4.getString(R.string.snackbar_cant_access_bluetooth));
                        W7.c.g(0);
                    }
                    return r.f47939a;
                }
            };
            aVar2.getClass();
            aVar2.f32133b.getClass();
            com.voltasit.obdeleven.domain.usecases.permissions.a.a(mainActivityQ3, lVar);
            return;
        }
        if (!((c) r10.getValue()).c()) {
            MainActivity mainActivityQ4 = q();
            P.a(mainActivityQ4, mainActivityQ4.getString(R.string.snackbar_bluetooth_not_enabled));
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 302);
            return;
        }
        Bundle bundle = new Bundle();
        DeviceSelectionSheet deviceSelectionSheet = new DeviceSelectionSheet();
        deviceSelectionSheet.setArguments(bundle);
        deviceSelectionSheet.f33918u = null;
        deviceSelectionSheet.f33991r = getFragmentManager();
        deviceSelectionSheet.setTargetFragment(this, 0);
        deviceSelectionSheet.w();
    }

    public final void P(List<b> list) {
        String strB = b.a.b(list);
        MainActivity mainActivityQ = q();
        List<String> list2 = com.voltasit.obdeleven.a.f29638c;
        com.voltasit.obdeleven.a.C0320a.a(mainActivityQ).o("device_list", strB);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String dialogId, DialogCallback.CallbackType callbackType, Bundle data) {
        b bVar;
        i.e(dialogId, "dialogId");
        i.e(data, "data");
        if ("DeviceSelectionSheet".equals(dialogId) && callbackType == DialogCallback.CallbackType.f31102c) {
            b bVar2 = (b) data.getParcelable("bluetoothDeviceInfo");
            if (bVar2 == null) {
                return;
            }
            a aVar = (a) this.f32131q.getValue();
            aVar.getClass();
            if (!aVar.f32134c.a(bVar2)) {
                MainActivity mainActivityQ = q();
                P.a(mainActivityQ, mainActivityQ.getString(R.string.view_device_device_already_added));
                return;
            }
            AbstractC0637l abstractC0637l = this.f32127m;
            if (abstractC0637l == null) {
                i.m("binding");
                throw null;
            }
            d dVar = abstractC0637l.f1998t;
            i.b(dVar);
            dVar.a(bVar2);
            return;
        }
        if ("EditTextDialog".equals(dialogId) && callbackType == DialogCallback.CallbackType.f31102c && data.containsKey("key_bundle")) {
            Bundle bundle = (Bundle) data.getParcelable("key_bundle");
            String string = data.getString("key_new_value");
            if (bundle != null) {
                String str = this.f32126l;
                if (!bundle.containsKey(str) || (bVar = (b) bundle.getParcelable(str)) == null) {
                    return;
                }
                AbstractC0637l abstractC0637l2 = this.f32127m;
                if (abstractC0637l2 == null) {
                    i.m("binding");
                    throw null;
                }
                d dVar2 = abstractC0637l2.f1998t;
                i.b(dVar2);
                List<T> list = dVar2.f36779a;
                b bVar3 = (b) list.get(list.indexOf(bVar));
                i.b(bVar3);
                bVar3.f5127b = string;
                P(list);
                AbstractC0637l abstractC0637l3 = this.f32127m;
                if (abstractC0637l3 == null) {
                    i.m("binding");
                    throw null;
                }
                d dVar3 = abstractC0637l3.f1998t;
                if (dVar3 != null) {
                    dVar3.notifyItemChanged(dVar3.f36779a.indexOf(bVar));
                }
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return this.f32126l;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) throws Exception {
        if (i10 != 302) {
            super.onActivityResult(i10, i11, intent);
        } else {
            if (i11 == -1) {
                O();
                return;
            }
            MainActivity mainActivityQ = q();
            P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_bluetooth_not_enabled));
            W7.c.g(0);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f32128n;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_device);
        i.d(string, "getString(...)");
        return string;
    }
}
