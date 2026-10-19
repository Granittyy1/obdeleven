package kotlinx.datetime.internal.format.parser;

import p293xa.r;

/* JADX INFO: compiled from: ParserOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p<Output> implements k<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<Output, r> f43929a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(Ia.l<? super Output, r> lVar) {
        this.f43929a = lVar;
    }

    @Override // kotlinx.datetime.internal.format.parser.k
    public final Object a(c cVar, String input, int i10) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f43929a.invoke(cVar);
        return Integer.valueOf(i10);
    }
}
