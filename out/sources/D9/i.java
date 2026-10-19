package D9;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Context.java */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f2884a = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f2885b = new i();

    /* JADX INFO: compiled from: Context.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2886a;

        static {
            b yVar;
            AtomicReference atomicReference = new AtomicReference();
            try {
                yVar = (b) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(b.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                yVar = new y();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
            f2886a = yVar;
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                i.f2884a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }
    }

    /* JADX INFO: compiled from: Context.java */
    public static abstract class b {
        public abstract i a();

        public abstract void b(i iVar, i iVar2);

        public i c(i iVar) {
            a();
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }
    }

    public static i a() {
        i iVarA = a.f2886a.a();
        return iVarA == null ? f2885b : iVarA;
    }

    public final void b(i iVar) {
        if (iVar == null) {
            throw new NullPointerException("toAttach");
        }
        a.f2886a.b(this, iVar);
    }
}
