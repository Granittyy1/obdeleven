package com.voltasit.obdeleven.data.repositories;

import com.voltasit.obdeleven.Application;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: FileRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.FileRepositoryImpl$getReportFile$2", f = "FileRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class FileRepositoryImpl$getReportFile$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super byte[]>, Object> {
    int label;

    public FileRepositoryImpl$getReportFile$2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FileRepositoryImpl$getReportFile$2(2, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super byte[]> cVar) {
        return ((FileRepositoryImpl$getReportFile$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        P8.b bVar = Application.f29635c;
        kotlin.jvm.internal.i.b(bVar);
        File file = bVar.f4958c;
        kotlin.jvm.internal.i.d(file, "getLogFile(...)");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        fileInputStream.close();
        return bArr;
    }
}
