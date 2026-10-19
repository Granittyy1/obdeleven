package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.B;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyGridStateKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f10442a;

    static {
        a aVar = new a();
        EmptyList emptyList = EmptyList.f42983b;
        Orientation orientation = Orientation.f9957b;
        f10442a = new p(null, 0, false, 0.0f, aVar, 0.0f, false, B.a(EmptyCoroutineContext.f43032b), p006a5.a.a(), 0, new Ia.l<Integer, List<? extends Pair<? extends Integer, ? extends p013b0.a>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$EmptyLazyGridLayoutInfo$2
            @Override // Ia.l
            public final List<? extends Pair<? extends Integer, ? extends p013b0.a>> invoke(Integer num) {
                num.intValue();
                return EmptyList.f42983b;
            }
        }, emptyList, 0, 0, 0, false, orientation, 0, 0);
    }

    public static final LazyGridState a(final int i10, InterfaceC1084f interfaceC1084f, int i11) {
        final int i12 = 0;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        W.f fVar = LazyGridState.f10416w;
        boolean zH = interfaceC1084f.h(i10) | interfaceC1084f.h(0);
        Object objF = interfaceC1084f.f();
        if (zH || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.a<LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridStateKt$rememberLazyGridState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final LazyGridState invoke() {
                    return new LazyGridState(i10, i12);
                }
            };
            interfaceC1084f.E(objF);
        }
        return (LazyGridState) androidx.compose.runtime.saveable.b.c(objArr, fVar, null, (Ia.a) objF, interfaceC1084f, 0, 4);
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    public static final class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<AbstractC1155a, Integer> f10444a = kotlin.collections.y.p();

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
            return this.f10444a;
        }

        @Override // androidx.compose.ui.layout.F
        public final void p() {
        }
    }
}
