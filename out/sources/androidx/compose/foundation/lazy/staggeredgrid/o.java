package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.P;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.B;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f10866a;

    static {
        int[] iArr = new int[0];
        f10866a = new n(iArr, iArr, 0.0f, new a(), 0.0f, false, false, false, new u(iArr, iArr), new W4.b(new P()), p006a5.a.a(), 0, EmptyList.f42983b, 0L, 0, 0, 0, 0, 0, B.a(EmptyCoroutineContext.f43032b));
    }

    /* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
    public static final class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<AbstractC1155a, Integer> f10867a = y.p();

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
            return this.f10867a;
        }

        @Override // androidx.compose.ui.layout.F
        public final void p() {
        }
    }
}
