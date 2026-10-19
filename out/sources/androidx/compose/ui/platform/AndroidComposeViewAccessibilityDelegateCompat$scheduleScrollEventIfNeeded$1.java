package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ H0 $scrollObservationScope;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(H0 h8, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = h8;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v27, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // Ia.a
    public final p293xa.r invoke() {
        androidx.compose.ui.semantics.q qVar;
        LayoutNode layoutNode;
        H0 h8 = this.$scrollObservationScope;
        androidx.compose.ui.semantics.j jVar = h8.f14921f;
        androidx.compose.ui.semantics.j jVar2 = h8.f14922g;
        Float f10 = h8.f14919d;
        Float f11 = h8.f14920e;
        float fFloatValue = (jVar == null || f10 == null) ? 0.0f : ((Number) jVar.f15204a.invoke()).floatValue() - f10.floatValue();
        float fFloatValue2 = (jVar2 == null || f11 == null) ? 0.0f : ((Number) jVar2.f15204a.invoke()).floatValue() - f11.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
            int i10 = this.$scrollObservationScope.f14917b;
            androidx.collection.A a10 = AndroidComposeViewAccessibilityDelegateCompat.f14733M;
            int iQ = androidComposeViewAccessibilityDelegateCompat.q(i10);
            J0 j0B = this.this$0.j().b(this.this$0.f14755k);
            if (j0B != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                try {
                    B0.s sVar = androidComposeViewAccessibilityDelegateCompat2.f14757m;
                    if (sVar != null) {
                        sVar.h(androidComposeViewAccessibilityDelegateCompat2.b(j0B));
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                } catch (IllegalStateException unused) {
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
            }
            J0 j0B2 = this.this$0.j().b(this.this$0.f14756l);
            if (j0B2 != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this.this$0;
                try {
                    B0.s sVar2 = androidComposeViewAccessibilityDelegateCompat3.f14758n;
                    if (sVar2 != null) {
                        sVar2.h(androidComposeViewAccessibilityDelegateCompat3.b(j0B2));
                        p293xa.r rVar3 = p293xa.r.f47939a;
                    }
                } catch (IllegalStateException unused2) {
                    p293xa.r rVar4 = p293xa.r.f47939a;
                }
            }
            this.this$0.f14746a.invalidate();
            J0 j0B3 = this.this$0.j().b(iQ);
            if (j0B3 != null && (qVar = j0B3.f14934a) != null && (layoutNode = qVar.f15241c) != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat4 = this.this$0;
                if (jVar != null) {
                    androidComposeViewAccessibilityDelegateCompat4.f14760p.h(iQ, jVar);
                }
                if (jVar2 != null) {
                    androidComposeViewAccessibilityDelegateCompat4.f14761q.h(iQ, jVar2);
                }
                androidComposeViewAccessibilityDelegateCompat4.m(layoutNode);
            }
        }
        if (jVar != null) {
            this.$scrollObservationScope.f14919d = (Float) jVar.f15204a.invoke();
        }
        if (jVar2 != null) {
            this.$scrollObservationScope.f14920e = (Float) jVar2.f15204a.invoke();
        }
        return p293xa.r.f47939a;
    }
}
