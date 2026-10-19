package K5;

import android.view.View;
import androidx.core.view.C1286a;

/* JADX INFO: compiled from: NavigationMenuPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends C1286a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.c f4335c;

    public h(g.c cVar, int i10, boolean z10) {
        this.f4335c = cVar;
        this.f4333a = i10;
        this.f4334b = z10;
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityNodeInfo(View view, B0.s sVar) {
        super.onInitializeAccessibilityNodeInfo(view, sVar);
        int i10 = this.f4333a;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            g.c cVar = this.f4335c;
            if (i11 >= i10) {
                cVar.getClass();
                sVar.l(B0.s.f.a(i12, 1, 1, 1, this.f4334b, view.isSelected()));
                return;
            } else {
                g gVar = g.this;
                if (gVar.f4303f.getItemViewType(i11) == 2 || gVar.f4303f.getItemViewType(i11) == 3) {
                    i12--;
                }
                i11++;
            }
        }
    }
}
