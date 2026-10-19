package bo.app;

/* JADX INFO: renamed from: bo.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1461d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20832d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f20833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.a f20834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f20835c;

    /* JADX INFO: renamed from: bo.app.d$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public AbstractC1461d(d2 request, l2.a connectionResult) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(connectionResult, "connectionResult");
        this.f20833a = request;
        this.f20834b = connectionResult;
        String str = (String) connectionResult.b().get("retry-after");
        this.f20835c = str != null ? com.braze.support.g.a(str) : null;
    }

    public final l2.a a() {
        return this.f20834b;
    }

    public final Long b() {
        return this.f20835c;
    }
}
