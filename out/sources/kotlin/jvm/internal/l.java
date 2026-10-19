package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f43062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Oa.c[] f43063b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new m();
        }
        f43062a = mVar;
        f43063b = new Oa.c[0];
    }

    public static c a(Class cls) {
        f43062a.getClass();
        return new c(cls);
    }

    public static TypeReference b(Class cls) {
        c cVarA = a(cls);
        List listEmptyList = Collections.emptyList();
        f43062a.getClass();
        return new TypeReference(cVarA, listEmptyList);
    }
}
