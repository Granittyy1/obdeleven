package com.voltasit.obdeleven.presentation.twofactorauth.verify;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2147h;
import com.voltasit.obdeleven.ui.dialogs.C2166q0;
import kotlin.jvm.internal.i;
import p110i9.o;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33345c;

    public /* synthetic */ c(int i10, Object obj) {
        this.f33344b = i10;
        this.f33345c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33344b) {
            case 0:
                TwoFactorAuthVerifyFragment this$0 = (TwoFactorAuthVerifyFragment) this.f33345c;
                i.e(this$0, "this$0");
                this$0.O().f33352s.j(r.f47939a);
                break;
            case 1:
                ((C2147h) this.f33345c).y();
                break;
            case 2:
                C2166q0 c2166q0 = (C2166q0) this.f33345c;
                c2166q0.getClass();
                c2166q0.w("NumberLabelDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                c2166q0.y();
                break;
            default:
                o.a aVar = (o.a) this.f33345c;
                int adapterPosition = aVar.getAdapterPosition();
                o oVar = aVar.f36820c;
                i9.c.a<T> aVar2 = oVar.f36781c;
                if (aVar2 != 0) {
                    aVar2.d((Q8.b) oVar.f36779a.get(adapterPosition));
                }
                break;
        }
    }
}
