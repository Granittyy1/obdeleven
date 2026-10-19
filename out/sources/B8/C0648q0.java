package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentSignupBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0648q0 extends AbstractC0646p0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f2103u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f2104t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2103u = sparseIntArray;
        sparseIntArray.put(R.id.signupFragment_emailInputLayout, 2);
        sparseIntArray.put(R.id.signupFragment_emailInput, 3);
        sparseIntArray.put(R.id.signupFragment_usernameInputLayout, 4);
        sparseIntArray.put(R.id.signupFragment_usernameInput, 5);
        sparseIntArray.put(R.id.signupFragment_passwordInputLayout, 6);
        sparseIntArray.put(R.id.signupFragment_passwordInput, 7);
        sparseIntArray.put(R.id.signupFragment_passwordRequirements, 8);
        sparseIntArray.put(R.id.signupFragment_signup, 9);
        sparseIntArray.put(R.id.agreementLayout, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0648q0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 11, null, f2103u);
        TextView textView = (TextView) objArrK[1];
        super(dVar, view, textView);
        this.f2104t = -1L;
        this.f2099r.setTag(null);
        ((RelativeLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f2104t;
            this.f2104t = 0L;
        }
        if ((j & 1) != 0) {
            TextView textView = this.f2099r;
            W8.d.d(textView, textView.getResources().getString(R.string.common_terms_and_condition_and_privacy_policy));
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2104t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2104t = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
