package kotlin.coroutines;

import Ia.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
final class CoroutineContext$plus$1 extends Lambda implements p<e, e.a, e> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CoroutineContext$plus$1 f43031h = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    @Override // Ia.p
    public final e invoke(e eVar, e.a aVar) {
        CombinedContext combinedContext;
        e acc = eVar;
        e.a element = aVar;
        i.e(acc, "acc");
        i.e(element, "element");
        e eVarMinusKey = acc.minusKey(element.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f43032b;
        if (eVarMinusKey == emptyCoroutineContext) {
            return element;
        }
        d.a aVar2 = d.a.f43035b;
        d dVar = (d) eVarMinusKey.get(aVar2);
        if (dVar == null) {
            combinedContext = new CombinedContext(element, eVarMinusKey);
        } else {
            e eVarMinusKey2 = eVarMinusKey.minusKey(aVar2);
            if (eVarMinusKey2 == emptyCoroutineContext) {
                return new CombinedContext(dVar, element);
            }
            combinedContext = new CombinedContext(dVar, new CombinedContext(element, eVarMinusKey2));
        }
        return combinedContext;
    }
}
