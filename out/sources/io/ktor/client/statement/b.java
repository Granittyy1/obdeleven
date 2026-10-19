package io.ktor.client.statement;

import p293xa.r;

/* JADX INFO: compiled from: HttpResponsePipeline.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends io.ktor.util.pipeline.b<c, r> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P3.b f40424f = new P3.b(2, "Before");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P3.b f40425g = new P3.b(2, "State");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P3.b f40426h = new P3.b(2, "After");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40427e;

    public b(boolean z10) {
        super(f40424f, f40425g, f40426h);
        this.f40427e = z10;
    }

    @Override // io.ktor.util.pipeline.b
    public final boolean d() {
        return this.f40427e;
    }
}
