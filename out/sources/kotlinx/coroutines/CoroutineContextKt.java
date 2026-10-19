package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final kotlin.coroutines.e a(kotlin.coroutines.e eVar, kotlin.coroutines.e eVar2, final boolean z10) {
        Boolean bool = Boolean.FALSE;
        CoroutineContextKt$hasCopyableElements$1 coroutineContextKt$hasCopyableElements$1 = CoroutineContextKt$hasCopyableElements$1.f43164h;
        boolean zBooleanValue = ((Boolean) eVar.fold(bool, coroutineContextKt$hasCopyableElements$1)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) eVar2.fold(bool, coroutineContextKt$hasCopyableElements$1)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return eVar.plus(eVar2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = eVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f43032b;
        kotlin.coroutines.e eVar3 = (kotlin.coroutines.e) eVar.fold(emptyCoroutineContext, new Ia.p<kotlin.coroutines.e, kotlin.coroutines.e.a, kotlin.coroutines.e>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.coroutines.e] */
            @Override // Ia.p
            public final kotlin.coroutines.e invoke(kotlin.coroutines.e eVar4, kotlin.coroutines.e.a aVar) {
                kotlin.coroutines.e eVar5 = eVar4;
                kotlin.coroutines.e.a aVar2 = aVar;
                if (!(aVar2 instanceof InterfaceC2710u)) {
                    return eVar5.plus(aVar2);
                }
                if (ref$ObjectRef.element.get(aVar2.getKey()) != null) {
                    Ref$ObjectRef<kotlin.coroutines.e> ref$ObjectRef2 = ref$ObjectRef;
                    ref$ObjectRef2.element = ref$ObjectRef2.element.minusKey(aVar2.getKey());
                    return eVar5.plus(((InterfaceC2710u) aVar2).K0());
                }
                InterfaceC2710u interfaceC2710uN0 = (InterfaceC2710u) aVar2;
                if (z10) {
                    interfaceC2710uN0 = interfaceC2710uN0.n0();
                }
                return eVar5.plus(interfaceC2710uN0);
            }
        });
        if (zBooleanValue2) {
            ref$ObjectRef.element = ((kotlin.coroutines.e) ref$ObjectRef.element).fold(emptyCoroutineContext, new Ia.p<kotlin.coroutines.e, kotlin.coroutines.e.a, kotlin.coroutines.e>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // Ia.p
                public final kotlin.coroutines.e invoke(kotlin.coroutines.e eVar4, kotlin.coroutines.e.a aVar) {
                    kotlin.coroutines.e eVar5 = eVar4;
                    kotlin.coroutines.e.a aVar2 = aVar;
                    return aVar2 instanceof InterfaceC2710u ? eVar5.plus(((InterfaceC2710u) aVar2).n0()) : eVar5.plus(aVar2);
                }
            });
        }
        return eVar3.plus((kotlin.coroutines.e) ref$ObjectRef.element);
    }

    public static final kotlin.coroutines.e b(kotlin.coroutines.e eVar, kotlin.coroutines.e eVar2) {
        return !((Boolean) eVar2.fold(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.f43164h)).booleanValue() ? eVar.plus(eVar2) : a(eVar, eVar2, false);
    }

    public static final kotlin.coroutines.e c(A a10, kotlin.coroutines.e eVar) {
        kotlin.coroutines.e eVarA = a(a10.getCoroutineContext(), eVar, true);
        Sa.b bVar = N.f43198a;
        return (eVarA == bVar || eVarA.get(kotlin.coroutines.d.a.f43035b) != null) ? eVarA : eVarA.plus(bVar);
    }

    public static final I0<?> d(kotlin.coroutines.c<?> cVar, kotlin.coroutines.e eVar, Object obj) {
        I0<?> i10 = null;
        if (!(cVar instanceof Aa.b)) {
            return null;
        }
        if (eVar.get(J0.f43182b) != null) {
            Aa.b callerFrame = (Aa.b) cVar;
            while (!(callerFrame instanceof K) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof I0) {
                    i10 = (I0) callerFrame;
                    break;
                }
            }
            if (i10 != null) {
                i10.x0(eVar, obj);
            }
        }
        return i10;
    }
}
