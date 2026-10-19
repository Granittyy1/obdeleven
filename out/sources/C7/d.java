package C7;

import androidx.media3.exoplayer.h0;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p033c7.C1494g;
import p078g1.v;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements p191p5.f, j1.j.a, p183oa.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2426b;

    public /* synthetic */ d(Object obj) {
        this.f2426b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0030  */
    @Override // p183oa.d
    public boolean a(Object obj) {
        C1494g c1494g = (C1494g) this.f2426b;
        c1494g.getClass();
        long J10 = ((N7.e) obj).J();
        long jA = c1494g.f22449c.a();
        File file = new File(c1494g.f22448b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        boolean z10 = false;
        if (J10 != 0) {
            if (jA < J10) {
                z10 = true;
            }
        } else {
            if (!file.exists()) {
                return true;
            }
            if (jA < TimeUnit.DAYS.toMillis(1L) + file.lastModified()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p191p5.f
    public p191p5.g c(Object obj) {
        i iVar = (i) this.f2426b;
        p191p5.g<com.google.firebase.remoteconfig.internal.b> gVarB = iVar.f2436d.b();
        p191p5.g<com.google.firebase.remoteconfig.internal.b> gVarB2 = iVar.f2437e.b();
        return p191p5.j.g(gVarB, gVarB2).i(iVar.f2435c, new e(iVar, gVarB, gVarB2));
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        v.c cVar = (v.c) obj;
        h0 h0Var = (h0) this.f2426b;
        boolean z10 = h0Var.f18417g;
        cVar.getClass();
        cVar.l(h0Var.f18417g);
    }
}
