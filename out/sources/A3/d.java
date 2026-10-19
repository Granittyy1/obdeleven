package A3;

import java.security.MessageDigest;

/* JADX INFO: compiled from: Options.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.b f580b = new X3.b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            X3.b bVar = this.f580b;
            if (i10 >= bVar.f9139d) {
                return;
            }
            c cVar = (c) bVar.h(i10);
            V vM = this.f580b.m(i10);
            c.b<T> bVar2 = cVar.f577b;
            if (cVar.f579d == null) {
                cVar.f579d = cVar.f578c.getBytes(b.f574a);
            }
            bVar2.a(cVar.f579d, vM, messageDigest);
            i10++;
        }
    }

    public final <T> T c(c<T> cVar) {
        X3.b bVar = this.f580b;
        return bVar.containsKey(cVar) ? (T) bVar.get(cVar) : cVar.f576a;
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f580b.equals(((d) obj).f580b);
        }
        return false;
    }

    @Override // A3.b
    public final int hashCode() {
        return this.f580b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f580b + '}';
    }
}
