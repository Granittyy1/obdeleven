package io.ktor.client.plugins;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DefaultTransformersJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons}, m = "invokeSuspend")
final class DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a>, io.ktor.client.statement.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: compiled from: DefaultTransformersJvm.kt */
    public static final class a extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.jvm.javaio.b f40313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a> f40314c;

        public a(io.ktor.utils.io.jvm.javaio.b bVar, io.ktor.util.pipeline.c cVar) {
            this.f40313b = bVar;
            this.f40314c = cVar;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f40313b.f40644b.r();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f40313b.close();
            io.ktor.client.statement.e.b(this.f40314c.f40561b.d());
        }

        @Override // java.io.InputStream
        public final int read() {
            return this.f40313b.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] b10, int i10, int i11) {
            kotlin.jvm.internal.i.e(b10, "b");
            return this.f40313b.read(b10, i10, i11);
        }
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a> cVar, io.ktor.client.statement.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 defaultTransformersJvmKt$platformResponseDefaultTransformers$1 = new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(3, cVar2);
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$0 = cVar;
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$1 = dVar;
        return defaultTransformersJvmKt$platformResponseDefaultTransformers$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            io.ktor.util.pipeline.c cVar = (io.ktor.util.pipeline.c) this.L$0;
            io.ktor.client.statement.d dVar = (io.ktor.client.statement.d) this.L$1;
            p023ba.a aVar = dVar.f40428a;
            Object obj2 = dVar.f40429b;
            if (!(obj2 instanceof ByteReadChannel)) {
                return p293xa.r.f47939a;
            }
            if (aVar.f20638a.equals(kotlin.jvm.internal.l.a(InputStream.class))) {
                ByteReadChannel byteReadChannel = (ByteReadChannel) obj2;
                InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) ((io.ktor.client.call.a) cVar.f40561b).getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
                p293xa.g gVar = BlockingKt.f40641a;
                kotlin.jvm.internal.i.e(byteReadChannel, "<this>");
                io.ktor.client.statement.d dVar2 = new io.ktor.client.statement.d(aVar, new a(new io.ktor.utils.io.jvm.javaio.b(interfaceC2694i0, byteReadChannel), cVar));
                this.L$0 = null;
                this.label = 1;
                if (cVar.d(dVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
