package X2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.RealImageLoader;
import coil.decode.DataSource;
import coil.request.l;
import coil.request.n;
import coil.request.o;
import coil.size.Scale;
import coil.util.j;
import coil.util.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MemoryCacheService.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealImageLoader f7176a;

    public c(RealImageLoader realImageLoader, n nVar) {
        this.f7176a = realImageLoader;
    }

    public static o c(coil.intercept.d dVar, coil.request.g gVar, b.a aVar, b.C0101b c0101b) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(gVar.f23046a.getResources(), c0101b.f7174a);
        DataSource dataSource = DataSource.f22857b;
        Map<String, Object> map = c0101b.f7175b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = k.f23160a;
        return new o(bitmapDrawable, gVar, dataSource, aVar, str, zBooleanValue, dVar != null && dVar.f23007g);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ec A[PHI: r17
      0x00ec: PHI (r17v1 X2.b$b) = (r17v0 X2.b$b), (r17v0 X2.b$b), (r17v2 X2.b$b) binds: [B:62:0x00e8, B:57:0x00db, B:50:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    public final b.C0101b a(coil.request.g gVar, b.a aVar, Z2.e eVar, Scale scale) {
        b.C0101b c0101b;
        boolean zEquals;
        if (!gVar.f23061q.a()) {
            return null;
        }
        b bVarE = this.f7176a.e();
        b.C0101b c0101bB = bVarE != null ? bVarE.b(aVar) : null;
        if (c0101bB != null) {
            Bitmap bitmap = c0101bB.f7174a;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            if (n.b(gVar, config)) {
                Object obj = c0101bB.f7175b.get("coil#is_sampled");
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (eVar.equals(Z2.e.f7731c)) {
                    if (!zBooleanValue) {
                        c0101b = c0101bB;
                    }
                    c0101b = c0101bB;
                } else {
                    String str = aVar.f7173c.get("coil#transformation_size");
                    if (str != null) {
                        zEquals = str.equals(eVar.toString());
                        c0101b = c0101bB;
                    } else {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        Z2.a aVar2 = eVar.f7732a;
                        int i10 = aVar2 instanceof Z2.a.C0110a ? ((Z2.a.C0110a) aVar2).f7725a : Integer.MAX_VALUE;
                        Z2.a aVar3 = eVar.f7733b;
                        int i11 = aVar3 instanceof Z2.a.C0110a ? ((Z2.a.C0110a) aVar3).f7725a : Integer.MAX_VALUE;
                        double dG = A0.f.g(width, height, i10, i11, scale);
                        boolean zA = j.a(gVar);
                        if (zA) {
                            c0101b = c0101bB;
                            double d10 = dG > 1.0d ? 1.0d : dG;
                            if (Math.abs(((double) i10) - (((double) width) * d10)) > 1.0d && Math.abs(((double) i11) - (d10 * ((double) height))) > 1.0d) {
                                if ((dG == 1.0d && !zA) || (dG > 1.0d && zBooleanValue)) {
                                }
                            }
                        } else {
                            c0101b = c0101bB;
                            if ((i10 != Integer.MIN_VALUE && i10 != Integer.MAX_VALUE && Math.abs(i10 - width) > 1) || (i11 != Integer.MIN_VALUE && i11 != Integer.MAX_VALUE && Math.abs(i11 - height) > 1)) {
                                zEquals = dG == 1.0d ? false : false;
                            }
                        }
                    }
                }
                zEquals = true;
            } else {
                c0101b = c0101bB;
            }
            if (zEquals) {
                return c0101b;
            }
        }
        return null;
    }

    public final b.a b(coil.request.g gVar, Object obj, coil.request.k kVar, coil.b bVar) {
        String strA;
        Map mapP;
        b.a aVar = gVar.f23050e;
        if (aVar != null) {
            return aVar;
        }
        List<Pair<V2.b<? extends Object>, Class<? extends Object>>> list = this.f7176a.f22696g.f22700c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strA = null;
                break;
            }
            Pair<V2.b<? extends Object>, Class<? extends Object>> pair = list.get(i10);
            V2.b<? extends Object> bVarA = pair.a();
            if (pair.b().isAssignableFrom(obj.getClass())) {
                i.c(bVarA, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = bVarA.a(obj, kVar);
                if (strA != null) {
                    break;
                }
            }
            i10++;
        }
        if (strA == null) {
            return null;
        }
        Map<String, l.b> map = gVar.f23039A.f23113b;
        if (map.isEmpty()) {
            mapP = y.p();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, l.b> entry : map.entrySet()) {
                String str = entry.getValue().f23116b;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            mapP = linkedHashMap;
        }
        List<p016b3.d> list2 = gVar.f23054i;
        if (list2.isEmpty() && mapP.isEmpty()) {
            return new b.a(strA);
        }
        LinkedHashMap linkedHashMapY = y.y(mapP);
        List<p016b3.d> list3 = list2;
        if (!list3.isEmpty()) {
            int size2 = list3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedHashMapY.put(J4.i.b(i11, "coil#transformation_"), list2.get(i11).getCacheKey());
            }
            linkedHashMapY.put("coil#transformation_size", kVar.f23101d.toString());
        }
        return new b.a(strA, linkedHashMapY);
    }
}
