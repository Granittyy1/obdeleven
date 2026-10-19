package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33791c;

    public /* synthetic */ H0(int i10, Object obj) {
        this.f33790b = i10;
        this.f33791c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33790b) {
            case 0:
                I0 i10 = (I0) this.f33791c;
                i10.y();
                i10.w(i10.f33793s.isEmpty() ? "SimpleDialog" : i10.f33793s, DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                androidx.media3.ui.c cVar = (androidx.media3.ui.c) this.f33791c;
                cVar.k(!cVar.f18922B0);
                break;
        }
    }
}
