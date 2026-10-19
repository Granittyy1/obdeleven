package kotlinx.coroutines.selects;

import Ia.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final void a(d dVar, long j, l lVar) {
        a aVar = new a(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f43557b;
        i.c(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        o.d(3, onTimeout$selectClause$1);
        dVar.j(new d.a(aVar, onTimeout$selectClause$1, SelectKt.f43558a, SelectKt.f43563f, lVar, null), false);
    }
}
