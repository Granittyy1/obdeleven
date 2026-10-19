package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CallableReference implements Oa.b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.f43051b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient Oa.b reflected;
    private final String signature;

    public static class NoReceiver implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NoReceiver f43051b = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f43051b;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // Oa.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // Oa.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public Oa.b compute() {
        Oa.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        Oa.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract Oa.b computeReflected();

    @Override // Oa.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // Oa.b
    public String getName() {
        return this.name;
    }

    public Oa.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return l.a(cls);
        }
        l.f43062a.getClass();
        return new k(cls);
    }

    @Override // Oa.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public Oa.b getReflected() {
        Oa.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // Oa.b
    public Oa.m getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // Oa.b
    public List<Oa.n> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // Oa.b
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // Oa.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // Oa.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // Oa.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // Oa.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
