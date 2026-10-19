package kotlinx.datetime.internal.format.parser;

import java.util.List;

/* JADX INFO: compiled from: Parser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k<Output>> f43920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l<Output>> f43921b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends k<? super Output>> operations, List<? extends l<? super Output>> followedBy) {
        kotlin.jvm.internal.i.e(operations, "operations");
        kotlin.jvm.internal.i.e(followedBy, "followedBy");
        this.f43920a = operations;
        this.f43921b = followedBy;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.collections.q.U(this.f43920a, ", ", null, null, null, 62));
        sb2.append('(');
        return B7.b.g(sb2, kotlin.collections.q.U(this.f43921b, ";", null, null, null, 62), ')');
    }
}
