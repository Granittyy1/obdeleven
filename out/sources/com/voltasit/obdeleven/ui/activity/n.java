package com.voltasit.obdeleven.ui.activity;

import android.view.View;
import com.voltasit.obdeleven.utils.NavigationManager;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p100i.d f33683c;

    public /* synthetic */ n(p100i.d dVar, int i10) {
        this.f33682b = i10;
        this.f33683c = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p100i.d dVar = this.f33683c;
        switch (this.f33682b) {
            case 0:
                boolean z10 = MainActivity.f33531Q;
                MainActivity this$0 = (MainActivity) dVar;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                NavigationManager navigationManager = this$0.f33533B;
                if (navigationManager != null) {
                    navigationManager.m(this$0.E());
                }
                break;
            default:
                ((IntercomCarouselActivity) dVar).lambda$buildRetryButton$1(view);
                break;
        }
    }
}
