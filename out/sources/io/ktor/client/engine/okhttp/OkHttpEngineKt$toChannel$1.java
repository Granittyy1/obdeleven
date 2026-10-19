package io.ktor.client.engine.okhttp;

import Aa.c;
import D2.V;
import Ia.l;
import Ia.p;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.client.plugins.v;
import io.ktor.utils.io.j;
import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2702l0;
import p293xa.r;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: OkHttpEngine.kt */
/* JADX INFO: loaded from: classes.dex */
@c(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", l = {155}, m = "invokeSuspend")
final class OkHttpEngineKt$toChannel$1 extends SuspendLambda implements p<j, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ e $context;
    final /* synthetic */ V9.c $requestData;
    final /* synthetic */ InterfaceC2841h $this_toChannel;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngineKt$toChannel$1(InterfaceC2841h interfaceC2841h, e eVar, V9.c cVar, kotlin.coroutines.c<? super OkHttpEngineKt$toChannel$1> cVar2) {
        super(2, cVar2);
        this.$this_toChannel = interfaceC2841h;
        this.$context = eVar;
        this.$requestData = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        OkHttpEngineKt$toChannel$1 okHttpEngineKt$toChannel$1 = new OkHttpEngineKt$toChannel$1(this.$this_toChannel, this.$context, this.$requestData, cVar);
        okHttpEngineKt$toChannel$1.L$0 = obj;
        return okHttpEngineKt$toChannel$1;
    }

    @Override // Ia.p
    public final Object invoke(j jVar, kotlin.coroutines.c<? super r> cVar) {
        return ((OkHttpEngineKt$toChannel$1) create(jVar, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.nio.channels.Channel, zb.h] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0072 -> B:23:0x0075). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        r rVar;
        Closeable closeable;
        j jVar;
        e eVar;
        final Ref$IntRef ref$IntRef;
        final V9.c cVar;
        final ?? r10;
        ?? r11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        Throwable th = null;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                j jVar2 = (j) this.L$0;
                closeable = this.$this_toChannel;
                e eVar2 = this.$context;
                V9.c cVar2 = this.$requestData;
                jVar = jVar2;
                eVar = eVar2;
                ref$IntRef = new Ref$IntRef();
                cVar = cVar2;
                r10 = closeable;
                if (r10.isOpen() || !C2702l0.h(eVar) || ref$IntRef.element < 0) {
                    rVar = r.f47939a;
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } else {
                    io.ktor.utils.io.a aVarR = jVar.R();
                    l<ByteBuffer, r> lVar = new l<ByteBuffer, r>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(ByteBuffer byteBuffer) throws SocketTimeoutException {
                            ByteBuffer buffer = byteBuffer;
                            i.e(buffer, "buffer");
                            try {
                                ref$IntRef.element = r10.read(buffer);
                                return r.f47939a;
                            } catch (Throwable th3) {
                                V9.c cVar3 = cVar;
                                if (th3 instanceof java.net.SocketTimeoutException) {
                                    throw v.b(cVar3, th3);
                                }
                                throw th3;
                            }
                        }
                    };
                    this.L$0 = jVar;
                    this.L$1 = closeable;
                    this.L$2 = eVar;
                    this.L$3 = cVar;
                    this.L$4 = r10;
                    this.L$5 = ref$IntRef;
                    this.label = 1;
                    if (aVarR.e(1, lVar, this) == coroutineSingletons) {
                        r11 = r10;
                        return coroutineSingletons;
                    }
                }
                if (th == null) {
                    throw th;
                }
                i.b(rVar);
                return r.f47939a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$IntRef = (Ref$IntRef) this.L$5;
            InterfaceC2841h interfaceC2841h = (InterfaceC2841h) this.L$4;
            cVar = (V9.c) this.L$3;
            eVar = (e) this.L$2;
            closeable = (Closeable) this.L$1;
            jVar = (j) this.L$0;
            kotlin.b.b(obj);
            r11 = interfaceC2841h;
            r11 = r10;
            jVar.R().flush();
            r10 = r11;
            if (r10.isOpen()) {
            }
            rVar = r.f47939a;
            if (closeable != null) {
                closeable.close();
            }
        } catch (Throwable th3) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th4) {
                    V.e(th3, th4);
                }
            }
            th = th3;
            rVar = null;
        }
        if (th == null) {
            throw th;
        }
        i.b(rVar);
        return r.f47939a;
    }
}
