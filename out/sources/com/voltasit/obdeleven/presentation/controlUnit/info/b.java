package com.voltasit.obdeleven.presentation.controlUnit.info;

import B8.Y;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p162n1.s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31630e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f31627b = i10;
        this.f31628c = obj;
        this.f31629d = obj2;
        this.f31630e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView.B bJ;
        View view;
        switch (this.f31627b) {
            case 0:
                ControlUnitInfoFragment this$0 = (ControlUnitInfoFragment) this.f31628c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Y binding = (Y) this.f31630e;
                kotlin.jvm.internal.i.e(binding, "$binding");
                h hVar = (h) this.f31629d;
                kotlin.jvm.internal.i.b(hVar);
                d dVar = this$0.f31622r;
                dVar.getClass();
                int itemCount = dVar.getItemCount();
                int i10 = 0;
                for (int i11 = 0; i11 < itemCount; i11++) {
                    if (kotlin.jvm.internal.i.a(dVar.a(i11).f31658a, hVar.f31658a)) {
                        i10 = i11;
                        bJ = binding.f1836t.J(i10);
                        if (bJ == null && (view = bJ.itemView) != null) {
                            view.performClick();
                            break;
                        }
                    }
                }
                bJ = binding.f1836t.J(i10);
                if (bJ == null) {
                }
                break;
            default:
                p240t6.h hVar2 = (p240t6.h) this.f31628c;
                hVar2.getClass();
                hVar2.f47347b.execute(new s((Runnable) this.f31629d, 1, (t6.i.a) this.f31630e));
                break;
        }
    }
}
