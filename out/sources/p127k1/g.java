package p127k1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: ReorderingSeiMessageQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f41467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<r> f41468b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<a> f41469c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue<a> f41470d = new PriorityQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41471e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f41472f;

    /* JADX INFO: compiled from: ReorderingSeiMessageQueue.java */
    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f41474c = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f41473b = new ArrayList();

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.f41474c, aVar.f41474c);
        }
    }

    /* JADX INFO: compiled from: ReorderingSeiMessageQueue.java */
    public interface b {
        void d(long j, r rVar);
    }

    public g(b bVar) {
        this.f41467a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r0.f41474c) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r8, p114j1.r r10) {
        /*
            r7 = this;
            int r0 = r7.f41471e
            if (r0 == 0) goto L99
            java.util.PriorityQueue<k1.g$a> r1 = r7.f41470d
            r2 = -1
            if (r0 == r2) goto L21
            int r0 = r1.size()
            int r3 = r7.f41471e
            if (r0 < r3) goto L21
            java.lang.Object r0 = r1.peek()
            k1.g$a r0 = (k1.g.a) r0
            int r3 = p114j1.A.f40996a
            long r3 = r0.f41474c
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L21
            goto L99
        L21:
            java.util.ArrayDeque<j1.r> r0 = r7.f41468b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2f
            j1.r r0 = new j1.r
            r0.<init>()
            goto L35
        L2f:
            java.lang.Object r0 = r0.pop()
            j1.r r0 = (p114j1.r) r0
        L35:
            int r3 = r10.a()
            r0.D(r3)
            byte[] r3 = r10.f41062a
            int r10 = r10.f41063b
            byte[] r4 = r0.f41062a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            k1.g$a r10 = r7.f41472f
            if (r10 == 0) goto L5a
            long r3 = r10.f41474c
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L5a
            java.util.ArrayList r8 = r10.f41473b
            r8.add(r0)
            return
        L5a:
            java.util.ArrayDeque<k1.g$a> r10 = r7.f41469c
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L68
            k1.g$a r10 = new k1.g$a
            r10.<init>()
            goto L6e
        L68:
            java.lang.Object r10 = r10.pop()
            k1.g$a r10 = (k1.g.a) r10
        L6e:
            r10.getClass()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L7b
            r6 = 1
        L7b:
            p241t7.b.e(r6)
            java.util.ArrayList r3 = r10.f41473b
            boolean r4 = r3.isEmpty()
            p241t7.b.k(r4)
            r10.f41474c = r8
            r3.add(r0)
            r1.add(r10)
            r7.f41472f = r10
            int r8 = r7.f41471e
            if (r8 == r2) goto L98
            r7.b(r8)
        L98:
            return
        L99:
            k1.g$b r0 = r7.f41467a
            r0.d(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p127k1.g.a(long, j1.r):void");
    }

    public final void b(int i10) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue<a> priorityQueue = this.f41470d;
            if (priorityQueue.size() <= i10) {
                return;
            }
            a aVarPoll = priorityQueue.poll();
            int i11 = A.f40996a;
            int i12 = 0;
            while (true) {
                int size = aVarPoll.f41473b.size();
                arrayList = aVarPoll.f41473b;
                if (i12 >= size) {
                    break;
                }
                this.f41467a.d(aVarPoll.f41474c, (r) arrayList.get(i12));
                this.f41468b.push((r) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            a aVar = this.f41472f;
            if (aVar != null && aVar.f41474c == aVarPoll.f41474c) {
                this.f41472f = null;
            }
            this.f41469c.push(aVarPoll);
        }
    }
}
