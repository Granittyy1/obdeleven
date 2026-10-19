package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements g, Oa.f {
    private final int arity;
    private final int flags;

    public FunctionReference(int i10) {
        this(i10, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public Oa.b computeReflected() {
        l.f43062a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && i.a(getBoundReceiver(), functionReference.getBoundReceiver()) && i.a(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof Oa.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // Oa.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // Oa.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // Oa.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // Oa.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, Oa.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        Oa.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public Oa.f getReflected() {
        return (Oa.f) super.getReflected();
    }

    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
