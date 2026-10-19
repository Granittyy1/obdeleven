package X2;

import android.graphics.Bitmap;
import androidx.collection.C0893v;
import java.util.Map;

/* JADX INFO: compiled from: StrongMemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f7179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7180b;

    /* JADX INFO: compiled from: StrongMemoryCache.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f7181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f7182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7183c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
            this.f7181a = bitmap;
            this.f7182b = map;
            this.f7183c = i10;
        }
    }

    /* JADX INFO: compiled from: StrongMemoryCache.kt */
    public static final class b extends C0893v<X2.b.a, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e f7184g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, e eVar) {
            super(i10);
            this.f7184g = eVar;
        }

        @Override // androidx.collection.C0893v
        public final void b(Object obj, Object obj2, Object obj3) {
            a aVar = (a) obj2;
            this.f7184g.f7179a.c((X2.b.a) obj, aVar.f7181a, aVar.f7182b, aVar.f7183c);
        }

        @Override // androidx.collection.C0893v
        public final int g(X2.b.a aVar, a aVar2) {
            return aVar2.f7183c;
        }
    }

    public e(int i10, h hVar) {
        this.f7179a = hVar;
        this.f7180b = new b(i10, this);
    }

    @Override // X2.g
    public final void a(int i10) {
        int i11;
        if (i10 >= 40) {
            this.f7180b.h(-1);
            return;
        }
        if (10 > i10 || i10 >= 20) {
            return;
        }
        b bVar = this.f7180b;
        synchronized (bVar.f9217c) {
            i11 = bVar.f9218d;
        }
        bVar.h(i11 / 2);
    }

    @Override // X2.g
    public final X2.b.C0101b b(X2.b.a aVar) {
        a aVarC = this.f7180b.c(aVar);
        if (aVarC != null) {
            return new X2.b.C0101b(aVarC.f7181a, aVarC.f7182b);
        }
        return null;
    }

    @Override // X2.g
    public final void c(X2.b.a aVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        int i10;
        int iA = coil.util.a.a(bitmap);
        b bVar = this.f7180b;
        synchronized (bVar.f9217c) {
            i10 = bVar.f9215a;
        }
        if (iA <= i10) {
            this.f7180b.d(aVar, new a(bitmap, map, iA));
        } else {
            this.f7180b.e(aVar);
            this.f7179a.c(aVar, bitmap, map, iA);
        }
    }
}
