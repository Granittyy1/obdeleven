package V8;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService01;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.Param;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.w0;
import com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2167r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p134k8.C2663y;
import p134k8.C2665y1;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6808b;

    public /* synthetic */ n(int i10, Object obj) {
        this.f6807a = i10;
        this.f6808b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task12) {
        Object obj = this.f6808b;
        switch (this.f6807a) {
            case 0:
                o oVar = (o) obj;
                oVar.getClass();
                return !((Boolean) task12.getResult()).booleanValue() ? oVar.f6816s.e() : Task.forResult(Boolean.TRUE);
            case 1:
                w0 w0Var = (w0) obj;
                w0Var.getClass();
                String str = (String) task12.getResult();
                if (str == null) {
                    str = "";
                }
                return (str.startsWith("62") && kotlin.jvm.internal.n.d(str.substring(6)).startsWith(w0Var.f30184l)) ? 0 : -3;
            case 2:
                OnlineControlUnitFragment this$0 = (OnlineControlUnitFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task12, "task12");
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "OnlineControlUnitFragment", "task.result4(" + task12.getResult() + ")", Arrays.copyOf(new Object[0], 0));
                Object result = task12.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                if (!((Boolean) result).booleanValue()) {
                    return Task.forResult(Boolean.FALSE);
                }
                ControlUnit controlUnit = this$0.f31429o;
                kotlin.jvm.internal.i.b(controlUnit);
                return controlUnit.i0();
            case 3:
                UDSOutputTestFragment this$1 = (UDSOutputTestFragment) obj;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.e(task12, "task");
                if (task12.getResult() != null && this$1.f31977y) {
                    Object result2 = task12.getResult();
                    kotlin.jvm.internal.i.b(result2);
                    Param param = (Param) ((UDSResult) result2).f29414c.c(false).get(0);
                    LinearLayout linearLayout = this$1.f31964l;
                    kotlin.jvm.internal.i.b(linearLayout);
                    linearLayout.setVisibility(0);
                    TextView textView = this$1.f31965m;
                    kotlin.jvm.internal.i.b(textView);
                    textView.setText(param.f());
                    if (kotlin.jvm.internal.i.a(param.f29460h, "MAS00086")) {
                        FloatingActionButton floatingActionButton = this$1.f31968p;
                        kotlin.jvm.internal.i.b(floatingActionButton);
                        floatingActionButton.setImageResource(2131231724);
                        FloatingActionButton floatingActionButton2 = this$1.f31968p;
                        kotlin.jvm.internal.i.b(floatingActionButton2);
                        floatingActionButton2.setBackgroundTintList(this$1.getResources().getColorStateList(R.color.fab_selector_red));
                        this$1.f31978z = true;
                    } else {
                        FloatingActionButton floatingActionButton3 = this$1.f31968p;
                        kotlin.jvm.internal.i.b(floatingActionButton3);
                        floatingActionButton3.setImageResource(2131231137);
                        FloatingActionButton floatingActionButton4 = this$1.f31968p;
                        kotlin.jvm.internal.i.b(floatingActionButton4);
                        floatingActionButton4.setBackgroundTintList(this$1.getResources().getColorStateList(R.color.fab_selector_green));
                        this$1.f31978z = false;
                    }
                }
                if (this$1.f31977y) {
                    this$1.P();
                } else {
                    this$1.S(true);
                }
                return null;
            case 4:
                ((B0.a) obj).a();
                return null;
            case 5:
                com.voltasit.obdeleven.utils.bluetooth.o oVar2 = (com.voltasit.obdeleven.utils.bluetooth.o) obj;
                oVar2.getClass();
                return oVar2.p((task12.isFaulted() ? 2 : (Integer) task12.getResult()).intValue() == 3);
            case 6:
                p073f9.k kVar = (p073f9.k) obj;
                kVar.w();
                if (task12.isFaulted()) {
                    P.a(kVar.q(), I.b.h((CommandException) task12.getError(), kVar.getContext()));
                } else {
                    List list = (List) task12.getResult();
                    List listAsList = Arrays.asList(OBDIIService01.f29401b, OBDIIService01.f29402c, OBDIIService01.f29403d, OBDIIService01.f29404e, OBDIIService01.f29405f, OBDIIService01.f29406g, OBDIIService01.f29407h);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!listAsList.contains(obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    kVar.f35055G = arrayList;
                    if (arrayList.isEmpty()) {
                        kVar.E(R.string.snackbar_no_information_available);
                    } else {
                        Bundle bundle = new Bundle();
                        ArrayList arrayList2 = kVar.f35055G;
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((p109i8.j) it.next()).name());
                        }
                        bundle.putStringArrayList("items", arrayList3);
                        bundle.putString("key_title", kVar.getString(R.string.common_add_value));
                        C2167r0 c2167r0 = new C2167r0();
                        c2167r0.setArguments(bundle);
                        c2167r0.f32261r = kVar.getFragmentManager();
                        c2167r0.setTargetFragment(kVar, 0);
                        kVar.f35054F = c2167r0;
                        c2167r0.A();
                    }
                }
                return null;
            case 7:
                ControlUnit controlUnit2 = (ControlUnit) obj;
                controlUnit2.getClass();
                if (!((Boolean) task12.getResult()).booleanValue()) {
                    return Task.forResult(Boolean.FALSE);
                }
                ApplicationProtocol applicationProtocol = controlUnit2.f29327i;
                if (applicationProtocol == ApplicationProtocol.f29262b) {
                    return Task.forResult(Boolean.TRUE);
                }
                return applicationProtocol != ApplicationProtocol.f29266f ? Task.forResult(null).continueWithTask(new C2663y(0, controlUnit2)).continueWithTask(new com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.d(1 == true ? 1 : 0, controlUnit2)) : Task.forResult(Boolean.FALSE);
            default:
                ((OBDIICu) obj).getClass();
                return new C2665y1("0100", 500L).a();
        }
    }
}
