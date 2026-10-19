package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.B;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11012a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f11013b = new m(EmptyList.f42983b, 0, 0, 0, Orientation.f9958c, 0, 0, 0, androidx.compose.foundation.gestures.snapping.k.b.f10051a, new a(), B.a(EmptyCoroutineContext.f43032b));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11014c = new b();

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class b implements p013b0.c {
        @Override // p013b0.c
        public final float P0() {
            return 1.0f;
        }

        @Override // p013b0.c
        public final float getDensity() {
            return 1.0f;
        }
    }

    public static final long a(i iVar, int i10) {
        long jF = (((((long) i10) * ((long) (iVar.f() + iVar.g()))) + ((long) iVar.c())) + ((long) iVar.b())) - ((long) iVar.g());
        int iA = (int) (iVar.getOrientation() == Orientation.f9958c ? iVar.a() >> 32 : iVar.a() & 4294967295L);
        return Na.l.y(jF - ((long) (iA - Na.l.D(iVar.h().f(iA, iVar.f(), iVar.c(), iVar.b()), 0, iA))), 0L);
    }

    public static final DefaultPagerState b(final int i10, final Ia.a aVar, InterfaceC1084f interfaceC1084f, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        W.f fVar = DefaultPagerState.f10916I;
        final float f10 = 0.0f;
        boolean zH = interfaceC1084f.h(i10) | ((((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.g(0.0f)) || (i11 & 48) == 32);
        if ((((i11 & 896) ^ 384) <= 256 || !interfaceC1084f.K(aVar)) && (i11 & 384) != 256) {
            z10 = false;
        }
        boolean z11 = zH | z10;
        Object objF = interfaceC1084f.f();
        if (z11 || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.a<DefaultPagerState>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final DefaultPagerState invoke() {
                    return new DefaultPagerState(i10, f10, aVar);
                }
            };
            interfaceC1084f.E(objF);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) androidx.compose.runtime.saveable.b.c(objArr, fVar, null, (Ia.a) objF, interfaceC1084f, 0, 4);
        defaultPagerState.f10917H.setValue(aVar);
        return defaultPagerState;
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<AbstractC1155a, Integer> f11015a = y.p();

        @Override // androidx.compose.ui.layout.F
        public final int getHeight() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.F
        public final int getWidth() {
            return 0;
        }

        @Override // androidx.compose.ui.layout.F
        public final Map<AbstractC1155a, Integer> o() {
            return this.f11015a;
        }

        @Override // androidx.compose.ui.layout.F
        public final void p() {
        }
    }
}
