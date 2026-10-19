package org.koin.core.instance;

import java.util.ArrayList;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;

/* JADX INFO: compiled from: InstanceFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeanDefinition<T> f45767a;

    public c(BeanDefinition<T> beanDefinition) {
        this.f45767a = beanDefinition;
    }

    public T a(b context) throws InstanceCreationException {
        i.e(context, "context");
        StringBuilder sb2 = new StringBuilder("| (+) '");
        BeanDefinition<T> beanDefinition = this.f45767a;
        sb2.append(beanDefinition);
        sb2.append('\'');
        String string = sb2.toString();
        E3.b bVar = context.f45764a;
        bVar.g(string);
        try {
            Ob.a aVar = context.f45766c;
            if (aVar == null) {
                aVar = new Ob.a(3, null);
            }
            return beanDefinition.f45756c.invoke(context.f45765b, aVar);
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e10);
            sb3.append("\n\t");
            StackTraceElement[] stackTrace = e10.getStackTrace();
            i.d(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                i.d(className, "getClassName(...)");
                if (n.J(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb3.append(q.U(arrayList, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + beanDefinition + "': " + sb3.toString();
            i.e(msg, "msg");
            bVar.E(Level.f45771e, msg);
            String msg2 = "Could not create instance for '" + beanDefinition + '\'';
            i.e(msg2, "msg");
            throw new InstanceCreationException(msg2, e10);
        }
    }

    public abstract T b(b bVar);

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return i.a(this.f45767a, cVar != null ? cVar.f45767a : null);
    }

    public final int hashCode() {
        return this.f45767a.hashCode();
    }
}
