package com.voltasit.obdeleven.presentation.twofactorauth.verify;

import B8.u1;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p110i9.l;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33341c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f33340b = i10;
        this.f33341c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33340b) {
            case 0:
                TwoFactorAuthVerifyFragment this$0 = (TwoFactorAuthVerifyFragment) this.f33341c;
                i.e(this$0, "this$0");
                this$0.O().f33358y.j(r.f47939a);
                break;
            default:
                l.a aVar = (l.a) this.f33341c;
                u1 u1Var = aVar.f36810b;
                u1Var.f2165r.toggle();
                int adapterPosition = aVar.getAdapterPosition();
                if (adapterPosition >= 0) {
                    l lVar = l.this;
                    String str = (String) lVar.f36779a.get(adapterPosition);
                    boolean zIsChecked = u1Var.f2165r.isChecked();
                    ArrayList<String> arrayList = lVar.f36809d;
                    if (!zIsChecked) {
                        arrayList.remove(str);
                    } else {
                        arrayList.add(str);
                    }
                }
                break;
        }
    }
}
