package p275w5;

import android.view.View;
import androidx.core.view.c0;
import androidx.core.view.n0;
import java.util.List;
import p216r5.a;

/* JADX INFO: compiled from: InsetsAnimationCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends c0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f47757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f47760g;

    public h(View view) {
        super(0);
        this.f47760g = new int[2];
        this.f47757d = view;
    }

    @Override // androidx.core.view.c0.b
    public final void a(c0 c0Var) {
        this.f47757d.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.c0.b
    public final void b() {
        View view = this.f47757d;
        int[] iArr = this.f47760g;
        view.getLocationOnScreen(iArr);
        this.f47758e = iArr[1];
    }

    @Override // androidx.core.view.c0.b
    public final n0 c(n0 n0Var, List<c0> list) {
        for (c0 c0Var : list) {
            if ((c0Var.f16889a.c() & 8) != 0) {
                this.f47757d.setTranslationY(a.c(c0Var.f16889a.b(), this.f47759f, 0));
                break;
            }
        }
        return n0Var;
    }

    @Override // androidx.core.view.c0.b
    public final c0.a d(c0.a aVar) {
        View view = this.f47757d;
        int[] iArr = this.f47760g;
        view.getLocationOnScreen(iArr);
        int i10 = this.f47758e - iArr[1];
        this.f47759f = i10;
        view.setTranslationY(i10);
        return aVar;
    }
}
