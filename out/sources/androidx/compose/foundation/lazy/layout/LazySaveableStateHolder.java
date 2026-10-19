package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazySaveableStateHolder implements androidx.compose.runtime.saveable.f, androidx.compose.runtime.saveable.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.saveable.h f10660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.runtime.saveable.c f10661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.collection.L<Object> f10662c;

    public LazySaveableStateHolder(final androidx.compose.runtime.saveable.f fVar, Map<String, ? extends List<? extends Object>> map, androidx.compose.runtime.saveable.c cVar) {
        Ia.l<Object, Boolean> lVar = new Ia.l<Object, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(Object obj) {
                androidx.compose.runtime.saveable.f fVar2 = fVar;
                return Boolean.valueOf(fVar2 != null ? fVar2.a(obj) : true);
            }
        };
        O0 o10 = SaveableStateRegistryKt.f13132a;
        this.f10660a = new androidx.compose.runtime.saveable.h(map, lVar);
        this.f10661b = cVar;
        this.f10662c = androidx.collection.V.a();
    }

    @Override // androidx.compose.runtime.saveable.f
    public final boolean a(Object obj) {
        return this.f10660a.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // androidx.compose.runtime.saveable.f
    public final Map<String, List<Object>> b() {
        androidx.collection.L<Object> l10 = this.f10662c;
        Object[] objArr = l10.f9123b;
        long[] jArr = l10.f9122a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            this.f10661b.f(objArr[(i10 << 3) + i12]);
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return this.f10660a.b();
    }

    @Override // androidx.compose.runtime.saveable.f
    public final Object c(String str) {
        return this.f10660a.c(str);
    }

    @Override // androidx.compose.runtime.saveable.c
    public final void d(final Object obj, ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-697180401);
        this.f10661b.d(obj, composableLambdaImpl, interfaceC1084f, i10 & R.styleable.AppCompatTheme_windowNoTitle);
        boolean zK = interfaceC1084f.k(this) | interfaceC1084f.k(obj);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                    this.this$0.f10662c.i(obj);
                    return new O(this.this$0, obj);
                }
            };
            interfaceC1084f.E(objF);
        }
        androidx.compose.runtime.E.a(obj, (Ia.l) objF, interfaceC1084f);
        interfaceC1084f.D();
    }

    @Override // androidx.compose.runtime.saveable.f
    public final androidx.compose.runtime.saveable.f.a e(Ia.a aVar, String str) {
        return this.f10660a.e(aVar, str);
    }

    @Override // androidx.compose.runtime.saveable.c
    public final void f(Object obj) {
        this.f10661b.f(obj);
    }
}
