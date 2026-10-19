package p138l;

import O3.d;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseInterpolator f44100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f44101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44102e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44099b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f44103f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Z> f44098a = new ArrayList<>();

    /* JADX INFO: compiled from: ViewPropertyAnimatorCompatSet.java */
    public class a extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f44104e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44105f = 0;

        public a() {
        }

        @Override // O3.d, androidx.core.view.a0
        public final void c() {
            if (this.f44104e) {
                return;
            }
            this.f44104e = true;
            d dVar = g.this.f44101d;
            if (dVar != null) {
                dVar.c();
            }
        }

        @Override // androidx.core.view.a0
        public final void d() {
            int i10 = this.f44105f + 1;
            this.f44105f = i10;
            g gVar = g.this;
            if (i10 == gVar.f44098a.size()) {
                d dVar = gVar.f44101d;
                if (dVar != null) {
                    dVar.d();
                }
                this.f44105f = 0;
                this.f44104e = false;
                gVar.f44102e = false;
            }
        }
    }

    public final void a() {
        if (this.f44102e) {
            Iterator<Z> it = this.f44098a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f44102e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f44102e) {
            return;
        }
        for (Z z10 : this.f44098a) {
            long j = this.f44099b;
            if (j >= 0) {
                z10.c(j);
            }
            BaseInterpolator baseInterpolator = this.f44100c;
            if (baseInterpolator != null && (view = z10.f16887a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f44101d != null) {
                z10.d(this.f44103f);
            }
            View view2 = z10.f16887a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f44102e = true;
    }
}
