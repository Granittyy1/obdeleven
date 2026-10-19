package p100i;

import O3.d;
import android.view.ViewGroup;
import androidx.core.view.O;
import androidx.core.view.Z;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f36384b;

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class a extends d {
        public a() {
        }

        @Override // O3.d, androidx.core.view.a0
        public final void c() {
            i.this.f36384b.f36343w.setVisibility(0);
        }

        @Override // androidx.core.view.a0
        public final void d() {
            i iVar = i.this;
            iVar.f36384b.f36343w.setAlpha(1.0f);
            g gVar = iVar.f36384b;
            gVar.f36348z.d(null);
            gVar.f36348z = null;
        }
    }

    public i(g gVar) {
        this.f36384b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        g gVar = this.f36384b;
        gVar.f36345x.showAtLocation(gVar.f36343w, 55, 0, 0);
        Z z10 = gVar.f36348z;
        if (z10 != null) {
            z10.b();
        }
        if (!(gVar.f36300B && (viewGroup = gVar.f36301C) != null && viewGroup.isLaidOut())) {
            gVar.f36343w.setAlpha(1.0f);
            gVar.f36343w.setVisibility(0);
            return;
        }
        gVar.f36343w.setAlpha(0.0f);
        Z zA = O.a(gVar.f36343w);
        zA.a(1.0f);
        gVar.f36348z = zA;
        zA.d(new a());
    }
}
