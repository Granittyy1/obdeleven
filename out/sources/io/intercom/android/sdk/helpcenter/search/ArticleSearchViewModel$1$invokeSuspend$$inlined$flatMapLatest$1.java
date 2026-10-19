package io.intercom.android.sdk.helpcenter.search;

import Ia.q;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ArticleSearchViewModel.kt", l = {216, 189}, m = "invokeSuspend")
public final class ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements q<InterfaceC2687d<? super Pair<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>>, String, kotlin.coroutines.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(kotlin.coroutines.c cVar, ArticleSearchViewModel articleSearchViewModel) {
        super(3, cVar);
        this.this$0 = articleSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        InterfaceC2687d interfaceC2687d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                str = (String) this.L$1;
                interfaceC2687d = (InterfaceC2687d) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        InterfaceC2687d interfaceC2687d2 = (InterfaceC2687d) this.L$0;
        str = (String) this.L$1;
        HelpCenterApi helpCenterApi = this.this$0.helpCenterApi;
        String str2 = this.this$0.isFromSearchBrowse ? "search_browse" : null;
        this.L$0 = interfaceC2687d2;
        this.L$1 = str;
        this.label = 1;
        Object objSearchForArticles$default = HelpCenterApi.DefaultImpls.searchForArticles$default(helpCenterApi, str, str2, null, this, 4, null);
        if (objSearchForArticles$default == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC2687d = interfaceC2687d2;
        obj = objSearchForArticles$default;
        Pair pair = new Pair(obj, str);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (interfaceC2687d instanceof E) {
            throw ((E) interfaceC2687d).f43315b;
        }
        Object objEmit = interfaceC2687d.emit(pair, this);
        if (objEmit != coroutineSingletons) {
            objEmit = r.f47939a;
        }
        if (objEmit != coroutineSingletons) {
            objEmit = r.f47939a;
        }
        if (objEmit == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super Pair<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>> interfaceC2687d, String str, kotlin.coroutines.c<? super r> cVar) {
        ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.this$0);
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = interfaceC2687d;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(r.f47939a);
    }
}
