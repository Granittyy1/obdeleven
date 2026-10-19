package J5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.a f4032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.b f4033e;

    public b(com.google.android.material.floatingactionbutton.b bVar, boolean z10, com.google.android.material.floatingactionbutton.a aVar) {
        this.f4033e = bVar;
        this.f4031c = z10;
        this.f4032d = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4030b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f4033e;
        bVar.f27191r = 0;
        bVar.f27185l = null;
        if (this.f4030b) {
            return;
        }
        boolean z10 = this.f4031c;
        bVar.f27195v.b(z10 ? 8 : 4, z10);
        com.google.android.material.floatingactionbutton.a aVar = this.f4032d;
        if (aVar != null) {
            aVar.f27160a.a(aVar.f27161b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f4033e;
        bVar.f27195v.b(0, this.f4031c);
        bVar.f27191r = 1;
        bVar.f27185l = animator;
        this.f4030b = false;
    }
}
