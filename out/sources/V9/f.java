package V9;

/* JADX INFO: compiled from: HttpRequestPipeline.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends io.ktor.util.pipeline.b<Object, io.ktor.client.request.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P3.b f6868f = new P3.b(2, "Before");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P3.b f6869g = new P3.b(2, "State");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P3.b f6870h = new P3.b(2, "Monitoring");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P3.b f6871i = new P3.b(2, "Engine");
    public static final P3.b j = new P3.b(2, "Receive");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6872e;

    public f(boolean z10) {
        super(f6868f, f6869g, f6870h, f6871i, j);
        this.f6872e = z10;
    }

    @Override // io.ktor.util.pipeline.b
    public final boolean d() {
        return this.f6872e;
    }
}
