package io.ktor.client.engine.okhttp;

import Ia.l;
import io.ktor.client.engine.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import okhttp3.t;
import p293xa.r;

/* JADX INFO: compiled from: OkHttpConfig.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OkHttpConfig extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lambda f40291a = new l<t.a, r>() { // from class: io.ktor.client.engine.okhttp.OkHttpConfig$config$1
        @Override // Ia.l
        public final r invoke(t.a aVar) {
            t.a aVar2 = aVar;
            i.e(aVar2, "$this$null");
            aVar2.f45643h = false;
            aVar2.f45644i = false;
            aVar2.f45641f = true;
            return r.f47939a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40292b = 10;

    /* JADX WARN: Type inference failed for: r0v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.ktor.client.engine.okhttp.OkHttpConfig$config$2, kotlin.jvm.internal.Lambda] */
    public final void a(final l<? super t.a, r> block) {
        i.e(block, "block");
        final ?? r10 = this.f40291a;
        this.f40291a = new l<t.a, r>() { // from class: io.ktor.client.engine.okhttp.OkHttpConfig$config$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(t.a aVar) {
                t.a aVar2 = aVar;
                i.e(aVar2, "$this$null");
                r10.invoke(aVar2);
                block.invoke(aVar2);
                return r.f47939a;
            }
        };
    }
}
