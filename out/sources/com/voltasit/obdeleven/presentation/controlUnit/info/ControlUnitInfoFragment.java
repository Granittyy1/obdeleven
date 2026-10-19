package com.voltasit.obdeleven.presentation.controlUnit.info;

import B8.E0;
import B8.Y;
import G8.C0703e;
import Ia.l;
import Ia.p;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.core.app.z0;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.controlUnit.E;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.text.n;
import kotlinx.coroutines.C2680e;
import p220r9.P;
import p293xa.r;

/* JADX INFO: compiled from: ControlUnitInfoFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/107/info")
public class ControlUnitInfoFragment extends BaseFragment<Y> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f31616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f31617m = R.layout.fragment_control_unit_info;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f31618n = "ControlUnitInfoFragment";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ControlUnit f31619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f31621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f31622r;

    /* JADX INFO: compiled from: ControlUnitInfoFragment.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31623b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar) {
            this.f31623b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31623b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31623b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f31623b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f31623b.hashCode();
        }
    }

    /* JADX INFO: compiled from: ControlUnitInfoFragment.kt */
    public static final class b<TTaskResult, TContinuationResult> implements Continuation {
        public b() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            kotlin.jvm.internal.i.e(task, "task");
            Object result = task.getResult();
            kotlin.jvm.internal.i.d(result, "getResult(...)");
            boolean zBooleanValue = ((Boolean) result).booleanValue();
            ControlUnitInfoFragment controlUnitInfoFragment = ControlUnitInfoFragment.this;
            if (zBooleanValue) {
                controlUnitInfoFragment.P();
                return null;
            }
            ActivityC1347l activity = controlUnitInfoFragment.getActivity();
            kotlin.jvm.internal.i.b(activity);
            P.a(activity, activity.getString(R.string.common_something_went_wrong));
            controlUnitInfoFragment.q().K();
            return null;
        }
    }

    /* JADX INFO: compiled from: ControlUnitInfoFragment.kt */
    public static final class c<TTaskResult, TContinuationResult> implements Continuation {
        public c() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            kotlin.jvm.internal.i.e(task, "task");
            Object result = task.getResult();
            kotlin.jvm.internal.i.d(result, "getResult(...)");
            boolean zBooleanValue = ((Boolean) result).booleanValue();
            ControlUnitInfoFragment controlUnitInfoFragment = ControlUnitInfoFragment.this;
            if (zBooleanValue) {
                controlUnitInfoFragment.P();
                return null;
            }
            P.b(controlUnitInfoFragment.requireActivity(), R.string.common_something_went_wrong);
            controlUnitInfoFragment.q().K();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$special$$inlined$viewModel$default$1] */
    public ControlUnitInfoFragment() {
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$special$$inlined$viewModel$default$1
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
        this.f31621q = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<com.voltasit.obdeleven.presentation.controlUnit.info.c>(this) { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.controlUnit.info.c] */
            @Override // Ia.a
            public final c invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar = this.$qualifier;
                Ia.a aVar2 = r10;
                Ia.a aVar3 = this.$extrasProducer;
                Ia.a aVar4 = this.$parameters;
                b0 viewModelStore = ((c0) aVar2.invoke()).getViewModelStore();
                if (aVar3 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar3.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    kotlin.jvm.internal.i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(kotlin.jvm.internal.l.a(c.class), viewModelStore, null, defaultViewModelCreationExtras, aVar, Cb.a.i(fragment), aVar4);
            }
        });
        this.f31622r = new d(new l<h, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$infoAdapter$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(h hVar) {
                ControlUnitDB controlUnitDB;
                String oDXName;
                String oDXVersion;
                h infoItem = hVar;
                kotlin.jvm.internal.i.e(infoItem, "infoItem");
                ControlUnitInfoFragment controlUnitInfoFragment = this.this$0;
                ControlUnit controlUnit = controlUnitInfoFragment.f31619o;
                if (controlUnit != null && (controlUnitDB = controlUnit.f29320b) != null && (oDXName = controlUnitDB.getODXName()) != null && (oDXVersion = controlUnitDB.getODXVersion()) != null) {
                    c cVarO = controlUnitInfoFragment.O();
                    String str = controlUnitInfoFragment.f31616l;
                    if (str == null) {
                        kotlin.jvm.internal.i.m("platform");
                        throw null;
                    }
                    cVarO.getClass();
                    if (kotlin.jvm.internal.i.a(infoItem.f31658a, cVarO.f31632p.a(R.string.common_odx_file, new Object[0]))) {
                        C2680e.c(Z.a(cVarO), cVarO.f32112a, null, new ControlUnitInfoViewModel$clickItem$1(cVarO, oDXName, oDXVersion, str, infoItem, null), 2);
                    }
                }
                return r.f47939a;
            }
        }, new l<h, Boolean>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$infoAdapter$2
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(h hVar) {
                h it = hVar;
                kotlin.jvm.internal.i.e(it, "it");
                ActivityC1347l activity = this.this$0.getActivity();
                kotlin.jvm.internal.i.b(activity);
                Object systemService = activity.getSystemService("clipboard");
                kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                String str = it.f31658a;
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, it.f31661d));
                P.e(this.this$0.q(), String.format(Locale.US, "%s %s", Arrays.copyOf(new Object[]{str, this.this$0.getString(R.string.common_copied)}, 2)));
                return Boolean.TRUE;
            }
        }, new p<h, String, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$infoAdapter$3
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(h hVar, String str) {
                h infoItem = hVar;
                String option = str;
                kotlin.jvm.internal.i.e(infoItem, "infoItem");
                kotlin.jvm.internal.i.e(option, "option");
                ControlUnitInfoFragment controlUnitInfoFragment = this.this$0;
                ControlUnit controlUnit = controlUnitInfoFragment.f31619o;
                if (controlUnit != null) {
                    c cVarO = controlUnitInfoFragment.O();
                    cVarO.getClass();
                    if (kotlin.jvm.internal.i.a(infoItem.f31658a, cVarO.f31632p.a(R.string.common_odx_file, new Object[0]))) {
                        C2680e.c(Z.a(cVarO), cVarO.f32112a, null, new ControlUnitInfoViewModel$selectOption$1(cVarO, controlUnit, option, null), 2);
                    }
                }
                return r.f47939a;
            }
        });
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(M0.h hVar) {
        int color;
        int i10 = 1;
        final Y y10 = (Y) hVar;
        final ControlUnit controlUnit = this.f31619o;
        if (controlUnit == null) {
            return;
        }
        ShapeableImageView controlUnitInfoFragmentImage = y10.f1835s;
        kotlin.jvm.internal.i.d(controlUnitInfoFragmentImage, "controlUnitInfoFragmentImage");
        TextView controlUnitInfoFragmentName = y10.f1837u;
        kotlin.jvm.internal.i.d(controlUnitInfoFragmentName, "controlUnitInfoFragmentName");
        TextView controlUnitInfoFragmentNumber = y10.f1838v;
        kotlin.jvm.internal.i.d(controlUnitInfoFragmentNumber, "controlUnitInfoFragmentNumber");
        RecyclerView controlUnitInfoFragmentList = y10.f1836t;
        kotlin.jvm.internal.i.d(controlUnitInfoFragmentList, "controlUnitInfoFragmentList");
        controlUnitInfoFragmentList.setItemAnimator(null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        p208q9.a aVar = new p208q9.a(getContext(), linearLayoutManager.f19521p);
        aVar.f46180a = getResources().getDrawable(R.drawable.divider_content);
        aVar.f46181b = dimensionPixelSize;
        aVar.f46182c = dimensionPixelSize;
        if (q().E()) {
            y10.f1834r.setVisibility(8);
        }
        controlUnitInfoFragmentList.setLayoutManager(linearLayoutManager);
        controlUnitInfoFragmentList.i(aVar);
        controlUnitInfoFragmentList.setHasFixedSize(true);
        controlUnitInfoFragmentList.setAdapter(this.f31622r);
        if (this.f31620p) {
            com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(controlUnit.a0());
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
            kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
            dVarM.a(dVarJ).x(controlUnitInfoFragmentImage);
            controlUnitInfoFragmentName.setText(controlUnit.getName());
            controlUnitInfoFragmentNumber.setVisibility(8);
        } else {
            if (!W7.c.e() || this.f31619o == null) {
                r().o(false);
                return;
            }
            com.bumptech.glide.d<Drawable> dVarM2 = com.bumptech.glide.b.c(getContext()).f(this).m(controlUnit.a0());
            T3.d dVarJ2 = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
            kotlin.jvm.internal.i.d(dVarJ2, "placeholder(...)");
            dVarM2.a(dVarJ2).x(controlUnitInfoFragmentImage);
            controlUnitInfoFragmentNumber.setText(controlUnit.t());
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
            controlUnitInfoFragmentName.setText(controlUnit.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).c()).b()));
            if (!controlUnit.b()) {
                color = getResources().getColor(R.color.black);
            } else if (controlUnit.j0()) {
                color = controlUnit.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
            } else {
                color = getResources().getColor(R.color.yellow_500);
            }
            controlUnitInfoFragmentNumber.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        P();
        Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ControlUnit controlUnitRef = controlUnit;
                kotlin.jvm.internal.i.e(controlUnitRef, "$controlUnitRef");
                return ControlUnitDB.getLatestSoftwareVersion(controlUnitRef.f29320b.getSWNumber());
            }
        }).continueWith(new z0(controlUnit.f29320b.getSWVersion(), i10, this), Task.UI_THREAD_EXECUTOR);
        O().f31639w.e(getViewLifecycleOwner(), new a(new l<List<? extends h>, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$onCreateView$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends h> list2) {
                this.this$0.f31622r.f19484a.b(list2, null);
                return r.f47939a;
            }
        }));
        O().f31641y.e(getViewLifecycleOwner(), new a(new l<h, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment$onCreateView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(h hVar2) {
                new Handler(Looper.getMainLooper()).postDelayed(new b(this.this$0, hVar2, y10, 0), 100L);
                return r.f47939a;
            }
        }));
        z(O());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final com.voltasit.obdeleven.presentation.controlUnit.info.c O() {
        return (com.voltasit.obdeleven.presentation.controlUnit.info.c) this.f31621q.getValue();
    }

    public void P() {
        ControlUnitException controlUnitException;
        String str;
        String strA;
        if (y() || this.f31619o == null) {
            return;
        }
        com.voltasit.obdeleven.presentation.controlUnit.info.c cVarO = O();
        ControlUnit controlUnit = this.f31619o;
        kotlin.jvm.internal.i.b(controlUnit);
        cVarO.getClass();
        ControlUnitDB controlUnitDB = controlUnit.f29320b;
        if (controlUnitDB == null) {
            controlUnitException = null;
        } else {
            ArrayList arrayList = new ArrayList();
            C0703e c0703eA = cVarO.f31633q.a(controlUnit);
            cVarO.b(R.string.common_system_description, c0703eA.f3472n, arrayList);
            cVarO.b(R.string.common_identifier, c0703eA.f3452B, arrayList);
            cVarO.b(R.string.common_hardware_number, c0703eA.f3476r, arrayList);
            cVarO.b(R.string.common_hardware_version, c0703eA.f3474p, arrayList);
            cVarO.b(R.string.common_software_number, c0703eA.f3480v, arrayList);
            String str2 = c0703eA.f3478t;
            boolean zS = n.S(str2);
            J8.d dVar = cVarO.f31632p;
            if (!zS) {
                if (n.S("")) {
                    cVarO.b(R.string.common_software_version, str2, arrayList);
                } else {
                    arrayList.add(new h(dVar.a(R.string.common_software_version, new Object[0]), "", dVar.a(R.string.view_cu_info_new_version_exists, new Object[0]), c0703eA.f3478t, null, 16));
                }
            }
            cVarO.b(R.string.common_serial_number, c0703eA.f3456F, arrayList);
            try {
                int iOrdinal = controlUnitDB.getCodingType().ordinal();
                if (iOrdinal == 3) {
                    String str3 = (String) controlUnit.Q().f10040b;
                    kotlin.jvm.internal.i.d(str3, "getString(...)");
                    cVarO.b(R.string.common_coding, str3, arrayList);
                } else if (iOrdinal == 4) {
                    String str4 = controlUnit.W().f42831c;
                    kotlin.jvm.internal.i.d(str4, "toString(...)");
                    cVarO.b(R.string.common_long_coding, str4, arrayList);
                }
                if (!n.S(controlUnit.Y())) {
                    arrayList.add(new h(dVar.a(R.string.common_odx_file, new Object[0]), dVar.a(R.string.common_change, new Object[0]), null, cVarO.d(controlUnit), EmptyList.f42983b, 4));
                }
                cVarO.b(R.string.common_odx_name, controlUnit.Y(), arrayList);
                O.e.j(controlUnit.f0(), "getOdxVersion()");
                String oDXVersion = controlUnitDB.getODXVersion();
                if (oDXVersion == null) {
                    throw new ControlUnitException(0);
                }
                cVarO.b(R.string.common_odx_version, oDXVersion, arrayList);
                TransportProtocol transportProtocol = controlUnit.f29326h;
                int i10 = -1;
                int i11 = transportProtocol == null ? -1 : com.voltasit.obdeleven.presentation.controlUnit.info.c.a.f31642a[transportProtocol.ordinal()];
                if (i11 == 1) {
                    str = "CAN";
                } else if (i11 == 2) {
                    str = "TP2.0";
                } else if (i11 != 3) {
                    str = (i11 == 4 || i11 == 5) ? "K-Line" : null;
                } else {
                    str = "TP1.6";
                }
                if (str != null) {
                    ApplicationProtocol applicationProtocol = controlUnit.f29327i;
                    if (applicationProtocol != null) {
                        i10 = com.voltasit.obdeleven.presentation.controlUnit.info.c.a.f31643b[applicationProtocol.ordinal()];
                    }
                    if (i10 == 1) {
                        cVarO.b(R.string.common_protocol, str.concat(": KWP1281"), arrayList);
                    } else if (i10 == 2) {
                        cVarO.b(R.string.common_protocol, str.concat(": KWP2000"), arrayList);
                    } else if (i10 == 3) {
                        cVarO.b(R.string.common_protocol, str.concat(": UDS"), arrayList);
                    }
                    if (controlUnit.j == null) {
                        cVarO.f31636t.b("ControlUnitInfoViewModel", "Unable to get CU speed");
                    }
                    ControlUnit.h hVar = controlUnit.j;
                    if (hVar == null || (strA = hVar.toString()) == null) {
                        strA = dVar.a(R.string.common_not_available, new Object[0]);
                    }
                    cVarO.b(R.string.view_control_unit_info_baud, strA, arrayList);
                } else {
                    String protocol = controlUnitDB.getProtocol();
                    if (protocol == null) {
                        protocol = "";
                    }
                    cVarO.b(R.string.common_protocol, protocol, arrayList);
                }
                controlUnit.a();
                UserTrackingUtils.c(UserTrackingUtils.Key.j, 1);
                cVarO.f31638v.j(arrayList);
                controlUnitException = null;
            } catch (ControlUnitException e10) {
                controlUnitException = e10;
            }
        }
        if (controlUnitException != null) {
            int iA = controlUnitException.a();
            if (iA == 0) {
                ControlUnit controlUnit2 = this.f31619o;
                kotlin.jvm.internal.i.b(controlUnit2);
                controlUnit2.c().continueWith(new b(), Task.UI_THREAD_EXECUTOR);
            } else {
                if (iA != 2) {
                    return;
                }
                ControlUnit controlUnit3 = this.f31619o;
                kotlin.jvm.internal.i.b(controlUnit3);
                controlUnit3.n0().continueWithTask(new E(1, this)).continueWith(new c(), Task.UI_THREAD_EXECUTOR);
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return this.f31618n;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f31617m;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_info);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }
}
