package p093h4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HashUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<String> f36158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f36159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Condition f36160d;

    public h(Object obj, Ref$ObjectRef<String> ref$ObjectRef, ReentrantLock reentrantLock, Condition condition) {
        this.f36157a = obj;
        this.f36158b = ref$ObjectRef;
        this.f36159c = reentrantLock;
        this.f36160d = condition;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [T, java.lang.String] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objects) {
        ReentrantLock reentrantLock = this.f36159c;
        i.e(method, "method");
        i.e(objects, "objects");
        try {
            if (i.a(method.getName(), "onChecksumsReady") && objects.length == 1) {
                Object obj2 = objects[0];
                if (obj2 instanceof List) {
                    for (Object obj3 : (List) obj2) {
                        if (obj3 != null) {
                            Method method2 = obj3.getClass().getMethod("getSplitName", null);
                            i.d(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = obj3.getClass().getMethod("getType", null);
                            i.d(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(obj3, null) == null && i.a(method3.invoke(obj3, null), this.f36157a)) {
                                Method method4 = obj3.getClass().getMethod("getValue", null);
                                i.d(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object objInvoke = method4.invoke(obj3, null);
                                if (objInvoke == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                                this.f36158b.element = new BigInteger(1, (byte[]) objInvoke).toString(16);
                                reentrantLock.lock();
                                try {
                                    this.f36160d.signalAll();
                                    return null;
                                } finally {
                                    reentrantLock.unlock();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            i iVar = i.f36161a;
        }
        return null;
    }
}
