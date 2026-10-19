package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import coil.RealImageLoader;
import coil.size.Scale;
import coil.util.t;
import coil.util.v;
import java.util.List;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: RequestService.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealImageLoader f23117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f23118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final coil.util.r f23119c;

    public n(RealImageLoader realImageLoader, v vVar) {
        this.f23117a = realImageLoader;
        this.f23118b = vVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f23119c = coil.util.g.f23157a ? new t(false) : (i10 == 26 || i10 == 27) ? new C() : new t(true);
    }

    public static e a(g gVar, Throwable th) {
        Drawable drawableB;
        if (th instanceof NullRequestDataException) {
            drawableB = coil.util.j.b(gVar, null, null, gVar.f23045G.f23023l);
            if (drawableB == null) {
                drawableB = coil.util.j.b(gVar, gVar.f23043E, gVar.f23042D, gVar.f23045G.f23022k);
            }
        } else {
            drawableB = coil.util.j.b(gVar, gVar.f23043E, gVar.f23042D, gVar.f23045G.f23022k);
        }
        return new e(drawableB, gVar, th);
    }

    public static boolean b(g gVar, Bitmap.Config config) {
        if (!(config == Bitmap.Config.HARDWARE)) {
            return true;
        }
        if (!gVar.f23058n) {
            return false;
        }
        p004a3.b bVar = gVar.f23048c;
        if (bVar instanceof p004a3.c) {
            View viewA = ((p004a3.c) bVar).a();
            if (viewA.isAttachedToWindow() && !viewA.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final k c(g gVar, Z2.e eVar) {
        Bitmap.Config config;
        List<p016b3.d> list = gVar.f23054i;
        boolean zIsEmpty = list.isEmpty();
        Bitmap.Config config2 = gVar.f23052g;
        if (zIsEmpty || kotlin.collections.k.M(config2, coil.util.k.f23160a)) {
            if (config2 == Bitmap.Config.HARDWARE) {
                if (b(gVar, config2)) {
                    if (this.f23119c.b(eVar)) {
                    }
                }
                config = Bitmap.Config.ARGB_8888;
            }
            config = config2;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Z2.a aVar = eVar.f7732a;
        Z2.a.b bVar = Z2.a.b.f7726a;
        return new k(gVar.f23046a, config, null, eVar, (kotlin.jvm.internal.i.a(aVar, bVar) || kotlin.jvm.internal.i.a(eVar.f7733b, bVar)) ? Scale.f23144c : gVar.f23070z, coil.util.j.a(gVar), gVar.f23059o && list.isEmpty() && config != Bitmap.Config.ALPHA_8, gVar.f23060p, gVar.f23051f, gVar.f23055k, gVar.f23056l, gVar.f23039A, gVar.f23061q, gVar.f23062r, gVar.f23063s);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    public final k d(k kVar) {
        Bitmap.Config config;
        CachePolicy cachePolicy;
        boolean z10;
        Bitmap.Config config2 = kVar.f23099b;
        CachePolicy cachePolicy2 = kVar.f23111o;
        boolean z11 = false;
        boolean z12 = true;
        if (!(config2 == Bitmap.Config.HARDWARE) || this.f23119c.a()) {
            config = config2;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z11 = true;
        }
        if (kVar.f23111o.a()) {
            v vVar = this.f23118b;
            synchronized (vVar) {
                vVar.a();
                z10 = vVar.f23183f;
            }
            if (z10) {
                cachePolicy = cachePolicy2;
                z12 = z11;
            } else {
                cachePolicy = CachePolicy.DISABLED;
            }
        } else {
            cachePolicy = cachePolicy2;
            z12 = z11;
        }
        return z12 ? new k(kVar.f23098a, config, kVar.f23100c, kVar.f23101d, kVar.f23102e, kVar.f23103f, kVar.f23104g, kVar.f23105h, kVar.f23106i, kVar.j, kVar.f23107k, kVar.f23108l, kVar.f23109m, kVar.f23110n, cachePolicy) : kVar;
    }
}
