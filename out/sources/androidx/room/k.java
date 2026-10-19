package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p293xa.r;

/* JADX INFO: compiled from: RoomSQLiteQuery.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k implements p285x2.e, p285x2.d {
    public static final TreeMap<Integer, k> j = new TreeMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f20131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f20132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double[] f20133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f20134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[][] f20135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f20136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20137i;

    public k(int i10) {
        this.f20130b = i10;
        int i11 = i10 + 1;
        this.f20136h = new int[i11];
        this.f20132d = new long[i11];
        this.f20133e = new double[i11];
        this.f20134f = new String[i11];
        this.f20135g = new byte[i11][];
    }

    public static final k h(int i10, String str) {
        TreeMap<Integer, k> treeMap = j;
        synchronized (treeMap) {
            Map.Entry<Integer, k> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                k value = entryCeilingEntry.getValue();
                value.f20131c = str;
                value.f20137i = i10;
                return value;
            }
            r rVar = r.f47939a;
            k kVar = new k(i10);
            kVar.f20131c = str;
            kVar.f20137i = i10;
            return kVar;
        }
    }

    @Override // p285x2.d
    public final void O(int i10, long j10) {
        this.f20136h[i10] = 2;
        this.f20132d[i10] = j10;
    }

    @Override // p285x2.d
    public final void X(int i10, byte[] bArr) {
        this.f20136h[i10] = 5;
        this.f20135g[i10] = bArr;
    }

    @Override // p285x2.e
    public final String b() {
        String str = this.f20131c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p285x2.e
    public final void c(p285x2.d dVar) {
        int i10 = this.f20137i;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f20136h[i11];
            if (i12 == 1) {
                dVar.p0(i11);
            } else if (i12 == 2) {
                dVar.O(i11, this.f20132d[i11]);
            } else if (i12 == 3) {
                dVar.z(i11, this.f20133e[i11]);
            } else if (i12 == 4) {
                String str = this.f20134f[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.r(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f20135g[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.X(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void i() {
        TreeMap<Integer, k> treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f20130b), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.i.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            r rVar = r.f47939a;
        }
    }

    @Override // p285x2.d
    public final void p0(int i10) {
        this.f20136h[i10] = 1;
    }

    @Override // p285x2.d
    public final void r(int i10, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f20136h[i10] = 4;
        this.f20134f[i10] = value;
    }

    @Override // p285x2.d
    public final void z(int i10, double d10) {
        this.f20136h[i10] = 3;
        this.f20133e[i10] = d10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
