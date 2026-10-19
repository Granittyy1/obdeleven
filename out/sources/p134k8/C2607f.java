package p134k8;

import O.e;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2607f implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42753b;

    public /* synthetic */ C2607f(int i10, ControlUnit controlUnit) {
        this.f42752a = i10;
        this.f42753b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws Exception {
        switch (this.f42752a) {
            case 0:
                ControlUnit controlUnit = this.f42753b;
                controlUnit.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(Boolean.FALSE);
                }
                ApplicationProtocol applicationProtocol = controlUnit.f29327i;
                if (applicationProtocol == ApplicationProtocol.f29262b) {
                    return Task.forResult(Boolean.TRUE);
                }
                return applicationProtocol != ApplicationProtocol.f29264d ? controlUnit.g0() : Task.forResult(Boolean.FALSE);
            default:
                ControlUnit controlUnit2 = this.f42753b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                if (!str.startsWith("55")) {
                    throw new Exception();
                }
                String strSubstring = str.substring(2);
                int i10 = (~Integer.parseInt(strSubstring.substring(2, 4), 16)) & 255;
                if (strSubstring.startsWith("018A") || strSubstring.startsWith("0185") || strSubstring.startsWith("010A") || strSubstring.startsWith("0105")) {
                    controlUnit2.w0(ApplicationProtocol.f29262b);
                    controlUnit2.G0(new b());
                } else {
                    if (controlUnit2.T() == null || controlUnit2.T().isEmpty()) {
                        e.l("ControlUnit", "klineKwp2000Id missing");
                        return Task.forError(new Exception("klineKwp2000Id required"));
                    }
                    controlUnit2.w0(ApplicationProtocol.f29263c);
                    controlUnit2.G0(new Kwp2000Protocol(Integer.parseInt(controlUnit2.T(), 16), Kwp2000Protocol.Type.f29521b));
                }
                controlUnit2.j = new ControlUnit.h(500, "kbps");
                return new O0(String.format("%02X", Integer.valueOf(i10)), 1000L).a().onSuccessTask(new C2631n(2, controlUnit2));
        }
    }
}
