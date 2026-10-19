package androidx.compose.foundation.layout;

import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f10202a = new T(C0945e.f10284a, androidx.compose.ui.d.a.j);

    public static final T a(C0945e.InterfaceC0129e interfaceC0129e, androidx.compose.ui.f.b bVar, InterfaceC1084f interfaceC1084f, int i10) {
        if (kotlin.jvm.internal.i.a(interfaceC0129e, C0945e.f10284a) && kotlin.jvm.internal.i.a(bVar, androidx.compose.ui.d.a.j)) {
            interfaceC1084f.L(-848964613);
            interfaceC1084f.D();
            return f10202a;
        }
        interfaceC1084f.L(-848913742);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1084f.K(interfaceC0129e)) || (i10 & 6) == 4) | ((((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.K(bVar)) || (i10 & 48) == 32);
        Object objF = interfaceC1084f.f();
        if (z10 || objF == InterfaceC1084f.a.f12980a) {
            objF = new T(interfaceC0129e, bVar);
            interfaceC1084f.E(objF);
        }
        T t8 = (T) objF;
        interfaceC1084f.D();
        return t8;
    }
}
