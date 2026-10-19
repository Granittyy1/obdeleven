package io.intercom.android.sdk.helpcenter.articles;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.intercom.android.sdk.articles.ArticleWebViewListener;

/* JADX INFO: compiled from: IntercomArticleActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArticleActivity$onCreate$1$1$3$1$1$1$1 implements ArticleWebViewListener {
    final /* synthetic */ WebView $this_apply;
    final /* synthetic */ IntercomArticleActivity this$0;

    public IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(IntercomArticleActivity intercomArticleActivity, WebView webView) {
        this.this$0 = intercomArticleActivity;
        this.$this_apply = webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onArticleFinishedLoading$lambda$0(IntercomArticleActivity this$0, String str) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ArticleViewModel viewModel = this$0.getViewModel();
        kotlin.jvm.internal.i.b(str);
        viewModel.articleContentIdFetched(kotlin.text.n.b0(str));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        this.this$0.getViewModel().articleNotFound();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        this.this$0.getViewModel().onArticleFinishedLoading();
        WebView webView = this.$this_apply;
        final IntercomArticleActivity intercomArticleActivity = this.this$0;
        webView.evaluateJavascript("window.alexandriaArticleContentId", new ValueCallback() { // from class: io.intercom.android.sdk.helpcenter.articles.s
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                IntercomArticleActivity$onCreate$1$1$3$1$1$1$1.onArticleFinishedLoading$lambda$0(intercomArticleActivity, (String) obj);
            }
        });
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        this.this$0.getViewModel().onArticleLoadingError();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        this.this$0.getViewModel().onArticleStartedLoading();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int i10) {
        this.this$0.getViewModel().scrollArticleViewTo(i10);
    }
}
