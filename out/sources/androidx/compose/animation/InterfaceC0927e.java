package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.c0;

/* JADX INFO: renamed from: androidx.compose.animation.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0927e<S> extends Transition.b<S> {

    /* JADX INFO: renamed from: androidx.compose.animation.e$a */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Ha.a
    public static final class a {
        public static final boolean a(int i10, int i11) {
            return i10 == i11;
        }
    }

    static o f(InterfaceC0927e interfaceC0927e, c0 c0Var) {
        return interfaceC0927e.e(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
            @Override // Ia.l
            public final Integer invoke(Integer num) {
                return Integer.valueOf(num.intValue());
            }
        }, c0Var);
    }

    static m g(InterfaceC0927e interfaceC0927e, c0 c0Var) {
        return interfaceC0927e.b(new Ia.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
            @Override // Ia.l
            public final Integer invoke(Integer num) {
                return Integer.valueOf(num.intValue());
            }
        }, c0Var);
    }

    j a(j jVar, z zVar);

    n b(Ia.l lVar, InterfaceC0923x interfaceC0923x);

    p e(Ia.l lVar, InterfaceC0923x interfaceC0923x);
}
