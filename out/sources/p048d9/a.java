package p048d9;

import B8.AbstractC0657v0;
import X5.ViewOnClickListenerC0832a;
import android.os.Bundle;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.presentation.dialogs.bonus.b;
import com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TwoFactorAuthIntroFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class a extends BaseFragment<AbstractC0657v0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f34629l = "TwoFactorAuthIntroFragment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f34630m = R.layout.fragment_two_factor_auth_intro;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void C(AbstractC0657v0 abstractC0657v0) {
        abstractC0657v0.f2173r.setOnClickListener(new b(1, this));
        abstractC0657v0.f2174s.setOnClickListener(new ViewOnClickListenerC0832a(3, this));
    }

    public void P() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("popToMainFragment") : null;
        i.c(serializable, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.models.Screen");
        NavigationManager navigationManagerR = r();
        TwoFactorAuthSetupFragment twoFactorAuthSetupFragment = new TwoFactorAuthSetupFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("popToMainFragment", (Screen) serializable);
        twoFactorAuthSetupFragment.setArguments(bundle);
        navigationManagerR.n(twoFactorAuthSetupFragment, null);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return this.f34629l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f34630m;
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
