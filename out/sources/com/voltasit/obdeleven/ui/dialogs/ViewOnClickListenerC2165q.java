package com.voltasit.obdeleven.ui.dialogs;

import android.view.View;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2165q implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.voltasit.obdeleven.presentation.dialogs.e f34005c;

    public /* synthetic */ ViewOnClickListenerC2165q(com.voltasit.obdeleven.presentation.dialogs.e eVar, int i10) {
        this.f34004b = i10;
        this.f34005c = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34004b) {
            case 0:
                ((r) this.f34005c).y();
                break;
            default:
                ((b1) this.f34005c).y();
                break;
        }
    }
}
