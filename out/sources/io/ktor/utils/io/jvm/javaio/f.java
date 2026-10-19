package io.ktor.utils.io.jvm.javaio;

import java.io.InputStream;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: Reading.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static io.ktor.utils.io.a a(InputStream inputStream) {
        Sa.a context = N.f43200c;
        p086ga.a.C0373a pool = p086ga.a.f35672a;
        i.e(inputStream, "<this>");
        i.e(context, "context");
        i.e(pool, "pool");
        return io.ktor.utils.io.i.a(C2673a0.f43223b, context, true, new ReadingKt$toByteReadChannel$2(pool, inputStream, null)).f40597c;
    }
}
