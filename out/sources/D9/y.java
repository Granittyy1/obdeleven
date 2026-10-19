package D9;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ThreadLocalContextStorage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f2926a = Logger.getLogger(y.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<i> f2927b = new ThreadLocal<>();

    @Override // D9.i.b
    public final i a() {
        i iVar = f2927b.get();
        return iVar == null ? i.f2885b : iVar;
    }

    @Override // D9.i.b
    public final void b(i iVar, i iVar2) {
        if (a() != iVar) {
            f2926a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        i iVar3 = i.f2885b;
        ThreadLocal<i> threadLocal = f2927b;
        if (iVar2 != iVar3) {
            threadLocal.set(iVar2);
        } else {
            threadLocal.set(null);
        }
    }

    @Override // D9.i.b
    public final i c(i iVar) {
        i iVarA = a();
        f2927b.set(iVar);
        return iVarA;
    }
}
