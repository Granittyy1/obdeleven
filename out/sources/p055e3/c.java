package p055e3;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: compiled from: MDRootLayout.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f34724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MDRootLayout f34726c;

    public c(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z10) {
        this.f34726c = mDRootLayout;
        this.f34724a = viewGroup;
        this.f34725b = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(int i10, int i11, RecyclerView recyclerView) {
        MDRootLayout mDRootLayout = this.f34726c;
        boolean z10 = false;
        for (MDButton mDButton : mDRootLayout.f23281b) {
            if (mDButton != null && mDButton.getVisibility() != 8) {
                z10 = true;
                break;
            }
        }
        MDRootLayout.a(mDRootLayout, this.f34724a, this.f34725b, z10);
        mDRootLayout.invalidate();
    }
}
