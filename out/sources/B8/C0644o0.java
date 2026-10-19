package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentSigninBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0644o0 extends AbstractC0642n0 implements N8.b.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f2088x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final N8.b f2089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2090w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2088x = sparseIntArray;
        sparseIntArray.put(R.id.signinFragment_emailInputLayout, 3);
        sparseIntArray.put(R.id.signinFragment_emailInput, 4);
        sparseIntArray.put(R.id.signinFragment_passwordInputLayout, 5);
        sparseIntArray.put(R.id.signinFragment_passwordInput, 6);
        sparseIntArray.put(R.id.signinFragment_forgotPassword, 7);
        sparseIntArray.put(R.id.signinFragment_signin, 8);
        sparseIntArray.put(R.id.signinFragment_signup, 9);
        sparseIntArray.put(R.id.agreementLayout, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0644o0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 11, null, f2088x);
        TextView textView = (TextView) objArrK[2];
        ImageView imageView = (ImageView) objArrK[1];
        super(dVar, view, textView, imageView);
        this.f2090w = -1L;
        this.f2079r.setTag(null);
        this.f2080s.setTag(null);
        ((RelativeLayout) objArrK[0]).setTag(null);
        r(view);
        this.f2089v = new N8.b(this, 1);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        com.voltasit.obdeleven.presentation.signIn.b bVar = this.f2081t;
        if (bVar != null) {
            bVar.f33230E.j(p293xa.r.f47939a);
        }
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f2090w;
            this.f2090w = 0L;
        }
        if ((j & 2) != 0) {
            TextView textView = this.f2079r;
            W8.d.d(textView, textView.getResources().getString(R.string.common_terms_and_condition_and_privacy_policy));
            this.f2080s.setOnClickListener(this.f2089v);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2090w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2090w = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.AbstractC0642n0
    public final void t(com.voltasit.obdeleven.presentation.signIn.b bVar) {
        this.f2081t = bVar;
        synchronized (this) {
            this.f2090w |= 1;
        }
        c(24);
        n();
    }
}
