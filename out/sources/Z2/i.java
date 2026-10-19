package Z2;

import A8.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: ViewSizeResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public interface i<T extends View> extends f {
    static a g(int i10, int i11, int i12) {
        if (i10 == -2) {
            return a.b.f7726a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return new a.C0110a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return new a.C0110a(i14);
        }
        return null;
    }

    T a();

    @Override // Z2.f
    default Object e(kotlin.coroutines.c<? super e> cVar) {
        e size = getSize();
        if (size != null) {
            return size;
        }
        C2693i c2693i = new C2693i(1, p.y(cVar));
        c2693i.s();
        ViewTreeObserver viewTreeObserver = a().getViewTreeObserver();
        h hVar = new h(this, viewTreeObserver, c2693i);
        viewTreeObserver.addOnPreDrawListener(hVar);
        c2693i.u(new g(this, viewTreeObserver, hVar));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    default a getHeight() {
        int paddingBottom;
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        int i10 = layoutParams != null ? layoutParams.height : -1;
        int height = a().getHeight();
        if (l()) {
            paddingBottom = a().getPaddingBottom() + a().getPaddingTop();
        } else {
            paddingBottom = 0;
        }
        return g(i10, height, paddingBottom);
    }

    default e getSize() {
        a height;
        a width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new e(width, height);
    }

    default a getWidth() {
        int paddingRight;
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        int i10 = layoutParams != null ? layoutParams.width : -1;
        int width = a().getWidth();
        if (l()) {
            paddingRight = a().getPaddingRight() + a().getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        return g(i10, width, paddingRight);
    }

    default void k(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            a().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean l() {
        return true;
    }
}
