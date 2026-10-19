package E3;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SizeConfigStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f3070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f3071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f3072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f3073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f3074h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3075a = new c(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<b, Bitmap> f3076b = new f<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3077c = new HashMap();

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3078a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f3078a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3078a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3078a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3078a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f3079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f3081c;

        public b(c cVar) {
            this.f3079a = cVar;
        }

        @Override // E3.j
        public final void a() {
            this.f3079a.F(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3080b == bVar.f3080b && X3.j.a(this.f3081c, bVar.f3081c);
        }

        public final int hashCode() {
            int i10 = this.f3080b * 31;
            Bitmap.Config config = this.f3081c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return k.c(this.f3080b, this.f3081c);
        }
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static class c extends E3.b {
        public final j H() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f3070d = configArr;
        f3071e = configArr;
        f3072f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3073g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3074h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num2 = navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(X3.j.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iB = X3.j.b(i10, i11, config);
        c cVar = this.f3075a;
        j jVarH = (j) ((ArrayDeque) cVar.f3048c).poll();
        if (jVarH == null) {
            jVarH = cVar.H();
        }
        b bVar = (b) jVarH;
        bVar.f3080b = iB;
        bVar.f3081c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f3071e;
        } else {
            int i12 = a.f3078a[config.ordinal()];
            if (i12 == 1) {
                configArr = f3070d;
            } else if (i12 == 2) {
                configArr = f3072f;
            } else if (i12 != 3) {
                configArr = i12 != 4 ? new Bitmap.Config[]{config} : f3074h;
            } else {
                configArr = f3073g;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = d(config2).ceilingKey(Integer.valueOf(iB));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iB * 8) {
                if (numCeilingKey.intValue() == iB && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                cVar.F(bVar);
                int iIntValue = numCeilingKey.intValue();
                j jVarH2 = (j) ((ArrayDeque) cVar.f3048c).poll();
                if (jVarH2 == null) {
                    jVarH2 = cVar.H();
                }
                bVar = (b) jVarH2;
                bVar.f3080b = iIntValue;
                bVar.f3081c = config2;
                break;
            }
        }
        Bitmap bitmapA = this.f3076b.a(bVar);
        if (bitmapA != null) {
            a(Integer.valueOf(bVar.f3080b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap map = this.f3077c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = X3.j.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.f3075a;
        j jVarH = (j) ((ArrayDeque) cVar.f3048c).poll();
        if (jVarH == null) {
            jVarH = cVar.H();
        }
        b bVar = (b) jVarH;
        bVar.f3080b = iC;
        bVar.f3081c = config;
        this.f3076b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num = navigableMapD.get(Integer.valueOf(bVar.f3080b));
        navigableMapD.put(Integer.valueOf(bVar.f3080b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbE = C4.b.e("SizeConfigStrategy{groupedMap=");
        sbE.append(this.f3076b);
        sbE.append(", sortedSizes=(");
        HashMap map = this.f3077c;
        for (Map.Entry entry : map.entrySet()) {
            sbE.append(entry.getKey());
            sbE.append('[');
            sbE.append(entry.getValue());
            sbE.append("], ");
        }
        if (!map.isEmpty()) {
            sbE.replace(sbE.length() - 2, sbE.length(), "");
        }
        sbE.append(")}");
        return sbE.toString();
    }
}
