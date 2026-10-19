package androidx.compose.foundation.layout;

import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0952l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0953m f10307a = new C0953m(C0945e.f10286c, androidx.compose.ui.d.a.f13346m);

    public static final C0953m a(C0945e.l lVar, androidx.compose.ui.d.b bVar, InterfaceC1084f interfaceC1084f, int i10) {
        if (kotlin.jvm.internal.i.a(lVar, C0945e.f10286c) && kotlin.jvm.internal.i.a(bVar, androidx.compose.ui.d.a.f13346m)) {
            interfaceC1084f.L(346089448);
            interfaceC1084f.D();
            return f10307a;
        }
        interfaceC1084f.L(346143295);
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1084f.K(lVar)) || (i10 & 6) == 4) | ((((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.K(bVar)) || (i10 & 48) == 32);
        Object objF = interfaceC1084f.f();
        if (z10 || objF == InterfaceC1084f.a.f12980a) {
            objF = new C0953m(lVar, bVar);
            interfaceC1084f.E(objF);
        }
        C0953m c0953m = (C0953m) objF;
        interfaceC1084f.D();
        return c0953m;
    }
}
