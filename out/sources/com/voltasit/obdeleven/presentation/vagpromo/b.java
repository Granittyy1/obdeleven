package com.voltasit.obdeleven.presentation.vagpromo;

import android.view.View;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import kotlin.jvm.internal.i;
import p097h9.j;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33365c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f33364b = i10;
        this.f33365c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f33365c;
        switch (this.f33364b) {
            case 0:
                c this$0 = (c) obj;
                i.e(this$0, "this$0");
                Ia.a<r> aVar = this$0.f33367s;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                boolean z10 = MainActivity.f33531Q;
                MainActivity this$1 = (MainActivity) obj;
                i.e(this$1, "this$0");
                this$1.f();
                break;
            default:
                j jVar = ((p097h9.r) obj).f36231q;
                jVar.a(new p255u9.j());
                jVar.f36207i = true;
                break;
        }
    }
}
