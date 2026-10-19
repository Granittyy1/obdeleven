package P9;

import coil.compose.AsyncImagePainter;
import coil.request.g;
import io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import p141l2.w;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4970c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f4969b = i10;
        this.f4970c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [Ia.a, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // Ia.a
    public final Object invoke() {
        boolean z10;
        switch (this.f4969b) {
            case 0:
                return InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$2((androidx.paging.compose.b) this.f4970c);
            case 1:
                return (g) ((AsyncImagePainter) this.f4970c).f22725t.getValue();
            case 2:
                return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3((Ia.a) this.f4970c);
            default:
                w wVar = (w) this.f4970c;
                w.c cVar = wVar.f44314f;
                if (wVar.f44315g) {
                    z10 = wVar.a() > 1;
                }
                cVar.f8270a = z10;
                ?? r10 = cVar.f8272c;
                if (r10 != 0) {
                    r10.invoke();
                }
                return r.f47939a;
        }
    }
}
