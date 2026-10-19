package N8;

import B8.C0632i0;
import android.view.View;
import com.voltasit.obdeleven.presentation.main.MainViewModel;

/* JADX INFO: compiled from: OnLongClickListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements View.OnLongClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0632i0 f4673b;

    public c(C0632i0 c0632i0) {
        this.f4673b = c0632i0;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MainViewModel mainViewModel = this.f4673b.f1943I;
        if (mainViewModel != null) {
            return mainViewModel.f();
        }
        return false;
    }
}
