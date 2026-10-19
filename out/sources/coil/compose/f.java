package coil.compose;

import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.W;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.platform.InspectionModeKt;

/* JADX INFO: compiled from: AsyncImagePainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22767a = new a();

    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    public static final class a implements p029c3.d {
        @Override // p029c3.d
        public final Drawable d() {
            return null;
        }
    }

    public static final AsyncImagePainter a(coil.request.g gVar, coil.f fVar, Ia.l lVar, Ia.l lVar2, InterfaceC1161g interfaceC1161g, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        interfaceC1084f.e(1645646697);
        if ((i11 & 4) != 0) {
            lVar = AsyncImagePainter.f22712v;
        }
        if ((i11 & 8) != 0) {
            lVar2 = null;
        }
        if ((i11 & 16) != 0) {
            interfaceC1161g = InterfaceC1161g.a.f14244b;
        }
        if ((i11 & 32) != 0) {
            i10 = 1;
        }
        interfaceC1084f.e(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            coil.request.g gVarA = y.a(gVar, interfaceC1084f);
            c(gVarA);
            interfaceC1084f.e(1094691773);
            Object objF = interfaceC1084f.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new AsyncImagePainter(fVar, gVarA);
                interfaceC1084f.E(objF);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objF;
            interfaceC1084f.I();
            asyncImagePainter.f22719n = lVar;
            asyncImagePainter.f22720o = lVar2;
            asyncImagePainter.f22721p = interfaceC1161g;
            asyncImagePainter.f22722q = i10;
            asyncImagePainter.f22723r = ((Boolean) interfaceC1084f.x(InspectionModeKt.f14931a)).booleanValue();
            asyncImagePainter.f22726u.setValue(fVar);
            asyncImagePainter.f22725t.setValue(gVarA);
            asyncImagePainter.d();
            interfaceC1084f.I();
            Trace.endSection();
            interfaceC1084f.I();
            return asyncImagePainter;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static void b(String str) {
        throw new IllegalArgumentException(B6.c.d("Unsupported type: ", str, ". ", androidx.compose.foundation.gestures.d.b("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void c(coil.request.g gVar) {
        Object obj = gVar.f23047b;
        if (obj instanceof coil.request.g.a) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof W) {
            b("ImageBitmap");
            throw null;
        }
        if (obj instanceof androidx.compose.ui.graphics.vector.c) {
            b("ImageVector");
            throw null;
        }
        if (obj instanceof Painter) {
            b("Painter");
            throw null;
        }
        if (gVar.f23048c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
