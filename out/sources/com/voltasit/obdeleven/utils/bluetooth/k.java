package com.voltasit.obdeleven.utils.bluetooth;

import android.os.Handler;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.B;
import com.voltasit.obdeleven.ui.activity.v;
import java.util.Iterator;
import java.util.List;
import p033c7.RunnableC1499l;
import p134k8.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34363c;

    public /* synthetic */ k(Object obj, int i10, Object obj2) {
        this.f34361a = i10;
        this.f34362b = obj;
        this.f34363c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f34361a) {
            case 0:
                m mVar = (m) this.f34362b;
                mVar.getClass();
                O.e.j("Device", "writeFirmware()");
                Task taskForResult = Task.forResult(null);
                Iterator it = ((List) this.f34363c).iterator();
                while (it.hasNext()) {
                    taskForResult = taskForResult.onSuccessTask(new v(mVar, 1, (String) it.next()));
                }
                return taskForResult;
            case 1:
                p097h9.j jVar = (p097h9.j) this.f34362b;
                jVar.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    p255u9.j jVar2 = (p255u9.j) this.f34363c;
                    if (jVar2.getObjectId() != null) {
                        jVar.f36206h.add(jVar2);
                    }
                    int iIndexOf = jVar.f36795b.indexOf(jVar2);
                    jVar.f36795b.remove(jVar2);
                    int i10 = iIndexOf + 1;
                    jVar.notifyItemRemoved(i10);
                    jVar.notifyItemRangeChanged(i10, jVar.getItemCount() - iIndexOf);
                    jVar.f36207i = true;
                }
                if (jVar.j == null) {
                    return null;
                }
                new Handler().post(new RunnableC1499l(1, jVar));
                return null;
            default:
                ControlUnit controlUnit = (ControlUnit) this.f34362b;
                controlUnit.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(null);
                }
                ApplicationProtocol applicationProtocol = controlUnit.f29327i;
                ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29263c;
                Fault fault = (Fault) this.f34363c;
                p109i8.k kVar = controlUnit.f29335r;
                if (applicationProtocol == applicationProtocol2) {
                    O.e.s(controlUnit.f0(), "readFreezeFrameKWP(fault=" + fault.f29432c + ")");
                    return kVar.d("120004" + fault.f29432c).continueWith(new B(5, controlUnit));
                }
                O.e.s(controlUnit.f0(), "readFreezeFrameUDS(fault=" + fault.f29432c + ")");
                return kVar.d("1906" + com.obdeleven.service.util.b.d(6, fault.f29432c) + "FF").continueWith(new E(0, controlUnit));
        }
    }
}
