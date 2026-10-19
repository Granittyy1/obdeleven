package B2;

import android.animation.Animator;

/* JADX INFO: compiled from: CircularProgressDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.a f1462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1463c;

    public c(d dVar, d.a aVar) {
        this.f1463c = dVar;
        this.f1462b = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.f1463c;
        d.a aVar = this.f1462b;
        dVar.a(1.0f, aVar, true);
        aVar.f1481k = aVar.f1476e;
        aVar.f1482l = aVar.f1477f;
        aVar.f1483m = aVar.f1478g;
        aVar.a((aVar.j + 1) % aVar.f1480i.length);
        if (!dVar.f1471g) {
            dVar.f1470f += 1.0f;
            return;
        }
        dVar.f1471g = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.f1484n) {
            aVar.f1484n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1463c.f1470f = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
