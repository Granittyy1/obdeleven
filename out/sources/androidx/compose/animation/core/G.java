package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition.a;
import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G {
    public static final InfiniteTransition.a a(InfiniteTransition infiniteTransition, float f10, float f11, E e10, String str, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        return b(infiniteTransition, Float.valueOf(f10), Float.valueOf(f11), VectorConvertersKt.f9477a, e10, (i11 & 8) != 0 ? "FloatAnimation" : str, interfaceC1084f, 33208 | ((i10 << 3) & 458752), 0);
    }

    public static final InfiniteTransition.a b(final InfiniteTransition infiniteTransition, final Object obj, final Object obj2, d0 d0Var, final E e10, String str, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        Object objF = interfaceC1084f.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = infiniteTransition.new a(obj, obj2, d0Var, e10);
            interfaceC1084f.E(objF);
        }
        final InfiniteTransition.a aVar = (InfiniteTransition.a) objF;
        boolean z10 = ((((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.k(obj)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC1084f.k(obj2)) || (i10 & 384) == 256) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC1084f.k(e10)) || (i10 & 24576) == 16384);
        Object objF2 = interfaceC1084f.f();
        if (z10 || objF2 == c0153a) {
            objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
                @Override // Ia.a
                public final p293xa.r invoke() {
                    if (!kotlin.jvm.internal.i.a(obj, aVar.f9370b) || !kotlin.jvm.internal.i.a(obj2, aVar.f9371c)) {
                        InfiniteTransition.a<Object, Object> aVar2 = aVar;
                        ?? r10 = obj;
                        ?? r11 = obj2;
                        E<Object> e11 = e10;
                        aVar2.f9370b = r10;
                        aVar2.f9371c = r11;
                        aVar2.f9374f = e11;
                        aVar2.f9375g = new U<>(e11, aVar2.f9372d, r10, r11, null);
                        InfiniteTransition infiniteTransition2 = InfiniteTransition.this;
                        infiniteTransition2.f9367b.setValue(Boolean.TRUE);
                        aVar2.f9376h = false;
                        aVar2.f9377i = true;
                    }
                    return p293xa.r.f47939a;
                }
            };
            interfaceC1084f.E(objF2);
        }
        androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
        interfaceC1084f.l((Ia.a) objF2);
        boolean zK = interfaceC1084f.k(infiniteTransition);
        Object objF3 = interfaceC1084f.f();
        if (zK || objF3 == c0153a) {
            objF3 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b11) {
                    InfiniteTransition infiniteTransition2 = infiniteTransition;
                    infiniteTransition2.f9366a.b(aVar);
                    infiniteTransition2.f9367b.setValue(Boolean.TRUE);
                    return new F(infiniteTransition, 0, aVar);
                }
            };
            interfaceC1084f.E(objF3);
        }
        androidx.compose.runtime.E.a(aVar, (Ia.l) objF3, interfaceC1084f);
        return aVar;
    }

    public static final InfiniteTransition c(String str, InterfaceC1084f interfaceC1084f, int i10) {
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = new InfiniteTransition();
            interfaceC1084f.E(objF);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) objF;
        infiniteTransition.a(interfaceC1084f, 0);
        return infiniteTransition;
    }
}
