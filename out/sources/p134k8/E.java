package p134k8;

import O.e;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p181o8.c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42586b;

    public /* synthetic */ E(int i10, ControlUnit controlUnit) {
        this.f42585a = i10;
        this.f42586b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws ControlUnitException, OdxFactory$Exception {
        switch (this.f42585a) {
            case 0:
                ControlUnit controlUnit = this.f42586b;
                controlUnit.getClass();
                String str = (String) task.getResult();
                if (!str.startsWith("59")) {
                    e.D(controlUnit.f0(), "Bad response: ".concat(str));
                    return null;
                }
                if (controlUnit.f29322d == null) {
                    controlUnit.Z();
                }
                String strSubstring = str.substring(12);
                if (!strSubstring.isEmpty()) {
                    return new c(controlUnit.f29322d, strSubstring);
                }
                e.j(controlUnit.f0(), "Empty result for fault's freeze frame!");
                return null;
            default:
                ControlUnit controlUnit2 = this.f42586b;
                controlUnit2.getClass();
                String str2 = (String) task.getResult();
                if (!str2.startsWith("71B8")) {
                    return Boolean.FALSE;
                }
                if (str2.contains("0102")) {
                    controlUnit2.f29329l.add(SupportedFunction.f29290l);
                }
                if (str2.contains("0103")) {
                    controlUnit2.f29329l.add(SupportedFunction.f29288i);
                }
                if (str2.contains("0105")) {
                    controlUnit2.f29329l.add(SupportedFunction.f29291m);
                }
                if (str2.contains("0107")) {
                    controlUnit2.f29329l.add(SupportedFunction.f29299u);
                }
                if (str2.contains("010A")) {
                    controlUnit2.f29329l.add(SupportedFunction.j);
                }
                if (str2.contains("0118")) {
                    controlUnit2.f29329l.add(SupportedFunction.f29300v);
                }
                controlUnit2.f29329l.add(SupportedFunction.f29289k);
                return Boolean.TRUE;
        }
    }
}
