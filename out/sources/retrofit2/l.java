package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Invocation.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f46705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f46707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<?> f46708d;

    public l(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f46705a = cls;
        this.f46706b = obj;
        this.f46707c = method;
        this.f46708d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f46705a.getName(), this.f46707c.getName(), this.f46708d);
    }
}
