package io.ktor.client.plugins;

import io.ktor.client.HttpClient;

/* JADX INFO: compiled from: HttpRedirect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40378a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.ktor.util.a<o> f40379b = new io.ktor.util.a<>("HttpRedirect");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.voltasit.obdeleven.domain.usecases.device.u f40380c = new com.voltasit.obdeleven.domain.usecases.device.u();

    /* JADX INFO: compiled from: HttpRedirect.kt */
    public static final class a {
    }

    /* JADX INFO: compiled from: HttpRedirect.kt */
    public static final class b implements i<a, o> {
        /* JADX WARN: Code duplicated, block: B:36:0x011c  */
        /* JADX WARN: Code duplicated, block: B:40:0x018f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0196  */
        /* JADX WARN: Code duplicated, block: B:45:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:47:0x01af  */
        /* JADX WARN: Code duplicated, block: B:49:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:53:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:56:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:59:0x022a  */
        /* JADX WARN: Code duplicated, block: B:60:0x022c  */
        /* JADX WARN: Code duplicated, block: B:63:0x0247  */
        /* JADX WARN: Code duplicated, block: B:65:0x024a  */
        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v14, types: [T] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v8, types: [io.ktor.client.plugins.x, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r23v0, types: [T, io.ktor.client.call.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, io.ktor.client.request.a] */
        /* JADX WARN: Type inference failed for: r8v0, types: [T] */
        /* JADX WARN: Type inference failed for: r8v1, types: [io.ktor.client.request.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x022c -> B:61:0x0233). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static final java.lang.Object c(io.ktor.client.plugins.o.b r20, io.ktor.client.plugins.x r21, io.ktor.client.request.a r22, io.ktor.client.call.a r23, io.ktor.client.HttpClient r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
            /*
                Method dump skipped, instruction units count: 598
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.o.b.c(io.ktor.client.plugins.o$b, io.ktor.client.plugins.x, io.ktor.client.request.a, io.ktor.client.call.a, io.ktor.client.HttpClient, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        @Override // io.ktor.client.plugins.i
        public final void a(o oVar, HttpClient scope) {
            o plugin = oVar;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            t.d dVar = t.f40392b;
            t tVar = (t) j.a(scope);
            tVar.f40394a.add(new HttpRedirect$Plugin$install$1(plugin, scope, null));
        }

        @Override // io.ktor.client.plugins.i
        public final o b(Ia.l<? super a, p293xa.r> lVar) {
            lVar.invoke(new a());
            return new o();
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<o> getKey() {
            return o.f40379b;
        }
    }
}
