package io.ktor.utils.io.jvm.javaio;

import Ia.p;
import io.ktor.utils.io.j;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: Reading.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", f = "Reading.kt", l = {R.styleable.AppCompatTheme_popupWindowStyle}, m = "invokeSuspend")
final class ReadingKt$toByteReadChannel$2 extends SuspendLambda implements p<j, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p086ga.d<byte[]> $pool;
    final /* synthetic */ InputStream $this_toByteReadChannel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadingKt$toByteReadChannel$2(p086ga.d<byte[]> dVar, InputStream inputStream, kotlin.coroutines.c<? super ReadingKt$toByteReadChannel$2> cVar) {
        super(2, cVar);
        this.$pool = dVar;
        this.$this_toByteReadChannel = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ReadingKt$toByteReadChannel$2 readingKt$toByteReadChannel$2 = new ReadingKt$toByteReadChannel$2(this.$pool, this.$this_toByteReadChannel, cVar);
        readingKt$toByteReadChannel$2.L$0 = obj;
        return readingKt$toByteReadChannel$2;
    }

    @Override // Ia.p
    public final Object invoke(j jVar, kotlin.coroutines.c<? super r> cVar) {
        return ((ReadingKt$toByteReadChannel$2) create(jVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        byte[] bArrY;
        j jVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            j jVar2 = (j) this.L$0;
            bArrY = this.$pool.y();
            jVar = jVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArrY = (byte[]) this.L$1;
            jVar = (j) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th) {
                try {
                    jVar.R().a(th);
                    this.$pool.H0(bArrY);
                } finally {
                    this.$pool.H0(bArrY);
                    this.$this_toByteReadChannel.close();
                }
            }
        }
        while (true) {
            int i11 = this.$this_toByteReadChannel.read(bArrY, 0, bArrY.length);
            if (i11 < 0) {
                this.$pool.H0(bArrY);
                return r.f47939a;
            }
            if (i11 != 0) {
                io.ktor.utils.io.a aVarR = jVar.R();
                this.L$0 = jVar;
                this.L$1 = bArrY;
                this.label = 1;
                if (aVarR.d(bArrY, i11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
    }
}
