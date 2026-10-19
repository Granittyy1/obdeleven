package androidx.compose.runtime.saveable;

import Ia.l;
import Ia.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: ListSaver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final W.f a(final p pVar, l lVar) {
        p<j, Object, Object> pVar2 = new p<j, Object, Object>() { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final Object invoke(j jVar, Object obj) {
                j jVar2 = jVar;
                List<Object> listInvoke = pVar.invoke(jVar2, obj);
                List<Object> list = listInvoke;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = listInvoke.get(i10);
                    if (obj2 != null && !jVar2.a(obj2)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            }
        };
        kotlin.jvm.internal.i.c(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        o.d(1, lVar);
        W.f fVar = SaverKt.f13134a;
        return new W.f(pVar2, lVar);
    }
}
