package p134k8;

import com.obdeleven.service.core.c;
import com.obdeleven.service.core.gen1.b;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2654v implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42859b;

    public /* synthetic */ C2654v(int i10, ControlUnit controlUnit) {
        this.f42858a = i10;
        this.f42859b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42858a) {
            case 0:
                ControlUnit controlUnit = this.f42859b;
                return controlUnit.f29327i != ApplicationProtocol.f29264d ? controlUnit.g0() : Task.forResult(Boolean.FALSE);
            default:
                ((c) this.f42859b.f29339v).getClass();
                return new b().a();
        }
    }
}
