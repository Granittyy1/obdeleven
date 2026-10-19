package kotlin.coroutines.jvm.internal;

import Aa.b;
import Aa.d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseContinuationImpl implements c<Object>, b, Serializable {
    private final c<Object> completion;

    public BaseContinuationImpl(c<Object> cVar) {
        this.completion = cVar;
    }

    public c<r> create(c<?> completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // Aa.b
    public b getCallerFrame() {
        c<Object> cVar = this.completion;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public final c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Aa.c cVar = (Aa.c) getClass().getAnnotation(Aa.c.class);
        String str = null;
        if (cVar == null) {
            return null;
        }
        int iV = cVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? cVar.l()[iIntValue] : -1;
        d.a aVar = d.f1040b;
        d.a aVar2 = d.f1039a;
        if (aVar == null) {
            try {
                d.a aVar3 = new d.a(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                d.f1040b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                d.f1040b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2) {
            Method method = aVar.f1041a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = aVar.f1042b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = aVar.f1043c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = cVar.c();
        } else {
            strC = str + '/' + cVar.c();
        }
        return new StackTraceElement(strC, cVar.m(), cVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        c<Object> cVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            c<Object> cVar2 = baseContinuationImpl.completion;
            i.b(cVar2);
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.f43038b) {
                    return;
                }
            } catch (Throwable th) {
                obj = kotlin.b.a(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(cVar2 instanceof BaseContinuationImpl)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public c<r> create(Object obj, c<?> completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
