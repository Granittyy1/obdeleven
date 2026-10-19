package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import java.util.ArrayList;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f26826b;

    public a(b bVar) {
        this.f26826b = bVar;
    }

    @Override // androidx.core.view.InterfaceC1309y
    public final n0 g(View view, n0 n0Var) {
        b bVar = this.f26826b;
        b.C0267b c0267b = bVar.f26833n;
        if (c0267b != null) {
            bVar.f26827g.f26781X.remove(c0267b);
        }
        b.C0267b c0267b2 = new b.C0267b(bVar.j, n0Var);
        bVar.f26833n = c0267b2;
        c0267b2.e(bVar.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.f26827g;
        b.C0267b c0267b3 = bVar.f26833n;
        ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehavior.f26781X;
        if (!arrayList.contains(c0267b3)) {
            arrayList.add(c0267b3);
        }
        return n0Var;
    }
}
