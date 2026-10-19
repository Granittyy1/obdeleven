package androidx.compose.runtime.saveable;

import Ia.l;
import androidx.collection.K;
import androidx.collection.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.y;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f13143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K<String, List<Object>> f13144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K<String, List<Ia.a<Object>>> f13145c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Map<String, ? extends List<? extends Object>> map, l<Object, Boolean> lVar) {
        K<String, List<Object>> k10;
        this.f13143a = (Lambda) lVar;
        if (map == null || map.isEmpty()) {
            k10 = null;
        } else {
            k10 = new K<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                k10.l(entry.getKey(), entry.getValue());
            }
        }
        this.f13144b = k10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.saveable.f
    public final boolean a(Object obj) {
        return ((Boolean) this.f13143a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[LOOP:0: B:20:0x0039->B:30:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x007f A[EDGE_INSN: B:74:0x007f->B:31:0x007f BREAK  A[LOOP:0: B:20:0x0039->B:30:0x0077], SYNTHETIC] */
    @Override // androidx.compose.runtime.saveable.f
    public final Map<String, List<Object>> b() {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        K<String, List<Object>> k10 = this.f13144b;
        if (k10 == null && this.f13145c == null) {
            return y.p();
        }
        int i12 = k10 != null ? k10.f9131e : 0;
        K<String, List<Ia.a<Object>>> k11 = this.f13145c;
        HashMap map = new HashMap(i12 + (k11 != null ? k11.f9131e : 0));
        char c10 = 7;
        long j = -9187201950435737472L;
        int i13 = 8;
        if (k10 != null) {
            Object[] objArr = k10.f9128b;
            Object[] objArr2 = k10.f9129c;
            long[] jArr3 = k10.f9127a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr3[i14];
                    if ((((~j10) << 7) & j10 & j) == j) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                        j = -9187201950435737472L;
                    } else {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j10 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                map.put((String) objArr[i17], (List) objArr2[i17]);
                            }
                            j10 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        }
                        if (i14 != length) {
                            break;
                        }
                        i14++;
                        j = -9187201950435737472L;
                    }
                }
            }
        }
        K<String, List<Ia.a<Object>>> k12 = this.f13145c;
        if (k12 != null) {
            Object[] objArr3 = k12.f9128b;
            Object[] objArr4 = k12.f9129c;
            long[] jArr4 = k12.f9127a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j11 = jArr4[i18];
                    if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j11 & 255) < 128) {
                                int i21 = (i18 << 3) + i20;
                                Object obj = objArr3[i21];
                                List list = (List) objArr4[i21];
                                String str = (String) obj;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Ia.a) list.get(0)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            throw new IllegalStateException(b.a(objInvoke).toString());
                                        }
                                        map.put(str, kotlin.collections.l.n(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    int i22 = 0;
                                    while (i22 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Ia.a) list.get(i22)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            throw new IllegalStateException(b.a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i22++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr4;
                                i11 = i13;
                            }
                            j11 >>= i11;
                            i20++;
                            i13 = i11;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        i10 = i13;
                        if (i19 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i10 = i13;
                    }
                    if (i18 == length2) {
                        break;
                    }
                    i18++;
                    i13 = i10;
                    jArr4 = jArr;
                    c10 = 7;
                }
            }
        }
        return map;
    }

    @Override // androidx.compose.runtime.saveable.f
    public final Object c(String str) {
        K<String, List<Object>> k10 = this.f13144b;
        List<Object> listJ = k10 != null ? k10.j(str) : null;
        List<Object> list = listJ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listJ.size() > 1 && k10 != null) {
            List<Object> listSubList = listJ.subList(1, listJ.size());
            int iH = k10.h(str);
            if (iH < 0) {
                iH = ~iH;
            }
            Object[] objArr = k10.f9129c;
            Object obj = objArr[iH];
            k10.f9128b[iH] = str;
            objArr[iH] = listSubList;
        }
        return listJ.get(0);
    }

    @Override // androidx.compose.runtime.saveable.f
    public final f.a e(Ia.a aVar, String str) {
        int length = str.length();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            }
            if (!O.h.j(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        if (z10) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        K<String, List<Ia.a<Object>>> kB = this.f13145c;
        if (kB == null) {
            kB = U.b();
            this.f13145c = kB;
        }
        List<Ia.a<Object>> listD = kB.d(str);
        if (listD == null) {
            listD = new ArrayList<>();
            kB.l(str, listD);
        }
        listD.add(aVar);
        return new g(kB, str, aVar);
    }
}
