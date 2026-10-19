package G6;

import K2.x;
import Q2.C0738o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p019b6.d;

/* JADX INFO: compiled from: MiddleOutFallbackStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3376b;

    public a(b... bVarArr) {
        this.f3375a = bVarArr;
        this.f3376b = new d();
    }

    @Override // G6.b
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        b[] bVarArr = (b[]) this.f3375a;
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            b bVar = bVarArr[i10];
            if (stackTraceElementArrA.length <= 1024) {
                break;
            }
            stackTraceElementArrA = bVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > 1024 ? ((d) this.f3376b).a(stackTraceElementArrA) : stackTraceElementArrA;
    }

    public boolean b(C0738o c0738o) {
        boolean zContainsKey;
        synchronized (this.f3375a) {
            zContainsKey = ((LinkedHashMap) this.f3376b).containsKey(c0738o);
        }
        return zContainsKey;
    }

    public x c(C0738o c0738o) {
        x xVar;
        synchronized (this.f3375a) {
            xVar = (x) ((LinkedHashMap) this.f3376b).remove(c0738o);
        }
        return xVar;
    }

    public List d(String workSpecId) {
        List listO0;
        i.e(workSpecId, "workSpecId");
        synchronized (this.f3375a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3376b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (i.a(((C0738o) entry.getKey()).f5025a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f3376b).remove((C0738o) it.next());
                }
                listO0 = q.o0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listO0;
    }

    public x e(C0738o c0738o) {
        x xVar;
        synchronized (this.f3375a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3376b;
                Object xVar2 = linkedHashMap.get(c0738o);
                if (xVar2 == null) {
                    xVar2 = new x(c0738o);
                    linkedHashMap.put(c0738o, xVar2);
                }
                xVar = (x) xVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public a() {
        this.f3375a = new Object();
        this.f3376b = new LinkedHashMap();
    }
}
