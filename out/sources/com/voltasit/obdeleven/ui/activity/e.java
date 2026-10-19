package com.voltasit.obdeleven.ui.activity;

import B8.AbstractC0630h0;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.main.MainFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f33672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f33673c;

    public /* synthetic */ e(MainActivity mainActivity, o oVar) {
        this.f33672b = mainActivity;
        this.f33673c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseFragment<?> baseFragmentD;
        boolean z10 = MainActivity.f33531Q;
        MainActivity this$0 = this.f33672b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (this$0.E()) {
            NavigationManager navigationManager = this$0.f33533B;
            kotlin.jvm.internal.i.b(navigationManager);
            baseFragmentD = navigationManager.f34234e;
        } else {
            NavigationManager navigationManager2 = this$0.f33533B;
            kotlin.jvm.internal.i.b(navigationManager2);
            baseFragmentD = navigationManager2.d();
        }
        if (baseFragmentD instanceof MainFragment) {
            MainFragment mainFragment = (MainFragment) baseFragmentD;
            AbstractC0630h0 abstractC0630h0 = mainFragment.f32518m;
            if (abstractC0630h0 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            abstractC0630h0.f1951y.c();
            AbstractC0630h0 abstractC0630h1 = mainFragment.f32518m;
            if (abstractC0630h1 == null) {
                kotlin.jvm.internal.i.m("binding");
                throw null;
            }
            abstractC0630h1.f1938D.setPrimaryText(mainFragment.getString(R.string.common_sign_in));
        }
        this$0.y();
        this$0.S();
        if (W7.c.d()) {
            W7.c.b();
        }
        this$0.C();
        NavigationManager navigationManager3 = this$0.f33533B;
        kotlin.jvm.internal.i.b(navigationManager3);
        navigationManager3.o(false);
        o oVar = this.f33673c;
        if (oVar != null) {
            oVar.run();
        }
        MainActivityViewModel mainActivityViewModelB = this$0.B();
        mainActivityViewModelB.getClass();
        C2680e.c(Z.a(mainActivityViewModelB), mainActivityViewModelB.f32112a, null, new MainActivityViewModel$logout$1(mainActivityViewModelB, null), 2);
    }
}
