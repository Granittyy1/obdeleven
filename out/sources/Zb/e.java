package Zb;

import org.aspectj.lang.NoAspectBoundException;

/* JADX INFO: compiled from: RequiresParseDetailAspect.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Throwable f7990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e f7991b;

    static {
        try {
            f7991b = new e();
        } catch (Throwable th) {
            f7990a = th;
        }
    }

    public static e a() {
        e eVar = f7991b;
        if (eVar != null) {
            return eVar;
        }
        throw new NoAspectBoundException(f7990a);
    }

    public static void b(Ab.b bVar) {
        Object obj = bVar.f1048b;
        if (obj instanceof a) {
            ((a) obj).getClass();
            return;
        }
        throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
    }
}
