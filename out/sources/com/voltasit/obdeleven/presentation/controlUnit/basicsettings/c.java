package com.voltasit.obdeleven.presentation.controlUnit.basicsettings;

import Ia.l;
import android.content.DialogInterface;
import androidx.compose.ui.semantics.w;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31501c;

    public /* synthetic */ c(int i10, Object obj) {
        this.f31500b = i10;
        this.f31501c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f31500b) {
            case 0:
                ((i) this.f31501c).getClass();
                ((DialogInterface) obj).dismiss();
                return r.f47939a;
            default:
                return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18((String) this.f31501c, (w) obj);
        }
    }
}
