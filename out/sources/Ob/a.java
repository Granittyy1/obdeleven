package Ob;

import Oa.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import org.koin.core.error.NoParameterFoundException;

/* JADX INFO: compiled from: ParametersHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Object> f4876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f4877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4878c;

    public a() {
        this(3, null);
    }

    public <T> T a(int i10, c<?> clazz) throws NoParameterFoundException {
        i.e(clazz, "clazz");
        List<Object> list = this.f4876a;
        if (list.size() > i10) {
            return (T) list.get(i10);
        }
        String msg = "Can't get injected parameter #" + i10 + " from " + this + " for type '" + Sb.a.a(clazz) + '\'';
        i.e(msg, "msg");
        throw new NoParameterFoundException(msg);
    }

    public final <T> T b(c<?> cVar) {
        int i10 = this.f4878c;
        List<Object> list = this.f4876a;
        Object obj = list.get(i10);
        T t8 = null;
        if (!cVar.f(obj)) {
            obj = null;
        }
        if (obj != null) {
            t8 = (T) obj;
        }
        if (t8 != null && this.f4878c < l.r(list)) {
            this.f4878c++;
        }
        return t8;
    }

    public <T> T c(c<?> clazz) {
        Object next;
        i.e(clazz, "clazz");
        List<Object> list = this.f4876a;
        if (list.isEmpty()) {
            return null;
        }
        Boolean bool = this.f4877b;
        if (bool == null) {
            next = b(clazz);
            if (next == null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!clazz.f(next));
                if (next == null) {
                    return null;
                }
            }
        } else {
            if (bool.equals(Boolean.TRUE)) {
                return (T) b(clazz);
            }
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!clazz.f(next));
            if (next == null) {
                return null;
            }
        }
        return (T) next;
    }

    public final String toString() {
        return "DefinitionParameters" + q.o0(this.f4876a);
    }

    public a(int i10, ArrayList _values) {
        _values = (i10 & 1) != 0 ? new ArrayList() : _values;
        i.e(_values, "_values");
        this.f4876a = _values;
        this.f4877b = null;
    }
}
