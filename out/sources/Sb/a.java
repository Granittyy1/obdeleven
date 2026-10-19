package Sb;

import Oa.c;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import p241t7.b;

/* JADX INFO: compiled from: KClassExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f5727a = new ConcurrentHashMap();

    public static final String a(c<?> cVar) {
        i.e(cVar, "<this>");
        ConcurrentHashMap concurrentHashMap = f5727a;
        String str = (String) concurrentHashMap.get(cVar);
        if (str != null) {
            return str;
        }
        String name = b.r(cVar).getName();
        concurrentHashMap.put(cVar, name);
        return name;
    }
}
