package p134k8;

import J8.a;
import O.e;
import O.h;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.f;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import kotlin.jvm.internal.i;
import p084g8.c;

/* JADX INFO: renamed from: k8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2619j implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42774b;

    public /* synthetic */ C2619j(int i10, ControlUnit controlUnit) {
        this.f42773a = i10;
        this.f42774b = controlUnit;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xa.g] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42773a) {
            case 0:
                ControlUnit controlUnit = this.f42774b;
                controlUnit.getClass();
                if (Boolean.TRUE.equals(task.getResult())) {
                    return controlUnit.f29330m;
                }
                return null;
            case 1:
                ControlUnit controlUnit2 = this.f42774b;
                controlUnit2.getClass();
                if (task.isFaulted()) {
                    e.m(task.getError());
                    return Boolean.FALSE;
                }
                f fVar = new f();
                ((c) controlUnit2.f29341x.getValue()).b(controlUnit2.n().shortValue(), fVar);
                controlUnit2.G0(fVar);
                controlUnit2.w0(ApplicationProtocol.f29264d);
                controlUnit2.j = new ControlUnit.h(500, "kbps");
                return Boolean.TRUE;
            default:
                ControlUnit controlUnit3 = this.f42774b;
                controlUnit3.getClass();
                String str = (String) task.getResult();
                if (!str.startsWith("62F19E")) {
                    if (!str.startsWith("7F22")) {
                        return null;
                    }
                    controlUnit3.F0("");
                    return null;
                }
                String hexString = str.substring(6);
                if (hexString.contains(String.valueOf((char) 0))) {
                    ((a) controlUnit3.f29343z.getValue()).c0(controlUnit3.f29321c.f42726c.getObjectId(), hexString);
                }
                i.e(hexString, "hexString");
                StringBuilder sb2 = new StringBuilder();
                int i10 = 0;
                while (i10 < hexString.length()) {
                    int i11 = i10 + 2;
                    String strSubstring = hexString.substring(i10, i11);
                    i.d(strSubstring, "substring(...)");
                    h.c(16);
                    int i12 = Integer.parseInt(strSubstring, 16);
                    if (i12 != 0) {
                        sb2.append((char) i12);
                    }
                    i10 = i11;
                }
                String string = sb2.toString();
                i.d(string, "toString(...)");
                controlUnit3.F0(string.trim());
                return null;
        }
    }
}
