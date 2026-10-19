package V9;

/* JADX INFO: compiled from: HttpRequestPipeline.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends io.ktor.util.pipeline.b<Object, io.ktor.client.request.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P3.b f6856f = new P3.b(2, "Before");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P3.b f6857g = new P3.b(2, "State");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P3.b f6858h = new P3.b(2, "Transform");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P3.b f6859i = new P3.b(2, "Render");
    public static final P3.b j = new P3.b(2, "Send");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6860e;

    public d(boolean z10) {
        super(f6856f, f6857g, f6858h, f6859i, j);
        this.f6860e = z10;
    }

    @Override // io.ktor.util.pipeline.b
    public final boolean d() {
        return this.f6860e;
    }
}
