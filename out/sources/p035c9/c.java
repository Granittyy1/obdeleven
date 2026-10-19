package p035c9;

import B8.AbstractC0649r0;
import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TwoFactorAuthActivatedFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class c extends BaseFragment<AbstractC0649r0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f22526l = "TwoFactorAuthIntroFragment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22527m = R.layout.fragment_two_factor_auth_activated;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void C(final AbstractC0649r0 abstractC0649r0) {
        abstractC0649r0.f2131r.setOnClickListener(new View.OnClickListener() { // from class: c9.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c this$0 = this.f22521b;
                i.e(this$0, "this$0");
                this$0.P(abstractC0649r0);
            }
        });
    }

    public void P(AbstractC0649r0 abstractC0649r0) {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("popToMainFragment") : null;
        i.c(serializable, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.models.Screen");
        abstractC0649r0.f2131r.setOnClickListener(new b((Screen) serializable, this, 0));
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return this.f22526l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f22527m;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String u() {
        return getString(R.string.view_profile_2_step_auth);
    }
}
