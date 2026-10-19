package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: LazyLayoutScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10593a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f10594b = 1500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f10595c = 50;

    public static final boolean a(boolean z10, K k10, int i10, int i11) {
        if (z10) {
            if (k10.g() <= i10 && (k10.g() != i10 || k10.e() <= i11)) {
                return false;
            }
        } else if (k10.g() >= i10 && (k10.g() != i10 || k10.e() >= i11)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d8 A[Catch: ItemFoundInScroll -> 0x019d, TryCatch #4 {ItemFoundInScroll -> 0x019d, blocks: (B:33:0x00d4, B:35:0x00d8, B:37:0x00de, B:51:0x0107), top: B:101:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.h] */
    /* JADX WARN: Type inference failed for: r14v6, types: [T, androidx.compose.animation.core.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0187 -> B:93:0x018a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(androidx.compose.foundation.lazy.r r31, int r32, int r33, int r34, p013b0.c r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.L.b(androidx.compose.foundation.lazy.r, int, int, int, b0.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean c(K k10, int i10) {
        return i10 <= k10.a() && k10.g() <= i10;
    }
}
