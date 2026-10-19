package Y1;

import T4.v0;
import X1.i;
import X1.j;
import X1.k;
import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import p114j1.A;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f7564a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<k> f7565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<a> f7566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f7567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7570g;

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class a extends j implements Comparable<a> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f7571k;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (g(4) == aVar2.g(4)) {
                long j = this.f17943g - aVar2.f17943g;
                if (j == 0) {
                    j = this.f7571k - aVar2.f7571k;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j <= 0) {
                    return -1;
                }
            } else if (!g(4)) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class b extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d f7572g;

        @Override // p152m1.d
        public final void l() {
            e eVar = (e) this.f7572g.f7563c;
            eVar.getClass();
            k();
            eVar.f7565b.add(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f7564a.add(new a());
        }
        this.f7565b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque<k> arrayDeque = this.f7565b;
            d dVar = new d(0, this);
            b bVar = new b();
            bVar.f7572g = dVar;
            arrayDeque.add(bVar);
        }
        this.f7566c = new ArrayDeque<>();
        this.f7570g = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // p152m1.c
    public final void b(j jVar) throws DecoderException {
        p241t7.b.e(jVar == this.f7567d);
        a aVar = (a) jVar;
        if (aVar.g(4)) {
            long j = this.f7569f;
            this.f7569f = 1 + j;
            aVar.f7571k = j;
            this.f7566c.add(aVar);
        } else {
            long j10 = aVar.f17943g;
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.f7570g;
                if (j11 == -9223372036854775807L || j10 >= j11) {
                    long j12 = this.f7569f;
                    this.f7569f = 1 + j12;
                    aVar.f7571k = j12;
                    this.f7566c.add(aVar);
                } else {
                    aVar.k();
                    this.f7564a.add(aVar);
                }
            } else {
                long j13 = this.f7569f;
                this.f7569f = 1 + j13;
                aVar.f7571k = j13;
                this.f7566c.add(aVar);
            }
        }
        this.f7567d = null;
    }

    @Override // p152m1.c
    public final void c(long j) {
        this.f7570g = j;
    }

    @Override // X1.i
    public final void d(long j) {
        this.f7568e = j;
    }

    @Override // p152m1.c
    public final j f() throws DecoderException {
        p241t7.b.k(this.f7567d == null);
        ArrayDeque<a> arrayDeque = this.f7564a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a aVarPollFirst = arrayDeque.pollFirst();
        this.f7567d = aVarPollFirst;
        return aVarPollFirst;
    }

    @Override // p152m1.c
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f7569f = 0L;
        this.f7568e = 0L;
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.f7566c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f7564a;
            if (zIsEmpty) {
                break;
            }
            a aVarPoll = arrayDeque2.poll();
            int i10 = A.f40996a;
            aVarPoll.k();
            arrayDeque.add(aVarPoll);
        }
        a aVar = this.f7567d;
        if (aVar != null) {
            aVar.k();
            arrayDeque.add(aVar);
            this.f7567d = null;
        }
    }

    public abstract v0 h();

    public abstract void i(a aVar);

    @Override // p152m1.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public k e() throws SubtitleDecoderException {
        ArrayDeque<k> arrayDeque = this.f7565b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.f7566c;
            if (!arrayDeque2.isEmpty()) {
                a aVarPeek = arrayDeque2.peek();
                int i10 = A.f40996a;
                if (aVarPeek.f17943g > this.f7568e) {
                    break;
                }
                a aVarPoll = arrayDeque2.poll();
                boolean zG = aVarPoll.g(4);
                ArrayDeque<a> arrayDeque3 = this.f7564a;
                if (zG) {
                    k kVarPollFirst = arrayDeque.pollFirst();
                    kVarPollFirst.d(4);
                    aVarPoll.k();
                    arrayDeque3.add(aVarPoll);
                    return kVarPollFirst;
                }
                i(aVarPoll);
                if (k()) {
                    v0 v0VarH = h();
                    k kVarPollFirst2 = arrayDeque.pollFirst();
                    long j = aVarPoll.f17943g;
                    kVarPollFirst2.f44563c = j;
                    kVarPollFirst2.f7149e = v0VarH;
                    kVarPollFirst2.f7150f = j;
                    aVarPoll.k();
                    arrayDeque3.add(aVarPoll);
                    return kVarPollFirst2;
                }
                aVarPoll.k();
                arrayDeque3.add(aVarPoll);
            } else {
                break;
            }
        }
        return null;
    }

    public abstract boolean k();

    @Override // p152m1.c
    public void a() {
    }
}
