package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PreviewBottomBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1", f = "PreviewBottomBar.kt", l = {R.styleable.AppCompatTheme_selectableItemBackground}, m = "invokeSuspend")
public final class PreviewBottomBarKt$ThumbnailList$1$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ X<List<Integer>> $visibleItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBottomBarKt$ThumbnailList$1$1(LazyListState lazyListState, X<List<Integer>> x10, kotlin.coroutines.c<? super PreviewBottomBarKt$ThumbnailList$1$1> cVar) {
        super(2, cVar);
        this.$listState = lazyListState;
        this.$visibleItems = x10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(LazyListState lazyListState) {
        List<androidx.compose.foundation.lazy.g> listF = lazyListState.j().f();
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((androidx.compose.foundation.lazy.g) it.next()).getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PreviewBottomBarKt$ThumbnailList$1$1(this.$listState, this.$visibleItems, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final LazyListState lazyListState = this.$listState;
            kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a() { // from class: io.intercom.android.sdk.ui.preview.ui.j
                @Override // Ia.a
                public final Object invoke() {
                    return PreviewBottomBarKt$ThumbnailList$1$1.invokeSuspend$lambda$1(lazyListState);
                }
            });
            final X<List<Integer>> x10 = this.$visibleItems;
            InterfaceC2687d interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1.2
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                    return emit((List<Integer>) obj2, (kotlin.coroutines.c<? super p293xa.r>) cVar);
                }

                public final Object emit(List<Integer> list, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    x10.setValue(list);
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (tVarJ.collect(interfaceC2687d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PreviewBottomBarKt$ThumbnailList$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
