package B7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: DefaultUserAgentPublisher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1599b;

    public c(Set<e> set, d dVar) {
        this.f1598a = b(set);
        this.f1599b = dVar;
    }

    public static String b(Set<e> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<e> it = set.iterator();
        while (it.hasNext()) {
            e next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // B7.h
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        d dVar = this.f1599b;
        synchronized (dVar.f1601a) {
            setUnmodifiableSet = Collections.unmodifiableSet(dVar.f1601a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f1598a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (dVar.f1601a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(dVar.f1601a);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
