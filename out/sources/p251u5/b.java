package p251u5;

import B0.u;
import android.view.View;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.f;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SwipeDismissBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f47426a;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f47426a = swipeDismissBehavior;
    }

    @Override // B0.u
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f47426a;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        boolean z10 = view.getLayoutDirection() == 1;
        int i10 = swipeDismissBehavior.f26727f;
        view.offsetLeftAndRight((!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        f fVar = swipeDismissBehavior.f26724c;
        if (fVar != null) {
            fVar.a(view);
        }
        return true;
    }
}
