package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.InterfaceC1376t;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.NavigationManager;

/* JADX INFO: compiled from: FragmentAboutBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends O implements N8.b.a {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final M0.h.d f1772I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final SparseIntArray f1773J;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final N8.b f1774B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final N8.b f1775C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final N8.b f1776D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final N8.b f1777E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final N8.b f1778F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final N8.b f1779G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f1780H;

    static {
        M0.h.d dVar = new M0.h.d(11);
        f1772I = dVar;
        dVar.a(1, new String[]{"labeled_button_binding", "labeled_button_binding"}, new int[]{8, 9}, new int[]{R.layout.labeled_button_binding, R.layout.labeled_button_binding});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1773J = sparseIntArray;
        sparseIntArray.put(R.id.aboutIconImageView, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public P(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 11, f1772I, f1773J);
        super(dVar, view, (ShapeableImageView) objArrK[10], (o1) objArrK[9], (ImageView) objArrK[4], (ImageView) objArrK[6], (Button) objArrK[3], (Button) objArrK[2], (ImageView) objArrK[5], (o1) objArrK[8], (ImageView) objArrK[7]);
        this.f1780H = -1L;
        o1 o1Var = this.f1762s;
        if (o1Var != null) {
            o1Var.j = this;
        }
        this.f1763t.setTag(null);
        this.f1764u.setTag(null);
        ((RelativeLayout) objArrK[0]).setTag(null);
        ((LinearLayout) objArrK[1]).setTag(null);
        this.f1765v.setTag(null);
        this.f1766w.setTag(null);
        this.f1767x.setTag(null);
        o1 o1Var2 = this.f1768y;
        if (o1Var2 != null) {
            o1Var2.j = this;
        }
        this.f1769z.setTag(null);
        r(view);
        this.f1774B = new N8.b(this, 6);
        this.f1775C = new N8.b(this, 4);
        this.f1776D = new N8.b(this, 5);
        this.f1777E = new N8.b(this, 2);
        this.f1778F = new N8.b(this, 3);
        this.f1779G = new N8.b(this, 1);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        switch (i10) {
            case 1:
                com.voltasit.obdeleven.presentation.about.a aVar = this.f1760A;
                if (aVar != null) {
                    aVar.f31226o.g("https://obdeleven.com/terms-and-conditions");
                }
                break;
            case 2:
                com.voltasit.obdeleven.presentation.about.a aVar2 = this.f1760A;
                if (aVar2 != null) {
                    aVar2.f31226o.g("https://obdeleven.com/privacy-policy");
                }
                break;
            case 3:
                com.voltasit.obdeleven.presentation.about.a aVar3 = this.f1760A;
                if (aVar3 != null) {
                    NavigationManager navigationManager = aVar3.f31226o;
                    if (!navigationManager.g("fb://profile/61561565552565")) {
                        navigationManager.g("https://www.facebook.com/people/OBDeleven-Car-Diagnostics/61561565552565/");
                    }
                }
                break;
            case 4:
                com.voltasit.obdeleven.presentation.about.a aVar4 = this.f1760A;
                if (aVar4 != null) {
                    NavigationManager navigationManager2 = aVar4.f31226o;
                    if (!navigationManager2.g("twitter://user?screen_name=obdeleven")) {
                        navigationManager2.g("https://twitter.com/OBDeleven");
                    }
                }
                break;
            case 5:
                com.voltasit.obdeleven.presentation.about.a aVar5 = this.f1760A;
                if (aVar5 != null) {
                    aVar5.f31226o.g("http://forum.obdeleven.com");
                }
                break;
            case 6:
                com.voltasit.obdeleven.presentation.about.a aVar6 = this.f1760A;
                if (aVar6 != null) {
                    aVar6.f31226o.g("https://obdeleven.com");
                }
                break;
        }
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1780H;
            this.f1780H = 0L;
        }
        if ((j & 8) != 0) {
            this.f1763t.setOnClickListener(this.f1778F);
            this.f1764u.setOnClickListener(this.f1776D);
            this.f1765v.setOnClickListener(this.f1777E);
            this.f1766w.setOnClickListener(this.f1779G);
            this.f1767x.setOnClickListener(this.f1775C);
            this.f1769z.setOnClickListener(this.f1774B);
        }
        this.f1768y.e();
        this.f1762s.e();
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                if (this.f1780H != 0) {
                    return true;
                }
                return this.f1768y.g() || this.f1762s.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1780H = 8L;
        }
        this.f1768y.i();
        this.f1762s.i();
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        if (i10 == 0) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1780H |= 1;
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f1780H |= 2;
        }
        return true;
    }

    @Override // M0.h
    public final void q(InterfaceC1376t interfaceC1376t) {
        super.q(interfaceC1376t);
        this.f1768y.q(interfaceC1376t);
        this.f1762s.q(interfaceC1376t);
    }

    @Override // B8.O
    public final void t(com.voltasit.obdeleven.presentation.about.a aVar) {
        this.f1760A = aVar;
        synchronized (this) {
            this.f1780H |= 4;
        }
        c(1);
        n();
    }
}
