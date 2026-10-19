package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.B;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f10780a = new l(null, 0, false, 0.0f, new a(), 0.0f, false, B.a(EmptyCoroutineContext.f43032b), p006a5.a.a(), p013b0.b.b(0, 0, 15), EmptyList.f42983b, 0, 0, 0, false, Orientation.f9957b, 0, 0);

    public static final LazyListState a(final int i10, InterfaceC1084f interfaceC1084f, int i11, int i12) {
        boolean z10 = true;
        final int i13 = 0;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        W.f fVar = LazyListState.f10350w;
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC1084f.h(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean zH = interfaceC1084f.h(0) | z10;
        Object objF = interfaceC1084f.f();
        if (zH || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.a<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final LazyListState invoke() {
                    return new LazyListState(i10, i13);
                }
            };
            interfaceC1084f.E(objF);
        }
        return (LazyListState) androidx.compose.runtime.saveable.b.c(objArr, fVar, null, (Ia.a) objF, interfaceC1084f, 0, 4);
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    public static final class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<AbstractC1155a, Integer> f10781a = y.p();

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
            return this.f10781a;
        }

        @Override // androidx.compose.ui.layout.F
        public final void p() {
        }
    }
}
