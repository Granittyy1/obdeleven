package kotlin.text;

import Ia.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements kotlin.sequences.g<Na.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f43125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lambda f43128d;

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a implements Iterator<Na.i>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43129b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Na.i f43132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f43133f;

        public a() {
            int iD = Na.l.D(b.this.f43126b, 0, b.this.f43125a.length());
            this.f43130c = iD;
            this.f43131d = iD;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0073  */
        /* JADX WARN: Code duplicated, block: B:9:0x001c  */
        /* JADX WARN: Type inference failed for: r0v1, types: [Ia.p, kotlin.jvm.internal.Lambda] */
        public final void a() {
            Pair pair;
            int i10 = this.f43131d;
            if (i10 < 0) {
                this.f43129b = 0;
                this.f43132e = null;
                return;
            }
            b bVar = b.this;
            int i11 = bVar.f43127c;
            CharSequence charSequence = bVar.f43125a;
            if (i11 > 0) {
                int i12 = this.f43133f + 1;
                this.f43133f = i12;
                if (i12 >= i11) {
                    this.f43132e = new Na.i(this.f43130c, n.N(charSequence), 1);
                    this.f43131d = -1;
                } else if (i10 > charSequence.length() && (pair = (Pair) bVar.f43128d.invoke(charSequence, Integer.valueOf(this.f43131d))) != null) {
                    int iIntValue = ((Number) pair.a()).intValue();
                    int iIntValue2 = ((Number) pair.b()).intValue();
                    this.f43132e = Na.l.J(this.f43130c, iIntValue);
                    int i13 = iIntValue + iIntValue2;
                    this.f43130c = i13;
                    this.f43131d = i13 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f43132e = new Na.i(this.f43130c, n.N(charSequence), 1);
                    this.f43131d = -1;
                }
            } else if (i10 > charSequence.length()) {
                this.f43132e = new Na.i(this.f43130c, n.N(charSequence), 1);
                this.f43131d = -1;
            } else {
                int iIntValue3 = ((Number) pair.a()).intValue();
                int iIntValue4 = ((Number) pair.b()).intValue();
                this.f43132e = Na.l.J(this.f43130c, iIntValue3);
                int i14 = iIntValue3 + iIntValue4;
                this.f43130c = i14;
                this.f43131d = i14 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f43129b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f43129b == -1) {
                a();
            }
            return this.f43129b == 1;
        }

        @Override // java.util.Iterator
        public final Na.i next() {
            if (this.f43129b == -1) {
                a();
            }
            if (this.f43129b == 0) {
                throw new NoSuchElementException();
            }
            Na.i iVar = this.f43132e;
            kotlin.jvm.internal.i.c(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f43132e = null;
            this.f43129b = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence input, int i10, int i11, p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f43125a = input;
        this.f43126b = i10;
        this.f43127c = i11;
        this.f43128d = (Lambda) pVar;
    }

    @Override // kotlin.sequences.g
    public final Iterator<Na.i> iterator() {
        return new a();
    }
}
