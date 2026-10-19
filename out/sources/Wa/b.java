package Wa;

import Ia.l;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: Formatter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Pair<l<T, Boolean>, e<T>>> f7077a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends Pair<? extends l<? super T, Boolean>, ? extends e<? super T>>> formatters) {
        kotlin.jvm.internal.i.e(formatters, "formatters");
        this.f7077a = formatters;
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        for (Pair<l<T, Boolean>, e<T>> pair : this.f7077a) {
            l<T, Boolean> lVarA = pair.a();
            e<T> eVarB = pair.b();
            if (lVarA.invoke(cVar).booleanValue()) {
                eVarB.a(cVar, sb2, z10);
                return;
            }
        }
    }
}
