package androidx.compose.foundation.pager;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import java.util.List;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultPagerState extends PagerState {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final W.f f10916I = androidx.compose.runtime.saveable.a.a(new Ia.p<androidx.compose.runtime.saveable.j, DefaultPagerState, List<? extends Object>>() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$1
        @Override // Ia.p
        public final List<? extends Object> invoke(androidx.compose.runtime.saveable.j jVar, DefaultPagerState defaultPagerState) {
            DefaultPagerState defaultPagerState2 = defaultPagerState;
            return kotlin.collections.l.s(Integer.valueOf(defaultPagerState2.j()), Float.valueOf(Na.l.C(defaultPagerState2.k(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState2.m()));
        }
    }, new Ia.l<List, DefaultPagerState>() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2
        @Override // Ia.l
        public final DefaultPagerState invoke(List list) {
            final List list2 = list;
            Object obj = list2.get(0);
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list2.get(1);
            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new DefaultPagerState(iIntValue, ((Float) obj2).floatValue(), new Ia.a<Integer>() { // from class: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final Integer invoke() {
                    Object obj3 = list2.get(2);
                    kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1085f0 f10917H;

    public DefaultPagerState(int i10, float f10, Ia.a<Integer> aVar) {
        super(i10, f10, null);
        this.f10917H = J0.f(aVar);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public final int m() {
        return ((Number) ((Ia.a) this.f10917H.getValue()).invoke()).intValue();
    }
}
