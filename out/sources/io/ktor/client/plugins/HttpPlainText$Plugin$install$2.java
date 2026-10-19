package io.ktor.client.plugins;

import com.braze.support.BrazeLogger;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.utils.io.ByteReadChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$2", f = "HttpPlainText.kt", l = {136, 138}, m = "invokeSuspend")
final class HttpPlainText$Plugin$install$2 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a>, io.ktor.client.statement.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ k $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainText$Plugin$install$2(k kVar, kotlin.coroutines.c<? super HttpPlainText$Plugin$install$2> cVar) {
        super(3, cVar);
        this.$plugin = kVar;
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a> cVar, io.ktor.client.statement.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        HttpPlainText$Plugin$install$2 httpPlainText$Plugin$install$2 = new HttpPlainText$Plugin$install$2(this.$plugin, cVar2);
        httpPlainText$Plugin$install$2.L$0 = cVar;
        httpPlainText$Plugin$install$2.L$1 = dVar;
        return httpPlainText$Plugin$install$2.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws BadContentTypeFormatException {
        io.ktor.util.pipeline.c cVar;
        p023ba.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                aVar = (p023ba.a) this.L$1;
                cVar = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        io.ktor.util.pipeline.c cVar2 = (io.ktor.util.pipeline.c) this.L$0;
        io.ktor.client.statement.d dVar = (io.ktor.client.statement.d) this.L$1;
        p023ba.a aVar2 = dVar.f40428a;
        if (aVar2.f20638a.equals(kotlin.jvm.internal.l.a(String.class))) {
            Object obj2 = dVar.f40429b;
            if (obj2 instanceof ByteReadChannel) {
                this.L$0 = cVar2;
                this.L$1 = aVar2;
                this.label = 1;
                Object objT = ((ByteReadChannel) obj2).t(Long.MAX_VALUE, this);
                if (objT == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = cVar2;
                obj = objT;
                aVar = aVar2;
            }
        }
        return p293xa.r.f47939a;
        p061ea.d body = (p061ea.d) obj;
        k kVar = this.$plugin;
        io.ktor.client.call.a call = (io.ktor.client.call.a) cVar.f40561b;
        kVar.getClass();
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(body, "body");
        Charset charset = io.ktor.http.n.a(call.d());
        if (charset == null) {
            charset = kVar.f40371a;
        }
        n.f40377a.b("Reading response body for " + call.c().k() + " as String with charset " + charset);
        kotlin.jvm.internal.i.e(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        kotlin.jvm.internal.i.d(charsetDecoderNewDecoder, "charset.newDecoder()");
        io.ktor.client.statement.d dVar2 = new io.ktor.client.statement.d(aVar, S4.o.e(charsetDecoderNewDecoder, body, BrazeLogger.SUPPRESS));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (cVar.d(dVar2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
