package androidx.work.impl.utils.futures;

import p107i6.f;

/* JADX INFO: compiled from: SettableFuture.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<V> extends AbstractFuture<V> {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean k(V v10) {
        if (v10 == null) {
            v10 = (V) AbstractFuture.f20426h;
        }
        if (!AbstractFuture.f20425g.b(this, null, v10)) {
            return false;
        }
        AbstractFuture.d(this);
        return true;
    }

    public final boolean l(Throwable th) {
        if (!AbstractFuture.f20425g.b(this, null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.d(this);
        return true;
    }

    public final boolean m(f<? extends V> fVar) {
        AbstractFuture.Failure failure;
        fVar.getClass();
        Object obj = this.f20427b;
        if (obj == null) {
            if (fVar.isDone()) {
                if (!AbstractFuture.f20425g.b(this, null, AbstractFuture.g(fVar))) {
                    return false;
                }
                AbstractFuture.d(this);
            } else {
                AbstractFuture.e eVar = new AbstractFuture.e(this, fVar);
                if (AbstractFuture.f20425g.b(this, null, eVar)) {
                    try {
                        fVar.a(eVar, DirectExecutor.f20450b);
                    } catch (Throwable th) {
                        try {
                            failure = new AbstractFuture.Failure(th);
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.f20430b;
                        }
                        AbstractFuture.f20425g.b(this, eVar, failure);
                    }
                } else {
                    obj = this.f20427b;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.b)) {
            return false;
        }
        fVar.cancel(((AbstractFuture.b) obj).f20434a);
        return false;
    }
}
