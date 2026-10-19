package p141l2;

import Ia.l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.e;
import kotlin.sequences.n;
import p141l2.C;
import p163n2.c;

/* JADX INFO: compiled from: Navigator.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class P<D extends C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w.a f44270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44271b;

    /* JADX INFO: compiled from: Navigator.kt */
    public interface a {
    }

    /* JADX INFO: compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public abstract D a();

    public final S b() {
        w.a aVar = this.f44270a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List<C2749t> list, final J j, final a aVar) {
        e.a aVar2 = new e.a(SequencesKt___SequencesKt.D(new n(q.H(list), new l(j, aVar) { // from class: l2.O
            @Override // Ia.l
            public final Object invoke(Object obj) {
                C2749t backStackEntry = (C2749t) obj;
                i.e(backStackEntry, "backStackEntry");
                C c10 = backStackEntry.f44299c;
                if (c10 == null) {
                    c10 = null;
                }
                if (c10 == null) {
                    return null;
                }
                c cVar = backStackEntry.f44305i;
                cVar.a();
                P p10 = this.f44269b;
                C c11 = p10.c(c10);
                if (c11 == null) {
                    backStackEntry = null;
                } else if (!c11.equals(c10)) {
                    backStackEntry = p10.b().a(c11, c11.e(cVar.a()));
                }
                return backStackEntry;
            }
        })));
        while (aVar2.hasNext()) {
            b().f((C2749t) aVar2.next());
        }
    }

    public void e(C2749t c2749t, boolean z10) {
        List list = (List) b().f44278e.f43418b.getValue();
        if (!list.contains(c2749t)) {
            throw new IllegalStateException(("popBackStack was called with " + c2749t + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C2749t c2749t2 = null;
        while (f()) {
            c2749t2 = (C2749t) listIterator.previous();
            if (i.a(c2749t2, c2749t)) {
                break;
            }
        }
        if (c2749t2 != null) {
            b().c(c2749t2, z10);
        }
    }

    public boolean f() {
        return true;
    }

    public C c(C c10) {
        return c10;
    }
}
