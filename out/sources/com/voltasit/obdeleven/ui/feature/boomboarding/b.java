package com.voltasit.obdeleven.ui.feature.boomboarding;

import J8.u;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Y;
import com.obdeleven.feature.boomboarding.ui.BoomboardingVideoType;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.List;
import kotlin.collections.l;

/* JADX INFO: compiled from: BoomboardingViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavigationManager f34075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f34076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.obdeleven.feature.boomboarding.ui.c> f34077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<com.obdeleven.feature.boomboarding.ui.c> f34078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<com.obdeleven.feature.boomboarding.ui.c> f34079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f34080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f34081g;

    public b(NavigationManager navigationManager, u uVar) {
        this.f34075a = navigationManager;
        this.f34076b = uVar;
        List<com.obdeleven.feature.boomboarding.ui.c> listS = l.s(new com.obdeleven.feature.boomboarding.ui.c.b(), new com.obdeleven.feature.boomboarding.ui.c.C0293c(BoomboardingVideoType.f29228b, R.raw.welcome_lights), new com.obdeleven.feature.boomboarding.ui.c.a(), new com.obdeleven.feature.boomboarding.ui.c.d());
        this.f34077c = listS;
        this.f34078d = l.s(new com.obdeleven.feature.boomboarding.ui.c.b(), new com.obdeleven.feature.boomboarding.ui.c.C0293c(BoomboardingVideoType.f29229c, R.raw.urban_joke), new com.obdeleven.feature.boomboarding.ui.c.a(), new com.obdeleven.feature.boomboarding.ui.c.d());
        this.f34079e = l.s(new com.obdeleven.feature.boomboarding.ui.c.b(), new com.obdeleven.feature.boomboarding.ui.c.C0293c(BoomboardingVideoType.f29230d, R.raw.video_in_motion), new com.obdeleven.feature.boomboarding.ui.c.a(), new com.obdeleven.feature.boomboarding.ui.c.d());
        C1085f0 c1085f0F = J0.f(listS);
        this.f34080f = c1085f0F;
        this.f34081g = c1085f0F;
    }
}
