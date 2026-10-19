package p134k8;

import com.obdeleven.service.core.a;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Protocol;
import com.obdeleven.service.protocol.c;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p109i8.d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42630b;

    public /* synthetic */ O(int i10, ControlUnit controlUnit) {
        this.f42629a = i10;
        this.f42630b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42629a) {
            case 0:
                ControlUnit controlUnit = this.f42630b;
                controlUnit.w0(ApplicationProtocol.f29263c);
                controlUnit.G0(new c());
                controlUnit.j = new ControlUnit.h(500, "kbps");
                d dVar = controlUnit.f29339v;
                Protocol protocol = controlUnit.f29324f;
                ((com.obdeleven.service.core.c) dVar).getClass();
                return protocol.g("1089").continueWithTask(new a(0));
            default:
                return this.f42630b.D(false);
        }
    }
}
