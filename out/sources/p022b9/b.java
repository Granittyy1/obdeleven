package p022b9;

import O.e;
import V8.k;
import android.os.Bundle;
import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService01;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.n0;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2169s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p010a9.c;
import p109i8.j;
import p134k8.a2;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20619b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f20618a = i10;
        this.f20619b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        Object obj = this.f20619b;
        switch (this.f20618a) {
            case 0:
                f fVar = (f) obj;
                fVar.getClass();
                if (task.isFaulted()) {
                    fVar.R(task);
                } else if (!fVar.f20631r) {
                    fVar.f20631r = true;
                    fVar.Q(true);
                }
                fVar.f20626m.setClickable(true);
                fVar.f20634u.setRefreshing(false);
                return null;
            case 1:
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                String str = (String) task.getResult();
                if (str.startsWith("7F")) {
                    return -3;
                }
                n0Var.f(str);
                return 0;
            case 2:
                m mVar = (m) obj;
                mVar.getClass();
                C2134a0.a();
                mVar.U();
                return null;
            case 3:
                p073f9.b bVar = (p073f9.b) obj;
                if (bVar.isVisible()) {
                    bVar.f35015v.notifyDataSetChanged();
                    if (bVar.f35013t == 1) {
                        bVar.f35005l.c();
                    }
                }
                return null;
            case 4:
                StringBuilder sb2 = new StringBuilder();
                OBDIICu oBDIICu = (OBDIICu) obj;
                sb2.append(oBDIICu.t());
                sb2.append("_");
                sb2.append(oBDIICu.getName());
                e.j(sb2.toString(), "connectKline()");
                return new SetProtocolCommand(SetProtocolCommand.Protocol.K_LINE).a().onSuccessTask(new c(1)).onSuccessTask(new k(8, oBDIICu));
            case 5:
                return ((a2) obj).f42731h.a();
            default:
                p182o9.c cVar = (p182o9.c) obj;
                cVar.w();
                if (task.isFaulted()) {
                    P.a(cVar.q(), I.b.h((CommandException) task.getError(), cVar.getContext()));
                } else {
                    List list = (List) task.getResult();
                    List listAsList = Arrays.asList(OBDIIService01.f29401b, OBDIIService01.f29402c, OBDIIService01.f29403d, OBDIIService01.f29404e, OBDIIService01.f29405f, OBDIIService01.f29406g, OBDIIService01.f29407h);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!listAsList.contains(obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        cVar.Q();
                    } else {
                        Bundle bundle = new Bundle();
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((j) it.next()).name());
                        }
                        bundle.putStringArrayList("items", arrayList2);
                        bundle.putStringArrayList("key_selected_items", cVar.f45244y);
                        C2169s0 c2169s0 = new C2169s0();
                        c2169s0.setArguments(bundle);
                        c2169s0.f32261r = cVar.getFragmentManager();
                        c2169s0.setTargetFragment(cVar, 0);
                        cVar.f45242A = c2169s0;
                        c2169s0.A();
                    }
                }
                return null;
        }
    }
}
