package io.ktor.client.statement;

import S4.o;
import com.braze.support.BrazeLogger;
import io.ktor.http.n;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.TypeReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.InterfaceC2707q;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c cVar, Charset charset, ContinuationImpl continuationImpl) {
        HttpResponseKt$bodyAsText$1 httpResponseKt$bodyAsText$1;
        CharsetDecoder decoder;
        if (continuationImpl instanceof HttpResponseKt$bodyAsText$1) {
            httpResponseKt$bodyAsText$1 = (HttpResponseKt$bodyAsText$1) continuationImpl;
            int i10 = httpResponseKt$bodyAsText$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsText$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpResponseKt$bodyAsText$1 = new HttpResponseKt$bodyAsText$1(continuationImpl);
            }
        } else {
            httpResponseKt$bodyAsText$1 = new HttpResponseKt$bodyAsText$1(continuationImpl);
        }
        Object objA = httpResponseKt$bodyAsText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpResponseKt$bodyAsText$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            Charset charsetA = n.a(cVar);
            if (charsetA != null) {
                charset = charsetA;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            io.ktor.client.call.a aVarB = cVar.b();
            TypeReference typeReferenceB = l.b(p061ea.d.class);
            p023ba.a aVar = new p023ba.a(l.a(p061ea.d.class), kotlin.reflect.a.e(typeReferenceB), typeReferenceB);
            httpResponseKt$bodyAsText$1.L$0 = charsetDecoderNewDecoder;
            httpResponseKt$bodyAsText$1.label = 1;
            objA = aVarB.a(aVar, httpResponseKt$bodyAsText$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            decoder = charsetDecoderNewDecoder;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            decoder = (CharsetDecoder) httpResponseKt$bodyAsText$1.L$0;
            kotlin.b.b(objA);
        }
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket");
        }
        i.d(decoder, "decoder");
        return o.e(decoder, (p061ea.d) objA, BrazeLogger.SUPPRESS);
    }

    public static final void b(c cVar) {
        i.e(cVar, "<this>");
        kotlin.coroutines.e.a aVar = cVar.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
        i.b(aVar);
        ((InterfaceC2707q) aVar).b();
    }
}
