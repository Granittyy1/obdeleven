package p141l2;

import androidx.collection.Y;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p163n2.k;
import p163n2.m;

/* JADX INFO: compiled from: NavGraphBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F extends D<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q f44236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f44237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f44238i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Q provider, String startDestination, String str) {
        super(provider.b(Q.a.a(G.class)), str);
        i.e(provider, "provider");
        i.e(startDestination, "startDestination");
        this.f44238i = new ArrayList();
        this.f44236g = provider;
        this.f44237h = startDestination;
    }

    public final E c() {
        int iHashCode;
        E e10 = (E) super.a();
        ArrayList<C> nodes = this.f44238i;
        i.e(nodes, "nodes");
        m mVar = e10.f44235g;
        mVar.getClass();
        for (C c10 : nodes) {
            if (c10 != null) {
                k kVar = c10.f44219c;
                int i10 = kVar.f44813d;
                String str = kVar.f44814e;
                if (i10 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                E e11 = mVar.f44819a;
                String str2 = e11.f44219c.f44814e;
                if (str2 != null && i.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + c10 + " cannot have the same route as graph " + e11).toString());
                }
                if (i10 == e11.f44219c.f44813d) {
                    throw new IllegalArgumentException(("Destination " + c10 + " cannot have the same id as graph " + e11).toString());
                }
                Y<C> y10 = mVar.f44820b;
                C c11 = y10.c(i10);
                if (c11 == c10) {
                    continue;
                } else {
                    if (c10.f44220d != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (c11 != null) {
                        c11.f44220d = null;
                    }
                    c10.f44220d = e11;
                    y10.e(kVar.f44813d, c10);
                }
            }
        }
        String str3 = this.f44237h;
        if (str3 == null) {
            if (this.f44230c != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str3 == null) {
            iHashCode = 0;
        } else {
            E e12 = mVar.f44819a;
            if (str3.equals(e12.f44219c.f44814e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + e12).toString());
            }
            if (n.S(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i11 = C.f44217f;
            iHashCode = C.a.a(str3).hashCode();
        }
        mVar.f44821c = iHashCode;
        mVar.f44823e = str3;
        return e10;
    }
}
