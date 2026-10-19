package p275w5;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f47747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f47749d;

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f47749d = bottomSheetBehavior;
        this.f47747b = view;
        this.f47748c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47749d.L(this.f47747b, this.f47748c, false);
    }
}
