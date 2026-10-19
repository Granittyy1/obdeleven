package B8;

import android.view.View;
import android.widget.Button;

/* JADX INFO: compiled from: ItemButtonBottomBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V0 extends U0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f1821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1822t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(M0.d dVar, View view) {
        super(view, 0, dVar);
        Object[] objArrK = M0.h.k(dVar, view, 1, null, null);
        this.f1822t = -1L;
        Button button = (Button) objArrK[0];
        this.f1821s = button;
        button.setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1822t;
            this.f1822t = 0L;
        }
        String str = this.f1818r;
        if ((j & 3) != 0) {
            N0.c.a(this.f1821s, str);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1822t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1822t = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.U0
    public final void t(String str) {
        this.f1818r = str;
        synchronized (this) {
            this.f1822t |= 1;
        }
        c(26);
        n();
    }
}
