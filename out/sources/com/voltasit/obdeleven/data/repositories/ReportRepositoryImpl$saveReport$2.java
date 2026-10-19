package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseException;
import com.parse.ParseFile;
import io.intercom.android.sdk.models.Participant;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: ReportRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.ReportRepositoryImpl$saveReport$2", f = "ReportRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class ReportRepositoryImpl$saveReport$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $description;
    final /* synthetic */ byte[] $reportFileBytes;
    int label;
    final /* synthetic */ ReportRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportRepositoryImpl$saveReport$2(byte[] bArr, ReportRepositoryImpl reportRepositoryImpl, String str, kotlin.coroutines.c<? super ReportRepositoryImpl$saveReport$2> cVar) {
        super(2, cVar);
        this.$reportFileBytes = bArr;
        this.this$0 = reportRepositoryImpl;
        this.$description = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ReportRepositoryImpl$saveReport$2(this.$reportFileBytes, this.this$0, this.$description, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ReportRepositoryImpl$saveReport$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ParseException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        ParseFile parseFile = new ParseFile("log.txt", this.$reportFileBytes);
        parseFile.save();
        p255u9.p pVar = new p255u9.p();
        ReportRepositoryImpl reportRepositoryImpl = this.this$0;
        String str = this.$description;
        if (reportRepositoryImpl.f30310a.z()) {
            pVar.put(Participant.USER_TYPE, reportRepositoryImpl.f30310a.L());
        }
        pVar.put("description", str + " Version: 0.107.1-10800");
        pVar.put("log", parseFile);
        pVar.save();
        return p293xa.r.f47939a;
    }
}
