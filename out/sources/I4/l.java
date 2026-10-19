package I4;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.E;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.util.List;
import p078g1.v;
import p191p5.InterfaceC2755a;
import p302y6.G;
import p302y6.O;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements K4.a.InterfaceC0060a, p114j1.f, androidx.compose.ui.graphics.colorspace.j, E, j1.j.a, InterfaceC2755a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3865b;

    public /* synthetic */ l(Object obj) {
        this.f3865b = obj;
    }

    @Override // p114j1.f
    public void a(Object obj) {
        ((ImmutableList.a) this.f3865b).c((X1.c) obj);
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public double g(double d10) {
        androidx.compose.ui.graphics.colorspace.t tVar = (androidx.compose.ui.graphics.colorspace.t) this.f3865b;
        double d11 = tVar.f13617b;
        double d12 = tVar.f13620e;
        double d13 = tVar.f13619d;
        return d10 >= d12 * d13 ? (Math.pow(d10 - tVar.f13621f, 1.0d / tVar.f13616a) - tVar.f13618c) / d11 : (d10 - tVar.f13622g) / d13;
    }

    @Override // androidx.fragment.app.E
    public void h(Bundle bundle, String str) {
        ((Ia.p) this.f3865b).invoke(str, bundle);
    }

    @Override // p191p5.InterfaceC2755a
    public Object i(p191p5.g gVar) {
        boolean z10;
        ((O) this.f3865b).getClass();
        if (gVar.o()) {
            G g10 = (G) gVar.k();
            g10.getClass();
            Log.isLoggable("FirebaseCrashlytics", 3);
            File fileB = g10.b();
            if (fileB.delete()) {
                fileB.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                fileB.getPath();
            }
            z10 = true;
        } else {
            gVar.j();
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((v.c) obj).P((List) this.f3865b);
    }

    @Override // K4.a.InterfaceC0060a
    public Object k() {
        ((o) this.f3865b).f3879i.c();
        return null;
    }
}
