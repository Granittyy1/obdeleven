package X2;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.q;

/* JADX INFO: compiled from: WeakMemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<b.a, ArrayList<a>> f7185a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7186b;

    /* JADX INFO: compiled from: WeakMemoryCache.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<Bitmap> f7188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, Object> f7189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7190d;

        public a(int i10, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i11) {
            this.f7187a = i10;
            this.f7188b = weakReference;
            this.f7189c = map;
            this.f7190d = i11;
        }
    }

    @Override // X2.h
    public final synchronized void a(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    @Override // X2.h
    public final synchronized b.C0101b b(b.a aVar) {
        try {
            ArrayList<a> arrayList = this.f7185a.get(aVar);
            b.C0101b c0101b = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = arrayList.get(i10);
                Bitmap bitmap = aVar2.f7188b.get();
                b.C0101b c0101b2 = bitmap != null ? new b.C0101b(bitmap, aVar2.f7189c) : null;
                if (c0101b2 != null) {
                    c0101b = c0101b2;
                    break;
                }
            }
            int i11 = this.f7186b;
            this.f7186b = i11 + 1;
            if (i11 >= 10) {
                d();
            }
            return c0101b;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // X2.h
    public final synchronized void c(b.a aVar, Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
        try {
            LinkedHashMap<b.a, ArrayList<a>> linkedHashMap = this.f7185a;
            ArrayList<a> arrayList = linkedHashMap.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(aVar, arrayList);
            }
            ArrayList<a> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            a aVar2 = new a(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(aVar2);
                    break;
                }
                a aVar3 = arrayList2.get(i11);
                if (i10 >= aVar3.f7190d) {
                    if (aVar3.f7187a != iIdentityHashCode || aVar3.f7188b.get() != bitmap) {
                        arrayList2.add(i11, aVar2);
                        break;
                    } else {
                        arrayList2.set(i11, aVar2);
                        break;
                    }
                }
                i11++;
            }
            int i12 = this.f7186b;
            this.f7186b = i12 + 1;
            if (i12 >= 10) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        WeakReference<Bitmap> weakReference;
        this.f7186b = 0;
        Iterator<ArrayList<a>> it = this.f7185a.values().iterator();
        while (it.hasNext()) {
            ArrayList<a> next = it.next();
            if (next.size() <= 1) {
                a aVar = (a) q.P(next);
                if (((aVar == null || (weakReference = aVar.f7188b) == null) ? null : weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (next.get(i12).f7188b.get() == null) {
                        next.remove(i12);
                        i10++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
