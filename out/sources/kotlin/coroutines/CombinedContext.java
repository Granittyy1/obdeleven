package kotlin.coroutines;

import Ia.p;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CombinedContext implements e, Serializable {
    private final e.a element;
    private final e left;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final e[] elements;

        public Serialized(e[] eVarArr) {
            this.elements = eVarArr;
        }

        private final Object readResolve() {
            e[] eVarArr = this.elements;
            e eVarPlus = EmptyCoroutineContext.f43032b;
            for (e eVar : eVarArr) {
                eVarPlus = eVarPlus.plus(eVar);
            }
            return eVarPlus;
        }
    }

    public CombinedContext(e.a element, e left) {
        i.e(left, "left");
        i.e(element, "element");
        this.left = left;
        this.element = element;
    }

    private final Object writeReplace() {
        int iA = a();
        final e[] eVarArr = new e[iA];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(r.f47939a, new p<r, e.a, r>() { // from class: kotlin.coroutines.CombinedContext.writeReplace.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(r rVar, e.a aVar) {
                e.a element = aVar;
                i.e(rVar, "<anonymous parameter 0>");
                i.e(element, "element");
                e[] eVarArr2 = eVarArr;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i10 = ref$IntRef2.element;
                ref$IntRef2.element = i10 + 1;
                eVarArr2[i10] = element;
                return r.f47939a;
            }
        });
        if (ref$IntRef.element == iA) {
            return new Serialized(eVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            e eVar = combinedContext.left;
            combinedContext = eVar instanceof CombinedContext ? (CombinedContext) eVar : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof CombinedContext)) {
                return false;
            }
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.a() != a()) {
                return false;
            }
            CombinedContext combinedContext2 = this;
            while (true) {
                e.a aVar = combinedContext2.element;
                if (!i.a(combinedContext.get(aVar.getKey()), aVar)) {
                    zA = false;
                    break;
                }
                e eVar = combinedContext2.left;
                if (!(eVar instanceof CombinedContext)) {
                    i.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    e.a aVar2 = (e.a) eVar;
                    zA = i.a(combinedContext.get(aVar2.getKey()), aVar2);
                    break;
                }
                combinedContext2 = (CombinedContext) eVar;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, p<? super R, ? super e.a, ? extends R> operation) {
        i.e(operation, "operation");
        return operation.invoke((Object) this.left.fold(r10, operation), this.element);
    }

    @Override // kotlin.coroutines.e
    public final <E extends e.a> E get(e.b<E> key) {
        i.e(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.element.get(key);
            if (e10 != null) {
                return e10;
            }
            e eVar = combinedContext.left;
            if (!(eVar instanceof CombinedContext)) {
                return (E) eVar.get(key);
            }
            combinedContext = (CombinedContext) eVar;
        }
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // kotlin.coroutines.e
    public final e minusKey(e.b<?> key) {
        i.e(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        e eVarMinusKey = this.left.minusKey(key);
        if (eVarMinusKey == this.left) {
            return this;
        }
        return eVarMinusKey == EmptyCoroutineContext.f43032b ? this.element : new CombinedContext(this.element, eVarMinusKey);
    }

    @Override // kotlin.coroutines.e
    public final e plus(e context) {
        i.e(context, "context");
        return context == EmptyCoroutineContext.f43032b ? this : (e) context.fold(this, CoroutineContext$plus$1.f43031h);
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("["), (String) fold("", new p<String, e.a, String>() { // from class: kotlin.coroutines.CombinedContext.toString.1
            @Override // Ia.p
            public final String invoke(String str, e.a aVar) {
                String acc = str;
                e.a element = aVar;
                i.e(acc, "acc");
                i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            }
        }), ']');
    }
}
