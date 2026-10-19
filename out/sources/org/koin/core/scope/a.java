package org.koin.core.scope;

import Pb.b;
import java.util.ArrayList;
import kotlin.collections.i;
import kotlin.jvm.internal.c;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;

/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f45774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ib.a f45775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<a> f45776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<i<Ob.a>> f45777d;

    public a(b scopeQualifier, Ib.a _koin) {
        kotlin.jvm.internal.i.e(scopeQualifier, "scopeQualifier");
        kotlin.jvm.internal.i.e(_koin, "_koin");
        this.f45774a = scopeQualifier;
        this.f45775b = _koin;
        this.f45776c = new ArrayList<>();
        new ArrayList();
        this.f45777d = new ThreadLocal<>();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final Object a(Ia.a aVar, Pb.a aVar2, c cVar) throws NoBeanDefFoundException {
        String str;
        Ib.a aVar3 = this.f45775b;
        E3.b bVar = aVar3.f3937c;
        Level level = Level.f45768b;
        if (!bVar.D(level)) {
            return b(aVar, aVar2, cVar);
        }
        if (aVar2 != null) {
            str = " with qualifier '" + aVar2 + '\'';
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        aVar3.f3937c.l(level, "|- '" + Sb.a.a(cVar) + '\'' + str + " ...");
        long jNanoTime = System.nanoTime();
        Object objB = b(aVar, aVar2, cVar);
        double dNanoTime = ((double) (System.nanoTime() - jNanoTime)) / 1000000.0d;
        aVar3.f3937c.l(level, "|- '" + Sb.a.a(cVar) + "' in " + dNanoTime + " ms");
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014f  */
    public final Object b(Ia.a aVar, Pb.a aVar2, c cVar) throws NoBeanDefFoundException {
        i<Ob.a> iVar;
        String str;
        Ob.a aVarA;
        final Ob.a aVar3 = aVar != null ? (Ob.a) aVar.invoke() : null;
        ThreadLocal<i<Ob.a>> threadLocal = this.f45777d;
        Ib.a aVar4 = this.f45775b;
        if (aVar3 != null) {
            E3.b bVar = aVar4.f3937c;
            Level level = Level.f45768b;
            Ia.a<String> aVar5 = new Ia.a<String>() { // from class: org.koin.core.scope.Scope$resolveInstance$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "| >> parameters " + aVar3 + ' ';
                }
            };
            bVar.getClass();
            if (bVar.D(level)) {
                bVar.l(level, (String) aVar5.invoke());
            }
            iVar = threadLocal.get();
            if (iVar == null) {
                iVar = new i<>();
                threadLocal.set(iVar);
            }
            iVar.addFirst(aVar3);
        } else {
            iVar = null;
        }
        org.koin.core.instance.b bVar2 = new org.koin.core.instance.b(aVar4.f3937c, this, aVar3);
        Qb.a aVar6 = aVar4.f3936b;
        aVar6.getClass();
        b scopeQualifier = this.f45774a;
        kotlin.jvm.internal.i.e(scopeQualifier, "scopeQualifier");
        org.koin.core.instance.c cVar2 = (org.koin.core.instance.c) aVar6.f5139b.get(Lb.a.i(cVar, aVar2, scopeQualifier));
        Object objB = cVar2 != null ? cVar2.b(bVar2) : null;
        if (objB == null) {
            objB = null;
        }
        if (objB == null) {
            aVar4.f3937c.g("|- ? t:'" + Sb.a.a(cVar) + "' - q:'" + aVar2 + "' look in injected parameters");
            i<Ob.a> iVar2 = threadLocal.get();
            objB = (iVar2 == null || (aVarA = iVar2.A()) == null) ? null : aVarA.c(cVar);
            if (objB == null) {
                aVar4.f3937c.g("|- ? t:'" + Sb.a.a(cVar) + "' - q:'" + aVar2 + "' look in other scopes");
                Object objA = null;
                for (a aVar7 : this.f45776c) {
                    Ib.a aVar8 = aVar7.f45775b;
                    try {
                        objA = aVar7.a(aVar, aVar2, cVar);
                    } catch (ClosedScopeException unused) {
                        aVar8.f3937c.g("* Scope closed - no instance found for " + Sb.a.a(cVar) + " on scope " + aVar7);
                        objA = null;
                    } catch (NoBeanDefFoundException unused2) {
                        aVar8.f3937c.g("* No instance found for type '" + Sb.a.a(cVar) + "' on scope '" + aVar7 + '\'');
                        objA = null;
                    }
                    if (objA != null) {
                        break;
                    }
                }
                objB = objA;
                if (objB == null) {
                    if (aVar != null) {
                        threadLocal.remove();
                        aVar4.f3937c.g("|- << parameters");
                    }
                    if (aVar2 != null) {
                        str = " and qualifier '" + aVar2 + '\'';
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    String msg = "No definition found for type '" + Sb.a.a(cVar) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!";
                    kotlin.jvm.internal.i.e(msg, "msg");
                    throw new NoBeanDefFoundException(msg);
                }
            }
        }
        if (iVar != null) {
            aVar4.f3937c.g("| << parameters");
            if (!iVar.isEmpty()) {
                iVar.removeFirst();
            }
        }
        return objB;
    }

    public final String toString() {
        return "['_root_']";
    }
}
