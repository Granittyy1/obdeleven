package coil.compose;

import android.content.Context;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f22839a = p013b0.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z2.c f22840b = new Z2.c(Z2.e.f7731c);

    public static final coil.request.g a(Object obj, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.e(1087186730);
        if (obj instanceof coil.request.g) {
            coil.request.g gVar = (coil.request.g) obj;
            interfaceC1084f.I();
            return gVar;
        }
        Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        interfaceC1084f.e(-1245195153);
        boolean zK = interfaceC1084f.K(context) | interfaceC1084f.K(obj);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            coil.request.g.a aVar = new coil.request.g.a(context);
            aVar.f23074c = obj;
            objF = aVar.a();
            interfaceC1084f.E(objF);
        }
        coil.request.g gVar2 = (coil.request.g) objF;
        interfaceC1084f.I();
        interfaceC1084f.I();
        return gVar2;
    }

    public static final coil.request.g b(Object obj, InterfaceC1161g interfaceC1161g, InterfaceC1084f interfaceC1084f) {
        Z2.f fVar;
        interfaceC1084f.e(1677680258);
        boolean z10 = obj instanceof coil.request.g;
        if (z10) {
            coil.request.g gVar = (coil.request.g) obj;
            if (gVar.f23044F.f23027a != null) {
                interfaceC1084f.I();
                return gVar;
            }
        }
        interfaceC1084f.e(408306591);
        boolean zA = kotlin.jvm.internal.i.a(interfaceC1161g, InterfaceC1161g.a.f14248f);
        Object obj2 = InterfaceC1084f.a.f12980a;
        if (zA) {
            fVar = f22840b;
        } else {
            interfaceC1084f.e(408309406);
            Object objF = interfaceC1084f.f();
            if (objF == obj2) {
                objF = new ConstraintsSizeResolver();
                interfaceC1084f.E(objF);
            }
            fVar = (ConstraintsSizeResolver) objF;
            interfaceC1084f.I();
        }
        interfaceC1084f.I();
        if (z10) {
            interfaceC1084f.e(-227230258);
            coil.request.g gVar2 = (coil.request.g) obj;
            interfaceC1084f.e(408312509);
            boolean zK = interfaceC1084f.K(gVar2) | interfaceC1084f.K(fVar);
            Object objF2 = interfaceC1084f.f();
            if (zK || objF2 == obj2) {
                coil.request.g.a aVarA = coil.request.g.a(gVar2);
                aVarA.f23093w = fVar;
                aVarA.d();
                objF2 = aVarA.a();
                interfaceC1084f.E(objF2);
            }
            coil.request.g gVar3 = (coil.request.g) objF2;
            interfaceC1084f.I();
            interfaceC1084f.I();
            interfaceC1084f.I();
            return gVar3;
        }
        interfaceC1084f.e(-227066702);
        Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
        interfaceC1084f.e(408319118);
        boolean zK2 = interfaceC1084f.K(context) | interfaceC1084f.K(obj) | interfaceC1084f.K(fVar);
        Object objF3 = interfaceC1084f.f();
        if (zK2 || objF3 == obj2) {
            coil.request.g.a aVar = new coil.request.g.a(context);
            aVar.f23074c = obj;
            aVar.f23093w = fVar;
            aVar.d();
            objF3 = aVar.a();
            interfaceC1084f.E(objF3);
        }
        coil.request.g gVar4 = (coil.request.g) objF3;
        interfaceC1084f.I();
        interfaceC1084f.I();
        interfaceC1084f.I();
        return gVar4;
    }
}
