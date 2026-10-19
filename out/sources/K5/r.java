package K5;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p275w5.c f4361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.a f4362c;

    public r(p275w5.c cVar, t.a aVar) {
        this.f4361b = cVar;
        this.f4362c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    @Override // androidx.core.view.InterfaceC1309y
    public final n0 g(View view, n0 n0Var) {
        boolean z10;
        t.a aVar = this.f4362c;
        int i10 = aVar.f4363a;
        p275w5.c cVar = this.f4361b;
        n0.k kVar = n0Var.f16948a;
        p222s0.b bVarG = kVar.g(7);
        p222s0.b bVarG2 = kVar.g(32);
        int i11 = bVarG.f46852b;
        BottomSheetBehavior bottomSheetBehavior = cVar.f47752b;
        bottomSheetBehavior.f26811x = i11;
        boolean zB = t.b(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z11 = bottomSheetBehavior.f26797p;
        if (z11) {
            int iA = n0Var.a();
            bottomSheetBehavior.f26810w = iA;
            paddingBottom = iA + aVar.f4365c;
        }
        int i12 = aVar.f4364b;
        boolean z12 = bottomSheetBehavior.f26799q;
        int i13 = bVarG.f46851a;
        if (z12) {
            paddingLeft = (zB ? i12 : i10) + i13;
        }
        boolean z13 = bottomSheetBehavior.f26801r;
        int i14 = bVarG.f46853c;
        if (z13) {
            if (!zB) {
                i10 = i12;
            }
            paddingRight = i10 + i14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z14 = true;
        if (!bottomSheetBehavior.f26805t || marginLayoutParams.leftMargin == i13) {
            z10 = false;
        } else {
            marginLayoutParams.leftMargin = i13;
            z10 = true;
        }
        if (bottomSheetBehavior.f26807u && marginLayoutParams.rightMargin != i14) {
            marginLayoutParams.rightMargin = i14;
            z10 = true;
        }
        if (bottomSheetBehavior.f26809v) {
            int i15 = marginLayoutParams.topMargin;
            int i16 = bVarG.f46852b;
            if (i15 != i16) {
                marginLayoutParams.topMargin = i16;
            } else {
                z14 = z10;
            }
        } else {
            z14 = z10;
        }
        if (z14) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z15 = cVar.f47751a;
        if (z15) {
            bottomSheetBehavior.f26795n = bVarG2.f46854d;
        }
        if (z11 || z15) {
            bottomSheetBehavior.P();
        }
        return n0Var;
    }
}
