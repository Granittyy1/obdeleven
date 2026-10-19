package E;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<K, V> f2931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f2932e;

    public c(i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        this.f2931d = iVar;
        this.f2932e = v10;
    }

    @Override // E.b, java.util.Map.Entry
    public final V getValue() {
        return this.f2932e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // E.b, java.util.Map.Entry
    public final V setValue(V v10) {
        V v11 = this.f2932e;
        this.f2932e = v10;
        g<K, V, Map.Entry<K, V>> gVar = this.f2931d.f2950b;
        f<K, V> fVar = gVar.f2945e;
        K k10 = this.f2929b;
        if (fVar.containsKey(k10)) {
            boolean z10 = gVar.f2938d;
            if (!z10) {
                fVar.put(k10, v10);
            } else {
                if (!z10) {
                    throw new NoSuchElementException();
                }
                u uVar = gVar.f2936b[gVar.f2937c];
                Object obj = uVar.f2963b[uVar.f2965d];
                fVar.put(k10, v10);
                gVar.c(obj != null ? obj.hashCode() : 0, fVar.f2941d, obj, 0);
            }
            gVar.f2948h = fVar.f2943f;
        }
        return v11;
    }
}
