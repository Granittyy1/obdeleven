package com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation;

import S6.k;
import V8.v;
import V8.w;
import X8.j;
import X8.p;
import Z3.o;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.RunnableC1276a;
import androidx.lifecycle.Z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.messaging.CallableC2047j;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUCATEGORY;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.PHYSICALDATATYPE;
import com.obdeleven.service.odx.model.RADIX;
import com.obdeleven.service.odx.model.VT;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.O0;
import com.voltasit.obdeleven.ui.dialogs.R0;
import com.voltasit.obdeleven.ui.dialogs.b1;
import com.voltasit.obdeleven.ui.dialogs.c1;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.AdaptationType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import org.koin.java.KoinJavaComponent;
import p220r9.C2783o;
import p220r9.P;
import p255u9.z;
import p293xa.r;

/* JADX INFO: compiled from: UDSAdaptationFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/110/adaptations-uds")
public class h extends BaseProFragment implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f31922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31923o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FloatingActionButton f31924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ControlUnit f31925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p135k9.a f31926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B0 f31927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public R0 f31928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public O0 f31929u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public COMPUSCALE f31930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UDSResult f31931w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList<String> f31934z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f31932x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f31933y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f31915A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f31916B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.f f31917C = (com.voltasit.obdeleven.domain.usecases.f) KoinJavaComponent.a(com.voltasit.obdeleven.domain.usecases.f.class);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f31918D = KoinJavaComponent.b(com.voltasit.obdeleven.domain.usecases.odx.e.class, null, null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f31919E = KoinJavaComponent.b(i.class, null, null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Object f31920F = KoinJavaComponent.b(SfdViewModel.class, null, new p(1));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Object f31921G = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: compiled from: UDSAdaptationFragment.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31935a;

        static {
            int[] iArr = new int[PHYSICALDATATYPE.values().length];
            f31935a = iArr;
            try {
                iArr[PHYSICALDATATYPE.A_FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31935a[PHYSICALDATATYPE.A_FLOAT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31935a[PHYSICALDATATYPE.A_INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31935a[PHYSICALDATATYPE.A_UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31935a[PHYSICALDATATYPE.A_BYTEFIELD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31935a[PHYSICALDATATYPE.A_UNICODE2STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        O0 o10 = this.f31929u;
        if (o10 != null && o10.isVisible()) {
            this.f31929u.y();
            return false;
        }
        ?? r10 = this.f31919E;
        if (((i) r10.getValue()).f31937B != null) {
            V();
            return true;
        }
        i iVar = (i) r10.getValue();
        iVar.getClass();
        C2680e.c(C2673a0.f43223b, null, null, new UdsAdaptationViewModel$reportError$1(iVar, null), 3);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? r10 = this.f31919E;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ?? r11 = this.f31920F;
        z((com.voltasit.obdeleven.presentation.d) r11.getValue());
        ((SfdViewModel) r11.getValue()).f31218u.e(getViewLifecycleOwner(), new X8.i(this, 3));
        ((SfdViewModel) r11.getValue()).f31207A.e(getViewLifecycleOwner(), new j(this, 3));
        ((SfdViewModel) r11.getValue()).f31220w.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.g(this, 1));
        ((SfdViewModel) r11.getValue()).f31222y.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.h(this, 1));
        ((SfdViewModel) r11.getValue()).f31209C.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.i(this, 1));
        ((i) r10.getValue()).f31941F.e(getViewLifecycleOwner(), new v(this, 2));
        O().f32797E.e(getViewLifecycleOwner(), new w(this, 2));
        O().f32795C.e(getViewLifecycleOwner(), new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.b(this, 1));
        ((i) r10.getValue()).f31953y.e(this, new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.c(this, 1));
        ((i) r10.getValue()).f31936A.e(this, new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.d(this, 1));
        ((i) r10.getValue()).f31949u.e(this, new X8.e(this, 1));
        ((i) r10.getValue()).f31951w.e(this, new X8.f(this, 2));
        T();
        O().c(true);
        p135k9.a aVar = this.f31926r;
        com.voltasit.obdeleven.domain.usecases.f fVar = this.f31917C;
        if (aVar == null) {
            p135k9.a aVar2 = new p135k9.a(q(), fVar.a());
            this.f31926r = aVar2;
            aVar2.f42885c = this;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_uds_data, viewGroup, false);
        if (this.f31925q == null) {
            return viewInflate;
        }
        this.f31922n = (LinearLayout) viewInflate.findViewById(R.id.fragmentUdsData_dataLayout);
        this.f31923o = (TextView) viewInflate.findViewById(R.id.fragmentUdsData_dataTitle);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.fragmentUdsData_dataList);
        this.f31924p = (FloatingActionButton) viewInflate.findViewById(R.id.fragmentUdsData_fab);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        p208q9.a aVar3 = new p208q9.a(getContext(), linearLayoutManager.f19521p);
        aVar3.f46180a = getResources().getDrawable(R.drawable.divider_content);
        aVar3.f46181b = dimensionPixelSize;
        aVar3.f46182c = dimensionPixelSize;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.i(aVar3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f31926r);
        if (this.f31930v == null) {
            i iVar = (i) r10.getValue();
            ControlUnit controlUnit = this.f31925q;
            iVar.getClass();
            kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
            C2680e.c(Z.a(iVar), iVar.f32112a, null, new UdsAdaptationViewModel$getCompuscales$1(iVar, controlUnit, null), 2);
        } else {
            this.f31923o.setText(C2783o.a(this.f31930v, fVar.a()));
        }
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new k(5, this));
        getChildFragmentManager().b0("SfdAutoUnlockDialog", this, new Y1.d(6, this));
        if (this.f31916B) {
            this.f31924p.h();
        } else {
            this.f31924p.n();
        }
        Q(this.f31924p);
        return viewInflate;
    }

    public final void U(final boolean z10) {
        J();
        this.f31925q.D(false).continueWithTask(new d(0, this), Task.BACKGROUND_EXECUTOR).continueWith((Continuation<TContinuationResult, TContinuationResult>) new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.e
            /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, xa.g] */
            /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object, xa.g] */
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                int i10 = 1;
                h hVar = this.f31907a;
                hVar.w();
                hVar.f31931w = (UDSResult) task.getResult();
                if (task.isFaulted()) {
                    if (!(task.getError() instanceof OdxFactory$Exception)) {
                        Exception error = task.getError();
                        p279w9.b bVar = Application.f29634b;
                        P8.c.b(error);
                        hVar.W(R.string.common_something_went_wrong);
                        return null;
                    }
                    OdxFactory$Exception odxFactory$Exception = (OdxFactory$Exception) task.getError();
                    int iA = odxFactory$Exception.a();
                    if (iA == 0) {
                        hVar.W(R.string.common_check_network_try_again);
                        return null;
                    }
                    if (iA == 1) {
                        hVar.W(R.string.common_description_data_na);
                        return null;
                    }
                    p279w9.b bVar2 = Application.f29634b;
                    P8.c.b(odxFactory$Exception);
                    hVar.W(R.string.common_something_went_wrong);
                    return null;
                }
                UDSResult uDSResult = hVar.f31931w;
                if (uDSResult == null) {
                    hVar.W(R.string.common_something_went_wrong);
                    return null;
                }
                UDSResult.Type type = UDSResult.Type.f29417c;
                UDSResult.Type type2 = uDSResult.f29412a;
                boolean z11 = z10;
                if (type2 == type) {
                    P8.c.a(4, "UDSAdaptationFragment", "Received negative response", new Object[0]);
                    UDSResult uDSResult2 = hVar.f31931w;
                    if (uDSResult2.f29413b == 51) {
                        i iVar = (i) hVar.f31919E.getValue();
                        SecurityPolicy securityPolicy = z11 ? SecurityPolicy.f31892c : SecurityPolicy.f31891b;
                        iVar.getClass();
                        iVar.f31942G = securityPolicy;
                        ((SfdViewModel) hVar.f31920F.getValue()).b(hVar.f31925q.f29320b.getControlUnitBase().getObjectId(), hVar.f31925q.n().shortValue());
                        return null;
                    }
                    p135k9.a aVar = hVar.f31926r;
                    aVar.f42884b.add(uDSResult2.f29414c);
                    aVar.notifyDataSetChanged();
                    hVar.f31924p.setEnabled(false);
                    if (hVar.f31916B) {
                        hVar.f31924p.h();
                    } else {
                        hVar.f31924p.n();
                    }
                    hVar.f31922n.setVisibility(0);
                    UDSResult uDSResult3 = hVar.f31931w;
                    hVar.X(uDSResult3.f29412a, uDSResult3.f29414c.f29454b);
                    return null;
                }
                P8.c.a(4, "UDSAdaptationFragment", "Received positive response", new Object[0]);
                ArrayList arrayListC = hVar.f31931w.f29414c.c(false);
                ArrayList arrayList = hVar.f31932x;
                if (z11 && arrayList.size() == arrayListC.size()) {
                    HashMap map = new HashMap();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        Param param = (Param) arrayList.get(i11);
                        Param param2 = (Param) arrayListC.get(i11);
                        if (!param.f29459g.equals(param2.f29459g)) {
                            map.put(param, param2);
                        }
                    }
                    if (!map.isEmpty()) {
                        hVar.H(R.string.common_saving);
                        Task.callInBackground(new CallableC2047j(hVar, i10, map)).continueWith(new com.parse.a(3, hVar), Task.UI_THREAD_EXECUTOR);
                    }
                }
                UserTrackingUtils.c(UserTrackingUtils.Key.f34281z, 1);
                arrayList.clear();
                hVar.f31926r.b();
                hVar.f31926r.a(arrayListC);
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Param) it.next()).clone());
                }
                hVar.f31924p.setEnabled(true);
                if (hVar.f31916B) {
                    hVar.f31924p.h();
                } else {
                    hVar.f31924p.n();
                }
                hVar.f31922n.setVisibility(0);
                UDSResult uDSResult4 = hVar.f31931w;
                hVar.X(uDSResult4.f29412a, uDSResult4.f29414c.f29454b);
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
    public final void V() {
        O0 o10 = this.f31929u;
        if (o10 == null || !o10.isVisible()) {
            this.f31934z = C2783o.b(((i) this.f31919E.getValue()).f31937B, this.f31917C.a());
            Bundle bundle = new Bundle();
            bundle.putInt("key_last_position", this.f31933y);
            bundle.putStringArrayList("items", this.f31934z);
            bundle.putStringArrayList("key_selected_items", new ArrayList<>());
            O0 o11 = new O0();
            o11.setArguments(bundle);
            o11.f32261r = getFragmentManager();
            o11.setTargetFragment(this, 0);
            this.f31929u = o11;
            o11.A();
        }
    }

    public final void W(int i10) {
        P.b(requireActivity(), i10);
    }

    @Deprecated
    public final void X(UDSResult.Type type, byte[] bArr) {
        LIMIT lowerlimit = this.f31930v.getLOWERLIMIT();
        if (lowerlimit == null) {
            lowerlimit = this.f31930v.getUPPERLIMIT();
        }
        if (lowerlimit == null) {
            return;
        }
        this.f31925q.f29320b.updateAdaptation(AdaptationType.ADAPTATION, "UDS", Integer.parseInt(lowerlimit.getValue()), Arrays.toString(bArr), type.toString());
        this.f31925q.f29320b.saveInBackgroundEventually();
    }

    public final void Y(String str, Handler handler) throws Exception {
        O.e.s("UDSAdaptationFragment", "writeLongCoding()");
        ControlUnit controlUnit = this.f31925q;
        if (controlUnit.f29321c.i(controlUnit)) {
            handler.post(new androidx.activity.j(2, this));
            return;
        }
        this.f31925q.D(false).waitForCompletion();
        Task<Integer> taskJ0 = this.f31925q.J0(this.f31930v, str);
        taskJ0.waitForCompletion();
        final int iIntValue = taskJ0.isFaulted() ? -1 : taskJ0.getResult().intValue();
        handler.post(new Runnable() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.c
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xa.g] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, xa.g] */
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = this.f31903b;
                hVar.w();
                int i10 = iIntValue;
                if (i10 == -1) {
                    hVar.W(R.string.common_something_went_wrong);
                    return;
                }
                if (i10 == 0) {
                    P.f(hVar.requireActivity(), R.string.common_adaptation_accepted);
                    hVar.P();
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34242C, 1);
                    hVar.U(true);
                    return;
                }
                if (i10 != 51) {
                    P.a(hVar.requireActivity(), String.format(Locale.US, "(%02X) %s", Integer.valueOf(i10), Texttabe.a(i10)));
                    return;
                }
                i iVar = (i) hVar.f31919E.getValue();
                SecurityPolicy securityPolicy = SecurityPolicy.f31893d;
                iVar.getClass();
                iVar.f31942G = securityPolicy;
                ((SfdViewModel) hVar.f31920F.getValue()).b(hVar.f31925q.f29320b.getControlUnitBase().getObjectId(), hVar.f31925q.n().shortValue());
                hVar.f31915A = true;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
    public final void Z() {
        ((J8.a) this.f31921G.getValue()).c();
        O.e.s("UDSAdaptationFragment", "onLongClickWriteLongCoding()");
        if (this.f31931w == null) {
            O.e.D("UDSAdaptationFragment", "udsResult is null");
            W(R.string.common_something_went_wrong);
            return;
        }
        try {
            J();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArrG = this.f31931w.f29414c.g();
            Object[] objArr = {Integer.valueOf(bArrG.length)};
            p279w9.b bVar = Application.f29634b;
            P8.c.a(3, "UDSAdaptationFragment", "pduData.size():(%d)", Arrays.copyOf(objArr, 1));
            for (byte b10 : bArrG) {
                sb2.append(String.format(Locale.US, "%02X", Byte.valueOf(b10)));
            }
            final String string = sb2.toString();
            p279w9.b bVar2 = Application.f29634b;
            P8.c.a(3, "UDSAdaptationFragment", "pdu:(%s)", Arrays.copyOf(new Object[]{string}, 1));
            final Handler handler = new Handler(Looper.getMainLooper());
            Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str = string;
                    Handler handler2 = handler;
                    h hVar = this.f31895b;
                    hVar.getClass();
                    try {
                        hVar.Y(str, handler2);
                        return null;
                    } catch (Exception e10) {
                        O.e.m(e10);
                        handler2.post(new RunnableC1276a(1, hVar));
                        return null;
                    }
                }
            });
        } catch (Exception e10) {
            w();
            O.e.m(e10);
            W(R.string.common_something_went_wrong);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        boolean zEquals = str.equals("tryAgainDialog");
        ?? r10 = this.f31919E;
        if (zEquals) {
            if (callbackType != DialogCallback.CallbackType.f31102c) {
                r().h();
                return;
            }
            i iVar = (i) r10.getValue();
            ControlUnit controlUnit = this.f31925q;
            iVar.getClass();
            kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
            C2680e.c(Z.a(iVar), iVar.f32112a, null, new UdsAdaptationViewModel$getCompuscales$1(iVar, controlUnit, null), 2);
            return;
        }
        if ("PopTheHoodDialog".equals(str) && callbackType == DialogCallback.CallbackType.f31102c) {
            Z();
            return;
        }
        if (!str.equals("MultiChoiceDialog") || callbackType != DialogCallback.CallbackType.f31102c) {
            if (!str.equals("SecurityAccessDialogFragment")) {
                if (str.equals("MultiChoiceDialog") && callbackType == DialogCallback.CallbackType.f31101b) {
                    r().h();
                    return;
                }
                return;
            }
            if (callbackType == DialogCallback.CallbackType.f31102c) {
                SecurityPolicy securityPolicyValueOf = SecurityPolicy.valueOf(bundle.getBundle("key_bundle").getString("key_security_policy"));
                if (this.f31915A) {
                    ((i) r10.getValue()).f31940E.j(r.f47939a);
                    this.f31915A = false;
                } else {
                    U(securityPolicyValueOf == SecurityPolicy.f31892c);
                }
            } else if (callbackType == DialogCallback.CallbackType.f31101b) {
                P.a(getActivity(), String.format(Locale.US, "(%02X) %s", 51, Texttabe.a(51)));
            }
            B0 b10 = this.f31927s;
            if (b10 != null) {
                b10.y();
                this.f31927s = null;
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("items");
        int i10 = bundle.getInt("key_last_position");
        this.f31933y = i10;
        Object[] objArr = {Integer.valueOf(i10)};
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "UDSAdaptationFragment", "currentPosition:(%d)", Arrays.copyOf(objArr, 1));
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            r().h();
            return;
        }
        boolean zA = this.f31917C.a();
        COMPUSCALE compuscale = ((i) r10.getValue()).f31937B.get(this.f31934z.indexOf(stringArrayList.get(0)));
        this.f31930v = compuscale;
        this.f31923o.setText(C2783o.a(compuscale, zA));
        this.f31926r.b();
        if (!W7.c.e()) {
            J();
            Task.callInBackground(new D7.b(1 == true ? 1 : 0, this)).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.g
                /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    h hVar = this.f31914a;
                    int i11 = Integer.parseInt(hVar.f31930v.getLOWERLIMIT().getValue());
                    String value = ((ControlUnitDB) task.getResult()).getDataById(i11);
                    i iVar2 = (i) hVar.f31919E.getValue();
                    iVar2.getClass();
                    kotlin.jvm.internal.i.e(value, "value");
                    C2680e.c(Z.a(iVar2), iVar2.f32112a, null, new UdsAdaptationViewModel$getOfflineAdaptation$1(iVar2, i11, value, null), 2);
                    return null;
                }
            }, Task.BACKGROUND_EXECUTOR);
            return;
        }
        U(false);
        i iVar2 = (i) r10.getValue();
        COMPUSCALE compuscale2 = this.f31930v;
        iVar2.getClass();
        kotlin.jvm.internal.i.e(compuscale2, "compuscale");
        String ti = compuscale2.getCOMPUCONST().getVT().getTI();
        if (ti == null) {
            ti = "";
        }
        iVar2.f31947s.J(Feature.Adaptations.a(), ti);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "UDSAdaptationFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        O0 o10 = this.f31929u;
        if (o10 != null) {
            o10.y();
            this.f31929u = null;
        }
        R0 r10 = this.f31928t;
        if (r10 != null) {
            r10.y();
            this.f31928t = null;
        }
        B0 b10 = this.f31927s;
        if (b10 != null) {
            b10.y();
            this.f31927s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        DATAOBJECTPROP dataobjectprop;
        int i11;
        int i12;
        int i13;
        int i14;
        h hVar = this;
        Param paramC = hVar.f31926r.c(i10);
        Param.Type type = paramC.f29453a;
        if (type == Param.Type.f29473h || type == Param.Type.f29472g || (dataobjectprop = paramC.f29462k) == null) {
            return;
        }
        String strD = paramC.d();
        if (strD == null || strD.isEmpty()) {
            strD = hVar.f31923o.getText().toString();
        }
        if (dataobjectprop.getCOMPUMETHOD().getCATEGORY() == COMPUCATEGORY.TEXTTABLE) {
            ArrayList arrayList = new ArrayList();
            List<COMPUSCALE> compuscale = dataobjectprop.getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
            int size = compuscale.size();
            String[] strArr = new String[size];
            int i15 = -1;
            int i16 = 0;
            while (i16 < compuscale.size()) {
                COMPUSCALE compuscale2 = compuscale.get(i16);
                VT vt = compuscale2.getCOMPUCONST().getVT();
                if (vt.getValue().equals(paramC.f29459g)) {
                    i15 = i16;
                }
                String strC = vt.getTI() != null ? Texttabe.c(vt.getTI()) : null;
                if (strC == null) {
                    strC = vt.getValue();
                }
                int i17 = z.f47484b;
                if (hVar.f31917C.a()) {
                    strC = C4.b.d(strC, " (", compuscale2.getLOWERLIMIT().getValue(), ")");
                }
                strArr[i16] = strC;
                i16++;
                hVar = this;
            }
            for (int i18 = 0; i18 < size; i18++) {
                arrayList.add(Integer.valueOf(i18));
            }
            if (!W7.c.e()) {
                Bundle bundleA = o.a("key_tag", R.string.common_close, "UdsDataInputDialogOffline", "key_positive_text");
                bundleA.putString("key_string_title", strD);
                bundleA.putStringArray("item_array", strArr);
                bundleA.putBoolean("key_enabled", false);
                bundleA.putInt("key_checked_position", i15);
                c1 c1Var = new c1();
                c1Var.setArguments(bundleA);
                c1Var.f33911x = null;
                c1Var.f32261r = getFragmentManager();
                c1Var.setTargetFragment(this, 0);
                c1Var.A();
                return;
            }
            Bundle bundleA2 = o.a("key_tag", R.string.common_ok, "UdsDataInputDialogOnline", "key_positive_text");
            bundleA2.putStringArray("item_array", strArr);
            bundleA2.putString("key_string_title", strD);
            bundleA2.putBoolean("key_enabled", true);
            bundleA2.putInt("key_checked_position", i15);
            b bVar = new b(this, compuscale, dataobjectprop, paramC, i10);
            bundleA2.putInt("key_negative_text", R.string.common_cancel);
            c1 c1Var2 = new c1();
            c1Var2.setArguments(bundleA2);
            c1Var2.f33911x = bVar;
            c1Var2.f32261r = getFragmentManager();
            c1Var2.setTargetFragment(this, 0);
            c1Var2.A();
            return;
        }
        int i19 = 4096;
        switch (a.f31935a[dataobjectprop.getPHYSICALTYPE().getBASEDATATYPE().ordinal()]) {
            case 1:
            case 2:
                i11 = 8192;
                i12 = i11 | 4096;
                if (dataobjectprop.getPHYSICALTYPE().getDISPLAYRADIX() == RADIX.HEX) {
                    i13 = 1;
                } else {
                    i13 = i12 | 2;
                }
                break;
            case 3:
                i11 = 0;
                i12 = i11 | 4096;
                if (dataobjectprop.getPHYSICALTYPE().getDISPLAYRADIX() == RADIX.HEX) {
                    i13 = 1;
                } else {
                    i13 = i12 | 2;
                }
                break;
            case 4:
                i12 = 0;
                if (dataobjectprop.getPHYSICALTYPE().getDISPLAYRADIX() == RADIX.HEX) {
                    i13 = 1;
                } else {
                    i13 = i12 | 2;
                }
                break;
            case 5:
                i14 = 1;
                i13 = i19 | i14;
                break;
            case 6:
                i14 = 1;
                i19 = 0;
                i13 = i19 | i14;
                break;
            default:
                i13 = 0;
                break;
        }
        String hint = dataobjectprop.getHint();
        if (hint == null) {
            hint = hVar.getString(R.string.common_new_value);
        }
        if (!W7.c.e()) {
            Bundle bundleA3 = o.a("key_tag", R.string.common_close, "UdsInputDialogOffline", "key_positive_text");
            bundleA3.putString("key_title_string", strD);
            bundleA3.putBoolean("key_hint_above_text", true);
            bundleA3.putString("key_input_hint_str", hint);
            bundleA3.putBoolean("key_enabled", false);
            bundleA3.putInt("key_input_type", i13);
            b1 b1Var = new b1();
            b1Var.setArguments(bundleA3);
            b1Var.f32261r = getFragmentManager();
            b1Var.setTargetFragment(hVar, 0);
            b1Var.A();
            return;
        }
        Bundle bundleA4 = o.a("key_tag", R.string.common_ok, "UdsInputDialogOnline", "key_positive_text");
        bundleA4.putInt("key_negative_text", R.string.common_cancel);
        bundleA4.putString("key_title_string", strD);
        bundleA4.putBoolean("key_enabled", true);
        bundleA4.putBoolean("key_hint_above_text", true);
        bundleA4.putString("key_input_hint_str", hint);
        bundleA4.putInt("key_input_type", i13);
        bundleA4.putInt("key_negative_text", R.string.common_cancel);
        b1 b1Var2 = new b1();
        b1Var2.setArguments(bundleA4);
        b1Var2.f32261r = getFragmentManager();
        b1Var2.setTargetFragment(hVar, 0);
        b1Var2.f33908x = new f(this, dataobjectprop, paramC, b1Var2, i10);
        b1Var2.A();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_adaptation);
    }
}
