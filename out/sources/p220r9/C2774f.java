package p220r9;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p109i8.k;

/* JADX INFO: renamed from: r9.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2774f implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f46462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46463b;

    public /* synthetic */ C2774f(int i10, ControlUnit controlUnit) {
        this.f46462a = controlUnit;
        this.f46463b = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        ControlUnit controlUnit = this.f46462a;
        ApplicationProtocol applicationProtocol = controlUnit.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29263c;
        int i10 = this.f46463b;
        k kVar = controlUnit.f29335r;
        if (applicationProtocol == applicationProtocol2) {
            if (i10 >= 128) {
                i10 -= 127;
            }
            return kVar.d(String.format("21%02X", Integer.valueOf(i10)));
        }
        if (applicationProtocol == ApplicationProtocol.f29262b) {
            return i10 == 0 ? kVar.d("12") : kVar.d(String.format("29%02X", Integer.valueOf(i10)));
        }
        return null;
    }
}
