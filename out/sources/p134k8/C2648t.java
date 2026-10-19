package p134k8;

import O.e;
import com.obdeleven.service.core.gen1.d;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.m0;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.q;
import java.util.ArrayList;
import p109i8.k;

/* JADX INFO: renamed from: k8.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2648t implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42844b;

    public /* synthetic */ C2648t(int i10, ControlUnit controlUnit) {
        this.f42843a = i10;
        this.f42844b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42843a) {
            case 0:
                ControlUnit controlUnit = this.f42844b;
                controlUnit.getClass();
                String str = ((d.a) task.getResult()).f29260a;
                boolean z10 = ((d.a) task.getResult()).f29261b;
                controlUnit.j = new ControlUnit.h(1000000 / ((Integer.parseInt(str.substring(0, 2), 16) | (Integer.parseInt(str.substring(2, 4), 16) << 8)) & 65535), "bps");
                if (!z10) {
                    controlUnit.f29326h = TransportProtocol.f29304c;
                    controlUnit.w0(ApplicationProtocol.f29262b);
                    controlUnit.G0(new b());
                    return controlUnit.E(str, true);
                }
                if (controlUnit.T() == null || controlUnit.T().isEmpty()) {
                    e.l("ControlUnit", "klineKwp2000Id missing");
                    return Task.forError(new Exception("klineKwp2000Id required"));
                }
                controlUnit.f29326h = TransportProtocol.f29305d;
                controlUnit.w0(ApplicationProtocol.f29263c);
                controlUnit.G0(new Kwp2000Protocol(Integer.parseInt(controlUnit.T(), 16), Kwp2000Protocol.Type.f29521b));
                return Task.delay(55L).continueWithTask(new m0(1, controlUnit)).onSuccess(new q(1));
            case 1:
                ControlUnit controlUnit2 = this.f42844b;
                ApplicationProtocol applicationProtocol = controlUnit2.f29327i;
                ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29264d;
                k kVar = controlUnit2.f29335r;
                if (applicationProtocol != applicationProtocol2) {
                    e.j(controlUnit2.f0(), "readSubsystemsKWP2000()");
                    return kVar.d("220607").continueWithTask(new U(controlUnit2)).continueWith(new R0(controlUnit2));
                }
                controlUnit2.f29331n = new ArrayList();
                e.j(controlUnit2.f0(), "readSubsystemsUDS()");
                return kVar.d("220606").continueWithTask(new W(0, controlUnit2)).continueWith(new V(controlUnit2));
            default:
                return this.f42844b.f29335r.d("220600");
        }
    }
}
