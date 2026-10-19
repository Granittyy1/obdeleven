package io.ktor.client.plugins;

import io.ktor.client.HttpClient;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultTransformKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cc.b f40306a = p144l6.b.a("io.ktor.client.plugins.defaultTransformers");

    public static final void a(HttpClient httpClient) {
        kotlin.jvm.internal.i.e(httpClient, "<this>");
        httpClient.f40243f.f(V9.d.f6859i, new DefaultTransformKt$defaultTransformers$1(3, null));
        P3.b bVar = io.ktor.client.statement.f.f40431g;
        DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new DefaultTransformKt$defaultTransformers$2(3, null);
        io.ktor.client.statement.f fVar = httpClient.f40244g;
        fVar.f(bVar, defaultTransformKt$defaultTransformers$2);
        fVar.f(bVar, new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(3, null));
    }
}
