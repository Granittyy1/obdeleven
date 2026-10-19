package p275w5;

import B0.u;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f47754b;

    public d(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f47754b = bottomSheetBehavior;
        this.f47753a = i10;
    }

    @Override // B0.u
    public final boolean a(View view) {
        this.f47754b.I(this.f47753a);
        return true;
    }
}
