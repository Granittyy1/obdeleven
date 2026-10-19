package X8;

import V8.u;
import V8.v;
import V8.x;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.PHYSICALDATATYPE;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.Z0;
import com.voltasit.obdeleven.utils.HistoryUtils;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;
import p134k8.a2;
import p220r9.A;
import p255u9.E;

/* JADX INFO: compiled from: UDSLongCodingFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/128/long-coding-uds")
public class s extends BaseProFragment implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f7413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FloatingActionButton f7414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p135k9.a f7415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ControlUnit f7416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public COMPUSCALE f7417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.obdeleven.service.odx.e.g f7418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public E f7419t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public UDSResult f7421v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Param f7423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public MenuItem f7424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public B0 f7425z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Z0 f7420u = new Z0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f7422w = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f7408A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.f f7409B = (com.voltasit.obdeleven.domain.usecases.f) KoinJavaComponent.a(com.voltasit.obdeleven.domain.usecases.f.class);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f7410C = KoinJavaComponent.b(t.class, null, null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f7411D = KoinJavaComponent.b(SfdViewModel.class, null, new p(0));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f7412E = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 0;
        T();
        ?? r10 = this.f7411D;
        z((com.voltasit.obdeleven.presentation.d) r10.getValue());
        ((SfdViewModel) r10.getValue()).f31218u.e(getViewLifecycleOwner(), new e(this, i10));
        ((SfdViewModel) r10.getValue()).f31207A.e(getViewLifecycleOwner(), new f(this, i10));
        ((SfdViewModel) r10.getValue()).f31220w.e(getViewLifecycleOwner(), new h(this, i10));
        ((SfdViewModel) r10.getValue()).f31222y.e(getViewLifecycleOwner(), new i(this, i10));
        ((SfdViewModel) r10.getValue()).f31209C.e(getViewLifecycleOwner(), new j(this, i10));
        ?? r11 = this.f7410C;
        ((t) r11.getValue()).f7427p.e(getViewLifecycleOwner(), new b(this, i10));
        O().f32797E.e(getViewLifecycleOwner(), new u(this, 1));
        O().f32795C.e(getViewLifecycleOwner(), new v(this, 1));
        z((com.voltasit.obdeleven.presentation.d) r11.getValue());
        p135k9.a aVar = new p135k9.a(q(), this.f7409B.a());
        this.f7415p = aVar;
        aVar.f42885c = this;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_uds_data, viewGroup, false);
        if (this.f7416q == null) {
            return viewInflate;
        }
        this.f7413n = (LinearLayout) viewInflate.findViewById(R.id.fragmentUdsData_dataLayout);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fragmentUdsData_dataTitle);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.fragmentUdsData_dataList);
        FloatingActionButton floatingActionButton = (FloatingActionButton) viewInflate.findViewById(R.id.fragmentUdsData_fab);
        this.f7414o = floatingActionButton;
        Q(floatingActionButton);
        if (this.f7408A) {
            this.f7414o.h();
        } else {
            this.f7414o.n();
            O().c(true);
        }
        A.b(recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f7415p);
        textView.setText(getString(R.string.common_long_coding));
        if (this.f7408A || (W7.c.e() && this.f7416q != null)) {
            J();
            Task.callInBackground(new q(i10, this)).continueWith(new r(0, this), Task.UI_THREAD_EXECUTOR);
        } else {
            p279w9.b bVar = Application.f29634b;
            P8.c.a(3, "UDSLongCodingFragment", "switchToMain(), onCreateInnerView", Arrays.copyOf(new Object[0], 0));
            r().o(false);
        }
        getParentFragmentManager().b0("SfdWizardFullScreenDialog", this, new m(i10, this));
        getChildFragmentManager().b0("SfdAutoUnlockDialog", this, new n(this));
        return viewInflate;
    }

    public final boolean U(boolean z10) {
        Param param = this.f7421v.f29414c;
        this.f7423x = param;
        if (param.f29453a != Param.Type.f29468c) {
            return false;
        }
        for (Param param2 : param.f29456d) {
            String str = param2.f29455c;
            if (str != null && str.equals("Param_VWCodinValueTextu")) {
                this.f7423x = param2;
                ArrayList arrayListC = param2.c(false);
                if (arrayListC.isEmpty() || (arrayListC.size() == 1 && ((Param) arrayListC.get(0)).f29462k.getPHYSICALTYPE().getBASEDATATYPE() == PHYSICALDATATYPE.A_BYTEFIELD)) {
                    break;
                    break;
                }
                boolean z11 = this.f7408A;
                ArrayList arrayList = this.f7422w;
                if (!z11 && z10 && arrayList.size() == arrayListC.size()) {
                    final HashMap map = new HashMap();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        Param param3 = (Param) arrayList.get(i10);
                        Param param4 = (Param) arrayListC.get(i10);
                        if (!param3.f29459g.equals(param4.f29459g)) {
                            map.put(param3, param4);
                        }
                    }
                    if (!map.isEmpty()) {
                        H(R.string.common_saving);
                        Task.callInBackground(new Callable() { // from class: X8.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                HistoryUtils.UDSDataType uDSDataType = HistoryUtils.UDSDataType.f34228c;
                                s sVar = this.f7376b;
                                ControlUnit controlUnit = sVar.f7416q;
                                return HistoryUtils.c(uDSDataType, controlUnit.f29321c.f42726c, controlUnit, sVar.f7417r.getCOMPUCONST().getVT().getValue(), sVar.f7417r.getCOMPUCONST().getVT().getTI(), map);
                            }
                        }).continueWith(new x(1, this), Task.UI_THREAD_EXECUTOR);
                    }
                }
                arrayList.clear();
                this.f7415p.b();
                this.f7415p.a(arrayListC);
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Param) it.next()).clone());
                }
                this.f7415p.notifyDataSetChanged();
                this.f7414o.setEnabled(true);
                if (this.f7408A) {
                    this.f7414o.h();
                } else {
                    this.f7414o.n();
                }
                this.f7413n.setVisibility(0);
                MenuItem menuItem = this.f7424y;
                if (menuItem != null) {
                    menuItem.setEnabled(true);
                }
                UserTrackingUtils.c(UserTrackingUtils.Key.f34271p, 1);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xa.g] */
    public final void V() {
        ((J8.a) this.f7412E.getValue()).x();
        O.e.s("UDSLongCodingFragment", "longClickWriteButton()");
        if (this.f7421v == null) {
            E(R.string.common_something_went_wrong);
            return;
        }
        try {
            MenuItem menuItem = this.f7424y;
            if (menuItem != null) {
                menuItem.setEnabled(false);
            }
            StringBuilder sb2 = new StringBuilder();
            byte[] bArrG = this.f7423x.g();
            Object[] objArr = {Integer.valueOf(bArrG.length)};
            p279w9.b bVar = Application.f29634b;
            P8.c.a(3, "UDSLongCodingFragment", "pduData.size():(%d)", Arrays.copyOf(objArr, 1));
            for (byte b10 : bArrG) {
                sb2.append(String.format(Locale.US, "%02X", Byte.valueOf(b10)));
            }
            Object[] objArr2 = {sb2.toString()};
            p279w9.b bVar2 = Application.f29634b;
            P8.c.a(3, "UDSLongCodingFragment", "pdu:(%s)", Arrays.copyOf(objArr2, 1));
            Y(sb2.toString());
        } catch (Exception e10) {
            w();
            O.e.m(e10);
            E(R.string.common_something_went_wrong);
        }
    }

    public final void W(final boolean z10) {
        J();
        this.f7416q.D(false).continueWithTask(new Continuation() { // from class: X8.k
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) throws InterruptedException {
                s sVar = this.f7395a;
                sVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(null);
                }
                ControlUnit controlUnit = sVar.f7416q;
                COMPUSCALE compuscale = sVar.f7417r;
                com.obdeleven.service.odx.e.g gVar = sVar.f7418s;
                controlUnit.getClass();
                O.e.s("ControlUnit", "udsReadDataByIdentWithSaving");
                Task<UDSResult> taskI0 = controlUnit.I0(compuscale, gVar, true);
                taskI0.waitForCompletion();
                UDSResult result = taskI0.getResult();
                sVar.f7421v = result;
                if (!z10) {
                    return taskI0;
                }
                sVar.f7416q.E0(result.f29415d, false);
                return taskI0;
            }
        }, Task.BACKGROUND_EXECUTOR).continueWith((Continuation<TContinuationResult, TContinuationResult>) new Continuation() { // from class: X8.l
            /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, xa.g] */
            /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, xa.g] */
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                s sVar = this.f7397a;
                sVar.w();
                if (task.isFaulted() && (task.getError() instanceof OdxFactory$Exception)) {
                    int iA = ((OdxFactory$Exception) task.getError()).a();
                    if (iA == 0) {
                        sVar.E(R.string.common_check_network_try_again);
                    } else if (iA != 1) {
                        sVar.E(R.string.common_something_went_wrong);
                    } else {
                        sVar.E(R.string.common_description_data_na);
                    }
                    p279w9.b bVar = Application.f29634b;
                    P8.c.a(3, "UDSLongCodingFragment", "popFragment() because request task error", Arrays.copyOf(new Object[0], 0));
                    sVar.r().h();
                    return null;
                }
                UDSResult uDSResult = sVar.f7421v;
                if (uDSResult == null) {
                    p279w9.b bVar2 = Application.f29634b;
                    P8.c.a(3, "UDSLongCodingFragment", "popFragment() because request udsResult is null", Arrays.copyOf(new Object[0], 0));
                    sVar.E(R.string.common_something_went_wrong);
                    sVar.r().h();
                    return null;
                }
                UDSResult.Type type = UDSResult.Type.f29417c;
                UDSResult.Type type2 = uDSResult.f29412a;
                boolean z11 = z10;
                if (type2 != type) {
                    if (sVar.U(z11)) {
                        return null;
                    }
                    sVar.X();
                    return null;
                }
                if (uDSResult.f29413b == 51) {
                    ?? r10 = sVar.f7410C;
                    ((t) r10.getValue()).f7428q = 0;
                    t tVar = (t) r10.getValue();
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    tVar.getClass();
                    tVar.f7429r = boolValueOf;
                    ((SfdViewModel) sVar.f7411D.getValue()).b(sVar.f7416q.f29320b.getControlUnitBase().getObjectId(), sVar.f7416q.n().shortValue());
                    return null;
                }
                sVar.f7415p.b();
                p135k9.a aVar = sVar.f7415p;
                aVar.f42884b.add(sVar.f7421v.f29414c);
                aVar.notifyDataSetChanged();
                sVar.f7415p.notifyDataSetChanged();
                sVar.f7414o.setEnabled(false);
                sVar.f7414o.n();
                sVar.f7413n.setVisibility(0);
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    public final void X() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "UDSLongCodingFragment", "switchSimpleLongCoding()", Arrays.copyOf(new Object[0], 0));
        com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q();
        ControlUnit controlUnit = this.f7416q;
        boolean z10 = this.f7408A;
        qVar.f31857z = controlUnit;
        qVar.f31835F = false;
        qVar.f31832C = z10;
        r().n(qVar, null);
    }

    public final void Y(final String str) {
        J();
        final Handler handler = new Handler(Looper.getMainLooper());
        Task.callInBackground(new Callable() { // from class: X8.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                Handler handler2 = handler;
                s sVar = this.f7386b;
                sVar.getClass();
                try {
                    sVar.Z(str2, handler2);
                    return null;
                } catch (Exception e10) {
                    O.e.m(e10);
                    handler2.post(new a(0, sVar));
                    return null;
                }
            }
        });
    }

    public final void Z(String str, Handler handler) throws Exception {
        O.e.s("UDSLongCodingFragment", "writeLongCoding()");
        ControlUnit controlUnit = this.f7416q;
        if (controlUnit.f29321c.i(controlUnit)) {
            handler.post(new I4.q(1, this));
            return;
        }
        this.f7416q.D(false).waitForCompletion();
        Task<Integer> taskJ0 = this.f7416q.J0(this.f7417r, str);
        taskJ0.waitForCompletion();
        handler.post(new d(this, taskJ0, str, 0));
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (!str.equals("SecurityAccessDialogFragment")) {
            if ("PopTheHoodDialog".equals(str) && callbackType == DialogCallback.CallbackType.f31102c) {
                V();
                return;
            }
            return;
        }
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            Bundle bundle2 = bundle.getBundle("key_bundle");
            if (bundle2.getInt("key_type") == 0) {
                W(bundle2.getBoolean("key_data"));
            } else {
                Y(bundle2.getString("key_data"));
            }
        } else {
            w();
        }
        B0 b10 = this.f7425z;
        if (b10 != null) {
            b10.y();
            this.f7425z = null;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "UDSLongCodingFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        E e10 = this.f7419t;
        if (e10 != null) {
            this.f7416q.f29321c = new a2(e10);
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemAdd = menu.add("codingType");
        this.f7424y = menuItemAdd;
        menuItemAdd.setIcon(2131231409);
        this.f7424y.setShowAsAction(2);
        this.f7424y.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: X8.o
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int i10 = 0;
                while (true) {
                    s sVar = this.f7402a;
                    ArrayList arrayList = sVar.f7422w;
                    if (i10 >= arrayList.size()) {
                        com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q();
                        ControlUnit controlUnit = sVar.f7416q;
                        boolean z10 = sVar.f7408A;
                        qVar.f31857z = controlUnit;
                        qVar.f31835F = true;
                        qVar.f31832C = z10;
                        sVar.r().n(qVar, null);
                        break;
                    }
                    if (!((Param) arrayList.get(i10)).f29459g.equals(sVar.f7415p.c(i10).f29459g)) {
                        sVar.E(R.string.snackbar_save_changes_first);
                        break;
                    }
                    i10++;
                }
                return true;
            }
        });
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f7420u.a();
        B0 b10 = this.f7425z;
        if (b10 != null) {
            b10.y();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        Param paramC = this.f7415p.c(i10);
        Param.Type type = paramC.f29453a;
        if (type == Param.Type.f29473h || type == Param.Type.f29472g) {
            return;
        }
        String strD = paramC.d();
        this.f7420u.b(getActivity(), strD, paramC, this.f7408A, this.f7409B.a()).continueWith(new V8.q(1, this), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_long_coding);
    }
}
