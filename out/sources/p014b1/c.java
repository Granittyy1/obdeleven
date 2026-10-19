package p014b1;

import Ia.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20500a = new LinkedHashMap();

    public final void a(kotlin.jvm.internal.c cVar, l initializer) {
        i.e(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f20500a;
        if (!linkedHashMap.containsKey(cVar)) {
            linkedHashMap.put(cVar, new e(cVar, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + cVar.i() + '.').toString());
    }

    public final b b() {
        Collection initializers = this.f20500a.values();
        i.e(initializers, "initializers");
        e[] eVarArr = (e[]) initializers.toArray(new e[0]);
        return new b((e[]) Arrays.copyOf(eVarArr, eVarArr.length));
    }
}
