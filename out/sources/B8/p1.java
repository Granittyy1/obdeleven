package B8;

import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: LabeledButtonBindingBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends o1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2100v;

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f2100v;
            this.f2100v = 0L;
        }
        String str = this.f2093t;
        Y8.b textChange = this.f2094u;
        long j10 = 5 & j;
        if ((j & 6) != 0) {
            TextView textView = this.f2091r;
            kotlin.jvm.internal.i.e(textView, "<this>");
            kotlin.jvm.internal.i.e(textChange, "textChange");
            if (textChange.f7638b) {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(textView.getContext(), R.anim.push_up_out);
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(textView.getContext(), R.anim.push_up_in);
                animationLoadAnimation.setDuration(150L);
                animationLoadAnimation2.setDuration(150L);
                animationLoadAnimation.setAnimationListener(new W8.c(textView, textChange, animationLoadAnimation2, 0));
                textView.startAnimation(animationLoadAnimation);
            } else {
                Resources resources = textView.getResources();
                kotlin.jvm.internal.i.d(resources, "getResources(...)");
                textView.setText(textChange.a(resources));
            }
        }
        if (j10 != 0) {
            N0.c.a(this.f2092s, str);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2100v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2100v = 4L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.o1
    public final void t(String str) {
        this.f2093t = str;
        synchronized (this) {
            this.f2100v |= 1;
        }
        c(12);
        n();
    }

    @Override // B8.o1
    public final void u(Y8.b bVar) {
        this.f2094u = bVar;
        synchronized (this) {
            this.f2100v |= 2;
        }
        c(27);
        n();
    }
}
