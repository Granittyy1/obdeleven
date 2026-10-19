package K5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: StateListAnimator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f4344a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f4345b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4346c = new a();

    /* JADX INFO: compiled from: StateListAnimator.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            l lVar = l.this;
            if (lVar.f4345b == animator) {
                lVar.f4345b = null;
            }
        }
    }

    /* JADX INFO: compiled from: StateListAnimator.java */
    public static class b {
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b();
        valueAnimator.addListener(this.f4346c);
        this.f4344a.add(bVar);
    }
}
