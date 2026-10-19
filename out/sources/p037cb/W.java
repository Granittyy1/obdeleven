package p037cb;

import A8.f;
import Ya.b;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlinx.serialization.json.internal.x;
import p011ab.d;
import p024bb.a;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class W<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC1513a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<Key> f22588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<Value> f22589b;

    public W(b bVar, b bVar2) {
        this.f22588a = bVar;
        this.f22589b = bVar2;
    }

    @Override // p037cb.AbstractC1513a
    public final void f(a aVar, int i10, Object obj, boolean z10) {
        int iO;
        Map builder = (Map) obj;
        i.e(builder, "builder");
        K k10 = ((L) this).f22564c;
        Object objE = aVar.e(k10, i10, this.f22588a, null);
        if (z10) {
            iO = aVar.o(k10);
            if (iO != i10 + 1) {
                throw new IllegalArgumentException(f.d(i10, iO, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            iO = i10 + 1;
        }
        boolean zContainsKey = builder.containsKey(objE);
        b<Value> bVar = this.f22589b;
        builder.put(objE, (!zContainsKey || (bVar.getDescriptor().e() instanceof d)) ? aVar.e(k10, iO, bVar, null) : aVar.e(k10, iO, bVar, y.q(objE, builder)));
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Collection collection) {
        d(collection);
        K k10 = ((L) this).f22564c;
        p024bb.b bVarD = ((x) dVar).D(k10);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itC = c(collection);
        int i10 = 0;
        while (itC.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itC.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            bVarD.s(k10, i10, this.f22588a, key);
            i10 += 2;
            bVarD.s(k10, i11, this.f22589b, value);
        }
        bVarD.c(k10);
    }
}
