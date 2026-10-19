package J5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.a f4035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.b f4036d;

    public c(com.google.android.material.floatingactionbutton.b bVar, boolean z10, com.google.android.material.floatingactionbutton.a aVar) {
        this.f4036d = bVar;
        this.f4034b = z10;
        this.f4035c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f4036d;
        bVar.f27191r = 0;
        bVar.f27185l = null;
        com.google.android.material.floatingactionbutton.a aVar = this.f4035c;
        if (aVar != null) {
            aVar.f27160a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f4036d;
        bVar.f27195v.b(0, this.f4034b);
        bVar.f27191r = 2;
        bVar.f27185l = animator;
    }
}
