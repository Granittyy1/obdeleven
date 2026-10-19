package kotlin.sequences;

import java.util.Iterator;
import kotlin.text.b.a;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterable<Object>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.text.b f43103b;

    public l(kotlin.text.b bVar) {
        this.f43103b = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f43103b.new a();
    }
}
