package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractCollection;
import kotlin.collections.q;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f43114b;

    public MatcherMatchResult$groups$1(g gVar) {
        this.f43114b = gVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof e) {
            return super.contains((e) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f43114b.f43151a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<e> iterator() {
        return new kotlin.sequences.n.a(new kotlin.sequences.n(q.H(new Na.i(0, size() - 1, 1)), new Ia.l<Integer, e>() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            {
                super(1);
            }

            @Override // Ia.l
            public final e invoke(Integer num) {
                return this.this$0.k(num.intValue());
            }
        }));
    }

    public final e k(int i10) {
        g gVar = this.f43114b;
        Matcher matcher = gVar.f43151a;
        Na.i iVarJ = Na.l.J(matcher.start(i10), matcher.end(i10));
        if (iVarJ.f4687b < 0) {
            return null;
        }
        String strGroup = gVar.f43151a.group(i10);
        kotlin.jvm.internal.i.d(strGroup, "group(...)");
        return new e(strGroup, iVarJ);
    }
}
