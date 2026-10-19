package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SearchBrowseCard.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1$1$3$1", f = "SearchBrowseCard.kt", l = {}, m = "invokeSuspend")
public final class SearchBrowseCardKt$SearchBrowseCard$1$1$3$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ List<SuggestedArticle> $articleSuggestions;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(MetricTracker metricTracker, List<SuggestedArticle> list, kotlin.coroutines.c<? super SearchBrowseCardKt$SearchBrowseCard$1$1$3$1> cVar) {
        super(2, cVar);
        this.$metricTracker = metricTracker;
        this.$articleSuggestions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(this.$metricTracker, this.$articleSuggestions, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        MetricTracker metricTracker = this.$metricTracker;
        List<SuggestedArticle> list = this.$articleSuggestions;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SuggestedArticle) it.next()).getId());
        }
        metricTracker.viewedArticleSuggestions(arrayList);
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SearchBrowseCardKt$SearchBrowseCard$1$1$3$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
