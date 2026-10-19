package p048d9;

import B8.AbstractC0657v0;
import H3.c;
import W8.d;
import android.view.View;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TwoFactorAuthIntroSfdFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f34631n = "TwoFactorAuthIntroSfdFragment";

    @Override // p048d9.a, com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: O */
    public final void C(AbstractC0657v0 abstractC0657v0) {
        super.C(abstractC0657v0);
        View view = abstractC0657v0.f4488d;
        i.d(view, "getRoot(...)");
        d.b(view);
    }

    @Override // p048d9.a
    public final void P() {
        c.l(this, this.f34631n, p271w0.c.a());
    }

    @Override // p048d9.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return this.f34631n;
    }

    @Override // p048d9.a, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return null;
    }
}
