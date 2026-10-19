package p162n1;

import java.util.HashMap;
import java.util.Random;
import p078g1.x;
import p114j1.A;

/* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f44696h = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f44697i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f44701d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44703f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.c f44698a = new x.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.b f44699b = new x.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, a> f44700c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f44702e = x.f35467a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44704g = -1;

    /* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f44707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.h.b f44708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f44709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f44710f;

        public a(String str, int i10, androidx.media3.exoplayer.source.h.b bVar) {
            this.f44705a = str;
            this.f44706b = i10;
            this.f44707c = bVar == null ? -1L : bVar.f18701d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f44708d = bVar;
        }

        public final boolean a(b.a aVar) {
            androidx.media3.exoplayer.source.h.b bVar = aVar.f44669d;
            if (bVar == null) {
                return this.f44706b != aVar.f44668c;
            }
            long j = this.f44707c;
            if (j == -1) {
                return false;
            }
            if (bVar.f18701d > j) {
                return true;
            }
            androidx.media3.exoplayer.source.h.b bVar2 = this.f44708d;
            if (bVar2 == null) {
                return false;
            }
            x xVar = aVar.f44667b;
            int iB = xVar.b(bVar.f18698a);
            int iB2 = xVar.b(bVar2.f18698a);
            if (bVar.f18701d < bVar2.f18701d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            boolean zB = bVar.b();
            int i10 = bVar2.f18699b;
            if (!zB) {
                int i11 = bVar.f18702e;
                return i11 == -1 || i11 > i10;
            }
            int i12 = bVar.f18699b;
            if (i12 > i10) {
                return true;
            }
            if (i12 == i10) {
                if (bVar.f18700c > bVar2.f18700c) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(x xVar, x xVar2) {
            int i10 = this.f44706b;
            if (i10 < xVar.o()) {
                h hVar = h.this;
                xVar.n(i10, hVar.f44698a);
                x.c cVar = hVar.f44698a;
                int i11 = cVar.f35488m;
                while (true) {
                    if (i11 > cVar.f35489n) {
                        i10 = -1;
                        break;
                    }
                    int iB = xVar2.b(xVar.l(i11));
                    if (iB != -1) {
                        i10 = xVar2.f(iB, hVar.f44699b, false).f35470c;
                        break;
                    }
                    i11++;
                }
            } else if (i10 >= xVar2.o()) {
                i10 = -1;
                break;
            }
            this.f44706b = i10;
            if (i10 == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.h.b bVar = this.f44708d;
            return bVar == null || xVar2.b(bVar.f18698a) != -1;
        }
    }

    public final void a(a aVar) {
        long j = aVar.f44707c;
        if (j != -1) {
            this.f44704g = j;
        }
        this.f44703f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final a b(int i10, androidx.media3.exoplayer.source.h.b bVar) {
        long j;
        long j10;
        HashMap<String, a> map = this.f44700c;
        a aVar = null;
        long j11 = Long.MAX_VALUE;
        for (a aVar2 : map.values()) {
            if (aVar2.f44707c == -1 && i10 == aVar2.f44706b && bVar != null) {
                h hVar = h.this;
                a aVar3 = hVar.f44700c.get(hVar.f44703f);
                if (aVar3 != null) {
                    j10 = aVar3.f44707c;
                    if (j10 == -1) {
                        j10 = 1 + hVar.f44704g;
                    }
                } else {
                    j10 = 1 + hVar.f44704g;
                }
                long j12 = bVar.f18701d;
                if (j12 >= j10) {
                    aVar2.f44707c = j12;
                }
            }
            androidx.media3.exoplayer.source.h.b bVar2 = aVar2.f44708d;
            if (bVar != null) {
                long j13 = bVar.f18701d;
                if (bVar2 == null) {
                    if (!bVar.b() && j13 == aVar2.f44707c) {
                        j = aVar2.f44707c;
                        if (j != -1) {
                        }
                        aVar = aVar2;
                        j11 = j;
                    }
                } else if (j13 == bVar2.f18701d && bVar.f18699b == bVar2.f18699b && bVar.f18700c == bVar2.f18700c) {
                    j = aVar2.f44707c;
                    if (j != -1) {
                    }
                    aVar = aVar2;
                    j11 = j;
                }
            } else if (i10 == aVar2.f44706b) {
                j = aVar2.f44707c;
                if (j != -1 || j < j11) {
                    aVar = aVar2;
                    j11 = j;
                } else if (j == j11) {
                    int i11 = A.f40996a;
                    if (aVar.f44708d != null && bVar2 != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) f44696h.get();
        a aVar4 = new a(str, i10, bVar);
        map.put(str, aVar4);
        return aVar4;
    }

    public final synchronized String c(x xVar, androidx.media3.exoplayer.source.h.b bVar) {
        return b(xVar.g(bVar.f18698a, this.f44699b).f35470c, bVar).f44705a;
    }

    public final void d(b.a aVar) {
        androidx.media3.exoplayer.source.h.b bVar;
        boolean zP = aVar.f44667b.p();
        HashMap<String, a> map = this.f44700c;
        if (zP) {
            String str = this.f44703f;
            if (str != null) {
                a aVar2 = map.get(str);
                aVar2.getClass();
                a(aVar2);
                return;
            }
            return;
        }
        a aVar3 = map.get(this.f44703f);
        int i10 = aVar.f44668c;
        androidx.media3.exoplayer.source.h.b bVar2 = aVar.f44669d;
        this.f44703f = b(i10, bVar2).f44705a;
        e(aVar);
        if (bVar2 == null || !bVar2.b()) {
            return;
        }
        long j = bVar2.f18701d;
        if (aVar3 != null && aVar3.f44707c == j && (bVar = aVar3.f44708d) != null && bVar.f18699b == bVar2.f18699b && bVar.f18700c == bVar2.f18700c) {
            return;
        }
        b(i10, new androidx.media3.exoplayer.source.h.b(bVar2.f18698a, j));
        this.f44701d.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    public final synchronized void e(b.a aVar) {
        long j;
        this.f44701d.getClass();
        if (aVar.f44667b.p()) {
            return;
        }
        androidx.media3.exoplayer.source.h.b bVar = aVar.f44669d;
        if (bVar != null) {
            long j10 = bVar.f18701d;
            a aVar2 = this.f44700c.get(this.f44703f);
            if (aVar2 != null) {
                j = aVar2.f44707c;
                if (j == -1) {
                    j = this.f44704g + 1;
                }
            } else {
                j = this.f44704g + 1;
            }
            if (j10 < j) {
                return;
            }
            a aVar3 = this.f44700c.get(this.f44703f);
            if (aVar3 != null && aVar3.f44707c == -1 && aVar3.f44706b != aVar.f44668c) {
                return;
            }
        }
        a aVarB = b(aVar.f44668c, aVar.f44669d);
        if (this.f44703f == null) {
            this.f44703f = aVarB.f44705a;
        }
        androidx.media3.exoplayer.source.h.b bVar2 = aVar.f44669d;
        if (bVar2 != null && bVar2.b()) {
            androidx.media3.exoplayer.source.h.b bVar3 = aVar.f44669d;
            Object obj = bVar3.f18698a;
            a aVarB2 = b(aVar.f44668c, new androidx.media3.exoplayer.source.h.b(bVar3.f18699b, bVar3.f18701d, obj));
            if (!aVarB2.f44709e) {
                aVarB2.f44709e = true;
                aVar.f44667b.g(aVar.f44669d.f18698a, this.f44699b);
                this.f44699b.d(aVar.f44669d.f18699b);
                Math.max(0L, A.Q(0L) + A.Q(this.f44699b.f35472e));
                this.f44701d.getClass();
            }
        }
        if (!aVarB.f44709e) {
            aVarB.f44709e = true;
            this.f44701d.getClass();
        }
        if (aVarB.f44705a.equals(this.f44703f) && !aVarB.f44710f) {
            aVarB.f44710f = true;
            t tVar = this.f44701d;
            String str = aVarB.f44705a;
            tVar.getClass();
            androidx.media3.exoplayer.source.h.b bVar4 = aVar.f44669d;
            if (bVar4 == null || !bVar4.b()) {
                tVar.j();
                tVar.j = str;
                tVar.f44726k = androidx.compose.ui.scrollcapture.a.b().setPlayerName("AndroidXMedia3").setPlayerVersion("1.6.0");
                tVar.k(aVar.f44667b, aVar.f44669d);
            }
        }
    }
}
