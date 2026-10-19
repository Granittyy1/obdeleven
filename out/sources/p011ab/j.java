package p011ab;

import Ja.a;
import java.util.Iterator;
import p037cb.C1551x;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements Iterable<String>, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1551x f8120b;

    public j(C1551x c1551x) {
        this.f8120b = c1551x;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new i(this.f8120b);
    }
}
