package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: loaded from: classes.dex */
public final class b5 implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f20759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f20760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f20761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s1 f20762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r5 f20763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1486y f20764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c2 f20765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z0 f20766h;

    public static final class a extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20767b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e5 f20769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c5.c f20770e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e5 e5Var, c5.c cVar, kotlin.coroutines.c cVar2) {
            super(2, cVar2);
            this.f20769d = e5Var;
            this.f20770e = cVar;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return b5.this.new a(this.f20769d, this.f20770e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f20767b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b5.this.a(this.f20769d, this.f20770e);
            return p293xa.r.f47939a;
        }
    }

    public b5(l2 httpConnector, k2 internalEventPublisher, k2 externalEventPublisher, s1 feedStorageProvider, r5 serverConfigStorageProvider, C1486y contentCardsStorageProvider, c2 brazeManager, z0 endpointMetadataProvider) {
        kotlin.jvm.internal.i.e(httpConnector, "httpConnector");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(externalEventPublisher, "externalEventPublisher");
        kotlin.jvm.internal.i.e(feedStorageProvider, "feedStorageProvider");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(contentCardsStorageProvider, "contentCardsStorageProvider");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(endpointMetadataProvider, "endpointMetadataProvider");
        this.f20759a = httpConnector;
        this.f20760b = internalEventPublisher;
        this.f20761c = externalEventPublisher;
        this.f20762d = feedStorageProvider;
        this.f20763e = serverConfigStorageProvider;
        this.f20764f = contentCardsStorageProvider;
        this.f20765g = brazeManager;
        this.f20766h = endpointMetadataProvider;
    }

    @Override // bo.app.q2
    public void a(e5 requestInfo, c5.c requestDispatchCallback, boolean z10) {
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        kotlin.jvm.internal.i.e(requestDispatchCallback, "requestDispatchCallback");
        if (z10) {
            a(requestInfo, requestDispatchCallback);
        } else {
            C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new a(requestInfo, requestDispatchCallback, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(e5 e5Var, c5.c cVar) {
        new r(e5Var, this.f20759a, this.f20760b, this.f20761c, this.f20762d, this.f20765g, this.f20763e, this.f20764f, this.f20766h, cVar).c();
    }
}
