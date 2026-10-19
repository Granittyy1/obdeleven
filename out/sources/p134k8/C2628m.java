package p134k8;

import O.e;
import com.obdeleven.service.core.c;
import com.obdeleven.service.core.gen1.b;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import p109i8.d;

/* JADX INFO: renamed from: k8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2628m implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42788b;

    public /* synthetic */ C2628m(int i10, ControlUnit controlUnit) {
        this.f42787a = i10;
        this.f42788b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42787a) {
            case 0:
                ControlUnit controlUnit = this.f42788b;
                if (controlUnit.f29324f == null || !controlUnit.f29324f.d()) {
                    return Task.forResult(Boolean.TRUE);
                }
                d dVar = controlUnit.f29339v;
                Protocol protocol = controlUnit.f29324f;
                ((c) dVar).getClass();
                return protocol.a().continueWith(new C2645s(0, controlUnit));
            case 1:
                ControlUnit controlUnit2 = this.f42788b;
                controlUnit2.getClass();
                e.j("ControlUnit", "identifySupportedFunctions - connected");
                if (((Boolean) task.getResult()).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    controlUnit2.f29329l = arrayList;
                    ApplicationProtocol applicationProtocol = controlUnit2.f29327i;
                    if (applicationProtocol == ApplicationProtocol.f29262b || applicationProtocol == ApplicationProtocol.f29264d) {
                        arrayList.add(SupportedFunction.f29288i);
                        controlUnit2.f29329l.add(SupportedFunction.f29289k);
                        controlUnit2.f29329l.add(SupportedFunction.f29290l);
                        return Task.forResult(Boolean.TRUE);
                    }
                    if (applicationProtocol == ApplicationProtocol.f29263c) {
                        return controlUnit2.f29335r.d("31B80000").continueWith(new E(1, controlUnit2));
                    }
                }
                return Task.forResult(Boolean.FALSE);
            default:
                ((c) this.f42788b.f29339v).getClass();
                return new b().a();
        }
    }
}
