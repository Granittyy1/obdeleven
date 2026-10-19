package coil.fetch;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.C2753d;

/* JADX INFO: compiled from: HttpUriFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
final class HttpUriFetcher$executeNetworkRequest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpUriFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$executeNetworkRequest$1(HttpUriFetcher httpUriFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HttpUriFetcher httpUriFetcher = this.this$0;
        C2753d c2753d = HttpUriFetcher.f22963f;
        return httpUriFetcher.b(null, this);
    }
}
