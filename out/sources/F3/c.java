package F3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: DiskLruCacheWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f3216b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p299y3.a f3219e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f3218d = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3217c = 262144000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f3215a = new h();

    @Deprecated
    public c(File file) {
        this.f3216b = file;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // F3.a
    public final void a(A3.b bVar, D3.e eVar) {
        b.a aVar;
        String strA = this.f3215a.a(bVar);
        b bVar2 = this.f3218d;
        synchronized (bVar2) {
            aVar = (b.a) bVar2.f3210a.get(strA);
            if (aVar == null) {
                b.C0034b c0034b = bVar2.f3211b;
                synchronized (c0034b.f3214a) {
                    aVar = (b.a) c0034b.f3214a.poll();
                }
                if (aVar == null) {
                    aVar = new b.a();
                }
                bVar2.f3210a.put(strA, aVar);
            }
            aVar.f3213b++;
        }
        aVar.f3212a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(bVar);
            }
            try {
                p299y3.a aVarC = c();
                if (aVarC.k(strA) != null) {
                    this.f3218d.a(strA);
                    return;
                }
                y3.a.c cVarI = aVarC.i(strA);
                if (cVarI == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                }
                try {
                    if (eVar.f2721a.f(eVar.f2722b, cVarI.b(), eVar.f2723c)) {
                        p299y3.a.b(p299y3.a.this, cVarI, true);
                        cVarI.f48248c = true;
                    }
                    if (!cVarI.f48248c) {
                        try {
                            cVarI.a();
                        } catch (IOException unused) {
                        }
                    }
                    this.f3218d.a(strA);
                } catch (Throwable th) {
                    if (!cVarI.f48248c) {
                        try {
                            cVarI.a();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } catch (Throwable th2) {
            this.f3218d.a(strA);
            throw th2;
        }
    }

    @Override // F3.a
    public final File b(A3.b bVar) {
        String strA = this.f3215a.a(bVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(bVar);
        }
        try {
            y3.a.e eVarK = c().k(strA);
            if (eVarK != null) {
                return eVarK.f48257a[0];
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    public final synchronized p299y3.a c() throws IOException {
        try {
            if (this.f3219e == null) {
                this.f3219e = p299y3.a.s(this.f3216b, this.f3217c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3219e;
    }
}
