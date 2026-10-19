package io.ktor.client.statement;

/* JADX INFO: compiled from: HttpResponsePipeline.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends io.ktor.util.pipeline.b<d, io.ktor.client.call.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P3.b f40430f = new P3.b(2, "Receive");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P3.b f40431g = new P3.b(2, "Parse");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P3.b f40432h = new P3.b(2, "Transform");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P3.b f40433i = new P3.b(2, "State");
    public static final P3.b j = new P3.b(2, "After");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40434e;

    public f(boolean z10) {
        super(f40430f, f40431g, f40432h, f40433i, j);
        this.f40434e = z10;
    }

    @Override // io.ktor.util.pipeline.b
    public final boolean d() {
        return this.f40434e;
    }
}
