package androidx.compose.runtime.saveable;

import Ia.l;
import Ia.p;
import androidx.collection.K;
import androidx.collection.U;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SaveableStateHolderImpl implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W.f f13124e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Object, Map<String, List<Object>>> f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K<Object, f> f13126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f13127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Object, Boolean> f13128d;

    static {
        W.f fVar = SaverKt.f13134a;
        f13124e = new W.f(new p<j, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
            /* JADX WARN: Code duplicated, block: B:17:0x005e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:18:0x0060 A[LOOP:0: B:5:0x0019->B:18:0x0060, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:24:0x0063 A[EDGE_INSN: B:24:0x0063->B:19:0x0063 BREAK  A[LOOP:0: B:5:0x0019->B:18:0x0060], SYNTHETIC] */
            @Override // Ia.p
            public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(j jVar, SaveableStateHolderImpl saveableStateHolderImpl) {
                SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl;
                K<Object, f> k10 = saveableStateHolderImpl2.f13126b;
                Object[] objArr = k10.f9128b;
                Object[] objArr2 = k10.f9129c;
                long[] jArr = k10.f9127a;
                int length = jArr.length - 2;
                Map<Object, Map<String, List<Object>>> map = saveableStateHolderImpl2.f13125a;
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
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr[i13];
                                    Map<String, List<Object>> mapB = ((f) objArr2[i13]).b();
                                    if (mapB.isEmpty()) {
                                        map.remove(obj);
                                    } else {
                                        map.put(obj, mapB);
                                    }
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
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            }
        }, new l<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
            @Override // Ia.l
            public final SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
                return new SaveableStateHolderImpl((Map<Object, Map<String, List<Object>>>) map);
            }
        });
    }

    public SaveableStateHolderImpl() {
        this(0);
    }

    @Override // androidx.compose.runtime.saveable.c
    public final void d(final Object obj, ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-1198538093);
        interfaceC1084f.n(obj);
        Object objF = interfaceC1084f.f();
        Object obj2 = InterfaceC1084f.a.f12980a;
        if (objF == obj2) {
            l<Object, Boolean> lVar = this.f13128d;
            if (!((Boolean) ((SaveableStateHolderImpl$canBeSaved$1) lVar).invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map<String, List<Object>> map = this.f13125a.get(obj);
            O0 o10 = SaveableStateRegistryKt.f13132a;
            Object hVar = new h(map, lVar);
            interfaceC1084f.E(hVar);
            objF = hVar;
        }
        final f fVar = (f) objF;
        CompositionLocalKt.a(SaveableStateRegistryKt.f13132a.b(fVar), composableLambdaImpl, interfaceC1084f, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        r rVar = r.f47939a;
        boolean zK = interfaceC1084f.k(this) | interfaceC1084f.k(obj) | interfaceC1084f.k(fVar);
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == obj2) {
            objF2 = new l<B, A>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final A invoke(B b10) {
                    boolean zA = this.this$0.f13126b.a(obj);
                    Object obj3 = obj;
                    if (!zA) {
                        this.this$0.f13125a.remove(obj3);
                        this.this$0.f13126b.l(obj, fVar);
                        return new d(this.this$0, obj, fVar);
                    }
                    throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
                }
            };
            interfaceC1084f.E(objF2);
        }
        E.a(rVar, (l) objF2, interfaceC1084f);
        interfaceC1084f.d();
        interfaceC1084f.D();
    }

    @Override // androidx.compose.runtime.saveable.c
    public final void f(Object obj) {
        if (this.f13126b.j(obj) == null) {
            this.f13125a.remove(obj);
        }
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> map) {
        this.f13125a = map;
        this.f13126b = U.b();
        this.f13128d = new SaveableStateHolderImpl$canBeSaved$1(this);
    }

    public /* synthetic */ SaveableStateHolderImpl(int i10) {
        this(new LinkedHashMap());
    }
}
