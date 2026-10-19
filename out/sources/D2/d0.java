package D2;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: Visibility.java */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f2618e;

    public d0(e0 e0Var, ViewGroup viewGroup, View view, View view2) {
        this.f2618e = e0Var;
        this.f2615b = viewGroup;
        this.f2616c = view;
        this.f2617d = view2;
    }

    @Override // D2.J, D2.F.e
    public final void a(F f10) {
        this.f2615b.getOverlay().remove(this.f2616c);
    }

    @Override // D2.J, D2.F.e
    public final void c(F f10) {
        View view = this.f2616c;
        if (view.getParent() == null) {
            this.f2615b.getOverlay().add(view);
            return;
        }
        e0 e0Var = this.f2618e;
        ArrayList<Animator> arrayList = e0Var.f2514s;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).cancel();
        }
        ArrayList<F.e> arrayList2 = e0Var.f2518w;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) e0Var.f2518w.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((F.e) arrayList3.get(i10)).b(e0Var);
        }
    }

    @Override // D2.F.e
    public final void e(F f10) {
        this.f2617d.setTag(R.id.save_overlay_view, null);
        this.f2615b.getOverlay().remove(this.f2616c);
        f10.B(this);
    }
}
