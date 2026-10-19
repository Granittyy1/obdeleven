package androidx.compose.animation;

import androidx.compose.animation.core.G;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.d0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F {
    public static final InfiniteTransition.a a(InfiniteTransition infiniteTransition, long j, long j10, androidx.compose.animation.core.E e10, InterfaceC1084f interfaceC1084f, int i10) {
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            int i11 = H.f13505m;
            objF = (d0) ((ColorVectorConverterKt$ColorToVector$1) ColorVectorConverterKt.f9265a).invoke(H.f(j10));
            interfaceC1084f.E(objF);
        }
        int i12 = i10 << 3;
        return G.b(infiniteTransition, new H(j), new H(j10), (d0) objF, e10, "Color value animation", interfaceC1084f, (i10 & 14) | 8 | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i10 & 896) | 32768 | (57344 & i12) | (i12 & 458752), 0);
    }
}
